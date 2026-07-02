abstract class Bank {

    abstract void getInterestRate();

    void bankInfo() {
        System.out.println("Welcome to the Bank");
    }
}

class SBI extends Bank {

    void getInterestRate() {
        System.out.println("SBI Interest Rate: 7%");
    }
}

class ICICI extends Bank {

    void getInterestRate() {
        System.out.println("ICICI Interest Rate: 8%");
    }
}

public class BankProblem {

    public static void main(String[] args) {

        SBI s = new SBI();
        ICICI i = new ICICI();

        s.bankInfo();
        s.getInterestRate();

        i.bankInfo();
        i.getInterestRate();
    }
}