/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from NW
 */
final class nw_2 {
    private static final Logger a = Logger.getLogger(nw_2.class);

    private nw_2() {
    }

    static void a(List<nm_1> list, nz_1 nz_12) {
    }

    private static void a(List<nm_1> list, nz_1 nz_12, or_2 or_22) {
        or_22.a(nz_12);
        for (nm_1 nm_12 : list) {
            int n = nw_2.a(nm_12.a(nz_12), nz_12.f(), nm_12.b());
            if (n < nm_12.f() || !nz_12.f().c() && or_22.b(nm_12)) continue;
            oq_2 oq_22 = or_22.a();
            nv_1.a(new oh_2(nz_12.e(), nm_12.g(), oq_22.b(), oq_22.a(), gs_2.c(oq_22.c()), oq_22.d()));
            or_22.c(nm_12);
            if (!nm_12.d()) continue;
            or_22.a(nm_12);
        }
    }

    private static int a(Set<or_2> set, oi_2 oi_22, op_2 op_22) {
        int n = 0;
        for (or_2 or_22 : set) {
            n += or_22.a(oi_22, op_22);
        }
        return n;
    }
}

