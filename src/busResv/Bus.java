package busResv;

public class Bus {
       public int getBusNo() {
		return busNo;
	}

	public boolean isAC() {
		return AC;
	}

	public void setAC(boolean aC) {
		AC = aC;
	}

	public int getCapacity() {  // accessor
		return capacity;
	}

	public void setCapacity(int capacity) {  //mutator
		this.capacity = capacity;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No : "+busNo+" Ac : "+AC+" Total Capacity: "+capacity);
	}

	private int busNo;
       private boolean AC;
       private int capacity;
       
       Bus(int busNo,boolean AC,int capacity){
    	   this.busNo=busNo;
    	   this.AC=AC;
    	   this.capacity=capacity;  // get set
       }
}
