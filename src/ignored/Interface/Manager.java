package ignored.Interface;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-17
 * Time: 오후 1:50
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class Manager {

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("반지름이\t" + circle.radius + "인 원의 넓이는\t" + circle.getArea() + "입니다.");

        Rect rect = new Rect(4, 5);
        System.out.println("가로가\t" + rect.width + "이고 세로가\t" + rect.height + "인 사각형의 넓이는\t" + rect.getArea() + "이고 둘레는\t" + rect.getGround() + "입니다.");
    }

}
