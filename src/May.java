public class May {

    public static void main(String[] args) {
        Student ajay = new Student(); // object
        ajay.name = "Ajay";
        ajay.dob = "24/06";

        ajay.name = "Ajay Awesome";
        ajay.updateName("Ajay");
        ajay.printName();

        Instructor naman = new Instructor();
        naman.name = "naman";
        naman.dob = "24101998";
        naman.gender = "Male";
        naman.updateDOB("241098");
        naman.doBlahBlah();

        Human h = naman;
        h.updateDOB("24101998");

        Instructor i = (Instructor) new Human();
        i.doBlahBlah();
        naman.name = "Ajay";
        System.out.println(naman.name);
        System.out.println(h.name);


    }
}

// House
// architect -> create a blueprint
// |  |  ||  |   |
//   |        |
// blue colour
// ||

// TA, student -> change batch
// changeBatch()
// ArrayList<Animal> a = newArrayList<>();
// List<Animal> a = new List<>();
// List is an abstract class
// Factory Design Pattern
// Animal a = new Monkey();
// a.makeSound();
// Use lesser memory
// Animal a = new Animal();
// a.makeSound();
// Animal a = AnimalFactory.getSomeAnimal();


class Animal {

    void makeSound() {
        System.out.println("Common Sound");
    }
}

class Monkey extends Animal {
    @Override
    void makeSound() {
        System.out.println("kich kich");
    }
}


