/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from cgc
 */
class cgc_1
implements adx_1<cve_1> {
    cgc_1() {
    }

    @Override
    public boolean a(cve_1 cve_12) {
        long l = azu_0.j().n().u();
        byte[] byArray = cve_12.b();
        List<eZb> list = eyy_0.b(byArray);
        for (eZb eZb2 : list) {
            long l2 = eZb2.c();
            eZe.a.a(l, l2, eZb2);
        }
        return false;
    }

    @Override
    public int a() {
        return 12376;
    }
}

