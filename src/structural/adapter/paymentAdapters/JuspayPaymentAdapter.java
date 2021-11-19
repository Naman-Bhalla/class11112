package structural.adapter.paymentAdapters;

import structural.adapter.external.JustpayAPI;

public class JuspayPaymentAdapter implements  PaymentProviderInterface {
    JustpayAPI api = new JustpayAPI();

    @Override
    public void makeLink() {
        api.generateLink();
    }

    @Override
    public void pay() {
        api.pay();
    }

    @Override
    public PaymentStatus checkStatus() {
        api.status();
        return PaymentStatus.SUCCESS;
    }
}
