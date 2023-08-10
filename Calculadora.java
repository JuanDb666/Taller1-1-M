
package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int opcion;
        double num1;
        double num2;
        double resultado;
        double grados;
        
             System.out.println("Bienvenido a la app calculadora \n\nSeleccione la opcion que desea usar:\n\n\t1. Suma\n\t2. Resta\n\t3. Multiplicación"
             + "\n\t4. División\n\t5. Seno\n\t6. Coseno\n\t7. Tangente\n\t8. Raiz\n\t9. Potencia\n\t10. Porcentaje de IVA\n\t11. SALIR");
            opcion= p.nextInt();
        while(opcion<0 || opcion>11){
             System.out.println("Bienvenido a la app calculadora \n\nSeleccione la opcion que desea usar:\n\n\t1. Suma\n\t2. Resta\n\t3. Multiplicación"
                + "\n\t4. División\n\t5. Seno\n\t6. Coseno\n\t7. Tangente\n\t8. Raiz\n\t9. Potencia\n\t10. Porcentaje de IVA\n\t11. SALIR");
            opcion= p.nextInt();
            if (opcion == 0 || opcion == 12 ){
                System.out.println("Opcion seleccionada invalida (no esta progrmada)\n\nPor favor seleccione una opcion programada\n\n");
            }
        };
        do{
            switch(opcion){
                case 1:{
                    System.out.println("\nIngrese el primer valor que desea sumar:    ");
                    num1=p.nextDouble();
                    System.out.println("\nIngrese el segundo valor que desea sumar:    ");
                    num2=p.nextDouble();
                    resultado=num1+num2;
                    System.out.println("\n\nEl resultado de la suma de "+num1+" + " +num2+" = "+resultado);
                    break;
                }
                case 2:{
                    System.out.println("\nIngrese el primer valor que desea restar:    ");
                    num1=p.nextDouble();
                    System.out.println("\nIngrese el segundo valor que desea restar:    ");
                    num2=p.nextDouble();
                    resultado=num1-num2;
                    System.out.println("\n\nEl resultado de la suma de "+num1+" - " +num2+" = "+resultado);
                }
            }
        }while (opcion != 12);
    }
}
