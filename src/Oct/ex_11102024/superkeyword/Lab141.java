package Oct.ex_11102024.superkeyword;

public class Lab141 {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1();
        BaseClass t2 = new BaseClass();
        TestCase1 t3 = new TestCase1();//Dynamic dispatch

        //TestCase1 t1 = new BaseClass();

        //Dynamic dispatch
        t1.openBrowser("edge");
        t1.closeBrowser();

    }
}
