package com.gxcme;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	// 循环一维数组
	public static final Car[] Cars = { new PassageCar(1, "奥迪A4", 500, 5),
			new PassageCar(2, "马自达", 400, 4), new TruckCar(3, "一汽", 800, 4),
			new TruckCar(4, "大运", 1500, 15), new PickUp(5, "皮卡雪", 1000, 3, 5) };
	private static int num;
	// 主函数
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("欢迎使用哒哒租车系统！");
		System.out.print("请问您是否要租车(1是  0否)：");
		int input = scanner.nextInt();
		if (input != 1) {
			System.out.println("感谢您使用哒哒租车，祝您生活愉快！");
			System.exit(-1);
		} else {
			System.out.println("这是您可选择的租车详情列表！");
			System.out.println("序号\t汽车名称\t租金\t\t容量");
			for (int i = 0; i < Cars.length; i++) {
				System.out.printf("%d\t%s\t%d元/天\t\t%s\n", Cars[i].getCarId(),
						Cars[i].getCarName(), Cars[i].getPrice(), Cars[i]
								.getCapacity());
			}
		}

		System.out.println();

		// 保存已选择要租的车
		// ArrayList<Car> list=new ArrayList<Car>();
		// list.addAll(list);

		System.out.print("请输入租车数量：");
		int count = scanner.nextInt();

		// 空数组保存要租的车
		int[] choices = new int[Cars.length];
	
			for (int i = 0; i < count; i++) {
				System.out.printf("请输入您租的第" + (i + 1) + "辆车序号:");
				// -1,
				int num = scanner.nextInt();
				while(num<1||num>5){
					System.out.println("没有该车序号，请重新输入:");
					int oNum=scanner.nextInt();
					num=oNum;
				}
				choices[num]++;
			}
		

		System.out.print("请输入租车天数：");
		int days = scanner.nextInt();

		// 显示账单提示
		System.out.println("这是租车账单，请您核对！");

		// 载人车型
		System.out.println("----------可载人的车型是----------");
		// 定义变量，用来保存总人数
		int peopleNumTotal = 0;
		for (int i = 0; i < choices.length; i++) {
			if (choices[i] != 0 && Cars[i] instanceof IHumanNum) {
				System.out.printf("%s\t", Cars[i].getCarName());
				peopleNumTotal += ((IHumanNum) Cars[i]).getHumanNum()
						* choices[i];
			}
		}
		System.out.printf("共载" + peopleNumTotal + "人\n");

		// 载货车型
		System.out.println("----------可载货的车型是----------");
		// 定义变量，用来保存总重量
		int weightTotal = 0;
		for (int i = 0; i < choices.length; i++) {
			if (choices[i] != 0 && Cars[i] instanceof ICarGo) {
				System.out.printf("%s\t", Cars[i].getCarName());
				weightTotal += ((ICarGo) Cars[i]).getCaGo() * choices[i];
			}
		}
		System.out.println("共载" + weightTotal + "吨\n");

		// 保存总租车金额
		int totalPrice = 0;
		for (int i = 0; i < choices.length; i++) {
			if (choices[i] != 0) {
				totalPrice += (Cars[i].getPrice() * choices[i]) * days;
			}
		}
		System.out.println("--------租车总金额是：" + totalPrice + "元--------");

		// 最后确认，是否租车
		System.out.println("请问您是否确认租车！(1 是   0否):");
		int confirm = scanner.nextInt();
		if (confirm == 1) {
			System.out.println("您已成功支付租车金额:" + totalPrice + "元");
		} else {
			System.out.println("感谢您使用哒哒租车，祝您生活愉快！");
			System.exit(-1);
		}

		// 关闭资源
		scanner.close();
	}

}