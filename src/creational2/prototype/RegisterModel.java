package creational2.prototype;

public class RegisterModel implements Clonable {

    private int noOfPages;
    private int length;
    private int breadth;
    private int price;
    private String fact;
    private String coverType;

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public RegisterModel clone() {
        RegisterModel register = new RegisterModel();
        register.breadth = this.breadth;
        register.noOfPages = this.noOfPages;
        register.coverType = this.coverType;
        register.fact = this.fact;
        register.length = this.length;
        register.price = this.price;

        return register;
    }
}

// deeo copy v/s a shallow copy