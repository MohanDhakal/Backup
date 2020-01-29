class MainThread
{
  public static void main(String args[])throws           InterruptedException
  {
    Thread t=Thread.currentThread();
    System.out.println("Current Thread: "+t);
    t.setName("New Thread");
    t.setPriority(10);
    System.out.println("After name change: "+t);
    
    for(int i=1;i<=5;i++)
    {
      System.out.println(i);
      Thread.sleep(1000);
    }
  }
}