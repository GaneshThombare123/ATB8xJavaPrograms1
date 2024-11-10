package Oct.ex_25102024_Arrays;

public class Lab188_Arrays {
    public static void main(String[] args) {

        //Arrays-- same data type, homogeneous in nature. arrays are object in java, elements of arrays are store in contiguous memory location.
        //Marks--> 51, 100, 91, 87, 90

   int [] marks ={ 51, 100, 91, 87, 90 };
        System.out.println(marks.length);
        System.out.println(marks[0]); //  - index = 0
        System.out.println(marks[1]); // - index = 1
       // System.out.println(marks[5]); // - index = 5 // ArrayIndexOutOfBoundsException

        System.out.println("----------another way to create arrays----------");
        int[] marks_2 = new int[5];
                // 5 is length
        marks_2[0] = 11;
        marks_2[1] = 12;
        marks_2[2] = 13;
        marks_2[3] = 14;
        marks_2[4] = 15;
        System.out.println(marks_2[0]);
        System.out.println(marks_2[1]);
        System.out.println(marks_2[2]);
        System.out.println(marks_2[3]);
        System.out.println(marks_2[4]);

    }
}
