package com.gxcme;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	// ѭ��һά����
	public static final Car[] Cars = { new PassageCar(1, "�µ�A4", 500, 5),
			new PassageCar(2, "���Դ�", 400, 4), new TruckCar(3, "һ��", 800, 4),
			new TruckCar(4, "����", 1500, 15), new PickUp(5, "Ƥ��ѩ", 1000, 3, 5) };
	private static int num;
	// ������
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("��ӭʹ�������⳵ϵͳ��");
		System.out.print("�������Ƿ�Ҫ�⳵(1��  0��)��");
		int input = scanner.nextInt();
		if (input != 1) {
			System.out.println("��л��ʹ�������⳵��ף��������죡");
			System.exit(-1);
		} else {
			System.out.println("��������ѡ����⳵�����б�");
			System.out.println("���\t��������\t���\t\t����");
			for (int i = 0; i < Cars.length; i++) {
				System.out.printf("%d\t%s\t%dԪ/��\t\t%s\n", Cars[i].getCarId(),
						Cars[i].getCarName(), Cars[i].getPrice(), Cars[i]
								.getCapacity());
			}
		}

		System.out.println();

		// ������ѡ��Ҫ��ĳ�
		// ArrayList<Car> list=new ArrayList<Car>();
		// list.addAll(list);

		System.out.print("�������⳵������");
		int count = scanner.nextInt();

		// �����鱣��Ҫ��ĳ�
		int[] choices = new int[Cars.length];
	
			for (int i = 0; i < count; i++) {
				System.out.printf("����������ĵ�" + (i + 1) + "�������:");
				// -1,
				int num = scanner.nextInt();
				while(num<1||num>5){
					System.out.println("û�иó���ţ�����������:");
					int oNum=scanner.nextInt();
					num=oNum;
				}
				choices[num]++;
			}
		

		System.out.print("�������⳵������");
		int days = scanner.nextInt();

		// ��ʾ�˵���ʾ
		System.out.println("�����⳵�˵��������˶ԣ�");

		// ���˳���
		System.out.println("----------�����˵ĳ�����----------");
		// �����������������������
		int peopleNumTotal = 0;
		for (int i = 0; i < choices.length; i++) {
			if (choices[i] != 0 && Cars[i] instanceof IHumanNum) {
				System.out.printf("%s\t", Cars[i].getCarName());
				peopleNumTotal += ((IHumanNum) Cars[i]).getHumanNum()
						* choices[i];
			}
		}
		System.out.printf("����" + peopleNumTotal + "��\n");

		// �ػ�����
		System.out.println("----------���ػ��ĳ�����----------");
		// �����������������������
		int weightTotal = 0;
		for (int i = 0; i < choices.length; i++) {
			if (choices[i] != 0 && Cars[i] instanceof ICarGo) {
				System.out.printf("%s\t", Cars[i].getCarName());
				weightTotal += ((ICarGo) Cars[i]).getCaGo() * choices[i];
			}
		}
		System.out.println("����" + weightTotal + "��\n");

		// �������⳵���
		int totalPrice = 0;
		for (int i = 0; i < choices.length; i++) {
			if (choices[i] != 0) {
				totalPrice += (Cars[i].getPrice() * choices[i]) * days;
			}
		}
		System.out.println("--------�⳵�ܽ���ǣ�" + totalPrice + "Ԫ--------");

		// ���ȷ�ϣ��Ƿ��⳵
		System.out.println("�������Ƿ�ȷ���⳵��(1 ��   0��):");
		int confirm = scanner.nextInt();
		if (confirm == 1) {
			System.out.println("���ѳɹ�֧���⳵���:" + totalPrice + "Ԫ");
		} else {
			System.out.println("��л��ʹ�������⳵��ף��������죡");
			System.exit(-1);
		}

		// �ر���Դ
		scanner.close();
	}

}