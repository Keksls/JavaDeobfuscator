/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fdJ
extends fde<fey_0> {
    static final fdi_0 c = new fdi_0(new aqi_2("Nothing", new aqo_2[0]));
    public static final fdv_0<fdJ> b = new fdK();

    fdJ(long l, int n, int n2, boolean bl, Iterable<fdf_0> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void a(List<aot_2> list) {
    }

    @Override
    public fdj_0 i() {
        return fdj_0.k;
    }

    @Override
    public boolean a(fey_0 fey_02) {
        epq_2 epq_22;
        epq_2 epq_23 = (epq_2)fey_02.a();
        epq_2 epq_24 = fey_02.f();
        if (epq_24 == null) {
            a.error((Object)"Attacker null lors du test de loi d'incruste !!!");
            return false;
        }
        epq_2 epq_25 = fey_02.g();
        if (epq_25 == null) {
            a.error((Object)"Defender null lors du test de loi d'incruste !!!");
            return false;
        }
        epq_2 epq_26 = epq_22 = epq_23.Y() == epq_24.Y() ? epq_24 : epq_25;
        if (!(epq_23 instanceof Xe) || !(epq_22 instanceof Xe)) {
            return false;
        }
        long l = ((Xe)((Object)epq_23)).b(Xd.b);
        long l2 = ((Xe)((Object)epq_22)).b(Xd.b);
        return fey_02.e() != emr_2.n && (l != 0L || l2 != 0L);
    }
}

