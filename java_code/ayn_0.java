/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYN
 */
public class ayn_0
extends aXj {
    private final String a;
    private int b;
    private final short c;

    public ayn_0(String string, int n, String string2) {
        this.a = string;
        this.b = n;
        this.c = (short)("IG".equals(string2) ? 168 : 440);
    }

    public ayn_0(String string) {
        this.a = string;
        this.c = (short)72;
    }

    @Override
    public boolean a() {
        return !this.a.isEmpty() && (this.b > 0 ? this.c == 440 || this.c == 168 : this.c == 72);
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)23);
        pt.b(this.c);
        pt.a(this.a);
        if (this.b > 0) {
            pt.a(this.b);
        }
        aaw_22.c(pt);
    }
}

