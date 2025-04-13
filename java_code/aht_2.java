/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.AppenderSkeleton
 *  org.apache.log4j.Level
 *  org.apache.log4j.spi.LoggingEvent
 */
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;

/*
 * Renamed from aHT
 */
public class aht_2
extends AppenderSkeleton {
    private String a;
    private boolean b;

    protected void append(LoggingEvent loggingEvent) {
        String string;
        if (this.b) {
            return;
        }
        if (loggingEvent.getLevel() != Level.ERROR && loggingEvent.getLevel() != Level.FATAL) {
            return;
        }
        if (this.a != null && !loggingEvent.getLoggerName().matches(this.a)) {
            return;
        }
        String string2 = loggingEvent.getMessage().toString() + "\r\n\r\nAfficher les erreurs suivantes ?";
        if (JOptionPane.showConfirmDialog(null, string2, string = loggingEvent.getLocationInformation().getFileName() + ":" + loggingEvent.getLocationInformation().getLineNumber(), 0, 0) != 0) {
            this.b = true;
        }
    }

    public void a(String string) {
        this.a = null;
        try {
            Pattern.compile(string);
            this.a = string;
        }
        catch (Exception exception) {
            System.out.println("Invalid Pattern : " + string);
        }
    }

    public boolean requiresLayout() {
        return false;
    }

    public void close() {
    }
}

