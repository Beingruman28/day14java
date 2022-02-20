package day14java;

import java.util.*;

class WeightLimitExceeded extends Exception{
    WeightLimitExceeded(int x){
        System.out.print(Math.abs(15-x)+" kg : ");
    }
}
class Main {
	void validWeight(int weight) {
		if(weight>15)
		try {
		throw new WeightLimitExceeded(weight);
		} catch (WeightLimitExceeded e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		else
		System.out.println("You are ready to fly!");
    }
    public class ExceptionHandling {
    }
      public static void main (String[] args) {
        Main ob=new Main();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<2;i++){
           
                try {
					ob.validWeight(in.nextInt());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            } in.close();
            }
}