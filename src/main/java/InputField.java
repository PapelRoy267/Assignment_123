import org.openqa.selenium.WebElement;

public class InputField extends PageElement {


    public InputField(WebElement element) {
        super(element);
    }

    @Override
    public void performAction() {git
        element.sendKeys("Admin");
        element.sendKeys("admin123");
    }

}
