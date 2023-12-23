import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen kart numaranızı giriniz");
        String cardnumber = input.nextLine();
        checkcard(cardnumber);

        }
            public static void checkcard(String cardNumber){
                int sayı = 0;
                boolean kontrol = false;

                for (int i = cardNumber.length() - 1; i >= 0; i--) {
                    int n = Integer.parseInt(cardNumber.substring(i, i + 1));

                    if (kontrol) {
                        n *= 2;
                        if (n > 9) {
                            n = (n % 10) + 1;
                        }
                    }

                    sayı += n;
                    kontrol = !kontrol;
                }

                if (sayı % 10 == 0) {
                    if (cardNumber.startsWith("4")) {
                        System.out.println("Visa kartı.");
                    } else if (cardNumber.startsWith("5")) {
                        System.out.println("MasterCard kartı.");
                    }
                } else {
                    System.out.println("Geçersiz kart numarası.");
                }
            }














}