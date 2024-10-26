package Oct.ex_23102024;

public class Lab178_Parent {
    public static void main(String[] args) {
        int b = 0;

        try {
            String ip = args[0];  // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 100 / a;  //Arithmetic exception

//        }      catch (Throwable e) { // we can use
//            System.out.println(e.getMessage());

            //        }    catch (Object e) { // we can't use
//                         System.out.println(e.getMessage());

        } catch (Exception e){
        System.out.println(e.getMessage());

        }finally {
            System.out.println("END");
        }

    }
}



