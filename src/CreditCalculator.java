public class CreditCalculator {

    public double calculate(int creditSumB8, int years) {

        double interestRate;
        interestRate = 9.99; //  B6
        double month; // B7
        month = years * 12;
        //// Делимое
        double step_1 = 1+interestRate/12/100;
        double step_2 = Math. pow(step_1,month);
        double step_3 = interestRate/12/100;
        double step_4 = step_3 * step_2;
        //// Делитель
        double step_5 = 1+interestRate/12/100;
        double step_6 = Math. pow(step_5,month) - 1;
        ////Операция деления
        double step_7 = step_4 / step_6;
        double monthlyPayment = step_7 * creditSumB8;

         return monthlyPayment;
    }
}

