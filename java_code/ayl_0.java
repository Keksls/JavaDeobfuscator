/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYl
 */
public final class ayl_0
extends aXj {
    private final float a;

    public ayl_0(float f2) {
        this.a = f2;
    }

    @Override
    public boolean a() {
        return this.a > 0.0f;
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
        pt.a((short)238);
        pt.a(this.a);
        aaw_22.c(pt);
    }
}

