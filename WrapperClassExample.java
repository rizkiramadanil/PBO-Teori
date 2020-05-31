/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_PBO;

/**
 *
 * @author RIZKI RAMADANIL
 */
public class WrapperClassExample {
    public static void main(String[] args) {
        Integer integerObjek1 = new Integer(1234);
        Integer integerObjek2 = new Integer("1234");
        
        //membuat atau menginstansi objek dari wrapper class
        //menggunakan dua tipe argumen dari tipe data primitif dan String
        
        Double doubleObjek1 = new Double(12.34);
        Double doubleObjek2 = new Double("12.34");
        
        Boolean booleanObjek1 = new Boolean(true);
        Boolean booleanObjek2 = new Boolean("true");
        
        Character characterObjek1 = new Character('0');
        
        //output nilai Wrapper Class Integer
        System.out.println("Output Nilai Integer Class : " + integerObjek1 + " dan " + integerObjek2 + " sama." + "\nMax Nilai Integer : " + Integer.MAX_VALUE);
        
        //output nilai Wrapper Class Double
        System.out.println("Output Nilai Double Class : " + doubleObjek1 + " dan " + doubleObjek2 + " sama." + "\nMax Nilai Double : " + Double.MAX_VALUE);
        
        //output nilai Wrapper Class Boolean
        System.out.println("Output Nilai Boolean Class : " + booleanObjek1 + " dan " + booleanObjek2 + " sama.");
        
        //output nilai Wrapper Class Character
        System.out.println("Output Nilai Character Class : " + characterObjek1);
    }   
}