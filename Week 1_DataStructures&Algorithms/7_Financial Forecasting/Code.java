class FinancialForecast {
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
    public static void main(String[] args) {
        double initialInvestment = 10000;
        double growthRate = 0.08; // 8% annual growth
        int years = 5;

        double futureValue = predictFutureValue(initialInvestment, growthRate, years);
        System.out.printf("\nPredicted Future Value is %.2f\n", futureValue);


    }
}
