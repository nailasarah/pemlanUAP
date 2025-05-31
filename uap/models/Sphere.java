package uap.models;

import uap.bases.Donut;
import uap.interfaces.Calculable;
import uap.interfaces.Convertible;
import uap.interfaces.PIReq;
import uap.interfaces.ShipCost;
import uap.interfaces.ThreeD;

public class Sphere extends Donut implements ThreeD, PIReq, Calculable, Convertible, ShipCost {
    private double radius;

        public Sphere() {}
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override 
    public double getVolume(){
    return 4.0/3.0 * PI * Math.pow(radius, 3);
    }

    @Override
     public double getsurfaceArea(){
        return 4 * PI * Math.pow(radius,2);
    }
        
     @Override
    public double getMass(){
        return DENSITY * getsurfaceArea() * THICKNESS;
    }

     @Override
    public void dislayInfo(){
        System.out.println("Volume : " + getVolume());
        System.out.println("Luas Permukaan: " + getsurfaceArea());
        System.out.println("Massa: " + getMass());
    }

    @Override
    public double gramsToKg(){
        return getMass() / DENOM;
    }
    @Override
    public double calculateShippingCost(){
        return Math.ceil(gramsToKg()) * PRICE_PER_KG;
    }
    
}
