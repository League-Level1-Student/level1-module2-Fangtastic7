import java.util.Random;

 class Vault {
	int secretCode;
	
	boolean tryCode(int guess) {
		if(guess==secretCode) {
			return   true;
		}
		else {
			return false;
		}
	}
	public Vault() {
		Random random = new Random();
		secretCode = random.nextInt(1000001);
	}
		
		}
	
	

public class VaultRunner {
	static Vault object;
	static JamesBond key;
	public static void main(String[] args) {
		object = new Vault();
		key = new JamesBond();
		key.findCode(object);
		object.tryCode(key.findCode(object));
		//if(object.secretCode==key.answer) {
		System.out.println(object.secretCode +" code has been opened.");
	//	}
	//	else {
			System.out.println("Mission failed. "+ key.answer);
	//	}
}
}

 class JamesBond {
	
	 int answer;
	 int findCode(Vault vault){
		 Vault path = new Vault();
	
		 for(int i =0; i<path.secretCode;i++) {		 
		
			 if(i==path.secretCode-1) {
				 return answer = path.secretCode+1;
			 }
			
			
		
		
}
		 
			 return answer;
		 
		
	
	
		
		
	}

}