package a11ClassesInternas;

public class ClasseInternaTeste2 {
    
    private String name = "Classe local";

    void print() {
        class LocalClass {
            String outroNome = "dentro da classe";
            public void printLocal() {
                System.out.println(name + " " + outroNome);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        ClasseInternaTeste2 classeInternaTeste2 = new ClasseInternaTeste2();
        classeInternaTeste2.print();
    }
}
