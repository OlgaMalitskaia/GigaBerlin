import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

import static com.codeborne.selenide.Selenide.open;

public class GigaBerlinTest {
    @Test
    public void wikiGigaBerlinTest (){
        //open Google page
        GooglePage googlePage = open(GooglePage.googleUrl, GooglePage.class);


        //click on search field
        googlePage.searchForWiki();
        googlePage.chooseWikiLink();
        WikiHomePage wikiHomePage = googlePage.chooseWikiLink();
        //insert a search querry
        // click on search button
        // click on link on searchresultlist
        //i should see  for WikiPage (assert true)
        //click on search field Wiki
        //insert a search querry gigaberlin
        // click on search button
        //i should see  gigaberlin article (assert true)
        //find coordinates and save them
        //assert logistics and site concerns
        //open new tab and open google maps
        //search for coordinates (that i saved in line before)
        //assert coordinates that i v found

    }

}

