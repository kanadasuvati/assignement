package course2;

public class kids {
int count =0;
	public static void main(String[]args) {
	echo e1 =new echo(); //the correct answer
	echo e2 = e1; // is the bonus answer
	
int x = 0;
while (x<4) {
	e1.hello();
	e1.count = e1.count+1;
	if(x == 3) {
		e2.count = e2.count+1;
		
	}
	if(x>0) {
		e2.count = e2.count +e1.count;
	
	}
	x = x+1;
}
System.out.println(e2.count);
}	
}


class echo{
	int count = 0;
	void hello() {
		System.out.println("hellooooo...");
	}
}


