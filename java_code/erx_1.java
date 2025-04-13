/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from eRX
 */
public enum erx_1 {
    a(0, erw_1.a, erw_1.b, erw_1.c, erw_1.d),
    b(1, erw_1.e, erw_1.h, erw_1.k, erw_1.n, erw_1.q, erw_1.t, erw_1.w, erw_1.z),
    c(2, erw_1.C, erw_1.E, erw_1.G, erw_1.I),
    d(3, erw_1.K);

    private final byte e;
    private final erw_1[] f;

    private erx_1(byte by, erw_1 ... erw_1Array) {
        this.e = by;
        this.f = erw_1Array;
    }

    static void a() {
        erx_1 erx_12 = a;
    }

    public static erx_1 a(byte by) {
        for (erx_1 erx_12 : erx_1.values()) {
            if (erx_12.e != by) continue;
            return erx_12;
        }
        return null;
    }

    public byte b() {
        return this.e;
    }

    public erw_1[] c() {
        return this.f;
    }

    public static erw_1 a(erx_1 erx_12, List<erw_1> list) {
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            erw_1 erw_12 = list.get(k);
            if (!ArrayUtils.contains((Object[])erx_12.c(), (Object)((Object)erw_12))) continue;
            return erw_12;
        }
        return null;
    }

    static {
        for (erx_1 erx_12 : erx_1.values()) {
            for (erw_1 erw_12 : erx_12.c()) {
                erw_12.a(erx_12);
            }
        }
    }
}

