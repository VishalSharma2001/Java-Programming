class Static{
	int x;
	static int y;
	public void fun1(int x)
	{
		System.out.println("x="+x);
	}
	public static void fun2()
	{
		System.out.println(y=4);
    }
public static void main(String arg[])
	{
		Static S1 = new Static();
		S1.fun1(10);
		Static.fun2();
	}
}

