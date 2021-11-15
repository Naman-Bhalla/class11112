package creational.singleton;

public class DatabaseConnection {
    private static DatabaseConnection INSTANCE = null; // 2 // locking

    private DatabaseConnection() {}

    public synchronized  static DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnection(); // 1  // 2
        }

        return INSTANCE;
    }
}

// final-> variable can be assigned only once at the time of instantiation
// static -> variable doens't need an instance of the class


/// 1. Why can't we do this in constructor
// Ans: Constructor always constructs a new instance
// in constructor you can't retun anything

// Spring Boot: it does the thing
// if we assign the variable in class itself
// at application start time
// in if-else case: constructor will be called
// when first needed
// early-lazy initALZTION