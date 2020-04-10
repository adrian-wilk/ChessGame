public class Main {

    public static void  main(String[] args){

        Queen queen = new Queen();
        Position testPosition = new Position(1, 4);
        if(queen.isValidMove(testPosition)) {
            System.out.println("Outstanding move.");
        }
        else{
            System.out.println("A rookie mistake.");
        }
    }
}
