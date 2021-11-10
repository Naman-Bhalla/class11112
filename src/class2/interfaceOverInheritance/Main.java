package class2.interfaceOverInheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog(new FastWalkingBehaviour(),
                new SlowSpeakingBehaviour());
        Cat c = new Cat(new SlowSpeakingBehaviour());
        Monke M = new Monke(new FastWalkingBehaviour());

        List<Walkable> w = new ArrayList<>();
        w.add(d);
        w.add(M);


        List<Audible> a = new ArrayList<>();
        a.add(d);
        a.add(c);

        for (Walkable ws: w) {
            ws.walk();
        }
    }
}
