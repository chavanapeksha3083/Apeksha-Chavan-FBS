/******Bank Model******/

import java.util.Arrays;
import java.util.Scanner;

class Transaction {

    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    

    String getType() {
		return type;
	}


	void setType(String type) {
		this.type = type;
	}


	double getAmount() {
		return amount;
	}


	void setAmount(double amount) {
		this.amount = amount;
	}


	public String toString() {
        return type + " : " + amount;
    }
	
}//class transaction ends here



abstract class Account {

    int accNo;
    String name;
    double balance;
    String status;
    Transaction[] tArr;
    int tCount;


    static int accCounter = 1000;
    

   
     Account() {
        this.accNo = 0;
        this.name = "not given";
        this.balance = 0.0;
        this.status = "OPEN";
    }


    Account(String name, double balance) {
        this.accNo = ++accCounter;
        this.name = name;
        this.balance = balance;
        this.status = "OPEN";
        tArr = new Transaction[10];
        tCount = 0;
    }

    

    String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	static int getAccCounter() {
		return accCounter;
	}


	static void setAccCounter(int accCounter) {
		Account.accCounter = accCounter;
	}


	Transaction[] gettArr() {
		return tArr;
	}


	void settArr(Transaction[] tArr) {
		this.tArr = tArr;
	}


	int gettCount() {
		return tCount;
	}


	void settCount(int tCount) {
		this.tCount = tCount;
	}


	void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	void setBalance(double balance) {
		this.balance = balance;
	}


	boolean deposit(double amt) {
		if (status != "OPEN")
	        return false;
        balance = balance + amt;
        tArr[tCount++] = new Transaction("Deposit", amt);
        return true;
    }

	boolean withdraw(double amt) {
		if (status != "OPEN")
	        return false;
        balance = balance - amt;
        tArr[tCount++] = new Transaction("Withdraw", amt);
        return true;
    }

    int getAccNo() {
        return accNo;
    }

    double getBalance() {
        return balance;
    }
    boolean open() {
        if (status == "CLOSED") {
            status = "OPEN";
            return true;
        }
        return false;
    }

    boolean close() {
        if (status != "CLOSED") {
            status = "CLOSED";
            return true;
        }
        return false;
    }

    boolean freez() {
        if (status == "OPEN") {
            status = "FROZEN";
            return true;
        }
        return false;
    }


    

    abstract double calculateInterest();

    public String toString() {
        return "AccNo:" + accNo + " Name:" + name + " Balance:" + balance;
    }
    
}//class Account ends here


class SavingAccount extends Account
{
	static double minBalance=10000;
	static double getMinBalance()
	{
		return minBalance;
	}
	
	SavingAccount()
	{
		
	}
	
	SavingAccount(String name, double balance) {
	    super(name, balance);

	    if (balance < minBalance) {
	        this.balance = 0;
	        this.status = "INVALID";
	    }
	}

	

	void setMinBalance(double minBalance) {
		this.minBalance = minBalance;

	}

	double calculateInterest() {
		// TODO Auto-generated method stub
		return balance*0.04;
	}
	boolean withdraw(double amt) {
	    if (balance - amt >= minBalance) {
	        balance = balance - amt;
	        tArr[tCount++] = new Transaction("Withdraw", amt);
	        return true;
	    }
	    return false;
	}


	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", tArr="
				+ Arrays.toString(tArr) + ", tCount=" + tCount + "]";
	}

	
	
          	   
}//class saving ends here
class SalaryAccount extends Account
{
	
	int inactiveMonths=0;
	
	
	SalaryAccount()
	{
		// TODO Auto-generated constructor stub
	}
	
	SalaryAccount(String name, double balance, int inactiveMonths) {
	    super(name, balance);
	    this.inactiveMonths = inactiveMonths;

        if (inactiveMonths > 2) {
            this.status = "FROZEN";
        }
	}

	
	

	int getInactiveMonths() {
		return inactiveMonths;
	}

	void setInactiveMonths(int inactiveMonths) {
		this.inactiveMonths = inactiveMonths;
	}

	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		return balance * 0.04;
		
	}
	@Override
	boolean freez() {
	    if (inactiveMonths >= 2) {
	        status = "FROZEN";
	        return true;
	    }
	    return false;
	}


	@Override
	public String toString() {
	    return "SalaryAccount [accNo=" + accNo +
	           ", name=" + name +
	           ", balance=" + balance +
	           ", inactiveMonths=" + inactiveMonths + "]";
	}

	

	
} // class SalaryAccount ends here
class LoanAccount extends Account
{
	double loanAmount;
	double interestRate;
	double repaidAmount;
	 
