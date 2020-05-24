package hackerearth;

import java.util.Scanner;

public class ColoringTrees {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new ColoringTrees().run();
        long endTime = System.currentTimeMillis();
        //System.out.println(endTime - startTime + "ms");
    }

    private static final long INFINITY = 1000L;

    int treesNumber;
    int colorsNumber;
    int requiredBeauty;
    int[] treesColors;
    int[][] costs;
    long[][][] dp;

    private void run() {
        init();
        long result = evalResult();
        System.out.println(result);
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        treesNumber = scanner.nextInt();
        colorsNumber = scanner.nextInt();
        requiredBeauty = scanner.nextInt();
        treesColors = new int[treesNumber + 1];
        for (int i = 1; i <= treesNumber; i++) {
            treesColors[i] = scanner.nextInt();
        }
        costs = new int[treesNumber + 1][colorsNumber + 1];
        for (int i = 1; i <= treesNumber; i++) {
            for (int j = 1; j <= colorsNumber; j++) {
                costs[i][j] = scanner.nextInt();
            }
        }
        dp = new long[treesNumber + 1][requiredBeauty + 1][colorsNumber + 1];
        for (int i = 0; i <= treesNumber; i++) {
            for (int j = 0; j <= requiredBeauty; j++) {
                for (int k = 0; k <= colorsNumber; k++) {
                    dp[i][j][k] = INFINITY;
                }
            }
        }
    }


    private long evalResult() {
        fillFirstTreeLayer();
        for (int i = 2; i <= treesNumber; i++) {
            for (int j = 1; j <= requiredBeauty; j++) {
                for (int k = 1; k <= colorsNumber; k++) {
                    if (dp[i - 1][j][k] < INFINITY) {
                        if (treesColors[i] == 0) {
                            for (int new_k = 1; new_k <= colorsNumber; new_k++) {
                                if (new_k == k) {
                                    dp[i][j][new_k] = Math.min(dp[i][j][new_k], dp[i - 1][j][k] + costs[i][new_k]);
                                    System.out.println(" Unset - new k = k ");
                                    printDP(dp);
                                } else {
                                    if (j < requiredBeauty) {
                                        dp[i][j + 1][new_k] = Math.min(dp[i][j + 1][new_k], dp[i - 1][j][k] + costs[i][new_k]);
                                        System.out.println(" Unset - j < requiredBeauty");
                                        printDP(dp);
                                    }
                                }
                            }
                        } else {
                            int color = treesColors[i];
                            if (color == k) {
                                dp[i][j][color] = Math.min(dp[i][j][color], dp[i - 1][j][k]);
                                System.out.println("Set - color = k");
                                printDP(dp);
                            } else {
                                if (j < requiredBeauty) {
                                    dp[i][j + 1][color] = Math.min(dp[i][j + 1][color], dp[i - 1][j][k]);
                                    System.out.println("Set - j < requiredBeauty");
                                    printDP(dp);
                                }
                            }
                        }
                    }
                }
            }
        }

        printDP(dp);
        long result = INFINITY;
        for (int k = 1; k <= colorsNumber; k++) {
            result = Math.min(result, dp[treesNumber][requiredBeauty][k]);
        }
        if (result == INFINITY) result = -1;
        return result;
    }

    private void fillFirstTreeLayer() {
        if (treesColors[1] == 0) {
            for (int k = 1; k <= colorsNumber; k++) {
                dp[1][1][k] = costs[1][k];
                System.out.println("Unset - fillFirstTreeLayer");
                printDP(dp);
            }
        } else {
            int color = treesColors[1];
            dp[1][1][color] = 0;
            System.out.println("Set - fillFirstTreeLayer");
            printDP(dp);
        }
    }

    void printDP (long[][][] ett){
        for (int i= 0; i<ett.length;i++){

            for (int j= 0; j<ett[i].length ;j++){
                for (int k=0; k<ett[i][j].length;k++){
                    System.out.print(ett[i][j][k]+" ");
                }
                System.out.print("\n");
            }
            System.out.println();

        }
        System.out.println();
    }
}


