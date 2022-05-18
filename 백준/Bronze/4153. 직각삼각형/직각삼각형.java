import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        int sqrX, sqrY, sqrZ;

        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();

            if (x * y * z == 0) {
                break;
            }

            sqrX = (int) Math.pow(x, 2);
            sqrY = (int) Math.pow(y, 2);
            sqrZ = (int) Math.pow(z, 2);

            //* z 가 빗변이라는 가정하에
            if ((sqrX + sqrY == sqrZ) || (sqrX + sqrZ == sqrY) || (sqrZ + sqrY == sqrX)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }

}
