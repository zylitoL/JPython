public class PyRange {
    static int[] range(int stop) {
        int [] res = new int[stop];
        for (int i = 0; i < stop; i++) {
            res[i] = i;
        }
        return res;
    }
    static int[] range(int start, int stop) {
        int[] res = new int[stop - start];
        for (int i = 0, j = start; j < stop; i++, j++) {
            res[i] = j;
        }
        return res;
    }
    static int[] range(int start, int stop, int step) {
        int bound = (int) Math.ceil((double) (stop - start) / step);
        int[] res = new int[bound];
        for (int i = 0, j = start; j < stop; i++, j+= step) {
            res[i] = j;
        }
        return res;
    }
}
