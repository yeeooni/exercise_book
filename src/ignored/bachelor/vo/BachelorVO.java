package ignored.bachelor.vo;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-30
 * Time: 오후 12:48
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class BachelorVO {

    private int age;
    private String name;
    private int key;
    private String value;

    //
    public BachelorVO(int age, String name, int key, String value) {
        super ();
        this.age = age;
        this.name = name;
        this.key = key;
        this.value = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
