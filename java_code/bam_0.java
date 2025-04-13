/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 */
import gnu.trove.map.hash.THashMap;
import java.util.Map;

/*
 * Renamed from bam
 */
public abstract class bam_0
extends alb_2 {
    protected static final bwi_0 n = new bwi_0();
    private bwh_0 m;
    private final int o;

    public bam_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3);
        this.o = n4;
        THashMap tHashMap = new THashMap(1);
        tHashMap.put((Object)"fightId", (Object)this.o);
        this.a((Map<String, Object>)tHashMap);
        this.A();
    }

    protected void A() {
        if (this.m == null) {
            this.m = bwj_1.a().a(this.o);
        }
    }

    protected bwh_0 B() {
        this.A();
        return this.m;
    }

    public int C() {
        return this.o;
    }

    public boolean D() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        this.A();
        bvx_2 bvx_22 = bmr_12.cP();
        if (bvx_22 == null || this.m == null) {
            return false;
        }
        return bvx_22 == this.m;
    }

    public blx_1 d(long l) {
        this.A();
        blx_1 blx_12 = null;
        if (this.m != null) {
            blx_12 = this.m.e(l);
        }
        if (blx_12 == null) {
            blx_12 = bmf_2.a().c(l);
        }
        return blx_12;
    }

    public ss_0 E() {
        this.A();
        if (this.m == null) {
            a.error((Object)("combat non trouv\u00e9 : " + this.o));
            return null;
        }
        return this.m.i();
    }

    @Override
    protected void l() {
        super.l();
        blx_1 blx_12 = this.d(this.f());
        blx_1 blx_13 = this.d(this.h());
        bbI.a(blx_12, blx_13);
    }
}

