import java.util.*;

public class Main{
    public static void main(String args[]){
        char[][] board = {{' ',' ',' '},
                          {' ',' ',' '},
                          {' ',' ',' '}};
		
		System.out.println("***************************");
		System.out.println("It's time for Tic Tac Toe");
		System.out.println("***************************");
		System.out.println();
        	System.out.println("Welcome Player1 & Player2!!");
        	System.out.println();
		
        	rules(board);
        
		while(true){
			player1Turn(board);
			if(isGameFinished(board)){
				break;
			}
			printBoard(board);
			
			player2Turn(board);
			if(isGameFinished(board)){
				break;
			}
			printBoard(board);
		}
		
		while(true){
			boolean result = replay();
			if(result == true){
				result = replay();
				if(result == false){
					break;
				}
			}else{
				break;
			}
		}
    }
    
    public static void rules(char board[][]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Below is the format in which your board will appear");
        System.out.println();
        printBoard(board);
        System.out.println("If you wish to read the rules of game then press 1 otherwise press 0");
        System.out.println();
        int num;
        do{
            num = scn.nextInt();
            System.out.println();
            if(num == 1){
                System.out.println("***************************");
                System.out.println();
                System.out.println("You have to press the keys between 1 to 9 to chooe your position");
                System.out.println("Keys other than them will not be alloweded");
                System.out.println();
                System.out.println("Hope you have understood the rules of games");
                System.out.println("Then let's proceed towards fun");
                System.out.println();
                System.out.println("***************************");
                System.out.println();
                break;
            }else if(num == 0){
                System.out.println("***************************");
                System.out.println();
                System.out.println("Seems like we got some pro players here");
                System.out.println("Let's go then");
                System.out.println();
                System.out.println("***************************");
                System.out.println();
                break;
            }else{
                System.out.println("You are pressing the wrong key");
                System.out.println();
            }
        }while(num != 0 || num != 1);
    }
    
    public static void printBoard(char board[][]){
        System.out.println("*******");
        System.out.println();
        System.out.println(" " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println(" -+-+-  ");
        System.out.println(" " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println(" -+-+-  ");
        System.out.println(" " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println();
        System.out.println("*******");
        System.out.println();
        
    }
    
    public static void movePosition(char board[][], String position, char symbol){
        switch(position){
            case "1" :
                board[0][0] = symbol;
                break;
            case "2" :
                board[0][1] = symbol;
                break;
            case "3" :
                board[0][2] = symbol;
                break;
            case "4" :
                board[1][0] = symbol;
                break;
            case "5" :
                board[1][1] = symbol;
                break;
            case "6" :
                board[1][2] = symbol;
                break;
            case "7" :
                board[2][0] = symbol;
                break;
            case "8" :
                board[2][1] = symbol;
                break;
            case "9" :
                board[2][2] = symbol;
                break;
            default :
                System.out.println("number out of bound");
                System.out.println();
        }
    }
	
	public static boolean winningCond(char board[][], char symbol){
		if((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol)||
		   (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol)||
		   (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol)||
			
		   (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol)||
		   (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol)||
		   (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol)||
		   
		   (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)||
		   (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)){
			   return true;
		   }
		   return false;
	}
	
	public static void player1Turn(char board[][]){
		System.out.println("Player 1 your turn: Press the key");
        	System.out.println();
		Scanner scn = new Scanner(System.in);
		String player1Input;
		while(true){
            		player1Input = scn.nextLine();
            		System.out.println();
			if(isValidMove(board,player1Input)){
				break;
			}else{
				System.out.println(player1Input + " is not a valid move");
                		System.out.println();
			}
		}
		movePosition(board,player1Input,'X');
	}
	
	public static void player2Turn(char board[][]){
		System.out.println("Player 2 your turn: Press the key");
        	System.out.println();
		Scanner scn = new Scanner(System.in);
		String player2Input;
		while(true){
            		player2Input = scn.nextLine();
            		System.out.println();
			if(isValidMove(board,player2Input)){
				break;
			}else{
				System.out.println(player2Input + " is not a valid move");
                		System.out.println();
			}
		}
		movePosition(board,player2Input,'O');
	}
	
	public static boolean isValidMove(char[][] board, String playerInput){
		switch(playerInput){
            		case "1" :
                		return (board[0][0] == ' ');
            		case "2" :
                		return (board[0][1] == ' ');
            		case "3" :
                		return (board[0][2] == ' ');
            		case "4" :
                		return (board[1][0] == ' ');
            		case "5" :
                		return (board[1][1] == ' ');
            		case "6" :
                		return (board[1][2] == ' ');
            		case "7" :
                		return (board[2][0] == ' ');
            		case "8" :
                		return (board[2][1] == ' ');
            		case "9" :
                		return (board[2][2] == ' ');
            		default :
                		return false;
		}
	}
	
	public static boolean isGameFinished(char[][]board){
		if(winningCond(board,'X')){
			printBoard(board);
			System.out.println("Player 1 wins");
            		System.out.println();
            		System.out.println("***************************");
            		System.out.println();
			return true;
		}
		if(winningCond(board,'O')){
			printBoard(board);
			System.out.println("Player 2 wins");
		    	System.out.println();
            		System.out.println("***************************");
            		System.out.println();
			return true;
		}
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				if(board[i][j] == ' '){
					return false;
				}
			}
		}
		printBoard(board);
		System.out.println("The game ended in tie");
        	System.out.println();
        	System.out.println("***************************");
        	System.out.println();
		return true;
	}
    
    public static boolean replay(){
        System.out.println("If you want to replay then press 1 or to exit press 0");
        System.out.println();
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
		if(num == 0){
			System.out.println();
			System.out.println("Thanks for playing!!");
			System.out.println();
			System.out.println("******************************************************");
			return false;
		}else if(num == 1){
            		char[][] board = {{' ',' ',' '},
					  {' ',' ',' '},
					  {' ',' ',' '}};
			System.out.println();
			System.out.println("******************************************************");
			System.out.println();
        		System.out.println("Welcome Player1 & Player2!!");
        		System.out.println();
			System.out.println("Hope you already know the rules, so let's proceed towards game");
			System.out.println();
			System.out.println("***************************");
			
			while(true){
				player1Turn(board);
					if(isGameFinished(board)){
						break;
					}
				printBoard(board);
				
				player2Turn(board);
					if(isGameFinished(board)){
						break;
					}
				printBoard(board);
			}
			return true;
        	}else{
            		System.out.println("You are pressing the wrong key");
            		System.out.println();
			return true;
        	}
    }
    
}
