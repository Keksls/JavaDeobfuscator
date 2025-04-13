/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYG
 */
public class ayg_0
extends aXj {
    private final String a;
    private final String b;
    private static final String c = "*";

    public ayg_0(String string) {
        this(c, string);
    }

    public ayg_0(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public boolean a() {
        return this.b != null && this.a != null;
    }

    @Override
    public void b() {
        this.c();
    }

    private void c() {
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)183);
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

