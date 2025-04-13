/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortIterator
 *  gnu.trove.set.hash.TShortHashSet
 */
import gnu.trove.iterator.TShortIterator;
import gnu.trove.set.hash.TShortHashSet;

/*
 * Renamed from eYk
 */
public enum eyk_1 {
    a(new short[0]),
    b(106),
    c(226, 761, 758),
    d(109, 611, 582),
    e(385),
    f(735),
    g(733);

    private final TShortHashSet h = new TShortHashSet();

    private eyk_1(short ... sArray) {
        this.h.addAll(sArray);
    }

    public boolean a(exq_1 exq_12) {
        if (this == a) {
            return true;
        }
        if (this.h.contains(exq_12.d())) {
            return true;
        }
        Object ItemType = exq_12.f();
        return ItemType != null && this.a((exq_1)ItemType);
    }

    public TShortIterator a() {
        return this.h.iterator();
    }
}

