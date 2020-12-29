class TestSynchMethod
{
	synchronized void PrintResult()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("values of i is :"+ i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception ob)
			{
				System.out.println(ob);
			}
		}
	}
}
class Thread1 extends Thread
{
	TestSynchMethod ob3;
	Thread1(TestSynchMethod ob)
	{
		ob3=ob;
	}
	public void run()
	{
		ob3.PrintResult();
	}
}
class Thread2 extends Thread
{
	TestSynchMethod ob4;
	Thread2(TestSynchMethod ob)
	{
		ob4=ob;
	}
	public void run()
	{
		ob4.PrintResult();
	}
}
class TestSynchMethodDemo
{
	public static void main(String args[])
	{
		TestSynchMethod ob = new TestSynchMethod();
		Thread1 ob1 = new Thread1(ob);
		Thread2 ob2 = new Thread2(ob);
		ob1.start();
		ob2.start();
	}
}