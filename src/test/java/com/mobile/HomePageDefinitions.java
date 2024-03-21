//package mobile;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class HomePageDefinitions  {
//    WebDriver driver;
//
//    @Given("User Navigates to HRM login page")
//    public void userOnHomePage() {
//
//        System.out.println("Thread ID - " + Thread.currentThread().getId());
//        System.setProperty("webdriver.chrome.driver","/Users/manivannanpanneerselvam/Downloads/chromedriver_4");
//         driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//    }
//
//    @And("User login with valid credentials")
//    public void entersCredentials() throws InterruptedException {
//        Thread.sleep(1000);
//
//        driver.findElement(By.name("username")).sendKeys("Admin");
//      //  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//      //  driver.findElement(By.id("btnLogin")).submit();
//
//    }
//
//    @When("User is in Dashboard page")
//    public void verifyDashboardPage() {
//
//     //   String dashboardTitle = driver.findElement(By.id("welcome")).getText();
//        //   assertThat(dashboardTitle, containsString("Welcome"));
//
//    }
//
//    @Then("there are valid QuickLaunch options {string}")
//    public void verifyQuickLinks(String options) throws InterruptedException {
//
//        Thread.sleep(60000);
////        switch (options) {
////            case "Assign Leave":
////                String linkOne = driver
////                        .findElement(By.xpath(
////                                "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a/span"))
////                        .getText();
////                //   Assert.assertEquals(linkOne, options);
////                Thread.sleep(1000);
////                break;
////            case "Leave List ":
////                String linkTwo = driver
////                        .findElement(By.xpath(
////                                "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[2]/div/a/span"))
////                        .getText();
////                //  Assert.assertEquals(linkTwo, options);
////                Thread.sleep(1000);
////                break;
////            case "Timesheets":
////                String linkThree = driver
////                        .findElement(By.xpath(
////                                "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[3]/div/a/span"))
////                        .getText();
////                //   Assert.assertEquals(linkThree, options);
////                Thread.sleep(1000);
////                break;
////            default:
////                break;
////        }
//
//        driver.quit();
//
//    }
//}
