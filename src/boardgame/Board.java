/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardgame;

/**
 *
 * @author Rodrigo
 */
public class Board {
    
    
    //TAULEIRO TEM LINHAS E COLUNAS 
    private int rows;
    private int columns;
    //CRIADO MATRIZ DE PIECE
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        //COMPLETADO MANUALMENTE (CONSTRUTOR VAI INSTANCIAS PIECE COM ROWS E COLUMNS)
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }
    
    public Piece piece(int row, int column){
        return pieces[row][column];
    }
    
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
    
    
    
}
