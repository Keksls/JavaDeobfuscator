/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYP
 */
public class ayp_0
extends aXj {
    private final long a;
    private final String b;
    private final boolean c;

    public ayp_0(long l, String string) {
        this.a = l;
        this.b = string;
        this.c = false;
    }

    public ayp_0(long l, String string, boolean bl) {
        this.a = l;
        this.b = string;
        this.c = bl;
    }

    @Override
    public boolean a() {
        return this.a > 0L && this.b != null;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)1);
        pt.a((short)277);
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

