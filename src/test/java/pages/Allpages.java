package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class Allpages {

    public Allpages() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(),Duration.ofSeconds(25)), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Transport tickets and travel passes\n" +
            "wherever and whenever you want!\"]")
    public MobileElement transportTickets;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Later\"]")
    public MobileElement laterButton;

    @AndroidFindBy(xpath = "//android.widget.Image[@text=\"checked CGU/CGV\"]")
    public MobileElement checkbox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"You can buy tickets and pass up to 50€, but you need to create an account in order to register a payment card.\"]")
    public MobileElement accountText;
    @AndroidFindBy(xpath = "//android.view.View[@text=\"check Ok cross\"]")
    public MobileElement okButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Don't worry, your location won't be shared! Ever \uD83D\uDE09\"]")
    public MobileElement locationText;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"check OK, I got it! cross\"]")
    public MobileElement okLocationButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")
    public MobileElement allowLocationButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[@text=\"MTicket\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")
    public MobileElement selectTransportNetwork;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement addTransportNetwork;




}
