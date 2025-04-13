/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfd
 */
class cfd_1
implements adx_1<ckW> {
    cfd_1() {
    }

    @Override
    public boolean a(ckW ckW2) {
        int n = ckW2.b();
        String string = bae.h().a("connection.queued.title", new Object[0]);
        String string2 = bae.h().a("connection.queued.message", n);
        if (cfc_1.b != null) {
            cfc_1.b.b().b(string2);
            return false;
        }
        fzn_0 fzn_02 = new fzn_0(102, 0, string2, string, null, 16901L);
        cfc_1.b = fpm_0.b().a(fzn_02);
        cfc_1.b.a(new cfe_2(this));
        return false;
    }

    @Override
    public int a() {
        return 425;
    }
}

