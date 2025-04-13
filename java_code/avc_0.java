/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVC
 */
public class avc_0
extends aXj {
    private final long a;
    private final int b;
    private final int c;

    public avc_0(long l, int n, int n2) {
        this.a = l;
        this.b = n;
        this.c = n2;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)481);
        pt.a(this.a);
        pt.a(this.b);
        pt.a(this.c);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

