package SE.Structural.Adapter;

public class AdapterExam {

    AdapterExam(int votage){
        if (votage>380){
            new HighVoltage(votage+500);
        }else {
            new LowVoltage(votage-100);
        }
    }
}
