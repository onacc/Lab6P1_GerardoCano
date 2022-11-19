/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_gerardocano;
import java.util.Scanner;
import java.util.Random;
//import java.util.Arrays;

/**
 *
 * @author gcano
 */
public class Lab6P1_GerardoCano {
static Scanner read = new Scanner (System.in);
static Random ram = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        do{
            System.out.println("Menu");
            System.out.println("1. Turing");
            System.out.println("2. Constante de Kaprekar");
            System.out.println("3. Saliendo");
            op = read.nextInt();
            switch(op){
                case 1:
                    System.out.println("Ingrese un tamano");
                    int tam = read.nextInt();
                    System.out.println("Arreglo generado");
                    int [] arrayR = Generarandom(tam);
                    print(arrayR);
                    System.out.println("");
                    System.out.println("Ingrese instruccion");
                    String ins = read.next().toUpperCase();
                    System.out.println("Cadena Generada ");
                    Instruccion(ins,arrayR);
                break;
                case 2:
                    System.out.println("Ingrese 4 enteros ");
                    int num = read.nextInt();
                    int[] array = lectura(num);
                    print(array);
                    System.out.println("");
                    System.out.println(arregloaint(array));
                    
                    
                break;
                case 3:
                    System.out.println("Saliendo");
                break;
            }
        }while(op !=3);
    }
    public static void print (int[]arrayR){
        for (int i = 0; i < arrayR.length; i++) {
            System.out.print("["+arrayR[i]+"]");
            
        }
    }
    public static int[]Generarandom(int tam){
        int arrayR[] = new int [tam];
        for (int i = 0; i < arrayR.length; i++) {
            arrayR[i] = 1 + ram.nextInt(10);
        }
        return arrayR;
    }
    public static void  Instruccion(String ins, int[]arrayR){
        String res="";
        int p=0;
        for (int i = 0; i <ins.length(); i++) {
            char letr = ins.charAt(i);
            if(letr!='R'&&letr!='X'&&letr!='L'){
                System.out.println("Ingrese una instruccion valida");
            }else{
                 
            switch(letr){
                case 'R':
                    p++;
                break;
                case 'L':
                    p--;
                break;
                case'X':
                    res+=arrayR[p];
                if(p>arrayR.length){
                System.out.println("Fuera de los parametros");
            }
                break;
            }}
            
        }
        System.out.println(res);
    }
    //metodos del Kaprekar
    public static int[]lectura(int num){
         int array1[] = new int [4];
         for (int i = 0; i <4; i++) {
             System.out.println("Ingrese 4 elementos");
             num = read.nextInt();
             array1[i] += num;
         }
         return array1;
     }
    public static int[] ascendente(int [] array){
        int[] arraya = new int[4];
        for (int i = 0; i < array.length; i++) {
                    int codigoascii = (int)Math.floor(Math.random()*(57-48)+48);
                       array[i] = (char) codigoascii;
                       //arraya += array[i];
                    }
        return arraya;
    }
    public static int[] descent(int []arraya){
        int [] arrayd = new int [4];
        for (int i = 0; i < arrayd.length; i++) {
                  for (int j = arraya.length;; j--) {
                
            }
                    }
        return arrayd;
    }
    public static int  arregloaint(int[] arreglo){ 
        int num = 0;
        for (int i = 0; i < arreglo.length; i++) {
            
            num += (int)arreglo[i];
        }
        return num;
    }
    
}//fin de la clase   

