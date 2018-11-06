package abhishek8908.stepdefs;

import abhishek8908.enums.COLOR;
import abhishek8908.enums.SHAPE;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyStepDefs {


    @Given("^verify color (.*)$")
    public void verifyColor(COLOR color) {
        Assert.assertEquals(color.toString(),"RED","Test Case passed");
    }


    @Given("^verify shape (.*)")
    public void verifyShape(SHAPE shape) {

        Assert.assertEquals(shape.toString(),"TRIANGLE","Test Case passed");
    }

    @Given("verify page {}")
    public void verifyPage(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.quit();

    }

}
