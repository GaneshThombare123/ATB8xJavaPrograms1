package Oct.ex_16102024;

public class Lab157 {
    public static void main(String[] args) {
        System.out.println(color.RED.getHexcode());
        System.out.println(color.GREEN.getHexcode());
        System.out.println(color.BLACK.getHexcode());

        if(color.GREEN.getHexcode() == "#12346 i am Green"){
            System.out.println("color is Green");
        }

    }
}

enum color{
    RED("#12345 i am Red"),
    GREEN("#12346 i am Green"),
    BLUE("#12347 i am Blue"),
    BLACK("#12348 i am Black"),
    WHITE("#12349 i am White");

 String hexcode;

     color (String hexcode){
        this.hexcode = hexcode;
    }
     String getHexcode(){
        return  this.hexcode;

    }
}