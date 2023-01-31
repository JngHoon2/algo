import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        m = m + p;
        while(m >= 60){
            if( m >= 60 ){
                m = m - 60;
                h = h + 1;
                if(h > 23){
                    h = h - 24;
                }
            }
        }
        

        System.out.print(h);
        System.out.print(" ");
        System.out.println(m);
    }
}
