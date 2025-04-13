/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteLongHashMap
 *  gnu.trove.procedure.TByteLongProcedure
 */
import gnu.trove.map.hash.TByteLongHashMap;
import gnu.trove.procedure.TByteLongProcedure;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from feJ
 */
public class fej_0 {
    private final faX a;
    private fbb_0 b;
    private final TByteLongHashMap c = new TByteLongHashMap();
    private final TByteLongHashMap d = new TByteLongHashMap();
    private final Map<Integer, Integer> e = new HashMap<Integer, Integer>();

    fej_0(faX faX2) {
        this.a = faX2;
    }

    public void a(fbb_0 fbb_02) {
        this.b = fbb_02;
    }

    void a(int n, long l) {
        this.e.put(n, Math.min(1000000000, Hw.e(l)));
    }

    void a(int n) {
        this.e.remove(n);
    }

    void a(fgi_0 fgi_02, long l) {
        this.c.adjustOrPutValue(fgi_02.a(), l, l);
        if (this.b != null) {
            this.b.a(this.a, fgi_02.a(), l);
        }
    }

    void a(fjb_0 fjb_02, int n) {
        this.d.adjustOrPutValue(fjb_02.b, (long)n, (long)n);
        if (this.b != null) {
            this.b.a(this.a, fjb_02, (long)n);
        }
    }

    public void a() {
        this.c.clear();
        this.d.clear();
        this.e.clear();
    }

    public void a(wp_2 wp_22, Boolean bl) {
        this.c.forEachEntry((TByteLongProcedure)new fel_0(wp_22));
        this.d.forEachEntry((TByteLongProcedure)new fek_0(wp_22));
        if (bl.booleanValue()) {
            wp_22.c = new ws_2();
            wp_22.c.a = this.d();
        }
    }

    public void a(wp_2 wp_22) {
        gs_0 gs_02;
        int n;
        int n2 = wp_22.a.size();
        for (n = 0; n < n2; ++n) {
            gs_02 = wp_22.a.get(n);
            this.c.put(gs_02.a, (long)gs_02.b);
        }
        n2 = wp_22.b.size();
        for (n = 0; n < n2; ++n) {
            gs_02 = wp_22.b.get(n);
            this.d.put(((wq_1)gs_02).a, (long)((wq_1)gs_02).b);
        }
    }

    public TByteLongHashMap b() {
        return this.c;
    }

    public TByteLongHashMap c() {
        return this.d;
    }

    public int d() {
        int n = 0;
        for (int n2 : this.e.values()) {
            if ((n = Hw.e((long)n + (long)n2)) < 1000000000) continue;
            return 1000000000;
        }
        return n;
    }
}

