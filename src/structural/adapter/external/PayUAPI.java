package structural.adapter.external;

public class PayUAPI {
    public void makeLink() {
        System.out.println("Payu generate link");
    }

    public void pay() {
        System.out.println("Payu pay");
    }

    public void statusCheck() {
        System.out.println("Payu status");
    }
}
