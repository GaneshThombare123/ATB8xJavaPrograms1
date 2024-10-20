package Oct.ex_11102024.superkeyword;

public class TestCase1 extends BaseClass{

    //Test case is Type of Base class-- single inheritance.

    TestCase1(){
        super();  // it will call Default constructor of parent
this.setBrowser("edge", true);
    }
    @Override
    public void setBrowser(String browser, boolean isAuth){
        super.setBrowser(browser, isAuth);
    }

}
