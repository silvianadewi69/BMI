/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author LENOVO
 */
public class BMI {
    float berat;
    float tinggi;
    String jenisKelamin;
    
    // membuat constructor
    public BMI(float berat , float tinggi){
    this.berat = berat;
    this.tinggi = tinggi;
}
    // untuk calculator BMI
    public float hitung(){
        float meter = tinggi / 160;
        return berat / (meter * meter);
    }
    
    // status
    public String getStatus (){
        float BMI = hitung();
        if(BMI < 18.5){
            return "kurus";
        }else if(BMI < 24.9){
            return "berat ideal";
        }else if (BMI < 27.5){
            return "berat berlebih";
        }else{
            return "Obesitas";
    }
    }
    
    public void getHasil (int pilihanKelamin){
        float BMI = hitung();
        System.out.println("hasil");
        jenisKelamin = switch(pilihanKelamin){
            case 1 ->
                "Laki-Laki";
            case 2 ->
                "Perempuan";
            default ->
                "Tidak valid";
    };
        System.out.println("jenisKelamin ; " + jenisKelamin);
        System.out.println("BMI Anda ; " + BMI);
        System.out.println("Status ; " + getStatus ());
        System.out.println("Terimakasih");
}
}
