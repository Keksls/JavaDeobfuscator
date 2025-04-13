/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cZB
 */
public class czb_0
implements ahr_1,
czu_0 {
    private static final String b = "destinationPosition";
    private static final float[] c = new float[]{0.0f, 1.0f, 0.0f, 0.5f};
    private static final float[] d = new float[]{1.0f, 0.0f, 0.0f, 0.5f};
    private static final Logger e = Logger.getLogger(czb_0.class);
    private static final czb_0 f = new czb_0();
    private aej_2 g = aej_2.d;
    private cZV h;
    final acf_2 i = new acf_2();
    private DisplayedScreenElement j;
    private bst_1 k;
    private bgf_1 l;
    private Runnable m;
    private Runnable n;
    private Runnable o;

    public static czb_0 a() {
        return f;
    }

    private czb_0() {
    }

    @Override
    public void a(bgf_1 bgf_12) {
        this.l = bgf_12;
    }

    @Override
    public void a(Runnable runnable) {
        this.n = runnable;
    }

    @Override
    public void b(Runnable runnable) {
        this.m = runnable;
    }

    @Override
    public void c(Runnable runnable) {
        this.o = runnable;
    }

    @Override
    public bst_1 c() {
        return this.k;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18907: 
            case 19751: {
                dhL dhL2 = (dhL)adt_12;
                DisplayedScreenElement displayedScreenElement = czb_0.a(dhL2.r(), dhL2.s());
                if (displayedScreenElement != this.j) {
                    this.a(displayedScreenElement);
                }
                return false;
            }
            case 16119: {
                dhL dhL3 = (dhL)adt_12;
                int n = dhL3.w();
                if (!dhL3.o()) {
                    this.k = bst_1.b;
                    e.info((Object)"Bag-action cancelled");
                    this.n.run();
                } else if (this.k == bst_1.a) {
                    cdw_0.n().c(600071L);
                    e.info((Object)("Bag-action to " + this.l.aB().b() + " validated"));
                    this.i.d(czb_0.b(this.j.G(), this.j.H(), this.j.I()));
                    this.g = this.l.F();
                    this.m.run();
                    if (this.a(n)) {
                        return false;
                    }
                    this.o.run();
                } else {
                    e.info((Object)"Bag-action cancelled");
                    this.n.run();
                }
                aii_0.a().e(b);
                this.l = null;
                azu_0.j().b(this);
                return false;
            }
            case 19672: {
                return bgp_1.a(adt_12, this.l);
            }
        }
        return true;
    }

    private boolean a(DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement != null) {
            float[] fArray;
            ScreenElement screenElement = displayedScreenElement.d();
            int n = screenElement.d();
            int n2 = screenElement.e();
            short s2 = yz_0.d(n, n2, screenElement.c());
            short s3 = azu_0.j().k().I();
            boolean bl = !this.a(n, n2, s2);
            this.k = bl ? bst_1.c : bst_1.a;
            float[] fArray2 = fArray = bl ? d : c;
            if (bl && Math.abs(screenElement.c() - s3) > 6) {
                this.i();
                this.j = displayedScreenElement;
                return true;
            }
            if (this.l != null) {
                this.l.aB().a(n, n2, s2);
            }
            aif_0 aif_02 = aii_0.a().d(b);
            assert (aif_02 != null);
            aif_02.f();
            aif_02.b(n, n2, s2);
            aif_02.a(fArray);
        } else {
            this.i();
        }
        this.j = displayedScreenElement;
        return false;
    }

    private void i() {
        this.k = bst_1.c;
        this.a(false);
        aii_0.a().e(b);
    }

    private void a(boolean bl) {
        if (this.l == null) {
            return;
        }
        for (ph_0 ph_02 : this.l.av_()) {
            ((bfr_0)ph_02).c(bl);
        }
    }

    private boolean a(int n, int n2, short s2) {
        if (s2 == Short.MIN_VALUE) {
            return false;
        }
        if (bwj_1.a().b(n, n2)) {
            return false;
        }
        return !this.i.c(czb_0.b(n, n2, s2));
    }

    @Nullable
    private static DisplayedScreenElement a(int n, int n2) {
        ArrayList<DisplayedScreenElement> arrayList = ans_0.D().c().a((float)n, (float)n2, 0.0f, acj.c);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(0);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (this.l != null) {
                this.l.aB().c();
            }
            this.j();
            aNF aNF2 = (aNF)ans_0.D().c();
            aNF2.n(true);
        }
        try {
            aii_0.a().b(b);
        }
        catch (Exception exception) {
            e.error((Object)("Exception raised while pushing frame " + this.getClass().getName()), (Throwable)exception);
        }
    }

    private void j() {
        this.i.c();
        List list = ccm_1.g().b();
        for (cch_1 cch_12 : list) {
            int n = cch_12.a() * 18;
            int n2 = cch_12.b() * 18;
            for (int k = n; k < n + cch_12.c(); ++k) {
                for (int i2 = n2; i2 < n2 + cch_12.d(); ++i2) {
                    bNK bNK2 = bNT.f().c(k, i2);
                    if (bNK2 != null) {
                        this.i.d(czb_0.b(k, i2, bNK2.I()));
                        continue;
                    }
                    yx_0 yx_02 = yz_0.a(k, i2);
                    if (yx_02 == null) continue;
                    for (short s2 : yz_0.d(k, i2)) {
                        if (s2 == Short.MIN_VALUE || !yx_02.a(k, i2, s2) && !yz_0.i(k, i2, s2)) continue;
                        this.i.d(czb_0.b(k, i2, s2));
                    }
                    cch_12.b(new cZC(this));
                }
            }
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        this.i.c();
        if (this.l != null) {
            e.info((Object)"Bag-action cancelled");
            this.n.run();
            this.l = null;
        }
        this.j = null;
        this.k = bst_1.b;
        aNF aNF2 = (aNF)ans_0.D().c();
        aNF2.n(false);
        try {
            this.l = null;
            aii_0.a().e(b);
            aii_0.a().c(b);
        }
        catch (Exception exception) {
            e.error((Object)"Exception during onFrameRemove", (Throwable)exception);
        }
    }

    static long b(int n, int n2, short s2) {
        return apb_2.a(n, n2, s2);
    }

    @Override
    public aej_2 d() {
        return this.g;
    }

    @Override
    public void e() {
        this.n.run();
    }

    @Override
    public void f() {
        this.n.run();
        aii_0.a().e(b);
    }

    @Override
    public void a(cZV cZV2) {
        this.h = cZV2;
    }

    @Override
    public cZV g() {
        return this.h;
    }

    @Override
    public bgf_1 h() {
        return this.l;
    }

    private boolean a(int n) {
        boolean bl = cFl.a(n);
        return bl && this.g() == cZV.a;
    }
}

