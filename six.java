package bank;

class Bank{

    private String bankName;
    protected String branchLocation;
    int establishedYear;
    double totalAssets;

    Bank(String bankName, String branchLocation, int establishedYear, double totalAssets){

        this.bankName=bankName;
        this.branchLocation=branchLocation;
        this.establishedYear=establishedYear;
        this.totalAssets=totalAssets;
    }

    public String getBankName(){
        return bankName;
    }

      public String getBranchLocation(){
        return branchLocation;
    }

      public int getEstablishedYear(){
        return establishedYear;
    }

      public double getTotalAssets(){
        return totalAssets;
    }

}


class Account{

    private int acountNumber;
    protected String accountHolder;
    double balance;
    public double interestRate;

    Account(int acountNumber, String accountHolder, double balance , double interestRate){

        this.acountNumber=acountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    public int getAccountNumber(){
        return acountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBlaance(){
        return balance;
    }

    public double getInterestRate(){
        return interestRate;
    }

}

class SavingsAccount extends Account{

    SavingsAccount(int acountNumber, String accountHolder, double balance , double interestRate){
        super(acountNumber, accountHolder,  balance , interestRate);
    }

    double calculateInterest(){
        return balance * interestRate;
    }

}

public class six{
    public static void main(String[] args){

        Bank ba = new Bank("hb","hh",2023,8796.0);

        String r1 = ba.getBankName();
        String r2 = ba.getBranchLocation();
        int r3    = ba.getEstablishedYear();
        double r4 = ba.getTotalAssets();

        System.out.println("---Bank Details---");
        System.out.println("Name:"+r1);
        System.out.println("Branch Location:"+r2);
        System.out.println("Established Year:"+r3);
        System.out.println("Total Assets:"+r4);

        Account ac = new Account(67544,"gvgf",765.90,679.98);

        int a1 = ac.getAccountNumber();
        String a2 = ac.getAccountHolder();
        double a3 = ac.getBlaance();
        double a4 = ac.getInterestRate();

        System.out.println("---Account Detials---");
        System.out.println("Account Number:"+a1);
        System.out.println("Account Holder:"+a2);
        System.out.println("Balance:"+a3);
        System.out.println("Interest Rate:"+a4);

        SavingsAccount sa = new SavingsAccount(67544,"gvgf",765.90,679.98);
        
        double ai = sa.calculateInterest();
        System.out.println("Annual Interest Rate is:"+ai);

    }
}







