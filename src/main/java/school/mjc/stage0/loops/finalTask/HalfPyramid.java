package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int offset = cathetusLength - i;
            System.out.print(" ".repeat(offset));
            System.out.println("*".repeat(i));
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
