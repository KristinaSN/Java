public class LifeTime {
    public static void main (String args []) {
        int x;

        for(x = 0; x < 5; x++) {
            int y = -1;
            System.out.println("y равно: " + y);
            y = 100;
            System.out.println("y теперь равно: " + y);
        }
    }
}
