/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio.pkg2;

/**
 *
 * @author Daniel Ríos
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laboratorio2 ejer13;
        Laboratorio2 ejer14;
        Laboratorio2 ejer15;
        Laboratorio2 ejer16;
        Laboratorio2 ejer17;
        Laboratorio2 ejer18;
        Laboratorio2 ejer19;
        Laboratorio2 ejer20;
        Laboratorio2 ejer21;
        Laboratorio2 ejer22;
        Laboratorio2 ejer23;
        Laboratorio2 ejer24;
        Laboratorio2 ejer25;
        Laboratorio2 ejer26;
        Laboratorio2 ejer27;
        ejer13 = new Laboratorio2();
        ejer13.ejercicio13();

        ejer14 = new Laboratorio2();
        ejer14.ejercicio14();

        ejer15 = new Laboratorio2();
        ejer15.ejercicio15();

        ejer16 = new Laboratorio2();
        ejer16.ejercicio16();

        ejer17 = new Laboratorio2();
        ejer17.ejercicio17();

        ejer18 = new Laboratorio2();
        ejer18.ejercicio18();

        ejer19 = new Laboratorio2();
        ejer19.ejercicio19();

        ejer20 = new Laboratorio2();
        ejer20.ejercicio20();

        ejer21 = new Laboratorio2();
        ejer21.ejercicio21();

        ejer22 = new Laboratorio2();
        ejer22.ejercicio22();

        ejer23 = new Laboratorio2();
        ejer23.ejercicio23();

        ejer24 = new Laboratorio2();
        ejer24.ejercicio24();

        ejer25 = new Laboratorio2();
        ejer25.ejercicio25();

        ejer26 = new Laboratorio2();
        ejer26.ejercicio26();

        ejer27 = new Laboratorio2();
        ejer27.ejercicio27();
    }
    
    public void ejercicio13() {
        int suma = 0;
        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares entre 2 y 1000 es: " + suma);
        System.out.println("\n----------------------");
    }

    public void ejercicio14() {
        double c = 25;
        double f;
        f = (9.0 / 5.0) * c + 32;

        System.out.println("La temperatura en Celsius es: " + c);
        System.out.println("La temperatura en Fahrenheit es: " + f);
        System.out.println("\n----------------------");
    }

    public void ejercicio15() {
        int x = 3;
        int n = 4;
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado = resultado * x;
        }

        System.out.println(x + " elevado a la " + n + " = " + resultado);
        System.out.println("\n----------------------");
    }

    public void ejercicio16() {
        int numero = 4;
        String mes;

        switch (numero) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "Número inválido";
        }
        System.out.println("El mes correspondiente es: " + mes);
        System.out.println("\n----------------------");
    }

    public void ejercicio17() {
        int x = -4;
        int f;

        if (x > 0) {
            f = x + 5;
        } else if (x < 0) {
            f = x * x;
        } else {
            f = 1;
        }

        System.out.println("El valor de F(" + x + ") es: " + f);
        System.out.println("\n----------------------");
    }

    public void ejercicio18() {
        double ladoA = 7;
        double ladoB = 8;
        double ladoC = 5;

        double p = (ladoA + ladoB + ladoC) / 2;
        double area = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));

        System.out.println("Lado a: " + ladoA);
        System.out.println("Lado b: " + ladoB);
        System.out.println("Lado c: " + ladoC);
        System.out.println("Área del triángulo: " + area);
        System.out.println("\n----------------------");
    }

    public void ejercicio19() {
        int numA = 5;
        int numB = 10;
        int temp;

        System.out.println("Antes del intercambio:");
        System.out.println("A = " + numA);
        System.out.println("B = " + numB);

        temp = numA;
        numA = numB;
        numB = temp;

        System.out.println("Después del intercambio:");
        System.out.println("A = " + numA);
        System.out.println("B = " + numB);
        System.out.println("\n----------------------");
    }

    public void ejercicio20() {
        double x0 = 2, y0 = 4;
        double x1 = 6, y1 = 10;

        double m = (y0 - y1) / (x0 - x1);
        double b = y0 - (m * x0);

        System.out.println("La ecuación de la recta es:");
        System.out.println("y = " + m + "x + " + b);
        System.out.println("\n----------------------");
    }

    public void ejercicio21() {
        int K = 10;
        int suma = 0;
        for (int i = 1; i < K; i++) {
            suma += i;
        }

        System.out.println("La suma de todos los números naturales menores que " + K + " es: " + suma);
        System.out.println("\n----------------------");
    }

    public void ejercicio22() {
        double[] numeros = {5, 8, 12, 7, 10};
        double suma = 0;
        int cantidad = numeros.length;
        for (int i = 0; i < cantidad; i++) {
            suma += numeros[i];
        }
        double promedio = suma / cantidad;

        System.out.println("La serie de números es:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nPromedio: " + promedio);
        System.out.println("\n----------------------");
    }

    public void ejercicio23() {
        int[] numeros = {4, 7, 2, 9, 10, 3, 8, 5, 6, 1};
        int sumaPares = 0;
        int sumaImpares = 0;
        int sumaTotal = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaTotal += numeros[i];
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
                contadorPares++;
            } else {
                sumaImpares += numeros[i];
                contadorImpares++;
            }
        }
        System.out.println("Suma de los números pares: " + sumaPares);
        System.out.println("Suma de los números impares: " + sumaImpares);
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
        System.out.println("Suma total de los números: " + sumaTotal);
        System.out.println("\n----------------------");
    }

    public void ejercicio24() {
        int sumaPares = 0;
        int sumaImpares = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }
        System.out.println("Suma de los números pares entre 1 y 200: " + sumaPares);
        System.out.println("Suma de los números impares entre 1 y 200: " + sumaImpares);
        System.out.println("\n----------------------");
    }

    public void ejercicio25() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i * i;
        }
        System.out.println("La suma de los cuadrados de los primeros 100 números naturales es: " + suma);
        System.out.println("\n----------------------");
    }

    public void ejercicio26() {
        int n = 5;
        long factorial = 1;
        if (n == 0 || n == 1) {
            factorial = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
        System.out.println("\n----------------------");
    }

    public void ejercicio27() {
        int[] numeros = {5, 12, 7, 20, 9, 3, 18, 6, 15, 10};
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El valor máximo de la serie es: " + maximo);
        System.out.println("\n----------------------");
    }
}
