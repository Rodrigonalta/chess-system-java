/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chess.system;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class ChessSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      ChessMatch chessMatch = new ChessMatch();
      
      while(true){
      UI.printBoard(chessMatch.getPieces());
          System.out.println("");
          System.out.print("Source: ");
          ChessPosition source = UI.readChessPosition(sc);
          
          System.out.println("");
          System.out.print("Target: ");
          ChessPosition target = UI.readChessPosition(sc);
          
          ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
          
      
      } 
       
    } 
}
