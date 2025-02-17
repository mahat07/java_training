package com.celcom.MondayAssignment;

import java.util.Scanner;

class StorageSpace{
	private int goods;
	public int getNoOfGoods(){
		return goods;
	}
	public void addGoods(int goods) {
		if(goods>0) {
			this.goods += goods;
		}
	}
	public void buyGoods(int goods) {
		if(goods>this.goods) {
			System.out.println("Lack of goods");
		}
		else {
			this.goods -= goods;
			System.out.println("Consumer purchased "+goods+" goods");

			System.out.println("Goods bought successfully");
			System.out.println("Remaining goods: "+getNoOfGoods());
		}
	}
}

class Producer extends Thread{
	private StorageSpace goods;

	Producer(StorageSpace goods){
		this.goods = goods;
	}
	
	public void run() {
		synchronized(goods){
			System.out.println("Enter count of goods to be stored");
			int k = new Scanner(System.in).nextInt();
			goods.addGoods(k);
			System.out.println("Goods stored successfully");
			System.out.println("Available goods: "+goods.getNoOfGoods());
			goods.notifyAll();
		}
	}
	
	
}

class Consumer extends Thread{
	private StorageSpace goods;

	Consumer(StorageSpace goods){
		this.goods = goods;
	}
	
	public void run() {
		synchronized(goods){
			System.out.println("Waiting for producer to add goods");
			try{
				goods.wait();
			}
			catch (InterruptedException e){
				
			}
			System.out.println("Enter count of goods to be retrived");
			int k = new Scanner(System.in).nextInt();
			goods.buyGoods(k);		}
	}
	
	
}


public class ProducerConsumerScenario {

	public static void main(String[] args) throws InterruptedException {
		StorageSpace s1 = new StorageSpace();
		Consumer c1 = new Consumer(s1);
		c1.start();
		Thread.sleep(2000);
		Producer p1 = new Producer(s1);
		p1.start();

	}

}
