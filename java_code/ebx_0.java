/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eBX
 */
public enum ebx_0 {
    a(1, 10, null),
    b(2, 20, a),
    c(3, 30, b),
    d(4, 40, c),
    e(5, 50, d),
    f(6, 60, e),
    g(7, 70, f),
    h(8, 80, g),
    i(9, 90, h),
    j(10, 100, i),
    k(11, 110, j),
    l(12, 120, k),
    m(13, 130, l),
    n(14, 140, m),
    o(15, 150, n),
    p(16, 160, o);

    public static final ebx_0 q;
    public static final ebx_0 r;
    public static final short s = 0;
    private final short t;
    private final short u;
    @Nullable
    private final ebx_0 v;

    private ebx_0(@Nullable int n2, int n3, ebx_0 ebx_02) {
        this.t = (short)n2;
        this.u = (short)n3;
        this.v = ebx_02;
    }

    public short a() {
        if (this.v == null) {
            return 0;
        }
        return (short)(this.v.c() + 1);
    }

    @NotNull
    public static ebx_0 a(short s2) {
        for (ebx_0 ebx_02 : ebx_0.values()) {
            if (ebx_02.u < s2 || ebx_02.v != null && ebx_02.v.u >= s2) continue;
            return ebx_02;
        }
        return s2 > ebx_0.r.u ? r : q;
    }

    @Nullable
    public static ebx_0 b(short s2) {
        for (ebx_0 ebx_02 : ebx_0.values()) {
            if (ebx_02.t != s2) continue;
            return ebx_02;
        }
        return null;
    }

    @NotNull
    public <Value> eby_0<Value> a(@NotNull Map<ebx_0, Value> map, boolean bl) {
        if (map.containsKey((Object)this)) {
            return new eby_0<Value>(false, this, map.get((Object)this));
        }
        if (!bl) {
            return new eby_0<Object>(false, null, null);
        }
        ebx_0 ebx_02 = this.d();
        if (ebx_02 == null) {
            return new eby_0<Object>(false, null, null);
        }
        while (ebx_02 != null && !map.containsKey((Object)ebx_02)) {
            ebx_02 = ebx_02.d();
        }
        if (ebx_02 == null) {
            return new eby_0<Object>(true, null, null);
        }
        return new eby_0<Value>(true, ebx_02, map.get((Object)ebx_02));
    }

    public short b() {
        return this.t;
    }

    public short c() {
        return this.u;
    }

    @Nullable
    public ebx_0 d() {
        return this.v;
    }

    static {
        q = a;
        r = p;
    }
}

