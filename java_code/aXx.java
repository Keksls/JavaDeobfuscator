/*
 * Decompiled with CFR 0.152.
 */
public class aXx
extends aXj {
    private final int a;
    private final int b;

    public aXx(int n) {
        this.a = n;
        this.b = 1;
    }

    public aXx(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)12);
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