	public LoanAccount() 
	{
		// TODO Auto-generated constructor stub
	}
	
	
	LoanAccount(String name, double loanAmount, double interestRate) {
	    super(name, -loanAmount);
	    this.loanAmount = loanAmount;
	    this.interestRate = interestRate;
	    this.repaidAmount = 0;
	}
	 boolean withdraw(double amt) {
	        return false;
	    }


	 @Override
	    boolean deposit(double amount) {

	        if (amount <= 0) return false;

	        boolean status = super.deposit(amount); 
	        if (status) {
	            repaidAmount = repaidAmount + amount;
	        }

	        return status;
	    }
	 
	



	double getLoanAmount() {
		return loanAmount;
	}




	void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}




	double getInterestRate() {
		return interestRate;
	}




	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}



	double getRepaidAmount() {
		return repaidAmount;
	}


	void setRepaidAmount(double repaidAmount) {
		this.repaidAmount = repaidAmount;
	}

	@Override
	double calculateInterest() {

	    if (balance < 0) {
	        return (-balance) * interestRate;   
	    }

	    return 0;   
	}


	   boolean isLoanCleared() {
	        return balance >= 0;
	    }

	    double getTotalRepaid() {
	        return repaidAmount;
	    }

		@Override
		public String toString() {
			return "LoanAccount [loanAmount=" + loanAmount + ", interestRate=" + interestRate + ", repaidAmount="
					+ repaidAmount + ", accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", status="
					+ status + ", tArr=" + Arrays.toString(tArr) + ", tCount=" + tCount + "]";
		}


	
	
} // class LoanAccount ends here
class CurrentAccount extends Account {

    static double overdraftLimit = 10000;
    static double getOverdraftLimit() {
        return overdraftLimit;
    }

    CurrentAccount() {
        super();
    }

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    

   void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // override withdraw to allow overdraft
    boolean withdraw(double amt) {
        if (balance - amt >= -overdraftLimit) {
            balance = balance - amt;
            tArr[tCount++] = new Transaction("Withdraw", amt);
            return true;
        }
        return false;
    }

    double calculateInterest() {
        return 0;
    }

    public String toString() {
        return "CurrentAccount AccNo:" + accNo +
               " Name:" + name +
               " Balance:" + balance +
               " OverdraftLimit:" + overdraftLimit;
    }
}//current account ends here

//model layer ends here


/******* BankController******/


class BankController {

    BankDAO bd = new BankDAO();

    String addAccount(Account acc) {

        if (acc.status == "INVALID") {
            return "INVALID";
        }

        if (acc.status == "FROZEN") {
            return "FROZEN";
        }

        if (bd.addAccount(acc)) {
            return "SUCCESS";
        }

        return "FULL";
    }




    Account searchAccountByAccNo(int accNo) {
        Account acc = bd.searchAccount(accNo);
        if (acc != null) {
            return acc;
        }
        return null;
    }

    boolean deposit(int accNo, double amt) {
        if (bd.deposit(accNo, amt)) {
            return true;
        }
        return false;
    }

    boolean withdraw(int accNo, double amt) {
        if (bd.withdraw(accNo, amt)) {
            return true;
        }
        return false;
    }

    boolean closeAccount(int accNo) {
        if (bd.closeAccount(accNo)) {
            return true;
        }
        return false;
    }

    boolean freezeAccount(int accNo) {
        if (bd.freezeAccount(accNo)) {
            return true;
        }
        return false;
    }

    boolean deleteAccount(int accNo) {
        if (bd.deleteAccount(accNo)) {
            return true;
        }
        return false;
    }

    void displayAllAccounts() {
        Account[] arr = bd.getAllAccounts();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}//bank controller ends here

/*******BankDAO******/

class BankDAO {

    Account[] accArr;
    int count;

    BankDAO() {
        accArr = new Account[20];
        count = 0;

        // Initial data
        accArr[count++] = new SavingAccount("Aditi", 20000);
        accArr[count++] = new SavingAccount("Neha", 18000);

        accArr[count++] = new SalaryAccount("Vedantika", 15000, 1);
        accArr[count++] = new SalaryAccount("Apeksha", 18000, 3);

        accArr[count++] = new CurrentAccount("Priya", 5000);
        accArr[count++] = new CurrentAccount("Nikita", 15000);

        accArr[count++] = new LoanAccount("Sakshi", 50000, 0.10);
        accArr[count++] = new LoanAccount("Anushka", 8000, 0.10);
    }

    boolean addAccount(Account acc) {
        if (count < accArr.length) {
            accArr[count++] = acc;
            return true;
        }
        return false;
    }

