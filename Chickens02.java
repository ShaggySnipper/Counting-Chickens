public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here

        double dailyAverage = 0;
        double monthlyAverage = 0;
        double monthlyProfit = 0;

        int dayOneEggs = 100;
        int dayTwoEggs = 121;
        int dayThreeEggs = 117;

        double eggProfit = 0.18;

        dailyAverage = (dayOneEggs + dayTwoEggs + dayThreeEggs) / 3;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = monthlyAverage * eggProfit;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
