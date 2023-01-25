package assignment.bank_new;

import java.util.Scanner;
public class BankAccount{
    String holdername;
    long accno;
    double balance = 0;
    boolean a = true;
    int x;
    Scanner sc = new Scanner(System.in);
    Scanner si = new Scanner(System.in);

    BankAccount() // constructor for creation
    {
        System.out.println("Enter your Account Holder Name");
        holdername = sc.nextLine();
        System.out.println("Enter your Account Number ");
        accno = sc.nextLong();
    }

    void operation() {
        while (a) {
            System.out.println("Enter your choice\n1.Deposit\n2.Withdraw\n3.balance\n4.Exit");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    deposit();
                    break;

                case 2:
                    withDraw();
                    break;

                case 3:
                    balanceAmt();
                    break;

                case 4:
                    a = false;
                    break;

                default:
                    System.out.println("Enter the correct choice");

            }
        }
    }

    public static void main(String[] args) {
        BankAccount in = new BankAccount();

        in.operation();

    }

    void deposit() {
        System.out.println("Enter deposit Amount");
        double amount = si.nextDouble();
        balance = balance + amount;
    }

    void withDraw() {
        System.out.print("Enter Withdraw Amount");
        double withdrawamt = si.nextDouble();
        if (withdrawamt > balance) {
            System.out.println("Thers is no required amount");
        } else {
            balance = balance - withdrawamt;
        }
    }

    void balanceAmt() {
        System.out.println("Balance is" + Balance);
    }
}
