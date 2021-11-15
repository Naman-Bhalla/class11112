package creational.builder;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
//        s.setAddress("aaqvsjhs");


        Student a = new Student("a",
                "b", "c", "d", "e");

        HashMap<String, Object> h = new HashMap<>();
        h.put("fName", "Naman");

        Student c;

        try {
            c = new Student(h);
        } catch (Exception e) {

        }


        NewStudent newStudent = NewStudent.getBuilder()
                .setAddress("abc")
                .setAge(10)
                .setBatch("january")
                .setName("naman")
                .build();
//        NewStudent.Builder builder = new NewStudent.Builder()
//                .setAddress("abs")
//                .setAge(10)
//                .setBatch("January");


    }
}
