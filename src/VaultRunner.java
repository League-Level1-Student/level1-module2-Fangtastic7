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
}
}

 class JamesBond {
	
	
	 int findCode(Vault vault){
		 Vault path = new Vault();
		 for(int i =0; i<path.secretCode;i++) {		 
		if(vault.equals(i)) {
			return i;
			
		}
		else {
			return -1;
		}
}
	return 0;
	
		
		
	}

}