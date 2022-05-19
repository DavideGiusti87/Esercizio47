import java.util.Scanner;

/*
While Loop 02
Exercise: While Loop 2

write a loop that
asks for an int input from the user (using Scanner and nextLine()): Please enter a command
prints the command that the user has entered
stops only if the entered command is equal to stop
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comand;
        String[] comandList = {"Get","Set","Add","Stop"};
        do {
            System.out.println("Please enter a command number:\n" +
                    "0) Get\n" +
                    "1) Set\n" +
                    "2) Add\n" +
                    "3) Stop run program");
            comand=Integer.parseInt(scanner.nextLine());
            System.out.println("The command chosen is: "+ comandList[comand]);
        } while (comand != 3);
    }
}
