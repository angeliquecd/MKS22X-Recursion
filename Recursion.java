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
  public static double sqrt(double n){//recursive method
    double guess=1;
    if (n==0) return 0;
    return sqrthelper(n, guess);
  }
  public static double sqrthelper(double n, double guess){
    if (100*(((Math.abs(guess*guess-n))/((guess*guess+n)/2)))<.001){
      return guess;
    }
    return sqrthelper(n,(n/guess+guess)/2);
  }

  public static void main(String[] args){
    System.out.println(sqrtreg(100));
    System.out.println(sqrt(100));
    System.out.println(sqrt(2));
    System.out.println(sqrt(81));
    System.out.println(sqrt(0));
    System.out.println(sqrt (4010120));
  }
}
