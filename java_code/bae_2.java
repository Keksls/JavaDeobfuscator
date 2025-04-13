/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;

/*
 * Renamed from bAe
 */
public class bae_2
extends uq_0 {
    private static final float m = 2.0f;
    final TLongHashSet n = new TLongHashSet();

    public void h() {
        this.n.clear();
    }

    public void a(blx_1 blx_12) {
        bmf_2.a().a(new baf_2(this, blx_12));
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.n.clear();
    }

    @Override
    protected float a(us_0 us_02, ys_0 ys_02, us_0 us_03, ys_0 ys_03, byte by) {
        float f2 = super.a(us_02, ys_02, us_03, ys_03, by);
        if (this.n.contains(bae_2.a(ys_03.a, ys_03.b))) {
            f2 += 2.0f;
        }
        return f2;
    }

    static /* synthetic */ long b(int n, int n2) {
        return bae_2.a(n, n2);
    }
}

