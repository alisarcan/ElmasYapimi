import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, adet = 0;
        System.out.print("bir değer giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
                adet++;
            }
            System.out.println();

        }
        for (int i = n-1 ; i >= 1; i--){
            for (int k = (n-i); k >= 1;k--){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

