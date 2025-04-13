/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Renamed from acq
 */
public class acq_0 {
    private static final int b = 16;
    private static final ArrayList<DisplayedScreenElement> c = new ArrayList(64);
    private boolean d = false;
    private aci_0 e;
    private DisplayedScreenElement[] f;
    private final ArrayList<DisplayedScreenElement> g = new ArrayList();
    private static final Comparator<DisplayedScreenElement> h = new acr();

    public void a(aci_0 aci_02, acn acn2, boolean bl) {
        this.a(acn2);
        this.e = aci_02;
        if (this.e == null) {
            return;
        }
        int n = this.e.a(acs_0.l());
        this.f = new DisplayedScreenElement[n];
        int n2 = 0;
        int n3 = this.e.c.size();
        for (int k = 0; k < n3; ++k) {
            ScreenElement screenElement = this.e.c.get(k);
            byte by = screenElement.i().n();
            if ((by & acs_0.l()) != by) continue;
            DisplayedScreenElement displayedScreenElement = acn2.a(screenElement.o);
            if (bl || displayedScreenElement.b == null) {
                displayedScreenElement.a(screenElement);
            }
            this.f[n2] = displayedScreenElement;
            ++n2;
            if (!screenElement.b()) continue;
            this.g.add(displayedScreenElement);
        }
    }

    final boolean a(ahm_0 ahm_02) {
        if (this.e == null) {
            return false;
        }
        return ahm_02.a(this.e.i, this.e.f, this.e.g, this.e.h);
    }

    ArrayList<DisplayedScreenElement> a() {
        return this.g;
    }

    public void b() {
        if (this.d) {
            return;
        }
        if (this.f == null) {
            this.d = true;
            return;
        }
        for (int k = 0; k < this.f.length; ++k) {
            DisplayedScreenElement displayedScreenElement = this.f[k];
            if (displayedScreenElement.d == null || displayedScreenElement.d.d() == null || displayedScreenElement.d.d().j()) continue;
            return;
        }
        this.d = true;
    }

    public void a(ahg_0 ahg_02, ArrayList<DisplayedScreenElement> arrayList, ahm_0 ahm_02) {
        if (!this.a(ahm_02)) {
            return;
        }
        int n = this.f.length;
        for (int k = 0; k < n; ++k) {
            this.f[k].a(ahg_02, arrayList, ahm_02);
        }
    }

    public final aci_0 c() {
        return this.e;
    }

    public final DisplayedScreenElement[] d() {
        return this.f;
    }

    public boolean e() {
        return this.d;
    }

    final void a(int n, int n2, ArrayList<DisplayedScreenElement> arrayList, acV acV2) {
        ScreenElement screenElement;
        if (this.f == null) {
            return;
        }
        if (!this.a(n, n2)) {
            return;
        }
        int n3 = this.f.length;
        if (n3 <= 16) {
            for (int k = 0; k < n3; ++k) {
                DisplayedScreenElement displayedScreenElement = this.f[k];
                ScreenElement screenElement2 = displayedScreenElement.b;
                if (screenElement2.d != n || screenElement2.e != n2 || !acV2.a(displayedScreenElement) || arrayList.contains(displayedScreenElement)) continue;
                arrayList.add(displayedScreenElement);
            }
            return;
        }
        int n4 = 0;
        int n5 = n3 - 1;
        int n6 = -1;
        do {
            ScreenElement screenElement3;
            int n7 = n5 + n4 >>> 1;
            if (n4 + 1 == n5) {
                screenElement3 = this.f[n4].b;
                if (screenElement3.d == n && screenElement3.e == n2) {
                    n6 = n4;
                    break;
                }
                screenElement3 = this.f[n5].b;
                if (screenElement3.d == n && screenElement3.e == n2) {
                    n6 = n5;
                    break;
                }
                return;
            }
            screenElement3 = this.f[n7].b;
            if (screenElement3.e > n2) {
                n5 = n7;
                continue;
            }
            if (screenElement3.e < n2) {
                n4 = n7;
                continue;
            }
            if (screenElement3.d > n) {
                n5 = n7;
                continue;
            }
            if (screenElement3.d < n) {
                n4 = n7;
                continue;
            }
            n6 = n7;
        } while (n6 == -1);
        n4 = n6;
        int n8 = 1;
        while (n4 - n8 >= 0) {
            screenElement = this.f[n4 - n8].b;
            if (screenElement.d != n || screenElement.e != n2) break;
            ++n8;
        }
        n4 = n4 + 1 - n8;
        while (n6 + 1 < n3) {
            screenElement = this.f[++n6].b;
            if (screenElement.d != n || screenElement.e != n2) break;
            ++n8;
        }
        for (int k = 0; k < n8; ++k) {
            DisplayedScreenElement displayedScreenElement = this.f[n4 + k];
            if (!acV2.a(displayedScreenElement) || arrayList.contains(displayedScreenElement)) continue;
            arrayList.add(displayedScreenElement);
        }
    }

