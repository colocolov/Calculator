package pkg16_bigcalculate;

import pkg16_bigcalculate.Calculator;

public class Numbers {

    private Integer value;
    
    // конструктор
    public Numbers(Integer value) {
        this.value = value;
    }

    // getter
    public Integer getValue() {
        return value;
    }

    //setter
    public void setValue(Integer value) {
        this.value = value;
    }
    
    
//    static void btnNumbers(Integer value) {
//        if (ravno) {
//            monitor.setText("");
//        }
//        if (monitor.getText().isEmpty()) {
//            monitor.setText("1");
//            tempValue = Double.parseDouble(monitor.getText());
//        } else {
//            if (point == true) {
//                monitor.setText(monitor.getText() + "1");
//                tempValue = Double.parseDouble(monitor.getText());
//            } else {
//                valueZero = Double.parseDouble(monitor.getText());
//                if (valueZero != 0) {
//                    monitor.setText(monitor.getText() + "1");
//                    tempValue = Double.parseDouble(monitor.getText());
//                } else {
//                    monitor.setText("1");
//                }
//            }
//        }
//    }
}
