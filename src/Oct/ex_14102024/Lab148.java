package Oct.ex_14102024;

public class Lab148 {
    public static void main(String[] args) {
        //I1 i = mew I1();
//        ABC abc = new ABC();
//        abc.f1();
//        abc.f2();
//        abc.f3();
//        abc.f4();

        XYZ xyz = new XYZ();
        xyz.display();
    }
}

     class XYZ{
    void display(){
        new ABC().f4();



    }
    static class ABC implements I1,I2{

        @Override
        public void f1() {
            System.out.println("F1");
        }

        @Override
        public void f2() {
            System.out.println("F2");

        }

        @Override
        public void f3() {
            System.out.println("F3");
        }

        @Override
        public void f4() {
            System.out.println("F4");
        }
    }

    interface I1{
        void f1();
        void f2();
    }
    interface I2{
        void f3();
        void f4();
    }

}