    final DisplayedScreenElement a(int n, int n2, acV acV2) {
        if (!this.a(n, n2)) {
            return null;
        }
        c.clear();
        this.a(n, n2, c, acV2);
        DisplayedScreenElement displayedScreenElement = null;
        int n3 = c.size();
        for (int k = 0; k < n3; ++k) {
            DisplayedScreenElement displayedScreenElement2 = c.get(k);
            if (displayedScreenElement2.b.d != n || displayedScreenElement2.b.e != n2 || displayedScreenElement != null && displayedScreenElement.b.i > displayedScreenElement2.b.i) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    final DisplayedScreenElement a(int n, int n2, int n3, acV acV2) {
        if (!this.a(n2, n3)) {
            return null;
        }
        c.clear();
        this.a(n2, n3, c, acV2);
        for (int k = c.size() - 1; k >= 0; --k) {
            DisplayedScreenElement displayedScreenElement = c.get(k);
            if (displayedScreenElement.b.d == n2 && displayedScreenElement.b.e == n3) continue;
            c.remove(k);
        }
        if (c.size() <= n) {
            return null;
        }
        c.sort(h);
        return c.get(c.size() - 1 - n);
    }

    DisplayedScreenElement b(int n, int n2, int n3, acV acV2) {
        if (!this.a(n, n2, (short)n3)) {
            return null;
        }
        c.clear();
        this.a(n, n2, c, acV2);
        DisplayedScreenElement displayedScreenElement = null;
        int n4 = c.size();
        for (int k = 0; k < n4; ++k) {
            DisplayedScreenElement displayedScreenElement2 = c.get(k);
            ScreenElement screenElement = displayedScreenElement2.b;
            if (screenElement.d != n || screenElement.e != n2 || screenElement.c != n3 && (!screenElement.h.j() || screenElement.c - screenElement.j != n3) || displayedScreenElement != null && displayedScreenElement.b.i > screenElement.i) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    final DisplayedScreenElement c(int n, int n2, int n3, acV acV2) {
        if (!this.a(n, n2, (short)n3)) {
            return null;
        }
        c.clear();
        this.a(n, n2, c, acV2);
        DisplayedScreenElement displayedScreenElement = null;
        int n4 = c.size();
        for (int k = 0; k < n4; ++k) {
            DisplayedScreenElement displayedScreenElement2 = c.get(k);
            assert (displayedScreenElement2.b.d == n);
            assert (displayedScreenElement2.b.e == n2);
            if (displayedScreenElement2.b.c != n3 || displayedScreenElement != null && displayedScreenElement.b.i > displayedScreenElement2.b.i || !displayedScreenElement2.b.h.m()) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    void a(int n, int n2, ArrayList<DisplayedScreenElement> arrayList) {
        if (!this.b(n, n2)) {
            return;
        }
        for (int k = 0; k < this.f.length; ++k) {
            DisplayedScreenElement displayedScreenElement = this.f[k];
            EntitySprite entitySprite = displayedScreenElement.d;
            if (n2 < entitySprite.n || n2 >= entitySprite.o || n < entitySprite.l || n >= entitySprite.m || displayedScreenElement.b.h.j() || !displayedScreenElement.g() || !displayedScreenElement.a(n, n2) || arrayList.contains(displayedScreenElement)) continue;
            arrayList.add(displayedScreenElement);
        }
    }

    private boolean a(int n, int n2) {
        return this.e == null || this.e.a(n, n2);
    }

    private boolean a(int n, int n2, short s2) {
        return this.e == null || this.e.a(n, n2, s2);
    }

    private boolean b(int n, int n2) {
        if (this.e == null) {
            return false;
        }
        if (n > this.e.h) {
            return false;
        }
        if (n < this.e.f) {
            return false;
        }
        if (n2 > this.e.i) {
            return false;
        }
        return n2 >= this.e.g;
    }

    public void a(acn acn2) {
        if (this.e == null) {
            return;
        }
        for (int k = 0; k < this.f.length; ++k) {
            DisplayedScreenElement displayedScreenElement = this.f[k];
            displayedScreenElement.a(acn2);
        }
        this.g.clear();
        this.f = null;
        this.e = null;
        this.d = false;
    }

    public final String toString() {
        return "DisplayedScreenMap {" + this.e + "}";
    }
}

