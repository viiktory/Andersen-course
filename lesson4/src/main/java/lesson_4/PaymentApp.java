package lesson_4;

public class PaymentApp {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addProduct("Bread", 10);
        payment.addProduct("Butter", 25);
        payment.addProduct("Caviar", 100);
        payment.printProductsList();
        payment.printTotalCost();
    }
}
