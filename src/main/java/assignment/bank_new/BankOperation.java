package assignment.bank_new;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankOperation {
	String holdername;
    long accno;
    double balance = 0;
    Scanner inputobj = new Scanner(System.in);
    Logger log=Logger.getLogger("hi");
	BankOperation(String holdername,long accno){
		this.holdername =holdername;
		this.accno = accno;
		balance = 0;
	}
	void deposit() {      
        log.info("Enter deposit Amount");
        double amount = inputobj.nextDouble();
        balance = balance + amount;
    }

    void withDraw() {
        log.info("Enter Withdraw Amount");
        double withdrawamt = inputobj.nextDouble();
        if (withdrawamt > balance) {
            log.info("Thers is no required amount");
        } else {
            balance = balance - withdrawamt;
        }
    }

    void balanceAmt() {
        log.log(Level.INFO,()->"Balance is" + balance);
    }
}

