package creational2.problem3;

public abstract class Employee {
    private int salary;
    private EmployeeType type;
    // 10 diff things

    Employee(EmployeeType type) {
        this.type = type;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }
}


// interface? -> behaviour
// class? -> state
// abstract class? v/s concrete class?
// Employee -> everything about diff employees?
// is there any diff in attributes/ methods of an employee v/s intern?
// in an intern: no bonuses
// employee: bonus, stocks
// part time: numberOfHts
// abstract class -> when an object of the class doesn't make
// sense in itself
// concrete class -> when object of the class has existence in
// isolation
// Models -> won't have any behavior -> User
// Service -> all behaviours -> UserService