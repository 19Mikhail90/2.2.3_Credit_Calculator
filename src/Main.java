public class Main {
    public static void main(String[] args) {


        CreditCalculator service = new CreditCalculator();
        double monthlyPayment =  service.calculate(1000000, 1);

        System.out.println(monthlyPayment);
    }
}