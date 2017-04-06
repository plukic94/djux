package seminarski;

import javax.swing.JFrame;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;

public class DatePickerGUI extends JFrame implements Funkcije{
        public JFrame pomocni;
    
    public DatePickerGUI(){
        pomocni = new JFrame();
        
        pomocni.setSize(300, 300);
        pomocni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        model.setDate(Integer.parseInt(GODINA), Integer.parseInt(MESEC), Integer.parseInt(DAN));
        model.setSelected(true);
        P.put("text.today", "Today");
        P.put("text.month", "Month");
        P.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, P);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setSize(170, 30);
        pomocni.add(datePicker);
    }
}
