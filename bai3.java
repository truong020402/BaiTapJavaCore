/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HONG TRUONG
 */

public class bai3 {
    public static void main(String a[])
    {
         
        String version = Runtime.class.getPackage().getImplementationVersion();
        System.out.println("Java runtime version: "+System.getProperty("java.runtime.version" ));
        System.out.println("Java home: "+System.getProperty("java.home" ));
        System.out.println("Java path: "+System.getProperty("java.library.path" ));
        System.out.println("Java version: "+System.getProperty("java.version" ));
        System.out.println("Java version"+version);
        
        
 
    }
}
