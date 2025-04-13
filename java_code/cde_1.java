/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cde
 */
class cde_1
extends acm_0 {
    private static final Logger h = Logger.getLogger(cde_1.class);
    static final int f = 1;
    private final cdh_1 i = new cdf_1(this);
    private final acy_2<aci_0> j = new acy_2();
    int k;
    int l = -1;
    private int m;

    cde_1() {
        this.e.a(false);
    }

    @Override
    protected aci_0 a(String string, int n, int n2) {
        assert (this.j.d() != 0);
        return this.j.g(Hw.d(n, n2));
    }

    public void a(int n, int n2, ccj_2 ccj_22) {
        this.a(n, n2, ccj_22.c(), this.i);
    }

    private void a(int n, int n2, ccn_2[] ccn_2Array, cdh_1 cdh_12) {
        afk_2 afk_22 = new afk_2();
        float f2 = 1024.0f;
        float f3 = 576.0f;
        for (ccn_2 ccn_22 : ccn_2Array) {
            ScreenElement screenElement = cde_1.a(n, n2, ccn_22);
            cdh_12.a(screenElement);
            if (screenElement.i() != null) {
                screenElement.t();
                screenElement.s();
                screenElement.a(afk_22);
                int n3 = Hw.c((float)afk_22.b / 1024.0f);
                int n4 = Hw.c((float)afk_22.d / 576.0f);
                int n5 = Hw.c((float)afk_22.c / 1024.0f);
                int n6 = Hw.c((float)afk_22.e / 576.0f);
                assert (n3 <= n5);
                assert (n4 <= n6);
                for (int k = n3; k <= n5; ++k) {
                    for (int i2 = n4; i2 <= n6; ++i2) {
                        cde_1.a(this.j, (short)k, (short)i2, screenElement);
                        screenElement.k_();
                    }
                }
            }
            screenElement.u();
        }
    }

    private static ScreenElement a(int n, int n2, ccn_2 ccn_22) {
        byte[] byArray = ccn_22.e();
        boolean bl = false;
        if (byArray != null) {
            bl |= true;
        }
        ScreenElement screenElement = new ScreenElement((byte)(bl ? 1 : 0));
        if (byArray != null) {
            cde_1.a(screenElement, byArray);
        }
        int n3 = ccn_22.b() + n;
        int n4 = ccn_22.c() + n2;
        short s2 = ccn_22.d();
        screenElement.a(n3, n4, s2);
        screenElement.a(ccn_22.a());
        screenElement.b(ccn_22.f());
        screenElement.a((int)ccn_22.g());
        screenElement.a(ccn_22.h());
        screenElement.c(ccn_22.i());
        screenElement.d(ccn_22.j());
        screenElement.a(ccn_22.j());
        return screenElement;
    }

    private static void a(ScreenElement screenElement, byte[] byArray) {
        screenElement.a(cde_1.a(byArray[0]), cde_1.a(byArray[1]), cde_1.a(byArray[2]));
    }

    private static float a(byte by) {
        return ScreenElement.a(by);
    }

    public void f() {
        int n = this.j.d();
        for (int k = 0; k < n; ++k) {
            aci_0 aci_02 = this.j.h(k);
            aci_02.e();
            aci_02.f();
        }
    }

    public Ya g() {
        Ya ya = new Ya();
        int n = this.j.d();
        for (int k = 0; k < n; ++k) {
            aci_0 aci_02 = this.j.h(k);
            ya.a(aci_02.c(), aci_02.d());
        }
        return ya;
    }

    @Override
    public void a() {
        int n = this.j.d();
        for (int k = 0; k < n; ++k) {
            this.j.h(k).a();
        }
        this.j.c();
        super.a();
        this.m = 0;
        this.k = 0;
        this.l = 0;
    }

    public void a(@NotNull cdj_1 cdj_12) {
        cdl_1 cdl_12 = (cdl_1)cdj_12.m();
        if (cdl_12 == null) {
            h.error((Object)("pas de model associ\u00e9 \u00e0 l'instance de batiement " + cdj_12));
            return;
        }
        int n = this.l + 1;
        cdg_1 cdg_12 = new cdg_1(this.k + 1, n, this.m + 1, cdj_12.f());
        this.a(cdj_12.h(), cdj_12.i(), cdl_12.b(), cdg_12);
        cdj_12.a(n);
        int n2 = cdl_12.c();
        this.l += n2;
        this.m += n2;
        this.k += cdg_12.a();
    }
}

