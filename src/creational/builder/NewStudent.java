package creational.builder;

public class NewStudent {
    private String name;
    private String address;
    private int age;
    private int psp;
    private String college;
    private String batch;

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private NewStudent student;

        private Builder() {
            student = new NewStudent();
        }

        public Builder setName(String name) {
            student.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            student.address = address;
            return this;
        }

        public Builder setAge(int age) {
            student.age = age;
            return this;
        }

        public Builder setPsp(int psp) {
            student.psp = psp;
            return this;
        }

        public Builder setCollege(String college) {
            student.college = college;
            return this;
        }

        public Builder setBatch(String batch) {
            student.batch = batch;
            return this;
        }

        public boolean validate() {
            if (student.name.startsWith("A") && student.psp < 10) {
                return false;
            }
            return true;
        }

        public NewStudent build() {
            return student;
        }
    }
}
