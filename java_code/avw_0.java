/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVW
 */
public final class avw_0
extends aXj {
    private final long a;

    public avw_0(long l) {
        this.a = l;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        this.c();
    }

    private void c() {
        fzn_0 fzn_02 = new fzn_0(102, 0, "Do you have a developer agreement for this command ?", 24L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(new aVX(this));
    }

    void d() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)340);
        pt.a(this.a);
        aaw_22.c(pt);
    }
}

