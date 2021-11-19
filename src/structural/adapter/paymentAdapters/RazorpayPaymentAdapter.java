package structural.adapter.paymentAdapters;

import structural.adapter.external.RazorpayAPI;
import structural.adapter.external.RazorpayStatus;

public class RazorpayPaymentAdapter implements PaymentProviderInterface {
    RazorpayAPI api = new RazorpayAPI();

    @Override
    public void makeLink() {
        api.generatePL();
    }

    @Override
    public void pay() {
        api.makePayment();
    }

    @Override
    public PaymentStatus checkStatus() {
        if (api.checkStatus() == RazorpayStatus.FAILED) {
            return PaymentStatus.FAILED;
        } else {
            return PaymentStatus.SUCCESS;
        }
    }
}

// Every service that we will use will first implement the interface