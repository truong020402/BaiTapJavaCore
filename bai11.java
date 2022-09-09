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
public class bai11 {
    public static int log(int x, int b) {
    return (int) (Math.log(x) / Math.log(b));
}
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Moi nhap n: ");
        int n= inp.nextInt();
        System.out.println("So nguyen nho nhat lon hon log2("+n+") la: "+(log(n,2)+1));
    }
     
     
}
