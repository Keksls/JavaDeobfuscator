/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class bbQ
extends alc_1 {
    private final long e;
    private final Collection<flj_0> f = new ArrayList<flj_0>();

    private bbQ(int n, long l) {
        super(n, emd_1.U.a(), 0);
        this.e = l;
    }

    public static bbQ[] a(ctc_1 ctc_12) {
        bbQ[] bbQArray = new bbQ[ctc_12.b()];
        flf_0 flf_02 = ctc_12.c();
        int n = 0;
        for (fld_0 fld_02 : flf_02) {
            bbQ bbQ2 = bbQ.a(fld_02);
            bbQArray[n++] = bbQ2;
        }
        return bbQArray;
    }

    private static bbQ a(fld_0 fld_02) {
        bbQ bbQ2 = new bbQ(bbQ.q(), fld_02.a());
        Iterator<flj_0> iterator = fld_02.iterator();
        while (iterator.hasNext()) {
            bbQ2.f.add(iterator.next());
        }
        return bbQ2;
    }

    @Override
    public long o() {
        blx_1 blx_12;
        blx_1 blx_13 = bzf_1.a(this.e);
        blx_1 blx_14 = blx_12 = blx_13 != null ? blx_13 : bmf_2.a().c(this.e);
        if (blx_12 == null) {
            a.warn((Object)("SkillOrSpellXpModificationAction non ex\u00e9cut\u00e9 pour player inconnu " + this.e));
            return 0L;
        }
        if (blx_13 == null) {
            return 0L;
        }
        if (this.f.isEmpty()) {
            return 0L;
        }
        if (fpm_0.b().q("spellDeckDialog")) {
            fis_1.a().a((ajf_1)blx_12.bb(), blx_12.bb().d());
            fis_1.a().a((ajf_1)blx_12.bg(), blx_12.bg().d());
        }
        return 0L;
    }

    @Override
    protected void l() {
    }
}

