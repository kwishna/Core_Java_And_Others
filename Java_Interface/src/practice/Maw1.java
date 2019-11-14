package practice;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Maw1 {

	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://www.katalon.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	
	  public void testMaw1() throws Exception {
	    driver.get("http://sit.mawani.trade/wcppayments/priceplan.html");
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("finexec");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("password");
	    driver.findElement(By.className("login-submit")).click();
	    
	    driver.findElement(By.xpath(".//a[href='/wcppayments/pricePlanView.html']")).click();
	    
	    driver.findElement(By.id("newtab")).click();
	    driver.findElement(By.id("planType")).click();
	    new Select(driver.findElement(By.id("planType"))).selectByVisibleText("Base Plan");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Type'])[2]/following::option[2]")).click();
	    driver.findElement(By.id("serviceProvider")).click();
	    new Select(driver.findElement(By.id("serviceProvider"))).selectByVisibleText("Sea Port");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Service Provider'])[4]/following::option[2]")).click();
	    driver.findElement(By.id("location")).click();
	    new Select(driver.findElement(By.id("location"))).selectByVisibleText("Kochi");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Location'])[2]/following::option[2]")).click();
	    driver.findElement(By.id("spName")).click();
	    new Select(driver.findElement(By.id("spName"))).selectByVisibleText("DP World T1");
	    driver.findElement(By.id("targetCategory")).click();
	    new Select(driver.findElement(By.id("targetCategory"))).selectByVisibleText("Client Type(s)");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Target Category'])[4]/following::option[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Client Type'])[2]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='--Select--'])[13]/following::button[1]")).click();

	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("1111aa");
	    driver.findElement(By.id("saleStartDate")).click();
		driver.findElement(By.id("saleStartDate")).sendKeys("09/11/2018");
	    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[13]")).click();
	    driver.findElement(By.id("saleEndDate")).click();
		driver.findElement(By.id("saleEndDate")).sendKeys("30/11/2018");
	    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[34]")).click();
	    driver.findElement(By.id("planStartDate")).click();
		driver.findElement(By.id("planStartDate")).sendKeys("09/11/2018");
	    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[13]")).click();
	    driver.findElement(By.id("planEndDate")).click();
		driver.findElement(By.id("planEndDate")).sendKeys("30/11/2018");
	    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[34]")).click();
	    driver.findElement(By.id("paymentType")).click();
	    new Select(driver.findElement(By.id("paymentType"))).selectByVisibleText("Prepaid");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Payment Type'])[4]/following::option[2]")).click();
	    driver.findElement(By.linkText("Fixed Tariff Details")).click();
	    driver.findElement(By.id("oneTimeFee")).click();
	    driver.findElement(By.id("PPstep2")).click();
	    driver.findElement(By.name("miscFeeName")).click();
	    driver.findElement(By.name("miscFeeName")).clear();
	    driver.findElement(By.name("miscFeeName")).sendKeys("1asdas");
	    driver.findElement(By.name("miscAmount")).click();
	    driver.findElement(By.id("popMiscellaneousOkBtn")).click();
	    driver.findElement(By.name("miscFeeName")).clear();
	    driver.findElement(By.name("miscFeeName")).sendKeys("12sd22");
	    driver.findElement(By.id("popMiscellaneousOkBtn")).click();
	    driver.findElement(By.id("planAmountBaseplan")).click();
	    driver.findElement(By.id("carryForwardOption")).click();
	    new Select(driver.findElement(By.id("carryForwardOption"))).selectByVisibleText("No");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Carry Forward Option'])[1]/following::option[3]")).click();
	    driver.findElement(By.linkText("Variable Tariff Details")).click();
	    driver.findElement(By.name("durationBaseplan")).click();
	    driver.findElement(By.name("timeUnitsBaseplan")).click();
	    new Select(driver.findElement(By.name("timeUnitsBaseplan"))).selectByVisibleText("Weeks");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Units'])[2]/following::option[3]")).click();
	    driver.findElement(By.linkText("Additional Services")).click();
	    driver.findElement(By.id("addnlService")).click();
	    new Select(driver.findElement(By.id("addnlService"))).selectByVisibleText("Event Notification");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Service'])[1]/following::option[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select Plan'])[3]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='toadminNotification1'])[1]/following::span[2]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=client541Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT602Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT595Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT620Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT410Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT565Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT682Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT662Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=this test for long tezt in textbox how it will be behaviour in view page]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT629Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT652Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=premji15Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT564Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT418Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT533Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT622Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=CLIENT529Notification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=paadminNotification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=selectPlan | label=toadminNotification1]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=selectPlan | label=msadminNotification1]]
	    driver.findElement(By.linkText("Display Details")).click();
	    driver.findElement(By.id("priceHeadLine")).click();
	    driver.findElement(By.id("priceHeadLine")).clear();
	    driver.findElement(By.id("priceHeadLine")).sendKeys("11sd1");
	    driver.findElement(By.id("description")).click();
	    driver.findElement(By.id("description")).clear();
	    driver.findElement(By.id("description")).sendKeys("1sd11");
	    driver.findElement(By.id("priceLine1")).click();
	    driver.findElement(By.id("priceLine1")).clear();
	    driver.findElement(By.id("priceLine1")).sendKeys("1sdas1");
	    driver.findElement(By.id("priceLine2")).clear();
	    driver.findElement(By.id("priceLine2")).sendKeys("1sdasd1");
	    driver.findElement(By.id("priceLine3")).click();
	    driver.findElement(By.id("priceLine3")).clear();
	    driver.findElement(By.id("priceLine3")).sendKeys("11asdasd1");
	    driver.findElement(By.id("promotedBaseplan")).click();
	    new Select(driver.findElement(By.id("promotedBaseplan"))).selectByVisibleText("No");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Promoted'])[1]/following::option[3]")).click();
	    driver.findElement(By.linkText("Attachments")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::button[1]")).click();

	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Prepaid Plan should have User Based tariff method.'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Units'])[2]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tariff Method'])[2]/following::select[1]")).click();
	    new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tariff Method'])[2]/following::select[1]"))).selectByVisibleText("User Based");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No of Users'])[2]/following::input[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Prepaid Plan should have Transaction / Free and Time Based tariff method.'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Units'])[3]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tariff Method'])[3]/following::select[1]")).click();
	    new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tariff Method'])[3]/following::select[1]"))).selectByVisibleText("Transaction Based");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='take a quick tour'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Services'])[5]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='--Select--'])[28]/following::button[1]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Vessel Registration]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Berth Booking]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Truck Registration]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Import/Export Bill Message]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Vessel Voyage]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Import Delivery Order]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Container Acceptance]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Vessel Load Discharge Summary]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Document Upload]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Container Special Handling]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Resource Booking]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Truck Appointment]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Special Service request]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Gate In Gate Out]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Shipping Service Schedule]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Hold Container]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Container Release]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Nominate Transporter]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=EIR]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Voyage Nomination]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Export Status Report]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Container Details View]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Document Download]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Yard Inventory Status Report'])[1]/following::select[1] | label=Yard Inventory Status Report]]
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Channel'])[3]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='--Select--'])[28]/following::button[1]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='B2B'])[1]/following::select[1] | label=Web]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='B2B'])[1]/following::select[1] | label=Mobile]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='B2B'])[1]/following::select[1] | label=B2B]]
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Actions'])[3]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='--Select--'])[28]/following::button[1]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='View'])[1]/following::select[1] | label=Create]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='View'])[1]/following::select[1] | label=Amend]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='View'])[1]/following::select[1] | label=Cancel]]
	    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | xpath=(.//*[normalize-space(text()) and normalize-space(.)='View'])[1]/following::select[1] | label=View]]
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No of Transactions'])[3]/following::input[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Units'])[4]/following::div[3]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Do you want to submit your request?'])[1]/following::button[1]")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
//	    if (!"             ".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
//	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}

