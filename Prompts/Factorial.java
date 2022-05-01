class Fac {
  public static void main(String[] args) {
    System.out.println(Factorial(6));
  }
  static long Factorial(int i){
  long factorial = 1;
  for(int j = 1; j <= i; j++){
    factorial = factorial * j;
  }
  return factorial;
  }
}