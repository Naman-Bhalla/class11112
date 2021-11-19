package structural.adapter.external;

public class RazorpayAPI {
    public void generatePL() {
        System.out.println("RP generate link");
    }

    public void makePayment() {
        System.out.println("RP pay");
    }

    public RazorpayStatus checkStatus() {
        System.out.println("RP status");
        return RazorpayStatus.FAILED;
    }
}
