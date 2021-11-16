package class2.dependencyInversion;

public class PayTMPaymentProcessor {
    PaymentProcessorInterface ppi;

    PayTMPaymentProcessor(PaymentProcessorInterface ppi) {
        this.ppi = ppi;
    }

    void pay() {
        ppi.pay();
    }
}
