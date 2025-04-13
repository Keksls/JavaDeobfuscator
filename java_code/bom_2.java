/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bom
 */
final class bom_2
extends boq_2 {
    private static final Logger B = Logger.getLogger(bom_2.class);
    private final blx_1 C;
    private int D = 0;
    private int E = 0;

    bom_2(epa_1 epa_12, bor_1 bor_12, blx_1 blx_12) {
        super(epa_12, bor_12, (byte)83);
        this.C = blx_12;
        this.D = epa_12.a();
        this.E = epa_12.a();
    }

    @Override
    protected int a() {
        return super.a();
    }

    @Override
    protected int b() {
        return this.E;
    }

    @Override
    public String c() {
        ani_2 ani_22 = new ani_2();
        try {
            ani_22.a(bac.a(this.z), 16, 16, null).a((CharSequence)" ");
        }
        catch (gm_0 gm_02) {
            B.warn((Object)gm_02.getMessage());
            ani_22.a(this.n()).a((CharSequence)" : ");
        }
        ani_22.d(this.a()).a((CharSequence)"/").d(this.b());
        return ani_22.r();
    }

    @Override
    public void a(rs_0 rs_02) {
        if (rs_02.p() != this.f()) {
            return;
        }
        if (rs_02.a() > this.D) {
            int n = this.C.a_(eps_0.b).c();
            boolean bl = this.C.gY() == 0 || this.C.gY() == 5;
            this.E = bl ? (int)Math.ceil((double)n / 2.0) : n;
        } else if (rs_02.a() <= 0) {
            this.E = 0;
        }
        this.D = rs_02.a();
        super.a(rs_02);
    }
}

