import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int price = 0;

        if(a == b && b == c){
            price = 10000 + a * 1000;
        }else if(a == b || b == c || c == a){
            if(a == b){
                price = 1000 + a * 100;
            }else if(b == c){
                price = 1000 + b * 100;
            }else if(c == a){
                price = 1000 + c * 100;
            }
        }else{
            int top = a;
            if(a < b){
                top = b;
                if(b < c){
                    top = c;
                }
            }else if(a < c){
                top = c;
            }
            price = top * 100;
        }

        System.out.println(price);
    }
}
