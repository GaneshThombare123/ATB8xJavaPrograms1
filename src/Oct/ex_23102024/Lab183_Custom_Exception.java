package Oct.ex_23102024;

public class Lab183_Custom_Exception {
    public static void main(String[] args) throws Exception {

        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);
        Bank JP_Chase = new Bank("USD", 100);
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(JP_Chase));// USD and INR is not same currency so here custom exception occure

    }
}
