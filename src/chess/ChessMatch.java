/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import boardgame.Board;
import chess.pieces.King;

import chess.pieces.Rook;

/**
 *
 * @author Rodrigo
 */
public class ChessMatch {
    
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }
    
    //FEITO UM DOWNCASTING (PARA QUE O SISTEMA ENTENDA board.piece COMO UMA ChessPiece e não como uma Piece qualquer)
    public ChessPiece[][] getPieces(){
       ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
       for(int i = 0; i< board.getRows();i++){
           for(int j = 0; j< board.getColumns(); j++){
                 mat[i][j] = (ChessPiece) board.piece(i, j);
                 
           }
       }
       return mat;
       
       
    }
    
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    
    private void initialSetup(){
       placeNewPiece('b',6,new Rook(board, Color.WHITE ));
       placeNewPiece('e',8,new King(Color.BLACK, board));
       placeNewPiece('e',1,new King(Color.WHITE, board));
    }
    
}
