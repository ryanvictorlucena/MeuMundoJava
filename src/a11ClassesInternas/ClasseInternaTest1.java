package a11ClassesInternas;

public class ClasseInternaTest1 {
    
    private String name = "Naruto";

    class Inner {
        public void printAlterClassAttibute() {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        ClasseInternaTest1 ci = new ClasseInternaTest1();
        Inner inner = ci.new Inner();
        inner.printAlterClassAttibute();
    }
}
