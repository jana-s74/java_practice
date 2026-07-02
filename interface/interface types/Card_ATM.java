interface UPI {
    void upi();
}

interface Card {
    void card();
}

interface Cash {
    void cash();
}

class Payment implements UPI, Card, Cash {

    public void upi() {
        System.out.println("Payment done using UPI");
    }

    public void card() {
        System.out.println("Payment done using Card");
    }

    public void cash() {
        System.out.println("Payment done using Cash");
    }
}

public class Card_ATM{
    public static void main(String[] args) {

        Payment p = new Payment();

        p.upi();
        p.card();
        p.cash();
    }
}