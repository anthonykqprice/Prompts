class SquareRoot {
  public static void main(String[] args) {
    //number you want to take the square root of
    double x = sqrt(213945828);
    System.out.println(x);
    }
  static double sqrt(double a){
    double j = a;
    int k = 0;
    while(j / 10 > 1){
      k++;
      j = j / 10;
    }
    int s = 1;
    for(int z = 0; z < k; z++){
      s = s * 10;
    }
    double guess = s;
    for(int i = 0; i < 20; i++){
      guess = guess - (guess * guess - a) / (2 * guess);
    }
    return guess;
  }
}