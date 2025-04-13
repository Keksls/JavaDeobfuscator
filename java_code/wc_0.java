/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from WC
 */
public class wc_0
extends wq_0
implements abs_1 {
    private static final wc_0 d = new wc_0();
    protected static final Logger c;
    private boolean e;
    private ArrayList<wd_0> f;
    private boolean g;
    private float h;
    private float i;
    private wr_0 j;

    public static wc_0 p() {
        return d;
    }

    @Override
    public void b(long l) {
        if (this.a() == null) {
            this.j = (ws_02, wq_02) -> {
                if (ws_02 == ws_0.b) {
                    super.b(l);
                    this.b(this.j);
                }
            };
            this.a(this.j);
            return;
        }
        super.b(l);
    }

    @Override
    protected void h() {
        wi_0 wi_02 = new wi_0(wb_0.g);
        c.info((Object)("WakfuGameCalendar : adding periodic ClimateUpdateEvent event, period=" + wi_02));
        this.b(new wg_0(this.a(), wi_02));
        wu_0 wu_02 = d.a();
        int n = wu_02.o();
        wt_0 wt_02 = new wt_0(this.a());
        wt_02.e();
        this.b(new wk_0(wt_02));
        wt_02.d();
        this.b(new wj_0(wt_02));
        super.h();
    }

    @Override
    public void a(long l) {
        super.a(l);
        this.t();
    }

    @Override
    public void run() {
        super.run();
        if (this.b) {
            this.t();
        }
    }

    public void a(wd_0 wd_02) {
        if (wd_02 == null) {
            return;
        }
        if (this.f == null) {
            this.f = new ArrayList(2);
        }
        this.f.add(wd_02);
    }

    private void t() {
        boolean bl = this.g;
        long l = this.g() / 1000L;
        long l2 = wb_0.e;
        long l3 = l % l2;
        this.i = (float)l3 / (float)l2 * 100.0f;
        int n = 25;
        int n2 = 75;
        this.g = !(this.i >= 75.0f) && !(this.i < 25.0f);
        this.h = wc_0.a(this.i, 75, 25);
        if (bl != this.g && this.f != null) {
            int n3 = this.f.size();
            for (int k = 0; k < n3; ++k) {
                this.f.get(k).a(this.g);
            }
        }
        this.e = true;
    }

    private static float a(float f2, int n, int n2) {
        int n3;
        int n4 = Math.min(n, n2);
        int n5 = Math.max(n, n2);
        int n6 = n5 - n4;
        int n7 = 100 - n6;
        int n8 = n3 = f2 > (float)n4 && f2 <= (float)n5 ? n6 : n7;
        float f3 = f2 >= (float)n5 ? (f2 - (float)n5) / (float)n3 : (f2 < (float)n4 ? 1.0f + (f2 - (float)n4) / (float)n3 : (f2 - (float)n4) / (float)n3);
        return f3 * 100.0f;
    }

    @Override
    public boolean o() {
        return this.g;
    }

    public float q() {
        return this.h;
    }

    @Override
    public float b() {
        return this.i;
    }

    public boolean r() {
        return this.e;
    }

    private wc_0() {
        super(1970, 1);
    }

    @Override
    public long s() {
        return this.e();
    }

    static {
        d.setFirstDayOfWeek(2);
        c = Logger.getLogger(wc_0.class);
    }
}

