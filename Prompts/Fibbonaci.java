class Fibbonaci {
  public static void main(String[] args) {
    int n = 10;
    int currentNumber = 1;
    int previousNumber = 0;
    int store;
    for(int i = 0; i < n; i++){
      System.out.println(currentNumber);
      store = currentNumber;
      currentNumber = previousNumber + currentNumber;
      previousNumber = store;     
    }  
  }
}