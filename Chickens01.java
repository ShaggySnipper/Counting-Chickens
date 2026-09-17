import java.util.Scanner;

public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        Scanner input = new Scanner(System.in);

        int eggsPerChicken = input.nextInt();
        int chickenCount = input.nextInt();
        int totalEggs = 0;


        System.out.println("Farmer Brown’s chickens always lay " + eggsPerChicken + " eggs precisely at noon, which he collects that day");
        System.out.println("On Monday, Farmer Brown has " + chickenCount + " chickens");
        totalEggs = eggsPerChicken * chickenCount;
        System.out.println("On Tuesday morning, Farmer Brown gains 1 chicken");
        chickenCount = chickenCount + 1;
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        System.out.println("On Wednesday morning, a wild beast eats half the chickens!");
        chickenCount = chickenCount / 2;
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        System.out.println("Final egg count: " + totalEggs);

        System.out.println(totalEggs);
    }   
}
