/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXI
 */
public class axi_0
extends aXj {
    private final String a;

    public axi_0(String string) {
        this.a = string;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)90);
        pt.a(this.a);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

