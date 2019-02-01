public class Recursion{
  public static double sqrtreg(double n){//uses loop
    if (n==0) return 0;
    double guess= 1.0;
    while (100*(((Math.abs(guess*guess-n))/((guess*guess+n)/2)))>.001){
      guess=(n/guess+guess)/2;
    //  System.out.println(guess);
    //  System.out.println("in it");
    }
    return guess;}
  public static double sqrt(double n, double tolerance){//recursive method
    double guess=1;
    if (n==0) return 0;
    return sqrthelper(n, guess, tolerance);
  }
  public static double sqrthelper(double n, double guess, double tolerance){
    if (100*(((Math.abs(guess*guess-n))/((guess*guess+n)/2)))<tolerance){
      return guess;
    }
    return sqrthelper(n,(n/guess+guess)/2,tolerance);
  }
public static int fib(int n){
  if (n<=1) return n;
  return helperfib(1,1,1,n);
}
public static int helperfib(int first,int second,int index,int n){
  if (index==n) return first;
  return helperfib(second,first+second,index+1,n);
}
  public static void main(String[] args){
    double r = .001;
    System.out.println(sqrtreg(100));
    System.out.println(sqrt(100,r));
    System.out.println(sqrt(2,r));
    System.out.println(sqrt(81,r));
    System.out.println(sqrt(0,r));
    System.out.println(sqrt (4010120,r));
    System.out.println("-----\n testing fib: ");
    System.out.println(fib(1));
    System.out.println(fib(5));
    System.out.println(fib(49));

  }
}
