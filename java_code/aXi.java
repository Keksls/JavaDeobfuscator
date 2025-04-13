/*
 * Decompiled with CFR 0.152.
 */
public class aXi
extends aXj {
    private final long a;

    public aXi(long l) {
        this.a = l;
    }

    public aXi() {
        this.a = bhh_1.b();
    }

    @Override
    public boolean a() {
        return this.a > 0L;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)134);
        pt.a(this.a);
        aaw_22.c(pt);
    }
}

