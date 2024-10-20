package Oct.ex_14102024;

public class Lab144 {
    public static void main(String[] args) {

        CHROMETC c = new CHROMETC();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenshot();
        c.NoBodyKnowsWhereIamPresent();

        FIREFOXTC f = new FIREFOXTC();
          f.openBrowser("firefox");
          f.closeBrowser("firefox");
    }
}
