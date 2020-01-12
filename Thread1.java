class A implements Runnable{
	public void run(){
	int i;
	for(i=0;i<=10;i++){
		System.out.println("Thread A is:"+i);
	}
}
}
class B implements Runnable{
	public void run(){
	int i;
	for(i=0;i<=10;i++){
		System.out.println("Thread B is:"+i);
	}}
}
class Thread1{
	public static void main(String[] args){
	//A a=new A();
	//B b=new B();
	Thread t1 = new Thread(new A());
	Thread t2 = new Thread(new B());
    t1.start();
	t2.start();
	t2.setPriority(10);
	t2.getPriority();
	}
} 