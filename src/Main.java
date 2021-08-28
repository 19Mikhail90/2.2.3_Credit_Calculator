public class Main {
    public static void main(String[] args) {
        double interestRate = 9.99;
        {
            CreditCalculator service = new CreditCalculator();
            int monthlyPayment = (int) service.calculate(1000000, 1);

            System.out.println("Ежемесячный платёж " + monthlyPayment + " ₽. " + "Процентная ставка " + interestRate + " %");
        }
        {
            CreditCalculator service = new CreditCalculator();
            int monthlyPayment = (int) service.calculate(1000000, 2);

            System.out.println("Ежемесячный платёж " + monthlyPayment + " ₽. " + "Процентная ставка " + interestRate + " %");
        }
        {
            CreditCalculator service = new CreditCalculator();
            int monthlyPayment = (int) service.calculate(1000000, 3);

            System.out.println("Ежемесячный платёж " + monthlyPayment + " ₽. " + "Процентная ставка " + interestRate + " %");
        }
    }
}