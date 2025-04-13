/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bAj
 */
public class baj_2
implements bzz_1 {
    public static final bzz_1 a = new baj_2();
    private final bak_2 c = new bak_2();
    protected final ut_0 b = new ut_0();
    private final bah_2 d = new bah_2(apl_1.a, false);

    protected baj_2() {
        this.b.b = 1000;
        this.b.d = false;
        this.b.c = -1;
        this.b.j = true;
        this.b.h = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public bah_2 a(blx_1 blx_12, biI biI2, int n) {
        if (n <= 0) {
            return bal_2.d.a(blx_12, biI2, n);
        }
        if (blx_12.hd() != null) {
            return bal_2.d.a(blx_12, biI2, n);
        }
        boolean bl = blx_12.f(eoz_1.ax);
        bvx_2 bvx_22 = blx_12.bz();
        List<enj_1> list = bvx_22.h(blx_12.Y());
        if (list == null || list.isEmpty() || !enj_1.a(blx_12.P_(), list)) {
            if (bl) {
                return this.d;
            }
            return bal_2.d.a(blx_12, biI2, n);
        }
        aff_1 aff_12 = this.a(blx_12, biI2, list);
        if (aff_12 == null) {
            if (bl) {
                return this.d;
            }
            return bal_2.d.a(blx_12, biI2, n);
        }
        tg_0 tg_02 = bvx_22.g();
        tg_02.b(blx_12);
        apl_1 apl_12 = null;
        try {
            this.c.a(bvx_22, blx_12.Y(), list);
            apl_12 = agz.a(biI2, cyp_0.g().h(), this.b, tg_02, this.c);
        }
        finally {
            tg_02.j();
        }
        if (apl_12 != null && apl_12.b()) {
            boolean bl2 = blx_12.a(eoz_1.aR);
            if (bl2 && n > 0) {
                return new bah_2(apl_12, true);
            }
            int n2 = n * 3;
            if (apl_12.a() <= n2) {
                return new bah_2(apl_12, true);
            }
        }
        if (bl) {
            return this.d;
        }
        return bal_2.d.a(blx_12, biI2, n);
    }

    private aff_1 a(blx_1 blx_12, biI biI2, List<enj_1> list) {
        int n;
        float f2 = 0.0f;
        float f3 = 0.0f;
        ace_0 ace_02 = ans_0.D().c();
        if (ace_02 == null) {
            return null;
        }
        int n2 = cyp_0.g().o();
        ArrayList<DisplayedScreenElement> arrayList = ace_02.a(n2, n = cyp_0.g().p(), biI2.L(), acj.b, 0.0f, 0.0f);
        int n3 = arrayList.size();
        if (n3 == 0) {
            return null;
        }
        aff_1 aff_12 = blx_12.gg();
        TLongHashSet tLongHashSet = new TLongHashSet(50);
        for (int k = 0; k < n3; ++k) {
            DisplayedScreenElement displayedScreenElement = arrayList.get(k);
            ScreenElement screenElement = displayedScreenElement.d();
            if (!tLongHashSet.add(displayedScreenElement.j()) || aff_12.equals(screenElement.g()) || !enj_1.a(screenElement.g(), list)) continue;
            return new aff_1(screenElement.g());
        }
        return null;
    }
}

