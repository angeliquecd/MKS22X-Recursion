import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
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
  if (n==0) return 0;
  if (n==1) return 1;
  return helperfib(1,1,n);
}
public static int helperfib(int first,int second,int n){
  if (1==n) return first;
  return helperfib(second,first+second,n-1);
}
public static ArrayList<Integer> makeAllSums(int n){
  ArrayList<Integer> returner = new ArrayList<Integer>();
  sumsHelper(n,1,0,returner);
  return returner;
}
public static boolean sumsHelper(int n, int current, int partial, ArrayList<Integer> returner){
  //  if ((partial==1 || partial==n*2) && current==n) return true;
    //if (!returner.contains(partial)) returner.add(partial);
  if (current>n) {
    returner.add(partial);
  return false;}
  //if (returner.size()==Math.pow(2,n)) return true;
  return sumsHelper(n, current+1, partial+current, returner) || sumsHelper(n,current+1,partial,returner);
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
    System.out.println(fib(10));
    System.out.println(fib(30));
    System.out.println(fib(35));
    System.out.println(fib(48));
    System.out.println(fib(49));
    System.out.println("-----\n testing makeallsums: ");
    System.out.println(makeAllSums(3));
  }
}
