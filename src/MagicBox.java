import com.sun.source.tree.BreakTree;

import java.util.Random;

public class MagicBox<T> {
    protected T[] box;

    public MagicBox(T[] box) {
        this.box = box;
    }

    public boolean add(T item) {
        for (int i = 0; i < this.box.length; i++) {
            if (this.box[i] == null) {
                this.box[i] = item;
                return true;
            }
        }
        return false;
    }

    //этим методом проверяю количество пустых ячеек
    public int check() {
        int check = 0;
        for (int i = 0; i < this.box.length; i++) {
            if (this.box[i] == null) {
                check++;
            }
        }
        return check;
    }

    public T pick() throws Exception {
        if (this.check() == 0) {
            Random random = new Random();
            int randomInt = random.nextInt(this.box.length);
            return this.box[randomInt];
        }
        throw new Exception("Коробка не полна. Свободных ячеек: " + this.check());
    }

}




