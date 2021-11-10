package class2.interfaceOverInheritance;

public class Monke extends Animal implements Walkable {
    WalkingBehaviour walkingBehaviour;

    Monke(WalkingBehaviour walkingBehaviour) {
        this.walkingBehaviour = walkingBehaviour;
    }

    @Override
    public void walk() {
        walkingBehaviour.walk();
    }
}
