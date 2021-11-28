//Mary Kochmanski, CIS219, Tuesdays and Thursdays at 3:30pm

public class Main {
  public static void main(String[] args) {
  
  	//creating the array that will contain the 20 numbers generated
    int [] numgen = new int[20];
    
    //iterating through the array
    for (int i=0; i<numgen.length; i++){
    	//int x calls the function rando that returns a random number that is not already in the array
    	int x = rando(numgen);
        //sets the random number at the current element in the array
        numgen[i] = x;
        //prints the value of the current element in the array
        System.out.println(numgen[i]);
     }

  }
  
  //rando creates a random number that is not alreay in the array and returns it
  public static int rando(int [] array) {
	//sets rand to a random number between 1 and 30
  	int rand = (int)(30*Math.random()+1);
    //iterates over the inputted array
    for (int x=0; x<array.length; x++){
      if(array[x] == rand){
      	/* if the value of the current element in the inputted array is equal to the 
        random number generated, a new random number is generated and the for loop is 
        reset to check if the number is already in the array */
      	rand = (int)(30*Math.random()+1);
        x = -1;
        continue;
      }else{
      // if the value of the current element in the inputted array is not equal to the random number, the loop continues
        continue;
      }
   	}
    //returns the random number
    return rand;
  }
}
