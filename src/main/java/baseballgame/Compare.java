package baseballgame;

import java.util.List;

public class Compare {
    public int ballcount(List<Integer> computer, List<Integer> player) {
        int ball = 0;

        for(int i = 0; i < player.size(); i++) {
            if(computer.contains(player.get(i))) {
                ball++;
            }
        }
        return ball;
    }

    public int Strikecount(List<Integer> computer, List<Integer> player) {
        int strike = 0;

        for(int i = 0; i < player.size(); i++) {
            if(computer.get(i) == player.get(i)) {
                strike++;
            }
        }
        return strike;
    }

    public String Compare_num(List<Integer> computer, List<Integer> player) {
        int ball = ballcount(computer, player);
        int strike = Strikecount(computer, player);

        if(ball+strike == 0) return "nothing";
        return ball + "ball " + strike + "strike";
    }
}
