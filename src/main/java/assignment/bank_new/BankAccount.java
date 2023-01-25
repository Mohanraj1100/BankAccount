package assignment.bank_new;

import java.util.Scanner;
public class BankAccount{
	String HolderName;
    long Acc_No;
    double Balance = 0;
    boolean a = true;
    Scanner sc = new Scanner(System.in);
    Scanner si = new Scanner(System.in);

    BankAccount() // constructor for creation
    {
        System.out.println("Enter your Account Holder Name");
        HolderName = sc.nextLine();
        System.out.println("Enter your Account Number ");
        Acc_No = sc.nextLong();
    }

    void Operation() {
        while (a) {
            int x;
            System.out.println("Enter your choice\n1.Deposit\n2.Withdraw\n3.balance\n4.Exit");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    Deposit();
                    break;

                case 2:
                    WithDraw();
                    break;

                case 3:
                    BalanceAmt();
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

        in.Operation();

    }

    void Deposit() {
        System.out.println("Enter deposit Amount");
        double Amount = si.nextDouble();
        Balance = Balance + Amount;
    }

    void WithDraw() {
        System.out.print("Enter Withdraw Amount");
        double WithDrawAmt = si.nextDouble();
        if (WithDrawAmt > Balance) {
            System.out.println("Thers is no required amount");
        } else {
            Balance = Balance - WithDrawAmt;
        }
    }

    void BalanceAmt() {
        System.out.println("Balance is" + Balance);
    }
}