    Account searchAccount(int accNo) {
        for (int i = 0; i < count; i++) {
            if (accArr[i].getAccNo() == accNo) {
                return accArr[i];
            }
        }
        return null;
    }

    boolean deposit(int accNo, double amt) {
        Account acc = searchAccount(accNo);
        if (acc != null) {
            return acc.deposit(amt);
        }
        return false;
    }

    boolean withdraw(int accNo, double amt) {
        Account acc = searchAccount(accNo);
        if (acc != null) {
            return acc.withdraw(amt);   // polymorphism
        }
        return false;
    }

    boolean closeAccount(int accNo) {
        Account acc = searchAccount(accNo);
        if (acc != null) {
            return acc.close();
        }
        return false;
    }

    boolean freezeAccount(int accNo) {
        Account acc = searchAccount(accNo);
        if (acc != null) {
            return acc.freez();
        }
        return false;
    }

    boolean deleteAccount(int accNo) {
        for (int i = 0; i < count; i++) {
            if (accArr[i].getAccNo() == accNo) {
                for (int j = i; j < count - 1; j++) {
                    accArr[j] = accArr[j + 1];
                }
                accArr[--count] = null;
                return true;
            }
        }
        return false;
    }

    Account[] getAllAccounts() {
        Account[] temp = new Account[count];
        for (int i = 0; i < count; i++) {
            temp[i] = accArr[i];
        }
        return temp;
    }
}//bank DAO ends here

/*****Bank View ******/

class BankView {

    BankController bc;
    Scanner sc = new Scanner(System.in);

    BankView(BankController bc) {
        this.bc = bc;
    }

    void showOptions() {

        int choice = 0;

        do {
            System.out.println("\n----- BANK MENU -----");
            System.out.println("1. Add Account");
            System.out.println("2. Search Account");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Close Account");
            System.out.println("6. Freeze Account");
            System.out.println("7. Delete Account");
            System.out.println("8. Display All Accounts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addAccountView();
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    Account acc = bc.searchAccountByAccNo(accNo);
                    if (acc != null)
                        System.out.println(acc);
                    else
                        System.out.println("Account not found");
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double amt = sc.nextDouble();
                    if (bc.deposit(accNo, amt))
                        System.out.println("Deposit Successful");
                    else
                        System.out.println("Deposit Failed");
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    amt = sc.nextDouble();
                    if (bc.withdraw(accNo, amt))
                        System.out.println("Withdraw Successful");
                    else
                        System.out.println("Withdraw Failed");
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    if (bc.closeAccount(accNo))
                        System.out.println("Account Closed");
                    else
                        System.out.println("Close Operation Failed");
                    break;

                case 6:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    if (bc.freezeAccount(accNo))
                        System.out.println("Account Frozen");
                    else
                        System.out.println("Freeze Operation Failed");
                    break;

                case 7:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    if (bc.deleteAccount(accNo))
                        System.out.println("Account Deleted");
                    else
                        System.out.println("Delete Failed");
                    break;

                case 8:
                    bc.displayAllAccounts();
                    break;

                case 0:
                    System.out.println("Program Exited");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);
    }

    void addAccountView() {

        System.out.println("Select Account Type");
        System.out.println("1. Saving Account");
        System.out.println("2. Salary Account");
        System.out.println("3. Current Account");
        System.out.println("4. Loan Account");

        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        Account acc = null;

        if (type == 1) {
            if (amount < SavingAccount.getMinBalance()) {
                System.out.println("Minimum balance must be 10000 for Saving Account");
                return;
            }
            acc = new SavingAccount(name, amount);
        }

        else if (type == 2) {
            System.out.print("Enter Inactive Months: ");
            int months = sc.nextInt();
            acc = new SalaryAccount(name, amount, months);
           
        }
        else if (type == 3) {
            acc = new CurrentAccount(name, amount);
        }
        else if (type == 4) {
            System.out.print("Enter Interest Rate: ");
            double rate = sc.nextDouble();
            acc = new LoanAccount(name, amount, rate);
        }

        if (acc != null) {

            String result = bc.addAccount(acc);

            if (result == "SUCCESS") {
                System.out.println("Account added successfully");
            }
            else if (result == "INVALID") {
                System.out.println("Minimum balance must be 10000");
            }
            else if (result == "FROZEN") {
                System.out.println("Account is frozen due to no transaction in last 2 months");
            }
            else if (result == "FULL") {
                System.out.println("Account storage is full");
            }

        } else {
            System.out.println("Invalid Account Type");
        }

    }

    
}//bank view ends here



class CaseTest {
	
	public static void main(String[] args) {
        BankController bc = new BankController();
        BankView bv = new BankView(bc);
        bv.showOptions();
    }
}//class test ends here