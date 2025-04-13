/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWX
 */
public class awx_0
extends aXj {
    private final String a;
    private final String b;

    public awx_0(String string) {
        this(string, "");
    }

    public awx_0(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public boolean a() {
        return this.a != null;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            Pt pt = new Pt();
            pt.a((byte)2);
            pt.a((short)34);
            pt.a(this.a);
            pt.a(this.b);
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

