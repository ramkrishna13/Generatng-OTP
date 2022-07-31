import java.util.*;

public class otp{
    static char[] OTP(int len){
        System.out.println("Generating OTP......");
        System.out.print("Your OTP is:  ");
        String num="0123456789";
        Random ran=new Random();
        char[] otp=new char[len];
        for(int i=0;i<len;i++)
        {
            otp[i]=num.charAt(ran.nextInt(num.length()));
        }
        return otp;
    }
    public static void main(String[] args){
        int length=4;
        System.out.println(OTP(length));
    }
}