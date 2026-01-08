package _5_oops._4_abstraction;

class UPIPayment extends Payment {

    public void validate() {
        System.out.println("UPI validated");
    }

    public void processPayment() {
        System.out.println("UPI processed");
    }

}
