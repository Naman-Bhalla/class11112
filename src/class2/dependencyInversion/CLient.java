package class2.dependencyInversion;

public class CLient {
    public static void main(String[] args) {
        RazorpayPaymentProcessor rp  = new RazorpayPaymentProcessor();
        PayTMPaymentProcessor pp = new PayTMPaymentProcessor(rp);
    }
}

// cofig.
// IoC -> programmer doesn't even have to initialize dependencies. The framework they
// use will do it for them. Eg: Spring Boot, Anbgular
// Java Reflection