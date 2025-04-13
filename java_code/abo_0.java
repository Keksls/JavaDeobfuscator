/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from abO
 */
public enum abo_0 {
    a(fa_1.class, new abf_0()),
    b(fb_1.class, new abg_0()),
    c(fc_1.class, new abh_0()),
    d(fd_1.class, new abi_0()),
    e(fe_1.class, new abj_0()),
    f(ff_1.class, new abk_0()),
    g(fg_1.class, new abl_0()),
    h(fh_1.class, new abm_0()),
    i(fi_1.class, new abn_0()),
    j(fj_1.class, new abp_0());

    private static final Map<Class<? extends Fz>, atz_1<? extends Fz>> k;
    private final Class<? extends Fz> l;
    private final atz_1<? extends Fz> m;

    private <A extends Fz> abo_0(Class<A> clazz, atz_1<A> atz_12) {
        this.l = clazz;
        this.m = atz_12;
    }

    public static <A extends Fz, R extends atz_1<A>> R a(Class<? extends Fz> clazz) {
        return (R)k.get(clazz);
    }

    private static Map<Class<? extends Fz>, atz_1<? extends Fz>> a() {
        abo_0[] abo_0Array;
        HashMap<Class<? extends Fz>, atz_1<? extends Fz>> hashMap = new HashMap<Class<? extends Fz>, atz_1<? extends Fz>>();
        for (abo_0 abo_02 : abo_0Array = abo_0.values()) {
            hashMap.put(abo_02.l, abo_02.m);
        }
        return hashMap;
    }

    static {
        k = Collections.unmodifiableMap(abo_0.a());
    }
}

