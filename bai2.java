
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HONG TRUONG
 */
public class bai2 {

    /* Chuyển một số thập phân sang nhị phân và ngược lại*/
    int pow(int a, int b) {
        int s;
        s = 1;
        while (b > 0) {
            s *= a;
            --b;
        }
        return s;
    }

    long Dec2Bin(int decimalNumber) // Ctrl H => find & replace
    {
        long binaryNumber = 0;
        int p = 0;
        while (decimalNumber > 0) {
            binaryNumber += (decimalNumber % 2) * pow(10, p);
            ++p;
            decimalNumber /= 2;
        }
        return binaryNumber;
    }

    int Bin2Dec(long binNumber) {
        int decNumber = 0;
        int p=0;
        while (binNumber > 0) {
            decNumber += (binNumber % 10) * pow(2, p);
            ++p;
            binNumber /= 10;
        }
        return decNumber;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bai2 vd = new bai2();
        System.out.println("Nhap vao so thap phan: ");
        int num = in.nextInt();
        System.out.println("Da chuyen thanh so thap phan  " + vd.Dec2Bin(num));
        System.out.println("Nhap vao so nhi phan: ");
        num = in.nextInt();
        System.out.println("Da chuyen thanh so thap phan: "+vd.Bin2Dec(num));
    }
}
