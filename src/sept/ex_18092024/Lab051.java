package sept.ex_18092024;

public class Lab051 {
    public static void main(String[] args){
        long phone = 988676687800l;
       // short s = phone;  -- invalid Narrowing Implicit

        short s1 = (short)phone; //-- valida narrowing Explicit - with loss

        System.out.println(s1);
    }
}
