package exercise.book.array;

public class NumberArray {

    private static int[][] table;
    private static int n = 0;

    static {
        table = new int[3][4];

        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                table[i][j] = n++;
            }
        }
    }

    public void print(){
        System.out.println("행의 개수 : " + table.length);      //행의 개수를 리턴한다.
        System.out.println("열의 개수 : " + table[0].length);   //열의 개수를 리턴한다.


        //print
        for(int[] i : table) {
            for(int j : i){
                System.out.print(j);
            }
        }
    }


}
