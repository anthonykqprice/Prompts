class Primes {
  public static void main(String[] args) {
    //first n primes
    int n = 1000;
    int j = 2;
    int[] primes;
    primes = new int[n];
    primes[0] = 2;
    boolean prime = true;
    for(int i = 1; i < n; i++){
      do{
          j++;
          for(int k = 0; k < i; k++){
            if(j % primes[k] == 0){
              prime = false;
            }
            else{
              prime = true;
            }
            if(prime == false){
              break;
            }
          }
        }
      while(prime == false);
      primes[i] = j;
    }
    for(int z : primes){
      System.out.println(z);
    }
  }
}