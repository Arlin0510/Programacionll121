package Prac1;

import java.util.Scanner;

public class EcuacionLineal {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public boolean tieneSolucion() {
        return (a * d - b * c) != 0;
    }
    
    public double getX() {
        double denominador = a * d - b * c;
        if (denominador == 0) return 0;
        return (e * d - b * f) / denominador;
    }
    
    public double getY() {
        double denominador = a * d - b * c;
        if (denominador == 0) return 0;
        return (a * f - e * c) / denominador;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        
        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);
        
        if (ecuacion.tieneSolucion()) {
            System.out.printf("x = %.1f, y = %.1f%n", ecuacion.getX(), ecuacion.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
        
        scanner.close();
    }
}