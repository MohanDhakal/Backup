class LegalNumber
{
  static int isLegalNumber(int []a,int b)
  {
    int x=0;
    for(int m:a)
    {
      if(m>=b)
      {
        x=1;
        break;
      }
    }
    return x;
  }
  public static void main(String args[])
  {
    int []a={1,2,3};
    int x=isLegalNumber(a,4);
    System.out.println(x);
  }
}