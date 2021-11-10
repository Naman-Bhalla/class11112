public class Student extends Human implements BatchChange {
    String name;
    int id;
    int coins;

    Student() {
     this.name = "";
     dob = "24101998";
     id = 21;
    }

    void updateName(String newName) {
        this.name = newName;
        super.name= newName + " Super";
    }

    void addCoins(int amount) {
        this.coins += amount;
    }

    void printName() {
        System.out.println(this.name);
        System.out.println(super.name);
    }

    @Override
    public void changeBatch(String newBatchName) {
        System.out.println("Done");
    }
}

// Ultimate version of Intellij Ultimate support@scaler.com
// CureFit, Google
// Spring Boot -> Ultimate

// virtual class -> one virtual fucntion