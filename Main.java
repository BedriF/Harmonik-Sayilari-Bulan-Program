import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        double toplam=0.0;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        for(int i=1;i<=a;i++){
            toplam+=(1.0/i);
        }
        System.out.println(toplam);
    }
}