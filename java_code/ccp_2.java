/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ccP
 */
class ccp_2 {
    private final TIntObjectHashMap<afe_1> b = new TIntObjectHashMap();
    private final TIntObjectHashMap<afe_1> c = new TIntObjectHashMap();
    private final TIntObjectHashMap<ays_2> d = new TIntObjectHashMap();
    private final String e;
    private final String f;
    private float g;
    static final /* synthetic */ boolean a;

    ccp_2(String string, String string2) {
        this.e = string;
        this.f = string2;
    }

    ays_2 a(int n) {
        if (!a && this.b.isEmpty()) {
            throw new AssertionError((Object)"appeller initialize avant");
        }
        ays_2 ays_22 = (ays_2)this.d.get(n);
        if (ays_22 != null) {
            return ays_22;
        }
        afe_1 afe_12 = this.c(n);
        if (afe_12 == null) {
            cco_1.b.error((Object)("pas de texture " + n));
            return null;
        }
        String string = null;
        try {
            string = gg_0.e(azs_0.a().a(this.e) + n + ".tga");
        }
        catch (gm_0 gm_02) {
            cco_1.b.error((Object)"", (Throwable)gm_02);
        }
        long l = auc_1.d(string);
        ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), l, string, false);
        if (ays_22 == null) {
            cco_1.b.error((Object)("la texture " + string + " n'existe pas?"));
            return null;
        }
        if (ays_22.g() != null) {
            ays_22.a(true);
        }
        ays_22.k_();
        this.d.put(n, (Object)ays_22);
        ays_22.a(0).a((short)afe_12.a(), (short)afe_12.b());
        return ays_22;
    }

    afe_1 b(int n) {
        return (afe_1)this.c.get(n);
    }

    public afe_1 c(int n) {
        return (afe_1)this.b.get(n);
    }

    float a() {
        return this.g;
    }

    void b() {
        this.d.forEachValue((TObjectProcedure)new ccq_2(this));
        this.d.clear();
    }

    void c() {
        String string = azs_0.z(this.f);
        atg_2 atg_22 = atg_2.a();
        atg_22.a(string);
        ath_2 ath_22 = atg_22.b();
        atg_22.a(ath_22, new aqy_2[0]);
        ati_2 ati_22 = ath_22.a();
        for (aqx_2 aqx_22 : ati_22.d("offset")) {
            int n = aqx_22.f("id").g();
            int n2 = aqx_22.f("x").g();
            int n3 = aqx_22.f("y").g();
            this.b.put(n, (Object)new afe_1(n2, n3));
            int n4 = aqx_22.f("cell_x").g();
            int n5 = aqx_22.f("cell_y").g();
            this.c.put(n, (Object)new afe_1(n4, n5));
        }
        this.c.compact();
        this.b.compact();
        this.g = ati_22.f("scale").i();
        atg_22.l();
    }

    static {
        a = !cco_1.class.desiredAssertionStatus();
    }
}

