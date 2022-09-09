/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HONG TRUONG
 */
import java.util.Vector;
import java.util.Scanner;
public class bai7 {
    public static Vector<Integer> Uoc(int n)
    {
        Vector<Integer> uoc = new Vector<>();
        for(int i=1; i<= n;i++)
        {
            if(n%i==0)
                uoc.add(i);
        }
        return uoc;
    }
    public static void main(String a[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n= in.nextInt();
        //Vector<Integer> uoc =Uoc(n);
        System.out.println("Cac uoc cua "+n+" la:");
        for(int uoc : Uoc(n))
        {
            System.out.println(uoc);
        }
    }
}
