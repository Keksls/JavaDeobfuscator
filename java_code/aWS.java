/*
 * Decompiled with CFR 0.152.
 */
public class aWS
extends aXj {
    private final long a;

    public aWS(long l) {
        this.a = l;
    }

    public long c() {
        return this.a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)1);
        pt.a((short)276);
        pt.a(this.a);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

