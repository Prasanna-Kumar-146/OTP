import java.util.Random;
import java.util.Scanner;
public class otp {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to generate otp yes/no");
        String s1=sc.nextLine();
        if(s1.equals("yes")) {
            System.out.println("enter your mobile number");
            long mobile=sc.nextLong();
            int length = 0;
            while (mobile != 0) {
                mobile /= 10;
                length++;
            }
            if(length==10) {
                long firstDigit = Integer.parseInt(Long.toString(mobile).substring(0, 1));
                if (firstDigit > 5) {
                    int randomInt = rand.nextInt(10000);
                    System.out.println(randomInt);
                    System.out.println("Enter your OTP: ");
                    int otp = sc.nextInt();
                    if (otp == randomInt) {
                        System.out.println("OTP Verified successfully");
                    } else System.out.println("your otp does not match");
                } else System.out.println("Enter correct phone number");
            }
        }
        else if(s1.equals("no")) {
            System.out.println("thank you");
        }
        else System.out.println("enter a valid input");
    }
}