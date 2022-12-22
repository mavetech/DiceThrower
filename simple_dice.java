import java.util.Random;

public class Main
{
	public static void main(String[] args) {
	    
	     String[][] dice_image = {
          {
            "+-------+",
            "|       |",
            "|   o   |",
            "|       |",
            "+-------+",
          },
          {
            "+-------+",
            "| o     |",
            "|       |",
            "|     o |",
            "+-------+",
          },
          {
            "+-------+",
            "| o     |",
            "|   o   |",
            "|     o |",
            "+-------+",
          },
          {
            "+-------+",
            "| o   o |",
            "|       |",
            "| o   o |",
            "+-------+",
          },
          {
            "+-------+",
            "| o   o |",
            "|   o   |",
            "| o   o |",
            "+-------+",
          },
          {
            "+-------+",
            "| o   o |",
            "| o   o |",
            "| o   o |",
            "+-------+",
          }
        };
	    
	    int height = 5;
	    int numberOfDice = 1;
	    Random rand = new Random();
	    
        int randValues[] = new int[numberOfDice];
        boolean success = true;
        
	    String[][] dice = new String[numberOfDice][height];
	     
	    for(int r=0;r<numberOfDice;r++){
	        int rand_int = rand.nextInt(6);
	        randValues[r] = rand_int;
	        for(int i=0;i<height;i++){
	            dice[r][i] = dice_image[rand_int][i];
            }   
	    }
	    
	    for(int i=0;i<height;i++){
	        for(int j=0;j<numberOfDice;j++){
	            System.out.print(dice[j][i]);
            }   
            System.out.println();
	    }
	    
	    for(int i=0;i<numberOfDice-1;i++){
            if(randValues[i]!=randValues[i+1]){
                success = false;
            }
        }
        if(success){
            System.out.println("Congrutulations!!!. All Dice are the same!");
        }else{
            System.out.println("Not all dice are the same :(");
        }
        
	}
}

