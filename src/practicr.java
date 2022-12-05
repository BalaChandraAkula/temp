import javax.swing.*;

public class practicr {
    static JFrame frame;
    static void practicr(){
        frame = new JFrame();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //practicr();
        bull b = new bull();
        System.out.println(bull.sum(9,9));
    }
}
class bull{
    static int sum(int a,int b){
        return a+b;
    }
}
