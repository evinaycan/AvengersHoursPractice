package week5;

public class WebDriver {

    String browserType; // instance variable

    public WebDriver(String browserType) { // 1 parameter constructor
        this.browserType = browserType;
    }

    public String findElement(ID id) { // overload with different locator objects
        return id.locator;
    }

   protected String findElement(TagName tagName) { // same name but with different parameters, also access modifier can be different
        // we only care about the method name and parameters because it's already in the same class
        return tagName.locator;
    }

    public void findElement(Name name) {
        System.out.println("Locating the web element with name locator");
    }

    private final String findElement(ID id, Name name, TagName tagName) {

        return "We are using all the locators";

    }

    public static void clickElement(ID id) { // static methods can be overloaded
        System.out.println("Clicking on " + id.locator);
    }

    public static void clickElement(Name name) {
        System.out.println("Clicking on " + name.locator);
    }

    public Locators navigateTo(String link) {
        return new Locators(link);
    }

}
