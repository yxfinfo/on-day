package com.gxcme;

public abstract class Car {
	//��װ����
	private int carId;
	private String carName;
	private int price;
	//���췽��
	public Car(int carId,String carName,int price){
		this.carId=carId;
		this.carName=carName;
		this.price=price;
	}
	//�̳е�������뺬�еķ�����
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
