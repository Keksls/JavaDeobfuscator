/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntLongHashMap
 */
import gnu.trove.map.hash.TIntLongHashMap;
import java.util.ArrayList;

/*
 * Renamed from bnL
 */
public class bnl_2 {
    public static final bnl_2 a = new bnl_2();
    private int b;
    private long c;
    private final TIntLongHashMap d = new TIntLongHashMap();
    private final ArrayList<bno_1> e = new ArrayList();
    private final ans_1 f = new bnm_1(this);
    final fzi g = new bnn_1(this);

    private void d() {
        if (this.e.isEmpty()) {
            fpm_0.b().o("questActivationDialog");
        } else {
            bno_1 bno_12 = this.e.remove(this.e.size() - 1);
            this.b(bno_12.b, bno_12.a);
        }
    }

    public void a() {
        if (this.b != -1) {
            cld_1 cld_12 = new cld_1(this.b, this.c, true);
            azu_0.j().K().c(cld_12);
        }
        this.d();
    }

    public void b() {
        if (this.b != -1) {
            cld_1 cld_12 = new cld_1(this.b, this.c, false);
            azu_0.j().K().c(cld_12);
        }
        this.d();
    }

    public void a(int n, long l) {
        long l2 = this.d.get(n);
        long l3 = System.currentTimeMillis();
        if (l2 != 0L && l3 - l2 < 30000L) {
            return;
        }
        this.d.put(n, l3);
        if (fpm_0.b().q("questActivationDialog")) {
            this.e.add(new bno_1(l, n));
        } else {
            this.b(n, l);
        }
    }

    private void b(int n, long l) {
        this.b = n;
        this.c = l;
        if (!fpm_0.b().q("questActivationDialog")) {
            fpm_0.b().a(this.f);
            cff_0.b().b(this.g);
            fpm_0.b().a("questActivationDialog", cfi_0.a("questActivationDialog"), 8192L, (short)10000);
            fpm_0.b().a("wakfu.quests", cjp_0.class);
            fpm_0.b().a("wakfu.achievements", cfp_0.class);
        }
        biw_2 biw_22 = biz_2.a.b(azu_0.j().k().a_(), n);
        fis_1.a().a("displayedAchievement", (Object)biw_22, "questActivationDialog");
    }

    public void c() {
        this.e.clear();
        this.b = -1;
        this.c = -1L;
        this.d.clear();
        cff_0.b().b(this.g);
        fpm_0.b().b(this.f);
        fpm_0.b().e("wakfu.quests");
        fpm_0.b().e("wakfu.achievements");
    }
}

