/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HONG TRUONG
 */
import java.util.Scanner;
public class bai4 {
    public static int tongSo(int n)
    {
        int s =0;
        while (n>0)
        {
            s+=n%10;
            n=n/10;
        }
        return s;
    }
    public static void main(String a[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int num = in.nextInt();
        System.out.println("Tong cac chu so cua "+num+" la " + tongSo(num));
    }
}
