/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWk
 */
public class awk_0
extends aXj {
    private final int a;
    private final int b;
    private final short c;
    private final ezr_0 d;

    public awk_0(int n, int n2, short s2) {
        this.a = n;
        this.b = n2;
        this.c = s2;
        this.d = eyo_1.g().d(this.b);
    }

    @Override
    public boolean a() {
        return this.a >= 0 && this.b > 0 && this.c >= 1;
    }

    @Override
    public void b() {
        int n = (2 * this.a + 1) * (2 * this.a + 1);
        String string = this.d != null ? this.d.e() : "!Item Not Found!";
        fzm_0 fzm_02 = fpm_0.b().a("<b>Attention !\n\nVous \u00eates sur le point de distribuer un objet \u00e0 tous des joueurs se trouvant sur un total d'environ " + n + " partitions, \u00eates vous s\u00fbr ?\n\nObjet distribu\u00e9 :</b>\n" + this.c + "x " + string + " [id:" + this.b + "]", cfn_0.a(0), 2073L, 102, 1);
        if (fzm_02 != null) {
            fzm_02.a(new aWl(this));
        }
    }

    void c() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)275);
        pt.a(this.a);
        pt.a(this.b);
        pt.b(this.c);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

