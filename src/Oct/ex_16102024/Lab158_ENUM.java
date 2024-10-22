package Oct.ex_16102024;

public class Lab158_ENUM {
    public static void main(String[] args) {
        System.out.println(APIConstanceENDPoints.BASE_URL.getName());
    }
}

// Store the APIConstance End points
enum APIConstanceENDPoints{

    BASE_URL("https://app.vwo.com"),
    LOGIN_URL("https://app.vwo.com/login");


    private String name;
    APIConstanceENDPoints(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}