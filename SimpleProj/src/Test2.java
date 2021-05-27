import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num = input.nextInt();
        System.out.print("请输入左右两边延展的长度:");
        int len = input.nextInt();
        for(int i=1;i<=len*2+1;i++) {
            System.out.print((num-len-1+i)+" ");
        }
    }
}
