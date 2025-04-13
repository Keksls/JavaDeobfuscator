/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Renamed from Wy
 */
public enum wy_0 {
    a("Winter"),
    b("Spring"),
    c("Summer"),
    d("Fall");

    static final Calendar e;
    private final String f;

    public static synchronized wy_0 a(wu_0 wu_02) {
        long l = wu_02.h() - e.getTime().getTime();
        long l2 = l / wb_0.f.h();
        wy_0[] wy_0Array = wy_0.values();
        return wy_0Array[Hw.e(l2 % (long)wy_0.values().length)];
    }

    public static wt_0 b(wu_0 wu_02) {
        long l = e.getTime().getTime();
        long l2 = wu_02.h() - l;
        long l3 = l2 / wb_0.f.h() * wb_0.f.h();
        return wt_0.b(l3 + l);
    }

    public static int c(wu_0 wu_02) {
        wt_0 wt_02 = wy_0.b(wu_02);
        return wt_02.g(wu_02).d(wb_0.d);
    }

    public wu_0 d(wu_0 wu_02) {
        wu_0 wu_03 = wu_02;
        wy_0 wy_02 = wy_0.a(wu_03);
        while (wy_02 != this) {
            wu_03 = wu_03.l((int)(wb_0.f.g() / 86400L));
            wy_02 = wy_0.a(wu_03);
        }
        return wy_0.b(wu_03);
    }

    private wy_0(String string2) {
        this.f = string2;
    }

    public String a() {
        return this.f;
    }

    public byte b() {
        return (byte)(this.ordinal() + 1);
    }

    public String toString() {
        switch (this) {
            case b: {
                return "Printemps";
            }
            case c: {
                return "Et\u00e9";
            }
            case d: {
                return "Automne";
            }
            case a: {
                return "Hiver";
            }
        }
        return super.toString();
    }

    static {
        e = new GregorianCalendar();
        e.setTimeZone(wt_0.a);
        e.setTimeInMillis(0L);
        e.set(3, 2);
        e.set(7, 3);
    }
}

