package io.cottagem.java;

class SingletonObjectDemo {

	private SingletonObjectDemo() {
	}

	private static SingletonObjectDemo singletonObj;
	public static SingletonObjectDemo getSingletonObj() {
		
		if(singletonObj == null) {
			
			singletonObj = new SingletonObjectDemo();
		}
		return singletonObj;
	}

}

 class SingletonObjectCall {
	public static void main(String args[]){
				
		//create the Singleton Object..
	    SingletonObjectDemo obj = SingletonObjectDemo.getSingletonObj();

		// Your Business Logic
		System.out.println("Singleton object obtained: ");
		
	}
}
