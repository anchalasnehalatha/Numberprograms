import java.util.Scanner;
class prime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
			int a=2;
			while(true){
		if(isprime(a)){
			System.out.println(a);
			count++;
		}
		a++;
		if(count==n){
			break;
		}
			}
	}
static boolean isprime(int n){
	if(n<=1)
		return false;
	
	for(int i=2;i<=n/2;i++){
		if(n%i==0)
			return false;
		}
		return true;
	
}
}
