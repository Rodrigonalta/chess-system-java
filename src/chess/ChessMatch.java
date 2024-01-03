/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import boardgame.Board;

/**
 *
 * @author Rodrigo
 */
public class ChessMatch {
    
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
    }
    
    //FEITO UM DOWNCASTING (PARA QUE O SISTEMA ENTENDA board.piece COMO UMA ChessPiece e não como uma Piece qualquer)
    public ChessPiece[][] getPieces(){
       ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
       for(int i = 0; i< board.getRows();i++){
           for(int j = 0; j< board.getColumns(); j++){
                 mat[i][j] = (ChessPiece) board.piece(i,j);
                 
           }
       }
       return mat;
       
       
    }
    
    
    
}
