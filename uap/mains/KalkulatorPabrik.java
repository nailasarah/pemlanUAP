package uap.mains;

import uap.models.Torus;
import uap.models.Sphere;
import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Naila Sarah Yunanda");
        System.out.println("245150700111036");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        
        System.out.print("Isikan Radius : ");
        double outerRadius = input.nextDouble();
        
        System.out.print("Isikan radius : ");
        double innerRadius = input.nextDouble();
        System.out.println("==================================");
        
        Torus torus = new Torus(outerRadius, innerRadius);
        torus.dislayInfo();
        System.out.println("Massa dalam kg: " + torus.gramsToKg());
        System.out.println("Biaya Kirim: Rp." + torus.calculateShippingCost());
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        
        System.out.print("Isikan radius : ");
        double radius = input.nextDouble();
        System.out.println("==================================");

        Sphere donutBola = new Sphere(radius);
        donutBola.dislayInfo();
        System.out.println("Massa dalam kg: " + donutBola.gramsToKg());
        System.out.println("Biaya Kirim: Rp." + donutBola.calculateShippingCost());
        System.out.println("==================================");

        input.close();
    }
}