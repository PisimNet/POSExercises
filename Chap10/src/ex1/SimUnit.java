package ex1;
class SimUnit {

	String botType;
	static int counts []={0,0,0};
	
	SimUnit(String type){
		botType = type;
		countUp();
	}
	int powerUse(){
		if ("teplovaja mashina".equals(botType)){
			return 2;
	} else {
		return 4;
	}
}
	private void countUp(){
		switch(this.botType){
		    case "teplovaja mashina": counts[0]++;
		        break;
		    case "V2radiator": counts[1]++;
		    break;
		    case "V3radiator": counts[2]++;
		    break;
		}	
	}
	public static void printCounts(){
		System.out.println("teplovich mashin:" + counts[0]);
		System.out.println("V2:" + counts[1]);
		System.out.println("V3:" + counts[2]);
	}
}