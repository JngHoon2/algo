import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m  = sc.nextInt();

        m = m - 45;
        if (m < 0){
            m = 60 + m;
            h = h - 1;
            if (h < 0){
                h = 24 + h;
            }
        }

        System.out.print(h);
        System.out.print(" ");
        System.out.println(m);
    }
}
