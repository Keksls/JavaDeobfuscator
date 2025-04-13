/*
 * Decompiled with CFR 0.152.
 */
public class aXQ
extends aXj {
    private final short a;
    private final long b;

    public aXQ(short s2, long l) {
        this.a = s2;
        this.b = l;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        if (!bae.h().a(34, (long)this.a)) {
            aVo.a().d(String.format("Titre avec l'id %s iconnu", this.a));
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)468);
        pt.b(this.a);
        pt.a(this.b);
        aaw_22.c(pt);
    }
}

