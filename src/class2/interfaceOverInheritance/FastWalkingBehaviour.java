package class2.interfaceOverInheritance;

public class FastWalkingBehaviour implements  WalkingBehaviour {
    @Override
    public void walk() {
        System.out.println("Walk Fast");
    }
}
