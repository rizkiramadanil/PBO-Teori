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
public class FinallyExample {
    public static void main(String[] args) {
        try {
          System.out.println("Ini pernyataan di dalam blok try");          
        } 
        finally{
         System.err.println("Ini pernyataan di dalam blok finally");
        } 
    }
}