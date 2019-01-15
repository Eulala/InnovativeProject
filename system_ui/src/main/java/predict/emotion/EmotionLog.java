package predict.emotion;

import java.util.Date;

public class EmotionLog {
    private Date logTime;
    private Emotion emotion;
    public EmotionLog(Date date, Emotion emotion) {
        logTime = (Date)date.clone();
        this.emotion = emotion;
    }
    public String toString() {
        return logTime.toString() + " " + emotion.toString();
    }
}