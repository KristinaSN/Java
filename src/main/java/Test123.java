import java.util.ArrayList;

public class Test123 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(99));

        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
