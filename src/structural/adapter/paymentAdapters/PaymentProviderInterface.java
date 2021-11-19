package structural.adapter.paymentAdapters;

enum PaymentStatus {
    FAILED,
    SUCCESS,
    ERROR,
}

public interface PaymentProviderInterface {

    public void makeLink();
    public void pay();
    public PaymentStatus checkStatus();
}
