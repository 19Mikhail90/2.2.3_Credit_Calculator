public class CreditCalculator {

    public double calculate(int creditSum, int years) {

        double interestRate = 9.99;
        int month; // делал через зоведение локальных переменных
        month = years * 12;
        int fistLine;
        fistLine = (int) ((interestRate / 12) * Math.pow((1 + interestRate/12), month));
        int secondLine ;
        secondLine = (int) Math.pow((1 + interestRate / 12), (month - 1));
        double monthlyPayment =  ((-creditSum * fistLine ) / secondLine); // тут специально -creditSum * fistLine взяты в доп скобки

        return monthlyPayment;
    }
}

