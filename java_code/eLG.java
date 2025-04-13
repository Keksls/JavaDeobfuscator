/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 */
import gnu.trove.iterator.TLongIterator;

public final class eLG {
    private eLG() {
    }

    public static boolean a(long l) {
        TLongIterator tLongIterator = euw_2.a.e(l).iterator();
        while (tLongIterator.hasNext()) {
            if (!Ua.a().c(tLongIterator.next())) continue;
            return true;
        }
        return false;
    }
}

