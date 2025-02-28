import java.util.Random;
import java.util.Scanner;
public class snakegame {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random =new Random();
        // int dice=random.nextInt(1,7);
        // System.out.println(dice);
        
        int p1position=0;
        int p2position=0;
        // String ch=sc.next();
        int exit=0;
        System.out.println("Press 'S' to start the game ");
      
        
        String ch=sc.next();
        switch (ch) {
            case "s":
            System.out.println("press 1 to roll the dice for Player 1");
            System.out.println("press 2 to roll the dice for Player 2");
            System.out.println("press 5 to exit the game");
            while(true){
                    int key=sc.nextInt();
                    if(key==1){

                        int dice=random.nextInt(1,7);
                            System.out.println("Dice value: "+dice);
                        p1position=p1position+dice;
                        System.out.println("Player1 position: "+p1position);
                            if(p1position>=100){
                                System.out.println("player is the winner of snake ladder game");
                                exit=5;
                                
                            }
                    
                            if(p1position==99||p1position==88||p1position==77||
                            p1position==66||p1position==55||p1position==44||p1position==33||p1position==22||p1position==11){
                                p1position=p1position-10;
                                System.out.println("Player1 is bitten by the snake and new position is: "+p1position);
                            }
                            if(p1position==81||p1position==71||
                            p1position==61||p1position==51||p1position==41||p1position==31||p1position==21||p1position==10){
                                p1position=p1position+10;
                                System.out.println("Player1 got ladder and new position is: "+p1position);
                            }
                    

                    }
                    if(key==2){
                   
                        int dice=random.nextInt(1,7);
                        System.out.println("Dice value: "+dice);
                         p2position=p2position+dice;
                        System.out.println("Player2 position: "+p2position);
                        
                        if(p2position>=100){
                            System.out.println("player 2 is the winner of snake ladder game");
                            exit=5;
                            
                            
                        }
                
                            if(p2position==99||p2position==88||p2position==77||
                                 p2position==66||p2position==55||p2position==44||p2position==33||p2position==22||p2position==11){
                                 p2position=p2position-10;
                                System.out.println("Player2 is bitten by the snake and the new position is"+p2position);
                             }

                            if(p2position==81||p2position==71||
                                    p2position==61||p2position==51||p2position==41||p2position==31||p2position==21||p2position==10){
                                    p2position=p2position+10;
                                     System.out.println("Player2 got ladder and new position is "+p2position);
                             }
                     }

                     if(key==1 ||key==2){
                        
                     }
                     else{
                        System.out.println("please enter a valid key");
                     }

                     
                     if(key==5 || exit==5)
                     break;
                    } 
                    break;
                   default:{
                     System.out.println("invalid choice");
                     break;
                   }
    }
    

   
    }
}
