package structural.adapter;

import structural.adapter.paymentAdapters.PayUPaymentAdapter;
import structural.adapter.paymentAdapters.PaymentProviderInterface;
import structural.adapter.paymentAdapters.RazorpayPaymentAdapter;

public class Swiggy {
    PaymentProviderInterface paymentProvider = new PayUPaymentAdapter();

    Swiggy(PaymentProviderInterface providerInterface) {
        this.paymentProvider = providerInterface;
    }
}
