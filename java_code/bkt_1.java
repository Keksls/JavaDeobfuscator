/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/*
 * Renamed from bkT
 */
public class bkt_1 {
    private static final bkt_1 a = new bkt_1();
    private final acy_2<bks_1> b = new acy_2();
    private bks_1[] c;

    public static bkt_1 a() {
        return a;
    }

    private static Set<epn_2> e() {
        return epo_2.b();
    }

    private static Set<epn_2> f() {
        return epo_2.c();
    }

    public final void b() {
        bks_1 bks_12;
        this.c = null;
        this.b.c();
        for (epn_2 epn_22 : bkt_1.e()) {
            bks_12 = new bks_1(epn_22);
            this.b.a(epn_22.s(), bks_12);
        }
        for (epn_2 epn_22 : bkt_1.f()) {
            bks_12 = new bks_1(epn_22);
            this.b.a(epn_22.s(), bks_12);
        }
    }

    public final void c() {
        this.c = null;
        ImmutableSet immutableSet = ImmutableSet.builder().addAll(bkt_1.e()).addAll(bkt_1.f()).build();
        for (int n : this.b.f()) {
            bks_1 bks_12 = this.b.g(n);
            if (bks_12 == null || immutableSet.contains(bks_12.f())) continue;
            this.b.f(n);
        }
    }

    public final bks_1 a(int n) {
        return this.b.g(n);
    }

    public final bks_1[] d() {
        if (this.c == null) {
            ArrayList<bks_1> arrayList = new ArrayList<bks_1>(this.b.d());
            int n = this.b.d();
            for (int k = 0; k < n; ++k) {
                bks_1 bks_12 = this.b.h(k);
                if (bks_12.f() == epn_2.a || bks_12.f() == epn_2.b) continue;
                arrayList.add(bks_12);
            }
            Collections.sort(arrayList);
            this.c = arrayList.toArray(new bks_1[arrayList.size()]);
        }
        return this.c;
    }
}

