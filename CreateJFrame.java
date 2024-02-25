package brickGame;

import javax.swing.JFrame;
public class CreateJFrame
{
public static void main(String[] args)
{
JFrame screen = new JFrame();
GamePlay gamePlay = new GamePlay();
screen.setBounds(10, 10, 700, 600);
screen.setTitle("Breakout Ball");
screen.setResizable(false);
screen.setVisible(true);
screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
screen.add(gamePlay);
}
}
