package baseballgame;

import java.util.List;
public class Application {
    public static void main(String[] args) {
        ComputerNum computer = new ComputerNum();

        List<Integer> com_num = computer.ComputerNumber();

        System.out.println(com_num);
    }
}
