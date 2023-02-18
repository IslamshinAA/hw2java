import java.lang.System.Logger.Level;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class main1 {
   
    private static Object loger;
    public static void main (String[] args) {
        int[] num = new int[]{13, 21, 9, 40, 27, 25};
        int b;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1; j++) {   
            if (num[j] > num[j+1]) {
                b = num[j];
                num[j] = num[j+1];
                num[j+1] = b;
                Logger logger = Logger.getLogger(main1.class.getName());
                FileHandler fh = new FileHandler(log.xml);
                logger.addHandler(fh);
                XMLFormatter xml = new XMLFormatter();
                fh.setFormatter(xml);
                logger.log(Level.INFO, "  ");
                logger.info(num[i]);

            }
        }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
    // public static void resint (String[] args) {
    //     Logger logger = Logger.getLogger(main1.class.getName());
    //     FileHandler fh = new FileHandler(log.xml);
    //     logger.addHandler(fh);
    //     XMLFormatter xml = new XMLFormatter();
    //     fh.setFormatter(xml);
    //     loger.log(Level.INFO, "  ");
    //     loger.info();
    // }
}
