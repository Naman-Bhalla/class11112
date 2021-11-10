package class2.interfaceOverInheritance;

public class SlowSpeakingBehaviour implements SpeakingBehaviour{
    @Override
    public void makeSound() {
        System.out.println("Speaking Slowly");
    }
}

// 100 animals that walk slow