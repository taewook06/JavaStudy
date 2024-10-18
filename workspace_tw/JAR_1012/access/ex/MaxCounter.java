package access.ex;

public class MaxCounter {
    int maxVol; 
	int volume;
    
    public MaxCounter(int maxCount) {
    	this.maxVol = maxCount;
	}
    
    
    public void increment() {
    	if(maxVol <= volume ) {
    		System.out.println("음량을 초과했습니다");
    	}
    	volume++;
    }
    
    public String getCount() {
    	return "현재볼륨 : " + volume;
    }
    
}
