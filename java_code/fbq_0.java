/*
 * Decompiled with CFR 0.152.
 */
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Renamed from fbQ
 */
public final class fbq_0 {
    private static final SortedSet<fbm_0> a = new TreeSet<fbm_0>(new fbr_0());

    public static void a() {
        fbs_0[] fbs_0Array = new fbs_0[]{fbs_0.k, fbs_0.j, fbs_0.i, fbs_0.h, fbs_0.g};
        fbn_0 fbn_02 = new fbn_0(1, -10000, 1, "publicEnemy", "ff0000", fbs_0Array);
        a.add(fbn_02);
        fbs_0Array = new fbs_0[]{fbs_0.j, fbs_0.i, fbs_0.h, fbs_0.g};
        fbn_02 = new fbn_0(2, -5000, 1, "criminal", "ff6000", fbs_0Array);
        a.add(fbn_02);
        fbs_0Array = new fbs_0[]{fbs_0.h, fbs_0.g};
        fbn_02 = new fbn_0(3, -250, 1, "gangster", "ffd200", fbs_0Array);
        a.add(fbn_02);
        fbs_0Array = new fbs_0[]{fbs_0.g};
        fbn_02 = new fbn_0(4, -50, 1, "fellow", "14C800", fbs_0Array);
        a.add(fbn_02);
        fbs_0Array = new fbs_0[]{};
        fbn_02 = new fbn_0(5, 50, 1, "inhabitant", "14C800", fbs_0Array);
        a.add(fbn_02);
        fbs_0Array = new fbs_0[]{fbs_0.f};
        fbn_02 = new fbn_0(6, 100, 1, "citoyen", "14C800", fbs_0Array);
        a.add(fbn_02);
        fbs_0Array = new fbs_0[]{fbs_0.f};
        fbn_02 = new fbn_0(7, 500, 2, "citoyen", "14C800", fbs_0Array);
        a.add(fbn_02);
        fbo_0.a().a(a);
        fbo_0.a().d();
    }
}

