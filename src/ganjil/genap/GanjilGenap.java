/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjil.genap;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int bilangan = input.nextInt();
        if (bilangan %2 == 1){
            System.out.println("Ganjil");
        }
        else
            System.out.println("Genap");
    }
    
}
