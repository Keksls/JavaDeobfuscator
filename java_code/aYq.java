/*
 * Decompiled with CFR 0.152.
 */
public class aYq
extends aXj {
    private final float a;

    public aYq(float f2) {
        this.a = f2;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        if ((double)this.a < -1.0 || (double)this.a > 1.0) {
            aVo.a().d("La valeur d'une jauge de wakfu doit \u00eatre dans [-1.0, 1.0]");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)227);
        pt.a(this.a);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

