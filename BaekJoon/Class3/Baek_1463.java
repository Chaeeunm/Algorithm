package BaekJoon.Class3;

public class Baek_1463 {
    public static boolean[] visit;
    public static int[][] map;
    static int n = visit.length;

    public static void dfs(int i) {
        visit[i] = true;
        System.out.println(i + " ");
        for (int j = 1; j < n + 1; j++) {
            if (map[i][j] == 1 && visit[j] == false) {
                dfs(j);
            }
        }
    }
}
