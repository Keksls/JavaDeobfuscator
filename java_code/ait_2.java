/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

/*
 * Renamed from aIT
 */
public class ait_2
extends StreamHandler {
    @Override
    public void publish(LogRecord logRecord) {
        this.setOutputStream(logRecord.getLevel() == Level.INFO ? System.out : System.err);
        super.publish(logRecord);
        this.flush();
    }
}

