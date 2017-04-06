package seminarski;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import org.jdatepicker.impl.UtilDateModel;


public interface Funkcije {
        static UtilDateModel model = new UtilDateModel();
        static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        static LocalDateTime vreme = LocalDateTime.now();
        static String S = dtf.format(vreme);
        static String GODINA = S.substring(0, 4);
        static String MESEC = S.substring(5, 7);
        static String DAN = S.substring(8, 10);
        File ROOT = new File("projekti");
        String[] HOST_NAME = new String[4];
        int PORT_NUMBER_SERVER = 6000;
        int PORT_NUMBER_CLIENT = 6001;
        Properties P = new Properties();
}
