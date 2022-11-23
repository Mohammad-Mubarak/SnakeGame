import javax.swing.*;

public class SnakeGame {
    JFrame frame;
    SnakeGame(){
        frame=new JFrame();
        Board board=new Board();
        frame.add(board);


        frame.setVisible(true);
        frame.setBounds(100,100,500,500);
    }

    public  static void main(String[] args){
        SnakeGame game =new SnakeGame();
    }

}
