package baseballgame;

import java.util.List;
public class Application {
    public static void main(String[] args) throws IllegalArgumentException{
        ComputerNum computer = new ComputerNum();
        playgame game = new playgame();
        Compare compare = new Compare();
        Regame regame = new Regame();

        boolean again = true;

        while(again) {
            List<Integer> com_num = computer.ComputerNumber();
            System.out.println(com_num);

            String result = "";

            while(!result.equals("3strike")) {
                result = compare.Compare_num(com_num, game.player_num());
                System.out.println(result);
            }
            again = regame.restart();
        }



    }
}
