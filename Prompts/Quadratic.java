import static java.lang.Math.sqrt;
class Quadratic {
  public static void main(String[] args) {
    double a = 1;
    double b = -2;
    double c = 10;
    double discriminant = b * b - 4 * a * c;
    if(discriminant > 0){
      double xOne = (-b + sqrt(b * b - 4 * a * c)) /2 * a;
      double xTwo = (-b - sqrt(b * b - 4 * a * c)) /2 * a;
      System.out.println("x= " + xOne + " ; " + xTwo);
      }
    else{
      double real = -1 * b / 2 * a;
      double imaginary = sqrt(-1 * (b * b - 4 * a * c)) / 2 * a;
      System.out.println("x = " + real + " + " + imaginary + "i; " + real + " - " + imaginary + "i");
    }
  }
}