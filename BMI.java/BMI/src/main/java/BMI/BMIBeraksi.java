/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class BMIBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jenis Kelamin");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.print("Masukkan pilihan jenis kelamin anda (1/2) : ");
        int pilihanKelamin = input.nextInt();
        
        System.out.print("Masukkan tinggi badan anda : ");
        float tinggi = input.nextFloat();
        
        System.out.print("Masukkan berat badan anda : ");
        float berat = input.nextFloat();
        
        BMI BMIApp = new BMI(berat , tinggi);
        
        BMIApp.getHasil(pilihanKelamin);
        input.close();
    }
    
}
