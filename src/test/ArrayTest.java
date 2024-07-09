import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    public void 이차원배열() {
        int[][] table = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println("행의 개수 : " + table.length); //행의 개수를 리턴한다.
        System.out.println("열의 개수 : " + table[0].length);
    }

}
