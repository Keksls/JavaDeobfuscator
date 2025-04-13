/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;

/*
 * Renamed from bvt
 */
public class bvt_2
implements ajh_1 {
    public static final String a = "calendar";
    public static final String b = "eventsForMonth";
    private bvs_2 d;
    private fsb e;
    private final bvr_2 f = new bvr_2();
    private ArrayList<bvu_1> g;
    private static final bvt_2 h = new bvt_2();

    private bvt_2() {
    }

    public static bvt_2 a() {
        return h;
    }

    public void a(bvs_2 bvs_22) {
        this.d = bvs_22;
    }

    public fsb b() {
        return this.e;
    }

    private Calendar h() {
        return this.f.a();
    }

    public void a(fsb fsb2) {
        this.e = fsb2;
        this.f.b();
        this.e.setCalendar(this.h());
        this.g();
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f;
        }
        if (string.equals(b)) {
            return this.g;
        }
        return null;
    }

    public void a(int n) {
        this.f.b(n);
        this.e.setCalendar(this.h());
        this.g();
    }

    public void b(int n) {
        this.f.c(n);
        this.e.setCalendar(this.h());
        this.g();
    }

    public int c() {
        if (this.e != null) {
            return this.e.getDayOver();
        }
        return 1;
    }

    public int e() {
        if (this.e != null) {
            return this.f.e();
        }
        return 1;
    }

    public int f() {
        if (this.e != null) {
            return this.f.f();
        }
        return 1;
    }

    public void g() {
        if (this.e != null) {
            this.g = this.i();
            this.e.setContent(this.g);
        }
    }

    private ArrayList<bvu_1> i() {
        ArrayList<bvu_1> arrayList = new ArrayList<bvu_1>();
        wt_0 wt_02 = new wt_0(0, 0, 0, 1, this.f.e() + 1, this.f.f());
        int n = this.h().getActualMaximum(5);
        for (int k = 1; k <= n; ++k) {
            Set<eLo> set = this.d.a(wt_02);
            if (set != null && !set.isEmpty()) {
                bvu_1 bvu_12 = new bvu_1(k, set);
                arrayList.add(bvu_12);
            }
            wt_02.a(wx_0.c);
        }
        return arrayList;
    }

    @Override
    public String[] d() {
        return new String[0];
    }
}

