package ex_25_ENUM;

public class Lab207_ENUM_REAL_WEB_AUTOMATION {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
    }
}

enum Locators{
    page_input_email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_button("#btn");

    private String locators;

    Locators(String locators)
    {
        this.locators=locators;
    }

    public String getLocators()
    {
        return this.locators;
    }
}

