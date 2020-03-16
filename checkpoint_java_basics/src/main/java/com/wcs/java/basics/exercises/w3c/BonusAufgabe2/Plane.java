package com.wcs.java.basics.exercises.w3c.BonusAufgabe2;

public abstract class Plane {

	static int amountPlane;
	
	String planetype;
	String planeId;
	double spread;
	int seats;
	
	public Plane (String planetype, String planeId, double spread, int seats) {
		super();
		this.planetype = planetype;
		this.planeId = planeId;
		this.spread = spread;
		this.seats = seats;
		amountPlane++;
	}

	public String getPlanetype() {
		return planetype;
	}

	public void setPlanetype(String planetype) {
		this.planetype = planetype;
	}

	public String getPlaneId() {
		return planeId;
	}

	public void setPlaneId(String planeId) {
		this.planeId = planeId;
	}

	public double getSpread() {
		return spread;
	}

	public void setSpread(double spread) {
		this.spread = spread;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public abstract String toString();
	
	
}
