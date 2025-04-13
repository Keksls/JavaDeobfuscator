/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWy
 */
public class awy_0
extends aXj {
    private final String a;

    public awy_0(String string) {
        this.a = string;
    }

    @Override
    public boolean a() {
        return !this.a.isEmpty();
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
        pt.b((short)138);
        pt.a(this.a);
        aaw_22.c(pt);
    }
}

