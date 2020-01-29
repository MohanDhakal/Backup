class Stock
{
  int n;
  boolean valueSet=false;
  
  synchronized void get()
  {
    while(!valueSet){
    try{wait();}
    catch(InterruptedException e)
    {System.out.println(e);}
    }
    System.out.println("Got: "+n);
    valueSet=false;
    notify();
  }
  
  synchronized void put(int n)
  {
    while(valueSet){
    try{wait();}
    catch(InterruptedException e)
    {System.out.println(e);}
    }
    this.n=n;
    System.out.println("Put: "+n);
    valueSet=true;
    notify();
  }
}

class Producer extends Thread
{
  Stock s;
  Producer(Stock s)
  {
    this.s=s;
  }
  public void run()
  {try{
    for(int i=1;i<=10;i++)
    {s.put(i);
    Thread.sleep(1000);
    }}
  catch(InterruptedException e){}
  }
}

class Consumer extends Thread
{
  Stock s;
  Consumer(Stock s)
  {
    this.s=s;
  }
  public void run()
  {try{
    for(int i=1;i<=10;i++)
    {  s.get();
    Thread.sleep(1000);
    }}
  catch(InterruptedException e){}
  }
}

class InterthreadDemo
{
  public static void main(String args[])
  {
    Stock s=new Stock();
    new Producer(s).start();
    new Consumer(s).start();
  }
}

    