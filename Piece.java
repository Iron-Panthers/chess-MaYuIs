public class Piece {
    private String color; 
    private String name = "piece"; 
    private int x = 0;
    private int y = 0;
    public String toString(){
        String nameReturn = name.substring(0,1);
        return nameReturn.toUpperCase() ; 
    }

}
