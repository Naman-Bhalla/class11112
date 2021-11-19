package structural.adapter.external;

public class JustpayAPI {
    public void generateLink() {
        System.out.println("Juspay generate link");
    }

    public void pay() {
        System.out.println("Juspay pay");
    }

    public boolean status() {
        System.out.println("Juspay status");
        return true;
    }
}
