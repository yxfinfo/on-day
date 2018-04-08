package com.gxcme;

public abstract class Car {
	//封装属性
	private int carId;
	private String carName;
	private int price;
	//构造方法
	public Car(int carId,String carName,int price){
		this.carId=carId;
		this.carName=carName;
		this.price=price;
	}
	//继承的子类必须含有的方法体
	public abstract String getCapacity();
	
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
