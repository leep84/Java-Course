import java.util.Scanner;


public class Scan1 {
    static Scanner scanner = new Scanner(System.in);
    public static void inputName() {
        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.nextLine();
    }
    public static void inputAge(){
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        System.out.println("You are "+age+" years old!");

    }

}
