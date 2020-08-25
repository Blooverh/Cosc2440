import java.util.*;
public class RockPaperScisGame {
    public static void main (String args[]){
    Scanner kbr= new Scanner(System.in);
    System.out.println("Scissor (0), rock (1), paper(2): ");
    int computerMove= (int) (Math.random()* 3);
    int move= kbr.nextInt();

    if ((move==0 && computerMove == 2) || (move==1 && computerMove==0)|| (move ==2 && computerMove== 1)){
        System.out.println("You won"+ " The move of the computer was "+ computerMove);
    }else if (move == computerMove){
        System.out.println("Its a draw.");
    }else
        System.out.println("You lost. "+ " The move of the computer was "+ computerMove);
    
    }
}