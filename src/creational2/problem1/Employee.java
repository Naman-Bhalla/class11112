package creational2.problem1;

public abstract class Employee {
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
