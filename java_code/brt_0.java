/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from brT
 */
class brt_0
implements Comparator<eco_0> {
    brt_0() {
    }

    public int a(eco_0 eco_02, eco_0 eco_03) {
        exw_1 exw_12;
        if (eco_02.f() != eco_03.f()) {
            return eco_02.f() - eco_03.f();
        }
        int n = eco_02.k().a();
        int n2 = eco_03.k().a();
        exw_1 exw_13 = eyo_1.g().h(n);
        if (exw_13 != (exw_12 = eyo_1.g().h(n2))) {
            byte by = exw_13 != null ? exw_13.b() : exw_1.a.b();
            byte by2 = exw_12 != null ? exw_12.b() : exw_1.a.b();
            return by < by2 ? -1 : 1;
        }
        if (eco_02.n() != eco_03.n()) {
            return eco_02.n() ? 1 : -1;
        }
        String string = brt_0.a(n);
        String string2 = brt_0.a(n2);
        return Cz.d(string, string2);
    }

    public static String a(int n) {
        return bae.h().a(15, (long)n, new Object[0]);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((eco_0)object, (eco_0)object2);
    }
}

