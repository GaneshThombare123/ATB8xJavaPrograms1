package Oct.ex_18102024;

public class Lab163_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        // String name = "Promod";
        // name = "Aramod";

         // final class String Buffer

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuffer stringBuffer1 = new StringBuffer("Dutta");
        stringBuffer.append(" Dutta");
        stringBuffer1.append(" Pramod");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);

        StringBuilder sb =  new StringBuilder("Hello");
        // Appending to StringBuilder
        sb.append(" World");
        System.out.println(sb);

        //inserting in to String Builder
        sb.insert( 5, ",");
        System.out.println(sb);

        //deleting from string builder
        sb.delete(5, 6);
        System.out.println(sb);

        // reversing string builder
        sb.reverse();
        System.out.println(sb);



    }
}
