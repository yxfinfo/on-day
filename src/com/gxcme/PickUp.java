package com.gxcme;

public  class PickUp extends Car implements IHumanNum,ICarGo {
	private int humanNum;
	private int cargo;
	public PickUp(int carId, String carName, int price,int humanNum,int cargo) {
		super(carId, carName, price);
		// TODO Auto-generated constructor stub
		this.humanNum=humanNum;
		this.cargo=cargo;
	}

	@Override
	public int getHumanNum() {
		// TODO Auto-generated method stub
		return humanNum;
	}

	@Override
	public void setHumanNum(int humanNum) {
		// TODO Auto-generated method stub
		this.humanNum=humanNum;
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
		return "载人数："+humanNum+"人"+"  "+"载货量："+cargo+"吨";
	}

	

}
