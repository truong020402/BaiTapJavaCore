/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HONG TRUONG
 */
import java.util.Scanner;
public class bai5 {
    public int x,y;
    

    public double doDai(bai5 A, bai5 B)
    {
        double  lengthAB=Math.sqrt((A.x-B.x)*(A.x-B.x)+(A.y-B.y)*(A.y-B.y));
        
        return lengthAB;
    }
    public static void main(String a[])
    {
        Scanner in = new Scanner(System.in);
        bai5 A= new bai5();
        bai5 B= new bai5();
        System.out.print("Nhap vao Ax: ");
        A.x=in.nextInt();
        System.out.print("Nhap vao Ay: ");
        A.y= in.nextInt();
        System.out.print("Nhap vao Bx: ");
        B.x=in.nextInt();
        System.out.print("Nhap vao By: ");
        B.y= in.nextInt();
        
        double length=A.doDai(A, B);
        
       System.out.println("Do dai doan AB la "+length);
    }
}
