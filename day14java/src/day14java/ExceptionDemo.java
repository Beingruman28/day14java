package day14java;

public class ExceptionDemo {
	 static void func(int a) throws Exception {
		 System.out.println(10/a);
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   func(10);
    	   func(0);
       }catch (Exception e) {
    	   System.out.println("cant");
       }
	}

}
