class CounterProgram{

    static int staticCount = 5;
    int instanceCount;
	
	void showCount(){
	
	int localCount = 2;
	
	System.out.println("StaticCount: " + staticCount);
	System.out.println("instanceCount: " + instanceCount);
	System.out.println("localCount: " + localCount);
	System.out.println("--------------------");
	}
	
	public static void main(String[] args) {
    
	CounterProgram cp = new CounterProgram();
	
	cp.instanceCount = 55 + 5;
	cp.showCount();
	cp.staticCount += 5;    
	
	CounterProgram c2 = new CounterProgram();
	
	c2.instanceCount = 55 + 2;
	c2.showCount();
	
	}
    
	
	

}