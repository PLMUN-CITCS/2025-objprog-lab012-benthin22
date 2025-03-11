public class MethodDemo {

    
    public static void main(String[] args) {
        greet(); 
        printMessage("Hello this is my message!"); 
    }

    
    public static void greet() {
        System.out.println("Hello from the greet method!"); 
    }

    
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
