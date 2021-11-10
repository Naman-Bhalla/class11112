package class2.interfaceOverInheritance;

public class Dog extends Animal implements Walkable, Audible {
    WalkingBehaviour walkingBehaviour;
    SpeakingBehaviour speakingBehaviour;

    Dog(WalkingBehaviour walkingBehaviour,
        SpeakingBehaviour speakingBehaviour) {
        this.walkingBehaviour = walkingBehaviour;
        this.speakingBehaviour = speakingBehaviour;
    }

    @Override
    public void makeSound() {
        System.out.println("Bow bow bow");
        speakingBehaviour.makeSound();
    }

    @Override
    public void walk() {
        walkingBehaviour.walk();
    }
}

