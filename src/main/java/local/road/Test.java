package local.road;

/**
 * Created by tisizi on 4/8/16.
 */
public class Test {
    public static void main(String[] arg){
        int[][] input = new int[][]{
                new int[]{3,2},
                new int[]{1,2},
                new int[]{2,7},
                new int[]{1,3},
                new int[]{3,2},
                new int[]{1,2},
                new int[]{2,7},
                new int[]{1,3}
        };
        int n = input[0][0];//
        int v = input[0][1];//
        int max[] = new int[2];
        int tmp = 0;
        for(int i = 1; i < 8; i++){
            if(n >= v){
                tmp = v / input[i][0] * input[i][1];
            }
            else {
                tmp = n * input[i][0] / v * input[i][1];
            }
            if(tmp > max[0]){
                max[0] = tmp;
                max[1] = i;
            }
        }
        System.out.println(input[max[1]][0] + " " + input[max[1]][1]);
    }
}
