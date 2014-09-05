public class test {

	public static void main(String[] args) {

	String msg = "hello world";
	System.out.println("I am going to pass a msg to another function, it is gonna to modify it a bit and display it. msg to be passed is: " + msg);
	testFunction tf = new testFunction();	
	tf.displayFunction(msg);
	} 
}

