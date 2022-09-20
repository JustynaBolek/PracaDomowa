import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What's your surname?");
        Scanner scanner1 = new Scanner(System.in);
        String surname = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How old are you?");
        int x = scanner2.nextInt();
        if (x>18){
            System.out.println(name + " " + surname + " you can come in");
        }else {
            System.out.println(name + " " + surname + " you are too young to come in");
        }
    }

}
