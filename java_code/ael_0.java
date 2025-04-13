/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ael
 */
public class ael_0
implements wr_0,
aei_0 {
    private static final Logger b = Logger.getLogger(ael_0.class);
    public static final ael_0 a = new ael_0();
    private static final TByteObjectHashMap<acg_0> c = new TByteObjectHashMap();
    private final avi_2 d = new avi_2(0.0f, 0.0f, 0.0f);
    private aen e;
    private float f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private boolean m;

    public void a(boolean bl) {
        this.m = bl;
    }

    public void a(aen aen2) {
        this.e = aen2;
    }

    @Override
    public void onCalendarEvent(ws_0 ws_02, wq_0 wq_02) {
        switch (ws_02) {
            case a: {
                this.b(wq_02);
            }
        }
    }

    public void a() {
        this.j = 1.0f;
        this.f = 1.0f;
        this.k = 1.0f;
        this.g = 1.0f;
        this.l = 1.0f;
        this.h = 1.0f;
        this.d.a(1.0f, 1.0f, 1.0f);
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public boolean d() {
        return auc_1.a(this.j, 1.0f) && auc_1.a(this.k, 1.0f) && auc_1.a(this.l, 1.0f);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        fArray[0] = fArray[0] * this.j;
        fArray[1] = fArray[1] * this.k;
        fArray[2] = fArray[2] * this.l;
    }

    @Override
    public void b(int n) {
        this.d.a(n);
        this.j = this.d.a();
        this.k = this.d.b();
        this.l = this.d.c();
        if (this.i) {
            this.d.a(this.f, this.g, this.h, 1000);
            this.i = false;
        }
        float f2 = this.c();
        aed.a.a(f2);
    }

    private float c() {
        if (!this.m) {
            return 1.0f;
        }
        float f2 = 0.3705f;
        float f3 = 2.318223f;
        return 2.318223f * this.b() * this.b() + 1.0f - 2.318223f;
    }

    public float b() {
        return this.j * 0.212671f + this.k * 0.71516f + this.l * 0.072169f;
    }

    public void a(String string) {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        atg_22.a(string);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        ArrayList<aqx_2> arrayList = ath_22.a().d("season");
        if (arrayList == null) {
            b.error((Object)"Unable to find a season node");
            return;
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            aqx_2 aqx_22 = arrayList.get(k);
            byte by = aqx_22.f("id").e();
            ArrayList<aqx_2> arrayList2 = aqx_22.d("hour");
            if (arrayList2 == null) {
                b.error((Object)"Unable to find hour node");
                return;
            }
            int n2 = arrayList2.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                aqx_2 aqx_23 = arrayList2.get(i2);
                byte by2 = aqx_23.f("dayPercentage").e();
                float f2 = (float)aqx_23.f("red").g() / 255.0f;
                float f3 = (float)aqx_23.f("green").g() / 255.0f;
                float f4 = (float)aqx_23.f("blue").g() / 255.0f;
                ael_0.a(by, by2, f2, f3, f4);
            }
        }
    }

    private static void a(byte by, byte by2, float f2, float f3, float f4) {
        acg_0 acg_02 = (acg_0)c.get(by);
        if (acg_02 == null) {
            acg_02 = new acg_0();
            c.put(by, (Object)acg_02);
        }
        acg_02.a(by2, f2, f3, f4);
    }

    private float c(wq_0 wq_02) {
        if (this.e == null) {
            return wq_02.b();
        }
        return this.e.a(wq_02);
    }

    public void a(wq_0 wq_02) {
        this.b(wq_02);
        this.d.a(this.f, this.g, this.h);
    }

    public void b(wq_0 wq_02) {
        if (!wq_02.l()) {
            return;
        }
        wu_0 wu_02 = wq_02.a();
        if (wu_02 == null || wu_02.c()) {
            b.error((Object)"Pas de date d\u00e9finie dans le calendar");
            return;
        }
        wy_0 wy_02 = wq_02.k();
        if (wy_02 == null) {
            b.error((Object)"Pas de saison d\u00e9finie dans le calendar");
            return;
        }
        acg_0 acg_02 = (acg_0)c.get(wy_02.b());
        if (acg_02 == null) {
            b.error((Object)("Saison " + wy_02 + " inconnu du DayLightDefinitionManager"));
            return;
        }
        float f2 = this.c(wq_02);
        ach ach2 = acg_02.a((int)f2);
        ach ach3 = acg_02.a(ach2);
        byte by = ach2.d();
        int n = ach3.d();
        if (f2 < (float)by) {
            f2 += 100.0f;
        }
        if (f2 > (float)n) {
            n += 100;
        }
        float f3 = (f2 - (float)by) / (float)(n - by);
        if (this.m) {
            this.f = Hw.a(ach2.a(), ach3.a(), f3);
            this.g = Hw.a(ach2.b(), ach3.b(), f3);
            this.h = Hw.a(ach2.c(), ach3.c(), f3);
            this.i = true;
        } else {
            this.h = 1.0f;
            this.g = 1.0f;
            this.f = 1.0f;
            this.i = true;
            this.d.a(0.0f, 0.0f, 0.0f);
        }
    }
}

