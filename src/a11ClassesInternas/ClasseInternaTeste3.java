package a11ClassesInternas;

class Animal {
    public void walk() {
        System.out.println("Animal anda");
    }
}

public class ClasseInternaTeste3 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override 
            public void walk() {
                System.out.println("Andando nas sombras");
            }
        };
        animal.walk();
    }
}
