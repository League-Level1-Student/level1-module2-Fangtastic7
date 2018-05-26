package extra;



public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	 public String welcome(String name, boolean isWoman, boolean isKnighted) {
		getname();
		checkisWoman();
		checkisKnighted();
		this.name = name;
		return name;
		
		
     }
	   boolean checkisKnighted() {
		if(this.name.equals("Orwell" )) {
			isKnighted = true;
		}
		if(this.name.equals("Isaac Newton")) {
			isKnighted = true;
		}
		else {
			isKnighted = false;
		}
		return isKnighted;
	}
	boolean checkisWoman() {
		  if(this.name.equals("Austen")) {
			  isWoman = true;
		  }
		  else {
			  isWoman = false;
		  }
		return isWoman;
	}
	String getname() {
		// TODO Auto-generated method stub
		
		this.name = name;
		return name;
	}
     }

     

