/** Exercise 4: Scissor-Rock-Paper Game (Advanced Question)
The rule for this popular game is:
the scissor cuts the paper; the rock knocks the scissor; and the paper wraps the rock.
Write a program to simulate the game.
Your program:
(1) randomly generates a number (0, 1, or 2) to represent scissor, rock, or paper;
(2) prompts the user to enter “scissor”, “rock”, or “paper”; and
(3) displays the computer or the user wins, loses, or draws.
*/

import java.util.Scanner;

public class hm_9103_0810_w3_9 {

  public static void main (String[] args){

    System.out.print("Welcome to LUCK TEST! \nPaper(1), Scissor (2), Rock (3): ");

    Scanner Input = new Scanner(System.in);
    int pyr = Input.nextInt();
    int cmp = (int)(Math.random()*3 + 1);
    String result ="", pyrSt = "", cmpSt = "";
    Boolean key = true;

    switch (pyr) {
      case 1: pyrSt = "Paper"; break;
      case 2: pyrSt = "Scissor"; break;
      case 3: pyrSt = "Rock"; break;
      default: key = false; break;
    }

    switch (cmp) {
      case 1: cmpSt = "Paper"; break;
      case 2: cmpSt = "Scissor"; break;
      case 3: cmpSt = "Rock"; break;
      default: break;
    }

    switch (pyr-cmp) {
      case -2: case 1: result = ". \nYou WIN! "; break;
      case 2: case -1: result = ". \nYou LOSE! "; break;
      case 0: result = ". \nYou get a TIE. "; break;
      default: break;
    }

    if (key) {
      System.out.println("You: " + pyrSt + "; \nComputer: " + cmpSt + result);
    } else {
      System.out.println("Illegal input. Try again.");
    }
  }
}

//   public static int abs (int no) {return no * (1 - ((no >>> 31) << 1));}
//
// }
