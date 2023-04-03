package control;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCode {

    private static byte[] getSHA(String input) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(input.trim().getBytes(StandardCharsets.UTF_8));
    }

    private static String toHexString(byte[] hash) {
        BigInteger number = new BigInteger(1, hash);
        StringBuilder hexString = new StringBuilder(number.toString(16));
        while (hexString.length() < 64) {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }
    
    public String hashTo(String str){
        try {
            return toHexString(getSHA(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String args[]) {
        try {
            System.out.println("HashCode Generated by SHA-256 for:");

            String s1 = "vietyeuan";
            System.out.println("\n" + s1 + " : " + toHexString(getSHA(s1)));

            String s2 = "nguyenanhviet";
            System.out.println("\n" + s2 + " : " + toHexString(getSHA(s2)));
            //z0zshinnjihee
            String s3 = "emiuanh1";
            System.out.println("\n" + s3 + " : " + toHexString(getSHA(s3)));
            String s4 = "z0zshinnjihee";
            System.out.println("\n" + s4 + " : " + toHexString(getSHA(s3)));
            System.out.println("4d5d59ff96ce2ab89de9a7c9d02ed058b105c3a9564b4197f5295c5652a2ca1c".length());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
    }
}
