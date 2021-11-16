package creational.builder;

import java.util.HashMap;

public class Student {
    private String fName;
    private String lName;
    private String address;
    private String batch;
    private String something;

    Student(){}

    Student(String fName, String lName, String address,
            String batch, String something) {}
    Student(String fName, String lName) {}

    Student(HashMap<String, Object> h) throws Exception {
        String fName = (String) h.get("fName");
        String lName = (String) h.get("lName");
        String address = (String) h.get("address");

        // validation logic

        if (fName.startsWith("A")) {
            throw new Exception();
        }

        this.fName = fName;

    }
//
//    public String getfName() {
//        return fName;
//    }
//
//    public void setfName(String fName) {
//        this.fName = fName;
//    }
//
//    public String getlName() {
//        return lName;
//    }
//
//    public void setlName(String lName) {
//        this.lName = lName;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getBatch() {
//        return batch;
//    }
//
//    public void setBatch(String batch) {
//        this.batch = batch;
//    }
//
//    public String getSomething() {
//        return something;
//    }
//
//    public void setSomething(String something) {
//        this.something = something;
//    }
//



}
