package app;

public class Response {
    public static  String  name="DeafultUser";
    public String message;

    public String getName() {
        return this.name;
    }
    public String message(String message) {
        return this.message = message;
    }
    public void setName(String name) {
        this.name = name;
    }


}
