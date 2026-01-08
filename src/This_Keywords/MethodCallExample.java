package This_Keywords;

public class MethodCallExample {
    public void displayMessage() {
        System.out.println("Hello! This is displayMessage() method.");

        // Calling another method using 'this'
        this.showDetails();
    }

    // Method 2
    public void showDetails() {
        System.out.println("This is showDetails() method called using 'this'.");
    }

    // Main method
    public static void main(String[] args) {
        MethodCallExample obj = new MethodCallExample();
        obj.displayMessage();
    }
}
