package structural.adapter;

import structural.adapter.paymentAdapters.PayUPaymentAdapter;
import structural.adapter.paymentAdapters.PaymentProviderInterface;
import structural.adapter.paymentAdapters.RazorpayPaymentAdapter;

public class Client {
    public static void main(String[] args) {
        PaymentProviderInterface paymentProvider = new PayUPaymentAdapter();

        Swiggy swiggy = new Swiggy(paymentProvider);
    }
}
