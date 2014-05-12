public class Storage {
    protected int area = 20;
    protected int capacity = 20;
    protected int product = 10;
    protected int laminat = 10;
    protected int otherСomponents =10;

    public static void storage(String[] args) {
        char[][] storage1 = new char[2][9];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
                if (i < 2) {
                    storage1[i][j] = 1;
                } else {
                    storage1[i][j] = 2;
                }
            }
        }
    }
}
