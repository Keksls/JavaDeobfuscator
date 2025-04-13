/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.helpers.AbsoluteTimeDateFormat
 *  org.jetbrains.annotations.Nullable
 */
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;
import org.apache.log4j.helpers.AbsoluteTimeDateFormat;
import org.jetbrains.annotations.Nullable;

public class WR
extends AbsoluteTimeDateFormat {
    public WR() {
    }

    public WR(TimeZone timeZone) {
        super(timeZone);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        String string;
        long l = date.getTime();
        int n = (int)(l % 1000L);
        this.calendar.setTime(date);
        int n2 = stringBuffer.length();
        int n3 = this.calendar.get(1);
        stringBuffer.append(n3);
        switch (this.calendar.get(2)) {
            case 0: {
                string = "-01-";
                break;
            }
            case 1: {
                string = "-02-";
                break;
            }
            case 2: {
                string = "-03-";
                break;
            }
            case 3: {
                string = "-04-";
                break;
            }
            case 4: {
                string = "-05-";
                break;
            }
            case 5: {
                string = "-06-";
                break;
            }
            case 6: {
                string = "-07-";
                break;
            }
            case 7: {
                string = "-08-";
                break;
            }
            case 8: {
                string = "-09-";
                break;
            }
            case 9: {
                string = "-10-";
                break;
            }
            case 10: {
                string = "-11-";
                break;
            }
            case 11: {
                string = "-12-";
                break;
            }
            default: {
                string = "-NA-";
            }
        }
        stringBuffer.append(string);
        int n4 = this.calendar.get(5);
        if (n4 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(n4);
        stringBuffer.append(' ');
        int n5 = this.calendar.get(11);
        if (n5 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(n5);
        stringBuffer.append(':');
        int n6 = this.calendar.get(12);
        if (n6 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(n6);
        stringBuffer.append(':');
        int n7 = this.calendar.get(13);
        if (n7 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(n7);
        return stringBuffer;
    }

    @Nullable
    public Date parse(String string, ParsePosition parsePosition) {
        return null;
    }
}

