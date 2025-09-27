package Constructor;

public class ChildBoth extends ParentBoth {

    void showMessage() {
        System.out.println("Message from Child class");
    }

    void callBoth() {
        this.showMessage();   // Child version
        super.showMessage();  // Parent version
    }

    public static void main(String[] args) {
        ChildBoth obj = new ChildBoth();
        obj.callBoth();
    }
}
