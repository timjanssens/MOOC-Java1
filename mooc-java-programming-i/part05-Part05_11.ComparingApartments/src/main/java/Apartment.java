
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPrincePerSquare() {
        return this.princePerSquare;
    }

    public int getRooms() {
        return this.rooms;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int dif = 0;
        dif = (this.squares * this.princePerSquare) - (compared.princePerSquare * compared.squares);
        //get absolute value
        dif = Math.abs(dif);
        return dif;

    }

    public boolean moreExpensiveThan(Apartment compared) {
        int dif = 0;
        dif = (this.squares * this.princePerSquare) - (compared.princePerSquare * compared.squares);
        
        if (dif > 0){
            return true;
        }
        
        return false;
    }

}
