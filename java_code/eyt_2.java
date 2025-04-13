/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;

/*
 * Renamed from eyT
 */
public class eyt_2 {
    public static final int a = 53;
    private static final TLongHashSet b = new TLongHashSet();

    private eyt_2() {
    }

    public static boolean a(long l) {
        return !b.contains(l);
    }

    static {
        b.add(450L);
    }
}

