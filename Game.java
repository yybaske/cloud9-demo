import java.util.Scanner;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;

public class Game{
    
    public static final boolean SUCCESS = true;
    public static final boolean FAILURE = false;
    public static Logger log = Logger.getLogger("Game");
    Scanner sc = new Scanner(System.in);
    
    public boolean story() {
        System.out.println("Story Start");
        System.out.print("始めますか？( 0 or 1 )： ");
        try {
            int flag = sc.nextInt();
            if (flag == 0) 
                return SUCCESS;
            System.out.print("ほんとにそれでいいのか？:  ");
            flag = sc.nextInt();
            if (flag == 0) 
                return FAILURE;
            return story();
        } catch (NumberFormatException e) {
            //log,warn("数値を入力してね", e);
            System.out.println("数値を入力してね");
            return FAILURE;
        } catch (InputMismatchException e) {
            System.out.println("型が違います" + e);
            return FAILURE;
        }
    }
    
    public static void main(String[] args) {
        /*Game g = new Game();
        if(g.story()) {
            
        }else {
            return;
        }*/
        Human humanA = new Human("金田", 16);
        Human humanB = new Human("島", 15);
        
        humanA.greet();
        humanB.greet();
        
        System.out.println(Human.classification);
        System.out.println(Human.isMammal());

        Japanese ja = new Japanese("くみ", 15);
        American am = new American("エミリー", 15);
        
        ja.greet();
        am.greet();
        
        List<Human> humans = new ArrayList<>();
        humans.add(new Japanese("くみ", 15));
        humans.add(new American("ビリー", 15));
        humans.forEach(h -> h.greet());
    }
}