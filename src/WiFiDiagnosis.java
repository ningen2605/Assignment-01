
/*
 * Class: CMSC203
 * Instructor:
 * Description: Build an application that will step through some possible problems to restore internet
 connectivity.  Assume that your computer uses wi-fi to connect to a router which connects to
 an Internet Service Provider (ISP) which connects to the Internet.
 * Due: 09/09/2021
 * Platform/compiler: IntelliJ Idea Ultimate
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ricardo Abuabara
*/
import java.util.Scanner;  // Import the Scanner class

public class WiFiDiagnosis {
    public static void main(String[]args)
    {
        Scanner ans = new Scanner(System.in);
        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work,");
        System.out.println("First step: reboot your computer");
        System.out.println("Are you able to connect with the internet? (yes or no)");
        String answer = ans.nextLine();

        if(answer.equals("no")){
            System.out.println("\nSecond step: reboot your router");
            System.out.println("Are you able to connect with the internet? (yes or no)");
            answer = ans.nextLine();
            if(answer.equals("yes")){
                System.out.print("rebooting seems to have worked.");
            }
            else{
                System.out.println("\nThird step: Make sure your cables connecting the router are firmly plugged in and power is getting to the router");
                System.out.println("Are you able to connect with the internet? (yes or no)");
                answer = ans.nextLine();
                if(answer.equals("yes")){
                    System.out.print("Checking the router cables seems to have worked.");
                }
                else{
                    System.out.println("\nFourth step: Move your computer closer to your router");
                    System.out.println("Are you able to connect with the internet? (yes or no)");
                    answer = ans.nextLine();
                    if(answer.equals("yes")) {
                        System.out.print("Moving your computer closer to the router seems to have worked.");
                    }
                    else {
                        System.out.println("\nFifth step: Contact your ISP");
                        System.out.println("Make sure your ISP is hooked up to your router.");
                    }
                }
            }
        }
        else System.out.print("rebooting seems to have worked.");
    }
}
