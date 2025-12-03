public class Theosearcho {

    public static String theosearcho(int[] dataset, int target) {

        int n = dataset.length;
        int size = (int) Math.ceil(Math.sqrt(n));

        int row = size / 2;
        int col = size / 2;

        int[][] directions = {
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };

        int directionIndex = 0;
        int stepSize = 1;

        int visitedRealCells = 0;

        java.util.function.BiFunction<Integer, Integer, Integer> toIndex = (r, c) ->
                r * size + c;

        while (visitedRealCells < n) {

            for (int twice = 0; twice < 2; twice++) {

                for (int step = 0; step < stepSize; step++) {

                    int index = toIndex.apply(row, col);
                    if (index >= 0 && index < n) {
                        if (dataset[index] == target) {
                            return "FOUND by THEOSEARCHO at index: " + index;
                        }
                        visitedRealCells++;
                    }

                    row += directions[directionIndex][0];
                    col += directions[directionIndex][1];
                }

                directionIndex = (directionIndex + 1) % 4;
            }

            stepSize++;
        }

        return "NOT FOUND — THEOSEARCHO retires in defeat.";
    }

    public static void main(String[] args) {
        int[] data = {5, 9, 3, 1, 8, 7, 2};
        int target = 8;

        System.out.println(theosearcho(data, target));
    }
}
