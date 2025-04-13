/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXD
 */
public class axd_0
extends aXj {
    private final int a;
    private final String b;

    public axd_0(int n, String string) {
        this.a = n;
        this.b = string;
    }

    @Override
    public boolean a() {
        return this.b != null && this.a >= 0;
    }

    @Override
    public void b() {
        int n = (2 * this.a + 1) * (2 * this.a + 1);
        fzm_0 fzm_02 = fpm_0.b().a("<b>Attention !\n\nVous \u00eates sur le point d'envoyer un message \u00e0 tous des joueurs se trouvant sur un total d'environ " + n + " partitions, \u00eates vous s\u00fbr ?\n\nMessage :</b>\n" + this.b, cfn_0.a(0), 2073L, 102, 1);
        if (fzm_02 != null) {
            fzm_02.a(new aXE(this));
        }
    }

    void c() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)202);
        pt.a(this.a);
        pt.a(this.b);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

