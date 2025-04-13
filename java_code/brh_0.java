/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Ordering
 *  com.google.common.primitives.Ints
 */
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * Renamed from bRH
 */
public class brh_0
implements ajh_1 {
    private static final String a = "weatherOfDays";
    private static final String b = "weatherToday";
    private static final String d = "seasons";
    private static final String e = "currentWeather";
    private static final String f = "temperatureGraph";
    private static final String g = "minTemperatureGraph";
    private static final String h = "maxTemperatureGraph";
    private static final String i = "resources";
    private static final String j = "displayCultures";
    private static final String k = "displayPlants";
    private static final String l = "displayTrees";
    private static final azf_2 m = new azf_2(1.0f, 0.8f, 0.0f, 1.0f);
    private static final azf_2 n = new azf_2(0.0f, 0.8f, 1.0f, 1.0f);
    private static final azf_2 o = new azf_2(1.0f, 0.8f, 0.0f, 0.3f);
    private static final azf_2 p = new azf_2(0.0f, 0.8f, 1.0f, 0.3f);
    private static final azf_2[] q = new azf_2[]{azf_2.f};
    private static final azf_2[] r = new azf_2[]{m, n};
    private static final azf_2[] s = new azf_2[]{o, p};
    private static final Function<bNS, eAJ> t = new bri_0();
    private static final Function<bNS, Integer> u = new brj_0();
    private final ArrayList<brg_0> v = new ArrayList();
    private final brg_0 w = new brg_0();
    private final ArrayList<brg_0> x = new ArrayList();
    private fsj_0 y;
    private float z;
    private float A;
    private static final brh_0 B = new brh_0();

    private brh_0() {
        this.x.add(new brg_0());
    }

    public static brh_0 a() {
        return B;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(e)) {
            return this.w;
        }
        if (string.equals(d)) {
            return this.v;
        }
        if (string.equals(a)) {
            return this.x;
        }
        if (string.equals(b)) {
            if (this.x == null || this.x.size() == 0) {
                return null;
            }
            return this.x.get(0);
        }
        if (string.equals(g)) {
            return bae.h().a("weather.info.temperatureValue.short", Float.valueOf(this.z));
        }
        if (string.equals(h)) {
            return bae.h().a("weather.info.temperatureValue.short", Float.valueOf(this.A));
        }
        if (string.equals(f)) {
            return this.y;
        }
        if (string.equals(i)) {
            return this.j();
        }
        if (string.equals(k)) {
            return brm_0.a.b();
        }
        if (string.equals(l)) {
            return brm_0.a.c();
        }
        if (string.equals(j)) {
            return brm_0.a.a();
        }
        return null;
    }

    public boolean b() {
        return brm_0.a.a();
    }

    public void a(boolean bl) {
        brm_0.a.a(bl);
        fis_1.a().a((ajf_1)this, j, i);
    }

    public boolean c() {
        return brm_0.a.b();
    }

    public void b(boolean bl) {
        brm_0.a.b(bl);
        fis_1.a().a((ajf_1)this, k, i);
    }

    public boolean e() {
        return brm_0.a.c();
    }

    public void c(boolean bl) {
        brm_0.a.c(bl);
        fis_1.a().a((ajf_1)this, l, i);
    }

    public void f() {
        brm_0.a.a(true);
        brm_0.a.b(true);
        brm_0.a.c(true);
    }

    public void a(brf_0 brf_02) {
        this.w.a(brf_02);
    }

    public brg_0 g() {
        return this.w;
    }

    public void h() {
        this.x.clear();
        this.v.clear();
    }

    private Set<bNS> j() {
        ccu_1 ccu_12 = bRA.e().h();
        Ordering ordering = Ordering.natural().onResultOf(t).compound((Comparator)Ordering.natural().onResultOf(u));
        return ccu_12.e().stream().filter(Objects::nonNull).flatMap(ccv_22 -> Ints.asList((int[])ccv_22.a()).stream()).map(n -> (bNI)bNJ.a().a((int)n)).filter(Objects::nonNull).filter(bNI2 -> {
            eAJ eAJ2 = eAJ.a(bNI2.j());
            if (eAJ2 == null) {
                return false;
            }
            switch (eAJ2) {
                case d: {
                    return brm_0.a.a();
                }
                case a: {
                    return brm_0.a.c();
                }
                case c: {
                    return brm_0.a.b();
                }
            }
            return false;
        }).map(bNI2 -> new bNS((bNI)bNI2, bNI2.s())).collect(Collectors.toCollection(() -> new TreeSet(ordering)));
    }

    public void a(wy_0 wy_02, int n, int n2, int n3, float[] fArray, Yf yf, float f2, float f3) {
        brg_0 brg_02 = new brg_0();
        brf_0 brf_02 = new brf_0();
        brf_02.a(n, n, n2, n3, fArray, yf, f2, f3);
        brg_02.a(wy_02);
        brg_02.a(brf_02);
        brg_02.a(this.x.size() + 1);
        this.x.add(brg_02);
    }

    private void b(wy_0 wy_02, int n, int n2, int n3, float[] fArray, Yf yf, float f2, float f3) {
        brg_0 brg_02 = new brg_0();
        brf_0 brf_02 = new brf_0();
        brf_02.a(n, n, n2, n3, fArray, yf, f2, f3);
        brg_02.a(wy_02);
        brg_02.a(brf_02);
        this.v.add(brg_02);
    }

    public void a(bre_0 bre_02) {
        Object object;
        Object object2;
        this.y = new fsj_0();
        this.z = Float.MAX_VALUE;
        this.A = Float.MIN_VALUE;
        int[] nArray = new int[bre_02.a()];
        int[] nArray2 = new int[bre_02.a()];
        int[] nArray3 = new int[bre_02.a()];
        int[] nArray4 = new int[bre_02.a() * 2];
        float[] fArray = new float[bre_02.a()];
        float[] fArray2 = new float[bre_02.a()];
        float[] fArray3 = new float[bre_02.a()];
        float[] fArray4 = new float[bre_02.a()];
        for (int k = 0; k < bre_02.a(); ++k) {
            object2 = bre_02.a(k);
            object = new fwx_0();
            switch (brk_0.b[((Enum)object2).ordinal()]) {
                case 1: {
                    ((fwx_0)object).a(anr_0.W);
                    break;
                }
                case 2: {
                    ((fwx_0)object).a(anr_0.X);
                    break;
                }
                case 3: {
                    ((fwx_0)object).a(anr_0.Y);
                    break;
                }
                case 4: {
                    ((fwx_0)object).a(anr_0.Z);
                }
            }
            this.y.a((fwx_0)object);
            fArray[k] = bre_02.b(k) + bre_02.d(k);
            fArray2[k] = bre_02.c(k) + bre_02.d(k);
            if (fArray[k] < 0.0f) {
                nArray2[k] = 1;
                nArray4[k * 2] = 1;
            }
            if (fArray2[k] < 0.0f) {
                nArray3[k] = 1;
                nArray4[k * 2 + 1] = 1;
            }
            fArray3[k] = bre_02.a((wy_0)((Object)object2))[0];
            fArray4[k] = bre_02.a((wy_0)((Object)object2))[1];
            this.z = Math.min(this.z, fArray3[k]);
            this.A = Math.max(this.A, fArray4[k]);
        }
        fwy_0 fwy_02 = new fwy_0();
        fwy_02.a(fArray);
        fwy_02.a(r, nArray2);
        object2 = new fwy_0();
        ((fwy_0)object2).a(fArray2);
        ((fwy_0)object2).a(r, nArray3);
        object = new fwy_0();
        ((fwy_0)object).a(fArray3);
        ((fwy_0)object).a(q, nArray);
        fwy_0 fwy_03 = new fwy_0();
        fwy_03.a(fArray4);
        fwy_03.a(q, nArray);
        this.y.a(fwy_02);
        this.y.a((fwy_0)object2);
        this.y.a((fwy_0)object);
        this.y.a(fwy_03);
        fwz_0 fwz_02 = new fwz_0();
        fwz_02.a(fwy_02);
        fwz_02.a((fwy_0)object2);
        fwz_02.a(s, nArray4);
        this.y.a(fwz_02);
        this.y.a(this.z - 2.0f);
        this.y.b(this.A + 2.0f);
    }

    public void i() {
        fis_1.a().a((ajf_1)this, e, a);
    }

    public void b(bre_0 bre_02) {
        int n;
        this.h();
        wy_0 wy_02 = null;
        for (n = 0; n < bre_02.a(); ++n) {
            wy_0 wy_03 = bre_02.a(n);
            if (wy_03 == wy_02) continue;
            this.b(wy_03, (int)bre_02.a(wy_03)[0], (int)bre_02.a(wy_03)[1], 0, null, Yf.a, 0.0f, 0.0f);
            wy_02 = wy_03;
        }
        for (n = 0; n < bre_02.a(); ++n) {
            this.a(bre_02.a(n), bre_02.b(n), bre_02.c(n), bre_02.d(n), bre_02.a(bre_02.a(n)), bre_02.g(n), bre_02.e(n), bre_02.f(n));
        }
        this.a(bre_02);
        fis_1.a().a((ajf_1)this, e, a, d, f, g, h);
    }
}

