/**
 * <h1>Game class!</h1>
 * Initialize and use this class for starting the game
 *
 * @author  Farrukh Gafurov
 * @version 1.0
 * @since   2019-05-12
 */
package game;

import exception.NotEnoughPlayersException;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Player> players;

    public Game(){
        players = new ArrayList<Player>();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void start() throws NotEnoughPlayersException, InterruptedException {

        if(players.size()<2)
            throw new NotEnoughPlayersException("At least 2 players needed to start the game");

        Player firstPlayer = getRandomPlayer();
        Player secondPlayer = getRandomPlayer();

        while(secondPlayer.equals(firstPlayer)){
            secondPlayer=getRandomPlayer();
        }
        System.out.println("Starting the game:");
        firstPlayer.startTheGame(secondPlayer);
        System.out.println("Game over !");
    }

    private Player getRandomPlayer() {
        int min=0;
        int max = players.size()-1;

        int random = utils.Utils.getRandom(min,max);

        return players.get(random);
    }
}
