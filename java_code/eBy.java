/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;

public final class eBy {
    public static final eBy a = new eBy();
    private final TLongHashSet b = new TLongHashSet();

    private eBy() {
    }

    public void a(long l) {
        if (this.b.contains(l)) {
            this.b.remove(l);
        } else {
            this.b.add(l);
        }
    }

    public boolean b(long l) {
        return this.b.contains(l);
    }
}

