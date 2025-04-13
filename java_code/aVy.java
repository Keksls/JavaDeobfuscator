/*
 * Decompiled with CFR 0.152.
 */
public final class aVy
extends aXj {
    private final long a;

    public aVy(long l) {
        this.a = l;
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
        pt.a((byte)3);
        pt.a((short)61);
        pt.a(this.a);
        aaw_22.c(pt);
        fis_1.a().a((ajf_1)azu_0.j().k(), azu_0.j().k().d());
    }
}

