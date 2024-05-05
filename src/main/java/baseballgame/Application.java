package baseballgame;

import java.util.List;
public class Application {
    public static void main(String[] args) throws IllegalArgumentException{
        ComputerNum computer = new ComputerNum();
        playgame game = new playgame();

        List<Integer> com_num = computer.ComputerNumber();
        List<Integer> player_num = game.player_num();


        System.out.println(com_num);
        System.out.println(player_num);

    }
}
