package mainp5;

import java.util.Scanner;

public class Parcial1P5 {
    private int num[];
    private int n;
    private int posicion;
     Scanner sc = new Scanner(System.in);
     
    public Parcial1P5(){
        System.out.println("Practica 5");
    }
    public void captura(){
        num = new int[10];
    for(int i=0; i<10; i++){
        System.out.print("Ingrese un numero: ");
        num[i]=sc.nextInt();
    }
    }
    public void proceso(){
        System.out.print("Ingrese el numero a buscar: ");
        n = sc.nextInt();
        for(int i=0; i<10; i++){
            if(n==num[i]){
                System.out.println("El indice de valor " + n + " es: " + (i+1));
            }
        }  
    }
}
