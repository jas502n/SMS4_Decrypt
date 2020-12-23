import com.common.utils.SMS4;

import java.util.Scanner;


public class Main {
    public static String SMS4Decrypt(String data) {
//        byte[] SMS4_KEY = new byte[]{};
        byte[] SMS4_KEY = "12345678abcdefgh".getBytes();
        String passwd = SMS4.decodeSMS4(data, SMS4_KEY);
        return passwd;
    }
    public static String SMS4Eecrypt(String data) {
//        byte[] SMS4_KEY = new byte[]{};
        byte[] SMS4_KEY = "12345678abcdefgh".getBytes();
//        SMS4_KEY length= 16

        String passwd = SMS4.encodeSMS4(data, SMS4_KEY);
        return passwd;
    }

    public static void main(String[] args) {
//        System.out.println(SMS4Eecrypt("Jas502n"));

        Scanner sc = new Scanner(System.in);
        System.out.println("\n[+] SMS4 Decrypt");

        System.out.println("[+] Example: 1D7114B6968BF8208DD94A4DECE634CD\n");
        while (true) {
            System.out.print("[+] Input SMS4 Password= ");
            String passwd = sc.nextLine();
            System.out.println("[+] Passwd Length=" + passwd.length());
            System.out.println("[+] 明文密码= " + SMS4Decrypt(passwd));
            System.out.println();

        }


    }
}