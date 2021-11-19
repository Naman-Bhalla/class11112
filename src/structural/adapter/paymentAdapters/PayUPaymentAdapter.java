package structural.adapter.paymentAdapters;

import structural.adapter.external.PayUAPI;

public class PayUPaymentAdapter implements PaymentProviderInterface {
    PayUAPI api = new PayUAPI();

    @Override
    public void makeLink() {
        api.makeLink();
    }

    @Override
    public void pay() {
        api.pay();
    }

    @Override
    public PaymentStatus checkStatus() {
        api.statusCheck();
        return PaymentStatus.SUCCESS;
    }
}
