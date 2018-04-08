package com.gxcme;

public class PassageCar extends Car implements IHumanNum {
private int humanNum;
	public PassageCar(int carId, String carName, int price,int humanNum) {
		super(carId, carName, price);
		this.humanNum=humanNum;

	}

	@Override
	public int getHumanNum() {
		return humanNum;
		
	}

	@Override
	public void setHumanNum(int humanNum) {
		// TODO Auto-generated method stub
		this.humanNum=humanNum;
	}

	
	@Override
	public String getCapacity() {
		// TODO Auto-generated method stub
		return "ÔØÈËÊı£º"+humanNum+"ÈË";
	}

}
