class FizzBizz {
  public static void main(String[] args) {
    int number = 25;
    if(number % 3 == 0){
      if(number % 5 == 0){
        System.out.println("FizzBizz");
      }
      else{
        System.out.println("Fizz");
      }
    }
    else if(number % 5 == 0){
      System.out.println("Buzz");
    }
    else{
      System.out.println(number);
    }
  }
}