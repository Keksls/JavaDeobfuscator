/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWE
 */
public class awe_0
extends aXj {
    private final String a;
    private final int b;
    private final short c;
    private final ezr_0 d;

    public awe_0(String string, int n, short s2) {
        this.a = string;
        this.b = n;
        this.c = s2;
        this.d = eyo_1.g().d(this.b);
    }

    @Override
    public boolean a() {
        return this.b > 0 && this.c >= 1;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)349);
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

