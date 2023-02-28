import java.util.Random;

public class controle {
    public static void main(String [] args) {
        Random rand = new Random();

        televisor tv = new televisor();

        tv.getVolume();
        tv.setVolume(15);
        tv.getCanal();
        tv.setCanal(8);
        tv.AumentarVolume();
        tv.DiminuirVolume();
        tv.TrocarCanal(8);
        tv.mostra();

    }
}
