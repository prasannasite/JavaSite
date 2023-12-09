import java.util.Scanner;

public class StudentIdCard {
    public static void main(String[] args) {
        String name;
        int age;
        String bloodgroup;
        String group = "RED";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        System.out.println("Enter your blood group:");
        bloodgroup = scanner.next();

        if (age >= 20) {
            System.out.println("Your group is RED");
        } else if (age >= 15 && age < 20) {
            System.out.println("Your grpup is BLUE");
        } else if (age >= 10 && age < 15) {
            System.out.println("Your group is YELLOW");
        }
        System.out.println("----------------------------");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Blood Group:" + bloodgroup);
        System.out.println("----------------------------");
        System.out.println("Your Gorup is:" + group);
        System.out.println("----------------------------");

        scanner.close();


    }
}
