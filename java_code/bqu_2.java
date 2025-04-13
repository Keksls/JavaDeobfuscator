/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqu
 */
public class bqu_2
implements ajh_1 {
    public static final String a = "haveResurrectItem";

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "haveResurrectItem": {
                return this.a();
            }
        }
        return null;
    }

    private boolean a() {
        TLongHashSet tLongHashSet = euw_2.a.e(azu_0.j().k().U_());
        if (tLongHashSet == null) {
            return false;
        }
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            ts_0 ts_02;
            bnh_1 bnh_12 = (bnh_1)euw_2.a.d(tLongIterator.next());
            if (bnh_12 == null || (ts_02 = bnh_12.dS().d(9247)) == null) continue;
            return true;
        }
        return false;
    }
}

