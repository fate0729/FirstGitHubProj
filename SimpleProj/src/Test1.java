import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("请输入数字:");
            int num = input.nextInt();
            System.out.print("输入的数字是:"+num);
            if(num % 10 == 0) {
                System.out.print(",能被10整除,循环退出！");
                break;
            }
            System.out.println();
        }
    }
}
