package uap.models;

import uap.bases.Donut;
import uap.interfaces.Calculable;
import uap.interfaces.Convertible;
import uap.interfaces.PIReq;
import uap.interfaces.ShipCost;
import uap.interfaces.ThreeD;

public class Torus extends Donut implements ThreeD, PIReq, Calculable, Convertible, ShipCost{
    private double outerRadius;
    private double innerRadius;


    public Torus(double outerRadius, double innerRadius) {
        super();
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
        
    }

    public Torus() {

    }

    @Override
    public double getVolume (){
        return 2 * Math.pow(PI, 2) * outerRadius * Math.pow(innerRadius, 2);
    }

    @Override
    public double getsurfaceArea(){
        return 4 * Math.pow(PI, 2) * outerRadius * innerRadius;
    }

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
