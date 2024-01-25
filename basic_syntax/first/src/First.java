public class First {
    String name = "Keith";
    String email = "keithmuwanguzi@gmail.com";
    private String password = "Keith_mun-am_1!";

    String checkPasswordLegible(String password){
        return password.length() >= 8 ? "Legible":"Not Legible";
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        First authenticator = new First();

        Access access = new Access();
        System.out.println(authenticator.checkPasswordLegible("123"));
        System.out.println(access.getPassword());
    }
}


class Access {

    First value = new First();
    String getPassword(){
        return value.name + " " + value.email;
    }
}
