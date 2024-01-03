
package boardgame;

/**
 *
 * @author Rodrigo
 */
public class Piece {
    
    protected Position position ;
    private Board board;

    public Piece(){
    }

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    
    //#PROTECTED (Somente classes e subclasses podem acessar a a classe BORD)
    protected Board getBoard() {
        return board;
    }
    
    
   
    
    
    
    
}
