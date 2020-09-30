class constoverload{
	
	int x,y;
	constoverload(int a){
	x=y=a;
	}
constoverload(int a, int b){
	x=a;
	y=b;
}
void calculate(){
	int result=x*y;
	System.out.println("result is: "+result);
}
public static void main(String args[]){
	
	constoverload cs= new constoverload(5);
	constoverload cm= new constoverload(5,10);
	cs.calculate();
	cm.calculate();
}
}