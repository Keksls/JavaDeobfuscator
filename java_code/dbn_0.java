/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from dbN
 */
class dbn_0
implements YT {
    public static final String a = "fontNarrow28BoldBordered";
    public static final String b = "fontNarrow24BoldBordered";
    public static final float c = 0.5f;
    private final ArrayList<zu_0> e = new ArrayList();
    private final blx_1 f;
    final /* synthetic */ dbm_0 d;

    dbn_0(dbm_0 dbm_02, blx_1 blx_12) {
        this.d = dbm_02;
        this.f = blx_12;
        this.f.bv().a(this);
        this.a(this.f);
    }

    private void a(blx_1 blx_12) {
        String string;
        if (blx_12 instanceof bnh_1) {
            bnh_1 bnh_12 = (bnh_1)blx_12;
            string = bnh_12.a(((bvx_0)ans_0.D().h()).m());
            bQF bQF2 = bnh_12.eL();
            if (bQF2 != null && bQF2.c()) {
                this.a(bnh_12, string, a, 90);
                azf_2 azf_22 = cbm_1.a.a(bnh_12) ? bQF2.f().b() : azf_2.e;
                this.a(bnh_12, bQF2.a(bnh_12.gX()), b, 75, azf_22);
                return;
            }
        } else {
            string = blx_12.dp();
        }
        this.a(blx_12, string, a, 80);
    }

    private void a(blx_1 blx_12, String string, String string2, int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        azj_2 azj_22 = this.d.a(blx_12, bmr_12) ? aup_0.f.d() : (bmr_12.eZ() && bmr_12.eV().a(blx_12.a_()) != null ? aup_0.g.d() : (this.d.e(blx_12) ? aup_0.c.d() : aup_0.b.d()));
        this.a(blx_12, string, string2, n, azj_22);
    }

    private void a(blx_1 blx_12, String string, String string2, int n, azj_2 azj_22) {
        int n2 = -1;
        ZC zC = new ZC(0, n, 0.5f);
        ayn_2 ayn_22 = fpm_0.b().g().d(string2).c();
        zu_0 zu_02 = new zu_0(ayn_22, string, zC, -1);
        zu_02.b(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        biI biI2 = blx_12.bv();
        zu_02.a(biI2);
        zd_0.a().a(zu_02);
        this.e.add(zu_02);
    }

    @Override
    public void a(boolean bl, YU yU) {
        if (!bl) {
            this.a();
        }
    }

    public void a() {
        for (zu_0 zu_02 : this.e) {
            zd_0.a().b(zu_02);
        }
        this.f.bv().b(this);
        this.d.R.remove(this.f.a_());
    }
}

