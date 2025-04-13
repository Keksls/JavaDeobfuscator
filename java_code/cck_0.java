/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

/*
 * Renamed from cCk
 */
public class cck_0
implements adx_1<csr_0> {
    @Override
    public boolean a(csr_0 csr_02) {
        fzw_0.a.a("heroBuildLock", true);
        if (csr_02.c() && csr_02.d() == null) {
            aUh.a("build.error.companion.cannot.save", new Object[0]);
            return false;
        }
        if (csr_02.c()) {
            aUh.a("build.error.companion.save.incomplete", new Object[0]);
        }
        eBt eBt2 = eBo.a.c(csr_02.b());
        if (csr_02.d() != null && eBt2 != null) {
            Map<Integer, exk_2> map = eBx.c(eBt2);
            eBt2.h().b(csr_02.d().c);
            cxo_0.a(eBt2, eBx.a(map, eBt2.h()));
        }
        cZI.a().d(csr_02.b());
        return false;
    }

    @Override
    public int a() {
        return 13928;
    }
}

