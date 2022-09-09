/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HONG TRUONG
 */
import java.lang.*;
import java.util.Scanner;

public class bai10 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner inp = new Scanner(System.in);
        int N,S=0;
        
        System.out.print("Moi nhap N: ");
        N= inp.nextInt();
        
        boolean[] check = new boolean[N + 1];
        // Khởi tạo tất cả các số [2...N] đều là số nguyên tố
        for (int i = 2; i <= N; i++) {
            check[i] = true;
        }

        // Thuật toán sàng nguyên tố
        // Nếu một số là số nguyên tố, thì tất cả các bội của nó không phải số nguyên tố
        for (int i = 2; i <= N; i++) {
            if (check[i] == true) {
                for (int j = 2 * i; j <= N; j += i) {
                    check[j] = false;
                }
            }
        }
        // In ra các số là số nguyên tố
        System.out.println("Cac so nguyen to nho hon N la:");
        for (int i = 2; i <= N; i++) {
            if (check[i] == true) {
                S+=i;
                System.out.println(i + " ");
            }
        }
        System.out.println("Tong cac so nguyen to la: "+S);
    }
}
