/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursivo;

/**
 *
 * @author Jake
 */
public class Recursivo {

    public static void main(String[] args) {
        Recursivo ip = new Recursivo(); 
        ip.imprimir(5); 
        
    }
    private void imprimir(int x) { 
    int soma = 0; 
    for(int cont = 0; cont <= x; cont++) { 
    soma = soma + cont; 
        System.out.println(soma);
    } 
    System.out.println("Soma dos pares: " + soma); 
} 
        
    
}
