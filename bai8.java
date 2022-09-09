/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HONG TRUONG
 */
import java.util.Scanner;

public class bai8 {
   /*Viết chương trình cho phép nhập vào một chuỗi viết thường, in ra chuỗi trên với
các ký tự đầu tiên được viết in hoa.*/
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhap vao mot chuoi: ");
        message = sc.nextLine();
        char[] charArray = message.toCharArray();
         if (charArray[0] >= 97 && charArray[0] <= 122 ) {
                charArray[0] -= 32;
            }
         if (charArray.length>0)
         {
             for (int i = 1; i < charArray.length; i++) {
                 if (charArray[i] >= 97 && charArray[i] <= 122 && (charArray[i - 1] == 32 || i == 0)) {
                     charArray[i] -= 32;
                 }
             }
         }
       
        message = String.valueOf(charArray);
        System.out.println("Chuoi sau khi doi: " + message);
    }
}
