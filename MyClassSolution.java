public class MyClass {
    private int x = 5;

    public void myMethod() {
        int y = 10; // Use a different variable name to avoid shadowing
        System.out.println(y); // Prints 10
        System.out.println(this.x); // Prints 5, accesses the instance variable
    }
}