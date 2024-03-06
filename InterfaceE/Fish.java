package InterfaceE;

public class Fish implements Predator, Prey {

    @Override
    public void hunt() {
        System.out.println("**Fish is hunting!");
    }

    @Override
    public void flee() {
        System.out.println("**Fish is fleeing!");
    }
}
