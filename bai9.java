/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HONG TRUONG
 */
import java.util.Scanner;

public class bai9 {

    public static boolean Check(int a,int b)
    {
        if((a/10-b/10==0)||(a/10-b%10==0))
            return true;
        if(a%10-b/10==0||(a%10-b%10==0))
            return true;
        return false;
    }
    public static void main(String arg[]) {
        Scanner inp = new Scanner(System.in);
        int a = 0, b = 0;

        do {
            System.out.print("Moi nhap so dau tien: ");
            a = inp.nextInt();
        } while (a < 10 || a > 99);

        do {
            System.out.print("Moi nhap so thu hai: ");
            b = inp.nextInt();
        } while (b < 10 || b > 99);
        System.out.println("Ket qua: "+Check(a,b));
        
    }

}
