class CurrentThread
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();//currentThread() is a static method called by classname not an object
		System.out.println(t);//currentThread() method returns object of class Thread
		System.out.println("Thread name="+t.getName());
		System.out.println("Thread prio="+t.getPriority());
		System.out.println("ThreadGroup name="+t.getThreadGroup().getName());
		//thread object when printed shows three infos--> Thread Name,--Thread Priority---Thread GroupName
		t.setName("Demo Thread");
		System.out.println(t);
		System.out.println("thread name="+t.getName());
	}
}