/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.List;

public final class bgy {
    public static final bgy a = new bgy();

    private bgy() {
    }

    public void a(bmr_1 bmr_12) {
        this.a(bmr_12, 34, eey_0.j, bmr_12.df(), false);
    }

    public void a(bmr_1 bmr_12, boolean bl) {
        this.a(bmr_12, 32, eey_0.i, bmr_12.de(), bl);
    }

    public void b(bmr_1 bmr_12, boolean bl) {
        this.a(bmr_12, 28, eey_0.g, bmr_12.dc(), bl);
    }

    private void a(bmr_1 bmr_12, int n, Sm sm, TIntHashSet tIntHashSet, boolean bl) {
        bmr_12.cy().g(n);
        if (tIntHashSet == null || tIntHashSet.isEmpty()) {
            return;
        }
        int[] nArray = tIntHashSet.toArray();
        if (bl) {
            bmr_12.a_(eps_0.b).y();
        }
        for (int k = 0; k < nArray.length; ++k) {
            int n2 = nArray[k];
            efh_0 efh_02 = bgh_0.a().d(n2);
            if (efh_02 == null) continue;
            efh_02.a(sm, bmr_12, bmr_12.ge(), efc_0.a(), bmr_12.G(), bmr_12.H(), bmr_12.I(), bmr_12, null, false);
        }
        if (bl) {
            bmr_12.a_(eps_0.b).z();
        }
    }

    public static void a(List<sd_0> list) {
        for (int k = 0; k < list.size(); ++k) {
            sd_0 sd_02 = list.get(k);
            if (sd_02 instanceof eja_0 && ((eja_0)sd_02).aQ()) {
                sd_02.C();
            } else {
                sd_02.B();
            }
            if (sd_02.P() || sd_02.aq()) continue;
            sd_02.Y();
            sd_02.ad();
        }
    }
}

