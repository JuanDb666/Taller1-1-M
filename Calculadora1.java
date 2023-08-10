
package com.mycompany.calculadora1;

import static com.mycompany.calculadora1.math.radiant;
import static java.lang.Math.sin;
import java.util.Scanner;


public class Calculadora1 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int opcion;
        double num1;
        double num2;
        double resultado;
        double grados;
        
          
        do{
               System.out.println("Bienvenido a la app calculadora \n\nSeleccione la opcion que desea usar:\n\n\t1. Suma\n\t2. Resta\n\t3. Multiplicación"
             + "\n\t4. División\n\t5. Seno\n\t6. Coseno\n\t7. Tangente\n\t8. Raiz\n\t9. Potencia\n\t10. Porcentaje de IVA\n\t11. SALIR");
            opcion= p.nextInt();
        while(opcion<0 || opcion>11){
             System.out.println("Opcion seleccionada invalida (no esta progrmada)\n\nPor favor seleccione una opcion programada\n\n");
             System.out.println("Bienvenido a la app calculadora \n\nSeleccione la opcion que desea usar:\n\n\t1. Suma\n\t2. Resta\n\t3. Multiplicación"
                + "\n\t4. División\n\t5. Seno\n\t6. Coseno\n\t7. Tangente\n\t8. Raiz\n\t9. Potencia\n\t10. Porcentaje de IVA\n\t11. SALIR");
            opcion= p.nextInt();
        };
            switch(opcion){
                case 1 -> {
                    System.out.println("\nIngrese el primer valor que desea sumar:    ");
                    num1=p.nextDouble();
                    System.out.println("\nIngrese el segundo valor que desea sumar:    ");
                    num2=p.nextDouble();
                    resultado=num1+num2;
                    System.out.println("\n\nEl resultado de la suma de "+num1+" + " +num2+" = "+resultado);
                    break;
                }
                case 2 -> {
                    System.out.println("\nIngrese el primer valor que desea restar:    ");
                    num1=p.nextDouble();
                    System.out.println("\nIngrese el segundo valor que desea restar:    ");
                    num2=p.nextDouble();
                    resultado=num1-num2;
                    System.out.println("\n\nEl resultado de la resta de "+num1+" - " +num2+" = "+resultado);
                    break;
                }
                case 3 -> {
                    System.out.println("\nIngrese el primer valor que desea multiplicar:    ");
                    num1=p.nextDouble();
                    System.out.println("\nIngrese el segundo valor que desea multiplicar:    ");
                    num2=p.nextDouble();
                    resultado=num1*num2;
                    System.out.println("\n\nEl resultado de la multiplicación de "+num1+" x " +num2+" = "+resultado);
                    break;
                }
                case 4 -> {
                    System.out.println("\nIngrese el primer valor que desea dividir:    ");
                    num1=p.nextDouble();
                    System.out.println("\nIngrese el segundo valor que desea dividir:    ");
                    num2=p.nextDouble();
                    resultado=num1/num2;
                    System.out.println("\n\nEl resultado de la división de "+num1+" / " +num2+" = "+resultado);
                    break;
                }
                case 5 -> {
                    System.out.println("\nIngrese el angulo del que desea medir el seno:    ");
                    num1=p.nextDouble();
                    num2=Math.toRadians(num1);
                    resultado=sin(num2);
                    System.out.println("\n\nEl resultado de seno de "+num1+" = "+resultado);
                    break;
                }
                case 6->{
                    
                }
            }
        }while (opcion != 12);
    }
}
