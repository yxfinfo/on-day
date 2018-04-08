package com.gxcme;

public class TruckCar extends Car implements ICarGo {
	private int cargo;
	public TruckCar(int carId, String carName, int price,int cargo) {
		super(carId, carName, price);
		// TODO Auto-generated constructor stub
		this.cargo=cargo;
	}
		
	@Override
	public int getCaGo() {
		// TODO Auto-generated method stub
		return cargo;
	}

	@Override
	public void setCarGo(int cargo) {
		// TODO Auto-generated method stub
		this.cargo=cargo;
	}

	@Override
	public String getCapacity() {
		// TODO Auto-generated method stub
		return "‘ÿªı¡ø£∫"+cargo+"∂÷";
	}
	
}
