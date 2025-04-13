/*
 * Decompiled with CFR 0.152.
 */
public class aYp
extends aXj {
    private final int a;
    private final short b;

    public aYp(int n, short s2) {
        this.a = n;
        this.b = s2;
    }

    @Override
    public boolean a() {
        return this.b >= 0 && this.b <= 100;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)59);
        pt.a(this.a);
        pt.b(this.b);
        aaw_22.c(pt);
        fis_1.a().a((ajf_1)azu_0.j().k(), azu_0.j().k().d());
    }
}

