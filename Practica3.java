package Prac3;

import java.util.Scanner;

public class Estadisticas {
    private double[] datos;
    
    public Estadisticas(double[] datos) {
        this.datos = datos;
    }
    
    public double promedio() {
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }
    
    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        
        for (double dato : datos) {
            sumaCuadrados += Math.pow(dato - prom, 2);
        }
        
        return Math.sqrt(sumaCuadrados / (datos.length - 1));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }
        
        Estadisticas stats = new Estadisticas(numeros);
        
        System.out.printf("El promedio es %.2f%n", stats.promedio());
        System.out.printf("La desviación estándar es %.5f%n", stats.desviacion());
        
        scanner.close();
    }
}
