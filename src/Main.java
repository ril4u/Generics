import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int lenghtArrayBox = 5;

        //Создаем два массима волшебных коробок с разными типами и передаем их в
        String[] mb1 = new String[lenghtArrayBox];
        MagicBox<String> magicBox1 = new MagicBox(mb1);

        Integer[] mb2 = new Integer[lenghtArrayBox];
        MagicBox<Integer> magicBox2 = new MagicBox(mb2);

        magicBox1.add("One");
        magicBox1.add("Two");
        magicBox1.add("Three");
        magicBox1.add("Four");
        magicBox1.add("Five");
        magicBox1.add("Six");

        //делаю неполную коробку для исключения
        magicBox2.add(1);
        magicBox2.add(2);
        magicBox2.add(3);
        //magicBox2.add(4);
        //magicBox2.add(5);
        //magicBox2.add(6);

        System.out.println("String MagicBox: " + Arrays.toString(mb1));
        System.out.println("Random: " + magicBox1.pick());

        System.out.println("Integer MagicBox: " + Arrays.toString(mb2));
        System.out.println("Random: " + magicBox2.pick());
    }
}