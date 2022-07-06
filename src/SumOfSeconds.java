import java.util.Scanner;

public class SumOfSeconds {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("1st athlete performance in seconds:");
        int sa1 = Integer.parseInt(reader.nextLine());
        System.out.println("2nd athlete performance in seconds:");
        int sa2 = Integer.parseInt(reader.nextLine());
        System.out.println("3rd athlete performance in seconds:");
        int sa3 = Integer.parseInt(reader.nextLine());

        int saCombined = sa1+sa2+sa3;

        if (sa1 > 50 || sa2 > 50 || sa3 > 50){
            System.out.println("One of the contestants took too long!");
        } else {
            if (saCombined%60 < 10){
                System.out.println("Combined time in minutes is: " + saCombined/60 + ":0" + saCombined%60);
            } else {
                System.out.println("Combined time in minutes is: " + saCombined/60 + ":5" + saCombined%60);
            }
        }
    }
}
