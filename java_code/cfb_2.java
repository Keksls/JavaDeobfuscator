/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from cFb
 */
public class cfb_2
implements alh_1 {
    private final blx_1 a;
    private static final TLongArrayList b = new TLongArrayList(new long[]{120L, 320L, 920L});
    private static final TLongArrayList c = new TLongArrayList(new long[]{100L, 300L, 400L, 410L, 502L});
    private static final TLongArrayList d = new TLongArrayList(new long[]{130L, 330L, 502L, 930L});

    public cfb_2(blx_1 blx_12) {
        this.a = blx_12;
    }

    @Override
    public boolean a() {
        int n = azu_0.j().k().cQ();
        return n != 0 && n == this.a.bA();
    }

    @Override
    public boolean a(long l) {
        int n = azu_0.j().k().cQ();
        long l2 = ami_2.a(l);
        if (n != -1) {
            return n == this.a.bA() && !b.contains(l2);
        }
        if (this.a.bA() != -1) {
            return c.contains(l2);
        }
        return d.contains(l2);
    }

    static {
        d.add(b.toArray());
    }
}

