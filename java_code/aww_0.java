/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWW
 */
public class aww_0
extends aXj {
    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        this.c();
    }

    private void c() {
        fzn_0 fzn_02 = new fzn_0(102, 0, "This will kick EVERYONE BUT YOU on this server. Are you sure that's what you want to do? Did you properly serverlock before ?", 24L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((n, string) -> {
            if (n == 8) {
                aaw_2 aaw_22 = azu_0.j().K();
                if (aaw_22 != null) {
                    Pt pt = new Pt();
                    pt.a((byte)3);
                    pt.a((short)203);
                    aaw_22.c(pt);
                } else {
                    aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
                }
            }
        });
    }
}

