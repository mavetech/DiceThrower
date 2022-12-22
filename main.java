import java.util.Random;

public class Main
{
	public static void main(String[] args) {
	    String [][] dice_image = {{"+", "-", "-", "-","-", "-", "-", "-", "+"},{"|", " ", " ", " ", " ", " ", " ", " ","|"},{"|", " ", " ", " ", "o", " ", " ", " ","|"},{"|", " ", " ", " ", " ", " ", " ", " ","|"},{"+", "-", "-", "-","-", "-", "-", "-", "+"},
	                             {"+", "-", "-", "-","-", "-", "-", "-", "+"},{"|", " ", " ", " ", " ", " ", " ", " ","|"},{"|", " ", "o", " ", " ", " ", "o", " ","|"},{"|", " ", " ", " ", " ", " ", " ", " ","|"},{"+", "-", "-", "-","-", "-", "-", "-", "+"},
	                             {"+", "-", "-", "-","-", "-", "-", "-", "+"},{"|", " ", " ", " ", " ", " ", " ", " ","|"},{"|", " ", "o", " ", "o", " ", "o", " ","|"},{"|", " ", " ", " ", " ", " ", " ", " ","|"},{"+", "-", "-", "-","-", "-", "-", "-", "+"},
	                             {"+", "-", "-", "-","-", "-", "-", "-", "+"},{"|", " ", "o", " ", " ", " ", "o", " ","|"},{"|", " ", " ", " ", " ", " ", " ", " ","|"},{"|", " ", "o", " ", " ", " ", "o", " ","|"},{"+", "-", "-", "-","-", "-", "-", "-", "+"},
	                             {"+", "-", "-", "-","-", "-", "-", "-", "+"},{"|", " ", "o", " ", " ", " ", "o", " ","|"},{"|", " ", " ", " ", "o", " ", " ", " ","|"},{"|", " ", "o", " ", " ", " ", "o", " ","|"},{"+", "-", "-", "-","-", "-", "-", "-", "+"},
	                             {"+", "-", "-", "-","-", "-", "-", "-", "+"},{"|", " ", "o", " ", " ", " ", "o", " ","|"},{"|", " ", "o", " ", " ", " ", "o", " ","|"},{"|", " ", "o", " ", " ", " ", "o", " ","|"},{"+", "-", "-", "-","-", "-", "-", "-", "+"}
	    };
	    
	    int dice_width = 9;
	    int dice_height = 5;
	    int number_of_dice = 3;
	    
	    String[][] dice = new String[dice_width*number_of_dice][dice_height];
	     // create instance of Random class
        Random rand = new Random();
        
        int randValues[] = new int[number_of_dice];
        boolean success = true;
  
	    for(int r=0;r<number_of_dice;r++){
	        int rand_int = rand.nextInt(6)+1;
	        randValues[r] = rand_int;
	        for(int i=(rand_int-1)*dice_height;i<((rand_int-1)*dice_height)+dice_height;i++){
	            for(int j=0;j<dice_width;j++){
	                dice[(dice_width*r)+j][i-((rand_int-1)*dice_height)] = dice_image[i][j];
	            }
	        }
	    }
	    
        for(int i=0;i<dice_height;i++){
            for(int j=0;j<dice_width*number_of_dice;j++){
                System.out.print(dice[j][i]);
            }
            System.out.println();
        }
        
        for(int i=0;i<number_of_dice-1;i++){
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
