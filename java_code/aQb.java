/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

public class aQb
implements apd_0 {
    private static final aQb a = new aQb();

    public static aQb a() {
        return a;
    }

    private aQb() {
    }

    @Override
    public void a(blx_1 blx_12, abv_0 abv_02, abv_0 abv_03, abv_0 abv_04) {
        if (blx_12 == null) {
            return;
        }
        bvx_2 bvx_22 = blx_12.bz();
        if (bvx_22 == null) {
            return;
        }
        Collection<sr_0> collection = bvx_22.i().f();
        if (collection == null) {
            return;
        }
        for (sr_0 sr_02 : collection) {
            if (sr_02.v() != blx_12 || sr_02.w() != ele_0.b.a()) continue;
            abv_02.a(sr_02.G(), sr_02.H(), sr_02.I());
        }
    }
}

