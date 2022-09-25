import java.util.Scanner;

class firstClass{
    
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n\n\nHello my friend.");
        System.out.print("What is your name? ");
        String name = userInput.nextLine();
        System.out.println();
        System.out.print("Oh hello, " + name);
        System.out.println("\n\n\n");

        userInput.close();
    }

}
