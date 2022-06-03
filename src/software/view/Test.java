package software.view;


public class Test {
    public static void main(String[] args) {
        int mul=1;
        for (int i = 1; i <=5 ; i++) {
            mul=mul*i;
        }
        System.out.println(mul);
    }
    public void add(Integer a,Integer b){
        System.out.println(a+b);
    }
    public void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
