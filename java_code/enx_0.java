/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

/*
 * Renamed from enx
 */
enum enx_0 {
    a(EnumSet.noneOf(enw_0.class)),
    b(EnumSet.of(enw_0.b, new enw_0[]{enw_0.c, enw_0.e, enw_0.f, enw_0.g, enw_0.h, enw_0.i, enw_0.j, enw_0.k, enw_0.l})),
    c(EnumSet.of(enw_0.b, new enw_0[]{enw_0.c, enw_0.d, enw_0.e, enw_0.f, enw_0.g, enw_0.h, enw_0.i, enw_0.j, enw_0.k, enw_0.l, enw_0.m, enw_0.n, enw_0.o, enw_0.p, enw_0.q, enw_0.r, enw_0.s, enw_0.t, enw_0.u, enw_0.v, enw_0.w, enw_0.x, enw_0.y}));

    private final EnumSet<enw_0> d;

    private enx_0(EnumSet<enw_0> enumSet) {
        this.d = enumSet.clone();
    }

    public EnumSet<enw_0> a() {
        return this.d.clone();
    }

    public boolean a(enw_0 enw_02) {
        return this.d.contains((Object)enw_02);
    }

    public static void a(String ... stringArray) {
        for (enx_0 enx_02 : enx_0.values()) {
            System.out.println((Object)enx_02);
            for (enw_0 enw_02 : enx_02.d) {
                System.out.println("\t" + enw_02.name());
            }
        }
    }
}

