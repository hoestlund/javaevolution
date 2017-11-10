public class Tile {

    char letter;
    int value;

    public Tile() {
        this.letter = '0'; //0 is value 48, a is 97
        this.value = 0;
    }

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public void printTile(Tile t){
        System.out.println("Letter: " + t.letter + " Value: " + t.value);
    }

    public void testTile(Tile t){

        t.letter = 'z';
        t.value = 10;
        printTile(t);

    }

}//End of class
