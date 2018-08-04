package vn.codegym;
import java.lang.Math;
import java.util.Scanner;


public class CountPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int N = 2;
        int tag = 0;

        System.out.print("Nhập vào số lượng số nguyên tố cần in: ");
        int numbers = scanner.nextInt();

        while (count < numbers){
            tag = 0;
            for (int i = 2; i <= Math.sqrt(N); i++){
                if(N%i == 0){
                    tag++;
                }
            }
            if(tag == 0){
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}
