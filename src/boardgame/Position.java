/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardgame;

/**
 *
 * @author Rodrigo
 */
public class Position {
    private int row;
    private int column;

    public Position() {
    }

    public Position(int row, int colum) {
        this.row = row;
        this.column = colum;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    public void setValue(int row, int column){
        this.row = row;
        this.column = column;
    }
    
    @Override
    public String toString(){
        return row + " , " + column;
    }
    
}
