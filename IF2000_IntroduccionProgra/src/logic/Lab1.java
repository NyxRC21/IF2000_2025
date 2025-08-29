/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Daniel Ríos
 */
public class Lab1 {

    public void ejercicio1() {
        int n = 7;
        if (n % 2 == 0) {
            System.out.println(n + " es un numero par.");
        } else {
            System.out.println(n + " es un numero impar.");
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio2() {
        int n = -16;
        int valorA;

        if (n < 0) {
            valorA = -n;
        } else {
            valorA = n;
        }
        System.out.println("El valor absoluto de " + n + " es: " + valorA);
        System.out.println("\n----------------------");

    }

    public void ejercicio3() {
        int suma = 0;
        System.out.println("Serie de numeros: ");
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }
        System.out.println("\nLa suma de la serie de numeros es: " + suma);
        System.out.println("\n----------------------");
    }

    public void ejercicio4() {
        int num1 = 12;
        int num2 = 5;
        int num3 = 9;
        int temp;
        
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("Los números en orden ascendente son: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("\n----------------------");
    }

    public void ejercicio5() {
        int n1 = 10;
        int n2 = 5;

        int resultado;

        if (n1 == n2) {
            resultado = n1 * n2;
            System.out.println("Son iguales, se deben multiplicar: " + resultado);
        } else if (n1 > n2) {
            resultado = n1 - n2;
            System.out.println("El primer número es mayor, se restan: " + resultado);
        } else {
            resultado = n1 + n2;
            System.out.println("El primer número es menor, se suman: " + resultado);
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio6() {
        int[] notas = {7, 5, 10, 8, -1};
        boolean nota = false;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == -1) {
                break;
            }
            if (notas[i] == 10) {
                nota = true;
            }
        }

        if (nota) {
            System.out.println("Sí hay al menos una nota con 10.");
        } else {
            System.out.println("No hay ninguna nota con 10.");
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio7() {
        int edad = 20;
        char sexo = 'F';
        int pulsaciones = 0;

        if (sexo == 'F') {
            pulsaciones = (220 - edad) / 10;
        } else if (sexo == 'M') {
            pulsaciones = (210 - edad) / 10;
        }

        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Número de pulsaciones por cada 10 segundos: " + pulsaciones);
        System.out.println("\n----------------------");
    }

    public void ejercicio8() {
        double salario = 500000;
        int antiguedad = 8;
        double utilidad = 0;

        if (antiguedad < 1) {
            utilidad = salario * 0.05;
        } else if (antiguedad >= 1 && antiguedad < 2) {
            utilidad = salario * 0.07;
        } else if (antiguedad >= 2 && antiguedad < 5) {
            utilidad = salario * 0.10;
        } else if (antiguedad >= 5 && antiguedad < 10) {
            utilidad = salario * 0.15;
        } else if (antiguedad >= 10) {
            utilidad = salario * 0.20;
        }

        System.out.println("Salario mensual: " + salario);
        System.out.println("Años en la empresa: " + antiguedad);
        System.out.println("La utilidad anual que recibe es: " + utilidad);
        System.out.println("\n----------------------");
    }

    public void ejercicio9() {
        int n = 17;
        boolean numPrimo = true;

        if (n <= 1) {
            numPrimo = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    numPrimo = false;
                    break;
                }
            }
        }

        if (numPrimo) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " no es un número primo.");
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio10() {
        int cantidad = 8;
        double precioUnitario = 11000;
        double totalSinDescuento, descuento = 0, totalPagar;

        totalSinDescuento = cantidad * precioUnitario;

        if (cantidad < 5) {
            descuento = totalSinDescuento * 0.10;
        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = totalSinDescuento * 0.20;
        } else if (cantidad >= 10) {
            descuento = totalSinDescuento * 0.40;
        }

        totalPagar = totalSinDescuento - descuento;

        System.out.println("Cantidad de computadoras: " + cantidad);
        System.out.println("Precio total sin descuento: " + totalSinDescuento);
        System.out.println("Monto de descuento: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);
        System.out.println("\n----------------------");
    }

    public void ejercicio11() {
        int N = 20;

        System.out.println("Números primos entre 2 y " + N + ":");

        for (int num = 2; num <= N; num++) {
            boolean numPrimo = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    numPrimo = false;
                    break;
                }
            }

            if (numPrimo) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio12() {
        double base = 8;
        double altura = 5;
        double area;

        area = (base * altura) / 2;

        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área del triángulo: " + area);
        System.out.println("\n----------------------");
    }
}
