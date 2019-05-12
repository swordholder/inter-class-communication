import exception.NotEnoughPlayersException;
import game.Game;
import game.Player;

public class Program {

    public static void main(String[] args) {

        Game game = new Game();
        game.addPlayer(new Player("Mario"));
        game.addPlayer(new Player("Luigi"));
        game.addPlayer(new Player("Alfonso"));
        game.addPlayer(new Player("Arthur"));

        try {
            game.start();
        } catch (NotEnoughPlayersException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
