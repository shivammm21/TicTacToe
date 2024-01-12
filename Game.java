import java.util.Scanner;

/**
 * Game
 */
public class Game {

    static boolean haveWon(char[][] board, char player){

        for(int row=0;row<board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }
        for(int col=0;col<board[0].length;col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        else if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }
        return false;
    }

    static void printBoard(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] booard = new char[3][3];

        for(int i=0;i<booard.length;i++){
            for(int j=0;j<booard.length;j++){
                booard[i][j] = ' ';
            }
        }

        boolean gameOver = false;
        char player = 'X';

        while (!gameOver) {

            printBoard(booard);

            System.out.println(player+ " possition : ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            System.out.println();

            if(booard[row][col]==' '){

                booard[row][col] = player;

                gameOver = haveWon(booard, player);

                if(gameOver){
                    printBoard(booard);
                    System.out.println(player+ " won this match..");
                }
                else{
                    if(player=='X'){
                        player = 'O';
                    }
                    else{
                        player = 'X';
                    }
                }

            }else{
                System.out.println("Invalid...");
            }

            

        }

    }
}