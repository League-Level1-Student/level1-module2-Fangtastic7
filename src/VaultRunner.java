import java.util.Random;

class Vault {
	private int secretCode;

	boolean tryCode(int guess) {
		if (guess == secretCode) {
			return true;
		} else {
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
		int x = key.findCode(object);
		if(x==-1) {
			
		
		System.out.println(-1);
		}
		else {
			System.out.println("James Bond has broken the Code! The code is: " + x );
		}
	
	}
}

class JamesBond {

	// int answer;
	int findCode(Vault vault) {
		Vault path = new Vault();

		for (int i = 0; i < 1000000; i++) {
			boolean answer = path.tryCode(i);

			if (answer == true) {
				return i;
			}

		}
		return -1;

	}

}