/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bsC
 */
public class bsc_1
implements ajh_1 {
    public static final String a = "date";
    public static final String b = "sales";
    public static final String d = "totalSales";
    private final wu_0 f;
    private final abq_2<bse_1> g = new abq_2<bse_1>(new bsd_1(this));
    public static final String[] e = new String[]{"date", "sales"};

    public bsc_1(wu_0 wu_02) {
        this.f = new wt_0(wu_02);
    }

    public void a(bse_1 bse_12) {
        this.g.add(bse_12);
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a(this.f);
        }
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(d)) {
            int n = 0;
            for (int k = this.g.size() - 1; k >= 0; --k) {
                n = (int)((long)n + ((bse_1)this.g.get(k)).c());
            }
            return n;
        }
        return null;
    }

    public int a() {
        int n = 0;
        for (int k = this.g.size() - 1; k >= 0; --k) {
            n += ((bse_1)this.g.get(k)).a();
        }
        return n;
    }

    public List<bse_1> b() {
        return this.g;
    }

    public wu_0 c() {
        return this.f;
    }
}

