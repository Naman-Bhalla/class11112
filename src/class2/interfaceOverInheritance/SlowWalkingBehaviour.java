package class2.interfaceOverInheritance;

public class SlowWalkingBehaviour implements WalkingBehaviour {
    @Override
    public void walk() {
        System.out.println("Walking Slowly");
    }
}
