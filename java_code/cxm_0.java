/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cXM
 */
public class cxm_0
implements czu_0 {
    private static final String b = "destinationPosition";
    private static final float[] c = new float[]{0.0f, 1.0f, 0.0f, 0.5f};
    private static final float[] d = new float[]{1.0f, 0.0f, 0.0f, 0.5f};
    private static final Logger e = Logger.getLogger(cxm_0.class);
    private static final cxm_0 f = new cxm_0();
    final TIntObjectHashMap<bst_1> g = new TIntObjectHashMap();
    private DisplayedScreenElement h;
    private bst_1 i;
    private bgf_1 j;
    private Runnable k;
    private Runnable l;
    private Runnable m;
    private aej_2 n = aej_2.d;
    private cZV o;

    public static cxm_0 a() {
        return f;
    }

    private cxm_0() {
    }

    @Override
    public void a(bgf_1 bgf_12) {
        this.j = bgf_12;
    }

    @Override
    public void a(Runnable runnable) {
        this.l = runnable;
    }

    @Override
    public void b(Runnable runnable) {
        this.k = runnable;
    }

    @Override
    public void c(Runnable runnable) {
        this.m = runnable;
    }

    @Override
    public bst_1 c() {
        return this.i;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19751: {
                DisplayedScreenElement displayedScreenElement;
                dhL dhL2 = (dhL)adt_12;
                ArrayList<DisplayedScreenElement> arrayList = ans_0.D().c().a((float)dhL2.r(), (float)dhL2.s(), 0.0f, acj.a);
                DisplayedScreenElement displayedScreenElement2 = displayedScreenElement = arrayList != null && !arrayList.isEmpty() ? arrayList.get(0) : null;
                if (displayedScreenElement != this.h) {
                    this.a(displayedScreenElement);
                }
                return false;
            }
            case 16119: {
                dhL dhL3 = (dhL)adt_12;
                int n = dhL3.w();
                if (!dhL3.o()) {
                    this.i = bst_1.b;
                    e.info((Object)"Bag-action cancelled");
                    this.l.run();
                } else if (this.i == bst_1.a) {
                    cdw_0.n().c(600071L);
                    e.info((Object)("Bag-action to " + this.j.aB().b() + " validated"));
                    this.n = this.j.F();
                    this.k.run();
                    if (this.a(n)) {
                        return false;
                    }
                    this.m.run();
                } else {
                    e.info((Object)"Bag-action cancelled");
                    this.l.run();
                }
                aii_0.a().e(b);
                this.j = null;
                azu_0.j().b(this);
                return false;
            }
            case 19672: {
                return bgp_1.a(adt_12, this.j);
            }
        }
        return true;
    }

    private boolean a(int n) {
        boolean bl = cFl.a(n);
        return bl && this.g() == cZV.a;
    }

    private boolean a(DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement != null) {
            ScreenElement screenElement = displayedScreenElement.d();
            int n = screenElement.d();
            int n2 = screenElement.e();
            short s2 = screenElement.c();
            this.i = (bst_1)((Object)this.g.get(cxm_0.a(n, n2)));
            float[] fArray = this.i == bst_1.a ? c : d;
            this.j.aB().a(n, n2, s2);
            aif_0 aif_02 = aii_0.a().d(b);
            assert (aif_02 != null);
            aif_02.f();
            aif_02.b(n, n2, s2);
            aif_02.a(fArray);
        }
        this.h = displayedScreenElement;
        return false;
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
            this.j.aB().c();
            this.i();
        }
        aNF aNF2 = (aNF)ans_0.D().c();
        aNF2.n(true);
        try {
            aii_0.a().b(b);
        }
        catch (Exception exception) {
            e.error((Object)("Exception raised while pushing frame " + this.getClass().getName()), (Throwable)exception);
        }
    }

    private void i() {
        Object object2;
        this.g.clear();
        bmr_1 bmr_12 = azu_0.j().k();
        feX feX2 = bmr_12.di().u();
        for (Object object2 : feX2) {
            for (int k = ((feY)object2).c(); k < ((feY)object2).c() + 6; ++k) {
                for (int i2 = ((feY)object2).d(); i2 < ((feY)object2).d() + 6; ++i2) {
                    this.a((feY)object2, k, i2);
                }
            }
        }
        List list = ccm_1.g().b();
        object2 = list.iterator();
        while (object2.hasNext()) {
            cch_1 cch_12 = (cch_1)object2.next();
            cch_12.b(new cxn_0(this));
        }
    }

    private void a(feY feY2, int n, int n2) {
        if (feY2 instanceof ffi && !feY2.c(this.j) && ((ffi)feY2).d(this.j)) {
            this.g.put(cxm_0.a(n, n2), (Object)bst_1.e);
            return;
        }
        bNK bNK2 = bNT.f().c(n, n2);
        if (bNK2 != null) {
            this.g.put(cxm_0.a(n, n2), (Object)bst_1.c);
            return;
        }
        if (!feY2.a(this.j, n, n2)) {
            this.g.put(cxm_0.a(n, n2), (Object)bst_1.d);
            return;
        }
        yx_0 yx_02 = yz_0.a(n, n2);
        if (yx_02 == null) {
            return;
        }
        this.g.put(cxm_0.a(n, n2), (Object)(yx_02.a(n, n2) ? bst_1.c : bst_1.a));
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        this.g.clear();
        if (this.j != null) {
            e.info((Object)"Bag-action cancelled");
            this.l.run();
            this.j = null;
        }
        this.h = null;
        this.i = bst_1.b;
        aNF aNF2 = (aNF)ans_0.D().c();
        aNF2.n(false);
        this.n = aej_2.d;
        try {
            this.j = null;
            aii_0.a().e(b);
            aii_0.a().c(b);
        }
        catch (Exception exception) {
            e.error((Object)"Exception during onFrameRemove", (Throwable)exception);
        }
    }

    static int a(int n, int n2) {
        return Hw.d(n, n2);
    }

    @Override
    public aej_2 d() {
        return this.n;
    }

    @Override
    public void e() {
        this.l.run();
    }

    @Override
    public void f() {
        this.l.run();
        aii_0.a().e(b);
    }

    @Override
    public void a(cZV cZV2) {
        this.o = cZV2;
    }

    @Override
    public cZV g() {
        return this.o;
    }

    @Override
    public bgf_1 h() {
        return this.j;
    }
}

