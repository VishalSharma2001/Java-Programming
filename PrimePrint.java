class PrimePrint{
	public static void main(String[] args){
		int i,n;
		for(i=1;i<10;i++)
			if(n%i==0)
				break;
			if(i==n)
				System.out.println("Prime number"+n);
			else
				System.out.println("no prime number");
	}
}	