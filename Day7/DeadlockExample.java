package com.celcom.day7;

class Resource01{
	private String data;
	public String getData(){
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}

class Reader extends Thread{
	Resource01 resource;
	
	Reader(Resource01 resource){
		this.resource = resource;
	}
	
	public void run() { //starting reader thread
		synchronized (resource) { //to lock shared resource
			System.out.println("Reader is waiting for writer to write data ");
			try{
				resource.wait(); //waiting for writer
			} catch(InterruptedException e) {
				
			}
			System.out.println("Data from reader: "+resource.getData());
		}
	}
}

class Writer extends Thread{
	Resource01 resource;
	
	Writer(Resource01 resource){
		this.resource = resource;
	}
	
	public void run() {  //starting writer thread
		synchronized (resource) { //to aquire lock before modifying resource
			System.out.println("Writer is Writing the data ");
			resource.setData("Hiii!"); 
			resource.notifyAll(); //to start reader thread
			System.out.println("Data from Writer: "+resource.getData());
		}
	}
}
public class DeadlockExample {

	public static void main(String[] args) throws InterruptedException {
		Resource01 resource = new Resource01();
		Reader reader = new Reader(resource);
		reader.start();
		Thread.sleep(2000); //to see output clearly
		Writer writer = new Writer(resource);
		writer.start();

	}

}
