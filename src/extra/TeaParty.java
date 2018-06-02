package extra;

public class TeaParty {
	private  String name;
	private String hello = "Hello";
	private String woman = " Ms. ";
	private String man = " Mr. ";
	private String knight = " Sir ";
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		
		//.getname(name);
	//	isWoman(isWoman);
	//	isKnighted(isKnighted);
		if(name.equals(null)) {
			
			if(isWoman==false) {
				
				if(isKnighted==false) {
					
					return hello;
				}
			}
		}
		else {
			if(isWoman==true) {
				
				if(isKnighted==false) {
					name = "Austen";
					return hello + woman + name;
				}
			}
			else if(isWoman==false){
				if(isKnighted==false) {
					name = "Orwell";
					return hello + man +name;
				}
				else if(isKnighted == true) {
					name = "Isaac Newton";
					return hello + knight + name;
				}
			}
		}
		
		
		
		
		return hello + name;
				

	}


	boolean isKnighted(boolean isKnighted) {
		// TODO Auto-generated method stub
		if(isKnighted==true) {
			hello = hello + " Sir";
			
		}
		
			if(isKnighted == false) {
			
			}
			return isKnighted;
		
			
		
		
	}


	String getname(String name) {
		return name;
		// TODO Auto-generated method stub
		
	}
	boolean isWoman(boolean isWoman) {
		if(isWoman==true) {
			hello = hello + " Ms. ";
			return isWoman;
		}
		else if(isWoman==false) {
			hello = hello + " Mr.";
			return isWoman;
		}
		return isWoman;
		
	}

	
}
