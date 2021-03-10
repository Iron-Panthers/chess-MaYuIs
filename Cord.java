public class Cord {
    private int x;
    private int y;

    public Cord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Cord(String direction) {
        //this code is an affront to god 
        switch (direction) {
            case "up":
                this.x = 0;
                this.y = -1;
                break;
            case "down":
                this.x = 0;
                this.y = 1;
                break;
            case "right":
                this.x = 1;
                this.y = 0;
                break;
            case "left":
                this.x = -1;
                this.y = 0;
                break;
            case "up+right":
                this.x = 1;
                this.y = -1;
                break;
            case "up+left":
                this.x = -1;
                this.y = -1;
                break;
            case "down+right":
                this.x = 1;
                this.y = 1;
                break;
            case "down+left":
                this.x = -1;
                this.y = 1;
                break;
            default:
                System.out.print("bad thing has happened");
                this.x = 0;
                this.y = 0;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void makeAbs(Cord abs){
        this.setX(abs.getX() + this.getX());
        this.setY(abs.getY() + this.getY());
    }

    // public static void relCordsToAbCords(Cord[] rel, Cord source) {
    //     for(Cord cord : rel){
    //         cord.makeAbs(source);
    //     }
    // }

    public String toString(){
        return "x: "+x+" y: "+y;
    }
}
