import java.lang.Math;

class myRandomWalker {
	
	public static boolean rndBool(){
		return Math.random() < 0.5;
	}
	public static void main(String[] args){
		try{

			//ensure that you have only 1 input parameter
			if(args.length != 1){
				System.out.println("you must have one parameter");
				return;
			}

			//ensure that input param is an integer
			int n = Integer.parseInt(args[0]);
			int x = 0;
			int y = 0;

			System.out.println("Random Walk: " + n + " steps...");					
			for(int i = 0; i < n; i++){
				
				//first get the random number (x or y)
				boolean isXaxis 		= rndBool(); //is X axis or y axis 
				boolean isPositiveDir 	= rndBool(); //is up or down (left or right)

				
				//x = (isXaxis) ? x++ : x--;
				

				if(isXaxis) {
					if(isPositiveDir){
						x= x+1;
					}
					else {
						x= x-1;
					}
				}
				else{
					if(isPositiveDir){
						y= y+1;
					}
					else{ 	
						y= y-1;
					}
				}

				System.out.println("(" + x + "," + y + ")");
				
			}
			System.out.println("squared distance: " + (x*x)+(y*y));

		}
		catch(NumberFormatException ex){
			System.out.println("parameter must be an integer");
			System.exit(1);
		}


	}

}