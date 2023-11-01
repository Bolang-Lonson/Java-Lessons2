class Bank {
    int getRateOfInterest() {return 0;}
}

class SBI extends Bank {
    int getRateOfInterest() {return 8;}
}

class NFC extends Bank {
    int getRateOfInterest() {return 7;}
}

class UBA extends Bank {
    int getRateOfInterest() {return 9;}
}

class Overriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        NFC n = new NFC();
        UBA u = new UBA();

        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); 
        System.out.println("NFC Rate of Interest: "+n.getRateOfInterest()); 
        System.out.println("UBA Rate of Interest: "+u.getRateOfInterest());
    }
}