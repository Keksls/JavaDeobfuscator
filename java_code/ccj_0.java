/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCj
 */
public class ccj_0
implements adx_1<crZ> {
    @Override
    public boolean a(crZ crZ2) {
        fzw_0.a.a("heroBuildLock", true);
        if (crZ2.d().b()) {
            String string = "build.error.save." + crZ2.d().a();
            if (bae.h().d(string)) {
                aUh.a(string, new Object[0]);
            } else {
                aUh.a("build.error.save.generic", new Object[0]);
            }
        }
        if (crZ2.d() == ezg_1.b) {
            aUh.b("build.save.invalid.items", new Object[0]);
        }
        if (crZ2.e()) {
            cZI.a().a(crZ2.b(), crZ2.c(), crZ2.f(), crZ2.g(), crZ2.h(), crZ2.i());
        }
        return false;
    }

    @Override
    public int a() {
        return 13674;
    }
}

