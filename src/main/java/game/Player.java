/**
 * <h1>Player class!</h1>
 * Individual Player class who sends and receives messages
 *
 * @author  Farrukh Gafurov
 * @version 1.0
 * @since   2019-05-12
 */
package game;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<String> sayings;

    public Player(String name) {
        this.name = name;
        this.sayings = new ArrayList<String>();

        initSayings();
    }

    private void initSayings() {
        sayings.add("A cat has nine lives.");
        sayings.add("A bird in the hand is worth two in the bush.");
        sayings.add("Practice makes perfect.");
        sayings.add("Do not put all eggs into one basket.");
        sayings.add("A bad workman always blames his tools.");
        sayings.add("A chain is only as strong as its weakest link.");
        sayings.add("Actions speak louder than words.");
        sayings.add("All good things come to an end.");
        sayings.add("All that glitters is not gold.");
        sayings.add("An empty vessel makes much noise.");
    }


    public String getName() {
        return name;
    }

    public void startTheGame(Player otherPlayer) throws InterruptedException {

        Message message = new Message();
        message.setMessage(getSaying());
        message.setCounter(1);

        System.out.println(String.format("[%d] %s says to %s: %s",1,getName(),otherPlayer.getName(),message.getMessage()));

        otherPlayer.play(this,message);
    }

    public void play(Player otherPlayer, Message message) throws InterruptedException {

        if(message.getCounter()==20)
            return ; //game over

        Thread.sleep(1000); //sleep for one second
        StringBuilder text = new StringBuilder(message.getMessage()); //keeping original message as required by task - point #3
        text.append(getSaying()); //appending new saying

        message.setMessage(text.toString());
        message.setCounter(message.getCounter()+1);

        System.out.println(String.format("[%d] %s replies to %s: %s",message.getCounter(),getName(),otherPlayer.getName(),message.getMessage()));
        otherPlayer.play(this,message);
    }


    private String getSaying() {
        return sayings.get(utils.Utils.getRandom(0, 9));
    }

    @Override
    public boolean equals(Object other){
        if(other==this)
            return true;

        if (!(other instanceof Player)) {
            return false;
        }

        Player otherPlayer = (Player)other;
        return otherPlayer.getName().equalsIgnoreCase(getName());
    }
}
