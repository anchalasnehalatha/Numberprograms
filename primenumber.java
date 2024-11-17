class Demo{
  public static void main(String[] args){
    Scanner sc=new Scanner(Sytsem.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    if(isprime(n)){
      System.out.println("prime");
    }
    else{
      System.out.println("not prime");
    }
  }static boolean isprime(int n){
    int count=1;
    for(int i=1;i<=n/2;i++){
      if(n%i==0){
        count++;
      }
      return count==2;
    }
  }
