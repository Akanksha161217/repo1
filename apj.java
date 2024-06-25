// Abstract class with an abstract method
abstract class Display {
    abstract void show();

           System.out.println("This is a concrete method in an abstract class.");
    
}

// Concrete subclass of Display
class DisplayImpl extends Display {
    // Providing implementation for the abstract method
    @Override
    void show() {
        System.out.println("This is the implementation of the abstract method.");
    }
}

class Test {
    public static void main(String[] args) {
        // Creating an instance of the concrete subclass
        Display display = new DisplayImpl();
        // Calling the implemented abstract method
        display.show();
        // Calling the non-abstract method
        display.printMessage();
    }
}
