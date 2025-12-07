package com.mycompany.standartsapma;
import java.util.Scanner;
public class StandartSapma {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin eleman sayisini giriniz: ");
        int n = input.nextInt();
        int[] dizi = new int[n];
        
            for(int i = 0 ; i<= n-1 ; i++){
                System.out.println(i+" indexli eleman: ");
                dizi[i] = input.nextInt();
            }
            
        double toplam = 0;
        
            for(int i = 0 ; i<n ; i++){
                toplam += dizi[i];
            }
            
        double ortalama = toplam/n;
        double pay = 0;
        double payda = n-1; 
        
            for(int i = 0 ; i<n ; i++){
                pay += Math.pow(dizi[i]-ortalama,2.0);
            }
        
        double standartsapma = Math.pow(pay/payda,1.0/2.0);
        
        System.out.println("Standart sapma : "+ standartsapma);
    }
}
