//insert applicable imports here (HINT: You need two)

import javax.swing.*;
import java.util.Scanner;

/**
 * class BankAccountDriver
 * given a defined class BankAccount.java, allows users to decide if they would like to open their bank account in their
 * system console or through a GUI pane. Both options ask the users questions to accrue data to initialize and update
 * their bank account, and at the end of the period their bank account stats are shown.
 *
 * All peaks and modifications into the user's bank account are performed by calling public methods of the BankAccount
 * object instantiated from BankAccount.java.
 *
 * @author Akash Pandit
 * @version 4/7/2023
 */
public class BankAccountDriver    //Update to Main for Replit or MyProgram for codeHS
{
    public static void main (String[] args){
	//Create necessary code that forces a 1 or 2 input
        int useCase;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Press 1 to use console or 2 to use GUI: ");
            useCase = scanner.nextInt();
        } while (useCase != 1 && useCase != 2);

        if (useCase == 1) {
            useConsole();
        } else {
            useGUI();
        }
	//if user selects 1, call useConsole()
	//else call useGUI()
        System.exit(0);     //required to close out JOptionPane thread
    }

    //used for menu option 1
    /**
     * useConsole asks the user for the starting balance, the interest, and the number of months to
     * process.  A BankAccount object is created with balance and interest rates as args.
     * A loop runs based on number of months to process.  For each month deposits, withdraws,
     * and interest rate is calculated.  After the loop processes, ending balance, total deposits,
     * total withdraws, and total interest is displayed.  
     */
    public static void useConsole(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        double balance = keyboard.nextDouble();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();
        System.out.println("===============================");   //formatting
        BankAccount bankAccount = new BankAccount(balance, intRate);  //creates new BankAccount object to use BankAccount methods
        for(int i=1;i<=counter;i++){
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextDouble());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextDouble());
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance()); 
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f",bankAccount.getInterest());
    } //end useConsole()

    //used for menu option 2
    /**
     * useGUI asks the user for the starting balance, the interest, and the number of months to
     * process.  A BankAccount object is created with balance and interest rates as args.
     * A loop runs based on number of months to process.  For each month deposits, withdraws,
     * and interest rate is calculated.  After the loop processes, ending balance, total deposits,
     * total withdraws, and total interest is displayed.  
     */
    public static void useGUI(){
        String temp;        //used for deposit and withdraw method calls
        String origBal = JOptionPane.showInputDialog("What is your starting balance");
        String intRate = JOptionPane.showInputDialog("What is your interest rate? (ie enter 3.5 for 3.5%)");
        String strCtr = JOptionPane.showInputDialog("How many months do you want to calculate?");
        int counter = Integer.parseInt(strCtr);
        BankAccount bankAccount = new BankAccount(origBal, intRate);
        for(int i=1;i<=counter;i++){
            temp = JOptionPane.showInputDialog("Enter Month" + i + " deposits");
            bankAccount.makeDeposit(temp);      //could have used bankAccount.deposit(JOptionPane.showInputDialog("Enter Month" + i + " deposits"))
		//to combine previous 2 steps of code
            temp = JOptionPane.showInputDialog("Enter Month" + i + " withdraws");
            bankAccount.makeWithdraw(temp);
            bankAccount.calcInterest();  //calculates interest each month
        }
        JOptionPane.showMessageDialog(null,String.format("Ending balance: $%,.2f",bankAccount.getBalance()) +
            String.format("\nTotal deposits: $%,.2f",bankAccount.getDeposit()) +
            String.format("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw()) + 
            String.format("\nTotal interest: $%,.2f",bankAccount.getInterest()));
    }

}