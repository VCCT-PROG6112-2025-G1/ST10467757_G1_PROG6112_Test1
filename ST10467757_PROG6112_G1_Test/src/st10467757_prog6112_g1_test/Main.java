package st10467757_prog6112_g1_test;
import java.util.Scanner;
import javax.swing.InputMap;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String[] arrPlayers = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        String[] arrStadiums = {"KINGSMEAD", "ST GEORGE", "WANDERERS"};
        int[][] arrRuns = new int[arrPlayers.length][arrStadiums.length];
        
        System.out.println("SA CRICKETER APPLICATION");
        System.out.println("------------------------");
        
        for (int i = 0; i < arrPlayers.length; i++) 
        {
            for (int j = 0; j < arrStadiums.length; j++) 
            {
                System.out.print("Enter the number of runs scored by " + arrPlayers[i] + " at " + arrStadiums[j] + ": ");
                
                while (!input.hasNextInt()) 
                { 
                    System.out.print("Invalid input. Try again: ");
                    input.next();
                }
                
                arrRuns[i][j] = input.nextInt();
            }
        }
        
        System.out.println("RUNS SCORED REPORT");
        System.out.println("------------------------");
        
        for (int i = 0; i < arrPlayers.length; i++) 
        {
            System.out.println(arrPlayers[i] + ":");
            
            for (int j = 0; j < arrStadiums.length; j++) 
            {
                System.out.println("  " + arrStadiums[j] + ": " + arrRuns[i][j]);
            }
            
            System.out.println();
        }
        
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("------------------------");
        
        for (int j = 0; j < arrStadiums.length; j++) 
        {
            int total = 0;
            
            for (int i = 0; i < arrPlayers.length; i++) 
            {
                total += arrRuns[i][j];
            }
            System.out.println(arrStadiums[j] + ": " + total);
        }

        input.close();
        
        System.out.println("STADIUM WITH THE MOST RUNS:");
        int bestStadium = 0;
            
        System.out.println("------------------------");
        
                
        
        
    }
    
}
