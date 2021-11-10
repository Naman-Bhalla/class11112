package class2.interfaceOverInheritance;

public class Cat extends Animal implements Audible{
    SpeakingBehaviour speakingBehaviour;

    Cat(SpeakingBehaviour speakingBehaviour) {
        this.speakingBehaviour = speakingBehaviour;
    }

    @Override
    public void makeSound() {
        System.out.println("Bow bow bow");
        speakingBehaviour.makeSound();
    }
}


// class Human {
//   PersonalityType p;
// }
//
//