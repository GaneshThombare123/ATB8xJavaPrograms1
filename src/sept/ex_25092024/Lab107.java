package sept.ex_25092024;

public class Lab107 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // 0,1,2,3,4,5,6,7,8,9
            System.out.println(i);
            if (i == 5){
                continue;
                //break;
            }
            System.out.println("After");
        }
    }
}
