/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bwp
 */
public final class bwp_1 {
    private static final int a = 0;
    private bvx_2 b = null;
    private bae_0 c;
    private baK d;
    private bbb e;
    private baZ f;
    private bbc_0 g;
    private bbm h;
    private bbH i;

    public void a() {
        this.a(baK.a(alc_1.q(), emd_1.B.a(), 0, "fight.beginning"), this.c, baX.a(alc_1.q(), emd_1.G.a(), 0, bwp_1.b()), this.d, this.e, this.f, this.g, this.i, this.h);
        baa_0.a().a(this.b);
    }

    public static ArrayList<ahr_1> b() {
        ArrayList<ahr_1> arrayList = new ArrayList<ahr_1>();
        arrayList.add(ddy_0.a());
        arrayList.add(cyp_0.g());
        arrayList.add(cYH.a());
        return arrayList;
    }

    private void a(aku_1 ... aku_1Array) {
        for (int k = 0; k < aku_1Array.length; ++k) {
            aku_1 aku_12 = aku_1Array[k];
            this.a(aku_12);
        }
    }

    private void a(aku_1 aku_12) {
        baa_0.a().a(this.b, aku_12);
    }

    public void c() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public void a(bvx_2 bvx_22) {
        this.b = bvx_22;
    }

    public void a(baK baK2) {
        this.d = baK2;
    }

    public void a(bbm bbm2) {
        this.h = bbm2;
    }

    public void a(bbH bbH2) {
        this.i = bbH2;
    }

    public void a(bbc_0 bbc_02) {
        this.g = bbc_02;
    }

    public void a(baZ baZ2) {
        this.f = baZ2;
    }

    public void a(bbb bbb2) {
        this.e = bbb2;
    }

    public void a(blx_1 blx_12, aff_1 aff_12) {
        if (this.c == null) {
            this.c = bae_0.a(alc_1.q(), emd_1.x.a(), 0, blx_12, aff_12);
        } else {
            this.c.a(blx_12, aff_12);
        }
    }
}

