/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HONG TRUONG
 */
import java.util.Scanner;

public class bai6 {

    public static void main(String a[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String ip = in.nextLine();
        System.out.print("Chuoi dao nguoc cua chuoi vua nhap la: ");
        for (int i = ip.length() - 1; i >= 0; i--) {
            System.out.print(ip.charAt(i));
        }
        System.out.println("");
    }

}
