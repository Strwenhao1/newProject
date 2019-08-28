import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class BallGame extends JFrame  {
    Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");
    double x = 100;
    double y = 100;
    boolean right ;
    boolean up;
    double degree = 1;
    public void paint(Graphics g) {
        System.out.println("窗口重置");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int) x, (int) y, null);
//        //水平移动的距离
//        y = y + 10 * Math.sin(degree);//垂直移动的距离
//        //碰到上下边框
//        if (y > 450 || y < 80) {/*500-50,小球的y轴、窗口的高500，边框50;50+30,边框50，标题框30*/
//            degree = -degree;/*弹射（关于x轴对称）*/
//        }
//        //碰到左右边框
//        if (x < 50 || x > 806) {/*856-50,desk图片长度856，边框50*/
//            degree = 3.14 - degree;/*弹射（关于y轴对称）*/
//        }
//    }

        if (right) {
            x = x + 10;
        } else {
            x = x - 10 ;
        }
        if (up) {
            y = y + 10 ;
        } else {
            y = y - 10 ;
        }

    }
    void launchFrame(){
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_UP){
                   up = false;
                }else if(e.getKeyCode()==e.VK_DOWN){
                    up = true;
                }else if(e.getKeyCode()==e.VK_LEFT){

                    right = false;
                }else if(e.getKeyCode()==e.VK_RIGHT){
                    right=true;
                }
            }
        });
        setSize(300,300);
        setLocation(400,400);
        setVisible(true);
        while (true){
            repaint();
            try{
                Thread.sleep(20);
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
    }

    public static  void main(String[] args){
        System.out.println("游戏");
        BallGame game = new BallGame();
        game.launchFrame();
    }


}
