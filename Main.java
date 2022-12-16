import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, k, j;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        k = input.nextInt();
        System.out.println("4'ün kuvvetleri :");

        for (i = 1; i <= k; i *= 4) {
            System.out.println(i);
        }
        System.out.println("************");
        System.out.println("5'in kuvvetleri :");
        for (j = 1; j <= k; j *= 5) {
            System.out.println(j);
        }
    }
}
