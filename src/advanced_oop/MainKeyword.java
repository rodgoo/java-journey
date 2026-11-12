package advanced_oop;
import advanced_oop.keywords.Client;

public class MainKeyword {
    public static void main(String[] args) {
        var user = new Client();
        user.setName("Joanne");
        user.setStaticName("Pedro");
        System.out.println(user.getName());
        System.out.println(user.getStaticName());
        System.out.println("=============");

        var user2 = new Client();
        System.out.println(user2.getName());
        System.out.println(user2.getStaticName());
        System.out.println(Client.getStaticName());

    }


}
