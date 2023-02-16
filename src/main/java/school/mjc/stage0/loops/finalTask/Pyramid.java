package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int offset = cathetusLength - i;
            System.out.print(" ".repeat(offset));
            for (int k = i; k >= -i; k--) {
                if (k == 0 || k == -1) {
                    continue;
                }
                System.out.print(Math.abs(k));
            }
            System.out.println(" ".repeat(offset));
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
