class IsSquare
{
  static int isSquare(int n)
  {
    int ret=0;
    for(int i=0;i<=n/2;i++)
    {
      if(n==i*i)
      {
        ret=1;
        break;
      }
    }
    return ret;
  }
  public static void main(String args[])
  {
    int x=isSquare(0);
    System.out.println(x);
  }
}