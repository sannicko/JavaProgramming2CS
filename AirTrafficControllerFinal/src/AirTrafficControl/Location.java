/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirTrafficControl;

/**
 *
 */
public class Location implements Comparable<Location> {
    private int xLoc;
    private int yLoc;

    public Location(int xLoc, int yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    @Override
    public String toString() {
        return "Location{" + "xLoc=" + xLoc + ", yLoc=" + yLoc + '}';
    }

    public int compareTo(Location loc){

    	int locX = ((Location) loc).getxLoc();

		//ascending order
		return this.xLoc - locX;

		//descending order
		//return compareQuantity - this.quantity;
    }

}
