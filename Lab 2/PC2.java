import java.util.Scanner;

public class PC2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);  // create firstName scanner obj

        System.out.print("Enter your first name: ");
        String firstName = name.nextLine() + " ";
        System.out.print("Enter your middle name: ");
        String middleName = name.nextLine() + " ";
        System.out.print("Enter your last name: ");
        String lastName = name.nextLine();

        System.out.println("\nMy name is: " + firstName + middleName + lastName);
        System.out.println("My initials are: " + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0));

    }
}
