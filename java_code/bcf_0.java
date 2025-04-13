/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;

/*
 * Renamed from bcf
 */
public final class bcf_0
extends ban {
    private static final bwi_0 f = new bwi_0();
    private TLongHashSet g;

    public bcf_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected long o() {
        Object object;
        TLongIterator tLongIterator = this.g.iterator();
        StringBuilder stringBuilder = null;
        while (tLongIterator.hasNext()) {
            object = this.d(tLongIterator.next());
            if (object == null) continue;
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder();
            }
            stringBuilder.append(((epq_2)object).dp());
            if (!tLongIterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        if (stringBuilder == null) {
            return 0L;
        }
        object = new StringBuilder(bae.h().a("fight.waiting.for", new Object[0]));
        ((StringBuilder)object).append((CharSequence)stringBuilder);
        f.b(object);
        return 0L;
    }

    public void a(TLongHashSet tLongHashSet) {
        this.g = tLongHashSet;
    }
}

