/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Renamed from eyW
 */
public class eyw_2 {
    private static final Calendar a = new GregorianCalendar(wt_0.a);

    private eyw_2() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static short a(Date date) {
        Calendar calendar = a;
        synchronized (calendar) {
            a.setTime(date);
            byte by = (byte)a.get(5);
            byte by2 = (byte)a.get(2);
            return Hw.c(by, by2);
        }
    }

    public static short a(wu_0 wu_02) {
        byte by = (byte)wu_02.j();
        byte by2 = (byte)(wu_02.m() - 1);
        return Hw.c(by, by2);
    }
}

