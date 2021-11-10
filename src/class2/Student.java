package class2;

public class Student {
    private String firstName;
    public String phoneNumber;
    protected String email;

    void setName(String name) {
        if (name.startsWith("X")) {
            System.out.println("Error");
            return;
        }
    }

    String getName() {
        System.out.println("This method is now deprecated. Nothng will happen");
        return "";
    }

}

// There is a bad kid
// And I have my son
// Talk to the son via me (setter methods)
// If you anytime make an API public, you are forced to support it