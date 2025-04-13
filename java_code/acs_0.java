/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import gnu.trove.set.hash.THashSet;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from acs
 */
public class acs_0
implements aeh_0 {
    private static final int e = 25;
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private final ArrayList<DisplayedScreenElement> j = new ArrayList(2048);
    private acm_0 k;
    private final ArrayList<acq_0> l;
    private String m;
    private String n;
    private Ya o;
    private long p = Long.MIN_VALUE;
    private byte q;
    private static byte r = (byte)-1;
    private static final acs_0 s = new acs_0();
    private static final Logger t = Logger.getLogger(acs_0.class);
    private final acn u = new acn();
    private final ArrayList<act> v = new ArrayList();
    private final ArrayList<acF> w = new ArrayList();
    private final acP x;
    private final THashSet<DisplayedScreenElement> y = new THashSet();
    private final adb_0 z = new adb_0();
    private final ArrayList<DisplayedScreenElement> A = new ArrayList();
    private int B;
    private boolean C = true;
    private boolean D = false;

    private acs_0() {
        this.l = new ArrayList(25);
        this.x = new acP(this.u);
        this.k = new acm_0();
        this.d();
    }

    public static acs_0 a() {
        return new acs_0();
    }

    public static acs_0 b() {
        return s;
    }

    public Iterator<acq_0> c() {
        return this.l.iterator();
    }

    public void a(@NotNull acm_0 acm_02, Ya ya) {
        this.k.a();
        this.k = acm_02;
        this.a(ya);
    }

    public void d() {
        this.A.clear();
        this.w.clear();
        this.v.clear();
        this.q = 0;
        this.l.clear();
        this.k.a();
        this.x.a();
        this.y.clear();
        this.u.a();
    }

    public void e() {
        this.x.a();
        this.q();
    }

    private static String a(String string, long l) {
        if (string == null) {
            return null;
        }
        assert (string.contains("%d") && string.endsWith("/"));
        return String.format(string, l);
    }

    public void a(long l) {
        if (this.p == l) {
            return;
        }
        this.p = l;
        if (this.n != null) {
            this.m = acs_0.a(this.n, this.p);
        }
        this.n();
    }

    public void a(String string) {
        this.n = string;
        this.m = acs_0.a(this.n, this.p);
        this.n();
    }

    private void n() {
        this.q = (byte)(this.q & 0xFFFFFFFD);
    }

    public void a(acb_0 acb_02, int n) {
        this.y.clear();
        ahm_0 ahm_02 = acb_02.z();
        int n2 = this.l.size();
        for (int k = 0; k < n2; ++k) {
            acq_0 acq_02 = this.l.get(k);
            ArrayList<DisplayedScreenElement> arrayList = acq_02.a();
            int n3 = arrayList.size();
            if (n3 == 0 || !acq_02.a(ahm_02) || !this.C) continue;
            for (int i2 = 0; i2 < n3; ++i2) {
                DisplayedScreenElement displayedScreenElement = arrayList.get(i2);
                if (!displayedScreenElement.b.b() || displayedScreenElement.d == null || this.y.contains((Object)displayedScreenElement)) continue;
                displayedScreenElement.a((short)n);
                this.y.add((Object)displayedScreenElement);
            }
        }
    }

    public final void a(afk_2 afk_22) {
        this.a(afk_22.e, afk_22.b, afk_22.d, afk_22.c);
    }

    private void a(int n, int n2, int n3, int n4) {
        assert (this.m != null) : "You must call setPath before";
        this.k.a(this.m, n, n2, n3, n4, this.o);
        boolean bl = this.k.b();
        if (bl && this.q()) {
            this.r();
        }
        this.x.a(this.k.c(), this.k.d(), 25, this.l);
        int n5 = this.l.size();
        if (n5 != 0) {
            if (!bl && this.h()) {
                return;
            }
            this.D = false;
            boolean bl2 = true;
            for (int k = 0; k < n5; ++k) {
                acq_0 acq_02 = this.l.get(k);
                if (acq_02 == null) continue;
                acq_02.b();
                boolean bl3 = acq_02.e();
                bl2 &= bl3;
            }
            if (bl2) {
                this.o();
            } else {
                this.p();
            }
        } else {
            this.o();
            if (!this.D) {
                this.D = true;
                t.error((Object)("pas de maps \u00e0 charger (screen map=" + this.k.c() + ", " + this.k.d() + ") @" + this.p));
            }
        }
    }

    private void o() {
        this.q = (byte)(this.q | 1);
    }

    private void p() {
        this.q = (byte)(this.q & 0xFFFFFFFE);
    }

    private boolean q() {
        acy_2<aci_0> acy_22 = this.k.d;
        int n = acy_22.d();
        boolean bl = false;
        this.l.clear();
        for (int k = 0; k < n; ++k) {
            int n2 = acy_22.e(k);
            aci_0 aci_02 = acy_22.h(k);
            acq_0 acq_02 = (acq_0)this.x.a(n2);
            if (acq_02 == null) {
                bl = true;
                acq_02 = new acq_0();
                acq_02.a(aci_02, this.u, false);
                this.x.a(n2, acq_02);
            }
            this.l.add(acq_02);
        }
        return bl;
    }

    private void r() {
        for (int k = 0; k < this.w.size(); ++k) {
            this.w.get(k).b();
        }
    }

    public void a(acF acF2) {
        if (!this.w.contains(acF2)) {
            this.w.add(acF2);
        }
    }

    public void b(acF acF2) {
        this.w.remove(acF2);
    }

    public boolean a(act act2) {
        return this.v.add(act2);
    }

    public boolean b(act act2) {
        return this.v.remove(act2);
    }

    public void f() {
        int n;
        assert (this.l.size() == this.k.e());
        int n2 = this.l.size();
        for (n = 0; n < n2; ++n) {
            acq_0 acq_02 = this.l.get(n);
            acq_02.a(acq_02.c(), this.u, true);
        }
        for (n = 0; n < this.v.size(); ++n) {
            this.v.get(n).a();
        }
    }

    public void a(ahg_0 ahg_02) {
        int n = this.j.size();
        for (int k = 0; k < n; ++k) {
            this.j.get((int)k).g = false;
        }
        this.j.clear();
        ahm_0 ahm_02 = ahg_02.z();
        int n2 = this.l.size();
        for (n = 0; n < n2; ++n) {
            this.l.get(n).a(ahg_02, this.j, ahm_02);
        }
        n2 = this.A.size();
        for (n = 0; n < n2; ++n) {
            this.A.get(n).a(ahg_02, this.j, ahm_02);
        }
        ahg_02.a(this.j);
        this.s();
    }

    private void s() {
        this.q = (byte)(this.q | 2);
    }

    public final void a(int n, int n2, ArrayList<DisplayedScreenElement> arrayList, acV acV2) {
        int n3 = this.l.size();
        for (int k = 0; k < n3; ++k) {
            this.l.get(k).a(n, n2, arrayList, acV2);
        }
    }

    public final DisplayedScreenElement a(int n, int n2, acV acV2) {
        DisplayedScreenElement displayedScreenElement = null;
        int n3 = this.l.size();
        for (int k = 0; k < n3; ++k) {
            acq_0 acq_02 = this.l.get(k);
            DisplayedScreenElement displayedScreenElement2 = acq_02.a(n, n2, acV2);
            if (displayedScreenElement2 == null || displayedScreenElement != null && displayedScreenElement.b.i > displayedScreenElement2.b.i) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    public final DisplayedScreenElement a(int n, int n2, int n3, acV acV2) {
        DisplayedScreenElement displayedScreenElement = null;
        int n4 = this.l.size();
        for (int k = 0; k < n4; ++k) {
            acq_0 acq_02 = this.l.get(k);
            DisplayedScreenElement displayedScreenElement2 = acq_02.a(n, n2, n3, acV2);
            if (displayedScreenElement2 == null || displayedScreenElement != null && displayedScreenElement.b.i > displayedScreenElement2.b.i) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    public final DisplayedScreenElement b(int n, int n2, int n3, acV acV2) {
        DisplayedScreenElement displayedScreenElement = null;
        int n4 = this.l.size();
        for (int k = 0; k < n4; ++k) {
            acq_0 acq_02 = this.l.get(k);
            DisplayedScreenElement displayedScreenElement2 = acq_02.b(n, n2, n3, acV2);
            if (displayedScreenElement2 == null || displayedScreenElement != null && displayedScreenElement.b.i > displayedScreenElement2.b.i) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    public final DisplayedScreenElement c(int n, int n2, int n3, acV acV2) {
        DisplayedScreenElement displayedScreenElement = null;
        int n4 = this.l.size();
        for (int k = 0; k < n4; ++k) {
            acq_0 acq_02 = this.l.get(k);
            DisplayedScreenElement displayedScreenElement2 = acq_02.c(n, n2, n3, acV2);
            if (displayedScreenElement2 == null || displayedScreenElement != null && displayedScreenElement.b.i > displayedScreenElement2.b.i) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    public final DisplayedScreenElement d(int n, int n2, int n3, acV acV2) {
        short s2 = yz_0.b(n, n2, (short)n3);
        if (s2 == Short.MIN_VALUE) {
            return null;
        }
        return this.c(n, n2, s2, acV2);
    }

    public final DisplayedScreenElement e(int n, int n2, int n3, acV acV2) {
        short s2 = yz_0.d(n, n2, (short)n3);
        if (s2 == Short.MIN_VALUE) {
            return null;
        }
        return this.b(n, n2, s2, acV2);
    }

    public void a(int n, int n2, ArrayList<DisplayedScreenElement> arrayList) {
        int n3 = this.l.size();
        for (int k = 0; k < n3; ++k) {
            acq_0 acq_02 = this.l.get(k);
            aci_0 aci_02 = acq_02.c();
            if (aci_02 == null) continue;
            acq_02.a(n, n2, arrayList);
        }
    }

    public final ArrayList<acq_0> g() {
        return this.l;
    }

    public final boolean h() {
        return (this.q & 1) == 1;
    }

    public final boolean i() {
        return (this.q & 2) == 2;
    }

    final boolean j() {
        return this.q == 3;
    }

    public void a(Ya ya) {
        this.o = ya;
    }

    public void a(int n) {
        this.B = n;
        this.C = n != 0;
        byte by = (byte)(r & 0xFFFFFFF8 | acs_0.b(n));
        this.a(by);
        this.f();
    }

    public int k() {
        return this.B;
    }

    public void a(byte by, boolean bl) {
        byte by2 = r;
        by2 = bl ? (byte)(by2 | by) : (byte)(by2 & ~by);
        this.a(by2);
    }

    public static byte b(int n) {
        switch (n) {
            case 2: {
                return 7;
            }
            case 1: {
                return 3;
            }
            case 0: {
                return 1;
            }
        }
        return 1;
    }

    private void a(byte by) {
        if (by > r) {
            this.u.a(by);
            aed.a.d();
        }
        r = by;
    }

    public static byte l() {
        return r;
    }

    @Override
    public final void a(ahm_0 ahm_02, ArrayList<aek_0> arrayList) {
        for (DisplayedScreenElement displayedScreenElement : this.j) {
            if (displayedScreenElement.d() == null) continue;
            arrayList.add(displayedScreenElement);
        }
    }

    public boolean a(DisplayedScreenElement displayedScreenElement) {
        return this.A.add(displayedScreenElement);
    }

    public boolean a(Object object) {
        return this.A.remove(object);
    }

    public void m() {
        this.A.clear();
    }
}

