public class MyClass {
    private int x = 5;

    public void myMethod() {
        int x = 10; // This line shadows the instance variable x
        System.out.println(x); // Prints 10, not 5
        System.out.println(this.x); // Prints 5, accesses the instance variable
    }
}