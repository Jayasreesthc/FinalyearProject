package bank.management.system;

import java.util.Random;

public class OTPGneraTor {
    public static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }
}
