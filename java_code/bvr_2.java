/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Renamed from bvr
 */
public class bvr_2
implements ajh_1 {
    public static final String a = "calendar";
    public static final String b = "selectedMonth";
    public static final String d = "monthesList";
    public static final String e = "selectedYear";
    public static final String f = "yearsList";
    public static final String g = "hour";
    public static final String h = "minute";
    private static final int i;
    private static final ArrayList<Integer> j;
    private static final ArrayList<bvv_1> k;
    private final Calendar l = new GregorianCalendar(bae.h().f().b());
    private bvv_1 m;
    private Integer n;

    public bvr_2() {
        this.b();
    }

    public Calendar a() {
        return this.l;
    }

    public void b() {
        this.l.setTime(new Date());
        this.i();
        this.m = k.get(this.l.get(2) + k.size() - 12);
        int n = j.indexOf(this.l.get(1));
        this.n = j.get(n);
    }

    public void a(wu_0 wu_02) {
        this.c(wu_02.o());
        this.b(wu_02.m() - 1);
        this.a(wu_02.j());
        this.d(wu_02.k());
        this.e(wu_02.l());
    }

    public void a(int n) {
        this.l.set(5, n);
    }

    public int c() {
        return this.l.get(5);
    }

    public void b(int n) {
        this.l.set(2, n);
        this.m = k.get(Math.max(n + k.size() - 12, 0));
        fis_1.a().a((ajf_1)this, d, b, a);
    }

    public int e() {
        return this.m.a();
    }

    public void c(int n) {
        this.l.set(1, n);
        int n2 = j.indexOf(n);
        this.n = j.get(n2);
        this.i();
        fis_1.a().a((ajf_1)this, d, b, e, a);
    }

    public int f() {
        return this.n;
    }

    public void d(int n) {
        this.l.set(11, n);
        fis_1.a().a((ajf_1)this, g);
    }

    public int g() {
        return this.l.get(11);
    }

    public void e(int n) {
        this.l.set(12, n);
        fis_1.a().a((ajf_1)this, h);
    }

    public int h() {
        return this.l.get(12);
    }

    private void i() {
        int n;
        int n2 = 0;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date());
        if (gregorianCalendar.get(1) == this.l.get(1)) {
            n2 = gregorianCalendar.get(2);
        }
        int n3 = this.m != null ? this.m.a() : -1;
        k.clear();
        for (n = n2; n < 12; ++n) {
            k.add(new bvv_1(n));
        }
        this.m = null;
        if (n3 != -1) {
            for (n = k.size() - 1; n >= 0; --n) {
                bvv_1 bvv_12 = k.get(n);
                if (bvv_12.a() != n3) continue;
                this.m = bvv_12;
                break;
            }
        }
        if (this.m == null) {
            this.m = k.get(0);
        }
        this.b(this.m.a());
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.l;
        }
        if (string.equals(d)) {
            return k;
        }
        if (string.equals(b)) {
            return this.m;
        }
        if (string.equals(f)) {
            return j;
        }
        if (string.equals(e)) {
            return this.n;
        }
        if (string.equals(g)) {
            return this.l.get(11);
        }
        if (string.equals(h)) {
            return this.l.get(12);
        }
        return null;
    }

    @Override
    public String[] d() {
        return null;
    }

    static {
        j = new ArrayList(3);
        k = new ArrayList(12);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date());
        i = gregorianCalendar.get(1);
        for (int k = 0; k < 2; ++k) {
            j.add(i + k);
        }
    }
}

