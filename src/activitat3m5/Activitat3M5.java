package activitat3m5;

import java.util.Scanner;


public class Activitat3M5 {

    
    public static void main(String[] args) 
    {
        int uf = 0;
        int resultado = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Introdueix les UF a matricular");
        uf = input.nextInt();
        if(uf < 12)
        {
            resultado = uf *30;
            System.out.println("El preu serà: "+resultado+"€");
        }else if (uf >= 12)
        {
            resultado = 380;
            System.out.println("El preu serà "+resultado+"€");
        }
    }
    
}