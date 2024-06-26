package Day_16_17;
public class NQueen {

    private static int N = 8;

    public static boolean solveNQueen(int[][] board, int col) {
        if (col >= N) {
            return true;
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solveNQueen(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0; // Backtracking
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + (board[i][j]==1?"N":"X") + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        if (!solveNQueen(board, 0)) {
            System.out.println("Solution does not exist");
        } else {
            printSolution(board);
        }
    }
}

//code_by_dugar