public class Prime{
	public boolean Isprime(int n){
		if(n==1){return false;}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Prime in = new Prime();
		int count=0;
		for(int i=1;i<=20000;i++){
			if(in.Isprime(i)){
				count++;
				if(count%5==0){
					System.out.println(i+" ");
					continue;
				}
				System.out.print(i+" ");
			}
		}
	}
}