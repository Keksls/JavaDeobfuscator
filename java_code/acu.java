/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.log4j.Logger;

public class acu {
    private static final Logger d = Logger.getLogger(acu.class);
    private static final Comparator<DisplayedScreenElement> e = new acv_0();
    int a = Integer.MAX_VALUE;
    int b = Integer.MAX_VALUE;
    final ArrayList<DisplayedScreenElement> c = new ArrayList();

    void a() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c.clear();
    }

    private void a(acs_0 acs_02, int n, int n2) {
        if (n == this.a && n2 == this.b) {
            return;
        }
        this.c.clear();
        acs_02.a(n, n2, this.c, acV.a);
        this.a = n;
        this.b = n2;
    }

    int a(acs_0 acs_02, int n, int n2, int n3) {
        DisplayedScreenElement displayedScreenElement = this.b(acs_02, n, n2, n3);
        try {
            for (int k = this.c.size() - 1; k >= 0; --k) {
                DisplayedScreenElement displayedScreenElement2 = this.c.get(k);
                if (!displayedScreenElement2.k() || displayedScreenElement == null || displayedScreenElement2.e().e <= displayedScreenElement.e().e) continue;
                displayedScreenElement = displayedScreenElement2;
            }
        }
        catch (Exception exception) {
            d.warn((Object)"Probl\u00e8me dans le process d'affichage :", (Throwable)exception);
            return 0;
        }
        return displayedScreenElement != null && displayedScreenElement.b != null ? displayedScreenElement.b.r() : 0;
    }

    DisplayedScreenElement b(acs_0 acs_02, int n, int n2, int n3) {
        this.a(acs_02, n, n2);
        int n4 = this.c.size();
        if (n4 == 0) {
            return null;
        }
        if (n4 == 1) {
            return this.c.get(0);
        }
        int n5 = Integer.MAX_VALUE;
        DisplayedScreenElement displayedScreenElement = null;
        try {
            this.c.sort(e);
            for (int k = 0; k < n4; ++k) {
                DisplayedScreenElement displayedScreenElement2 = this.c.get(k);
                if (displayedScreenElement2.k() || displayedScreenElement2.b == null) continue;
                short s2 = displayedScreenElement2.I();
                int n6 = s2 - displayedScreenElement2.b.f();
                boolean bl = n3 >= n6 && n3 <= s2;
                int n7 = Math.abs(s2 - n3);
                if (n7 == 0 && n5 == 0 || bl) {
                    int n8;
                    int n9 = n8 = displayedScreenElement == null ? -1 : displayedScreenElement.b.r();
                    if (displayedScreenElement2.b.r() > n8) {
                        displayedScreenElement = displayedScreenElement2;
                    }
                }
                if (n7 >= n5) continue;
                n5 = (short)n7;
                displayedScreenElement = displayedScreenElement2;
            }
        }
        catch (Exception exception) {
            d.warn((Object)"Probl\u00e8me dans le process d'affichage :", (Throwable)exception);
            return null;
        }
        return displayedScreenElement;
    }
}

