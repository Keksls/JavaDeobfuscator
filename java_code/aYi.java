/*
 * Decompiled with CFR 0.152.
 */
public final class aYi
extends aXj {
    private final short a;

    public aYi(short s2) {
        this.a = s2;
    }

    @Override
    public boolean a() {
        return Oz.c.a(this.a);
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
        pt.a((short)280);
        pt.b(this.a);
        aaw_22.c(pt);
    }
}

