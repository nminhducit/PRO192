/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class Cat {
    protected String area;
    protected int leg;

    public Cat() {
    }

    public Cat(String area, int leg) {
        this.area = area;
        this.leg = leg;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return area + ", " + leg;
    }
    
    
    
}
