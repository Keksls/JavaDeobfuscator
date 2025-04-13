/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bbE
 */
public class bbe_0
extends alc_1 {
    private final Iterable<fld_0> e;

    public bbe_0(int n, Iterable<fld_0> iterable) {
        super(n, emd_1.S.a(), 0);
        this.e = iterable;
    }

    @Override
    public long o() {
        boolean bl;
        boolean bl2 = false;
        boolean bl3 = false;
        for (fld_0 fld_02 : this.e) {
            blx_1 blx_12 = bzf_1.a(fld_02.a());
            if (!(blx_12 instanceof bnh_1)) continue;
            bnh_1 bnh_12 = (bnh_1)blx_12;
            flk_0 flk_02 = fld_02.b();
            Optional<emy_0> optional = ena_0.a().a(bnh_12.U_(), end_0.a);
            optional.ifPresent(emy_02 -> ((eaf_0)emy_02).b(bnh_12.a_(), flk_02.a()));
            if (flk_02.e()) {
                bl2 = true;
            }
            if (!flk_02.e() || bnh_12.ab_() || bnh_12.ak() || bnh_12.bv().bs()) continue;
            this.a(bnh_12);
            if (bnh_12 != azu_0.j().k()) continue;
            bl3 = true;
        }
        if (bl2 && (bl = fis_1.a().c("hideDownscaling")) && !eag_0.a(azu_0.j().k().U_())) {
            fis_1.a().a("hideDownscaling", false);
        }
        int n = 0;
        if (bl3) {
            try {
                n = azu_0.j().k().bv().j("AnimLevelUp");
            }
            catch (RuntimeException runtimeException) {
                a.error((Object)"Exception levee", (Throwable)runtimeException);
            }
        }
        return n;
    }

    private boolean a(bnh_1 bnh_12, flk_0 flk_02) {
        long l = flk_02.c();
        if (l <= 0L) {
            return false;
        }
        short s2 = flk_02.a();
        bnh_12.a(l, s2);
        if (s2 <= 0) {
            return false;
        }
        if (cZI.A()) {
            cZI.a().e(bnh_12.a_());
        }
        if (bnh_12 == azu_0.j().k()) {
            try {
                bua_0.a.a(new bun_2(bnh_12.dt()));
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        return true;
    }

    private void a(bnh_1 bnh_12) {
        bnh_12.aH();
        bnh_12.a(aej_2.c);
        bnh_12.bv().e("AnimLevelUp");
        bnh_12.bv().g("AnimStatique");
    }

    @Override
    protected void l() {
        for (fld_0 fld_02 : this.e) {
            blx_1 blx_12 = bzf_1.a(fld_02.a());
            if (!(blx_12 instanceof bnh_1)) continue;
            bnh_1 bnh_12 = (bnh_1)blx_12;
            this.a(bnh_12, fld_02.b());
        }
    }

    public static bbe_0 a(ctc_1 ctc_12) {
        return new bbe_0(bbe_0.q(), ctc_12.c());
    }
}

