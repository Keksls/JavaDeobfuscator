/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ckh
 */
final class ckh_0
implements adx_1<cye_1> {
    private static final Logger a = Logger.getLogger(ckh_0.class);

    ckh_0() {
    }

    @Override
    public boolean a(cye_1 cye_12) {
        long l = cye_12.c();
        int n = cye_12.b();
        ArrayList<Integer> arrayList = cye_12.e();
        ArrayList<Integer> arrayList2 = cye_12.f();
        fiL fiL2 = new fiL();
        fiL2.a(l, n, (int)cye_12.d(), arrayList, arrayList2);
        Object t = euw_2.a.d(l);
        ezm_1 ezm_12 = ((epq_2)t).dx();
        ezj_1 ezj_12 = ezm_12.d();
        if (ezj_12 != null && ezj_12.e() == n) {
            ((epq_2)t).c(((epq_2)t).cK());
        }
        if (azu_0.j().c(cZI.a())) {
            cZI.a().x();
        }
        return false;
    }

    @Override
    public int a() {
        return 12093;
    }
}

