import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class GooglePage {
    public static String googleUrl = "https://www.google.com/";

    @FindBy(xpath = "//input[@name='q']")
    private SelenideElement searchField;
    @FindBy(xpath = "//*[@xpath='1']")
    private SelenideElement searchBtn;
    @FindBy(tagName = "h3")
    private SelenideElement searchWikiResult;

    public void searchForWiki() {
        searchField.setValue("wikipedia.com");
        searchBtn.click();
    }

    public WikiHomePage chooseWikiLink() {
        String resultText = searchWikiResult.getText();
        if (resultText.equals("Wikipedia")) {
            searchWikiResult.click();

    }
        return page (WikiHomePage.class);

}

