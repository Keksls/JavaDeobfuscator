/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class aWb
extends aXj {
    public final List<Integer> a;

    public aWb(List<Integer> list) {
        this.a = list;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)466);
        for (int k = 0; k < this.a.size(); ++k) {
            int n = this.a.get(k);
            pt.a(n);
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

