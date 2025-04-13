/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXV
 */
public class axv_0
extends aXj {
    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        byte[] byArray;
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        for (byte by : byArray = new byte[]{1, 2, 3}) {
            Pt pt = new Pt();
            pt.a(by);
            pt.a((short)478);
            aaw_22.c(pt);
        }
    }
}

