/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from aeP
 */
public class aep_0 {
    protected static final Logger a = Logger.getLogger(aep_0.class);
    public TIntObjectHashMap<TIntHashSet> b;

    public void a() {
        this.b = new TIntObjectHashMap();
    }

    public void b() {
        if (this.b != null) {
            this.b.clear();
        }
    }

    public void a(int n, int n2, int n3) {
        int n4;
        TIntHashSet tIntHashSet = (TIntHashSet)this.b.get(n);
        if (tIntHashSet == null) {
            tIntHashSet = new TIntHashSet();
            this.b.put(n, (Object)tIntHashSet);
        }
        if (!tIntHashSet.contains(n4 = aep_0.a(n2, n3))) {
            tIntHashSet.add(n4);
        }
    }

    public TIntHashSet a(int n) {
        if (this.b != null) {
            return (TIntHashSet)this.b.get(n);
        }
        return null;
    }

    public static int a(int n, int n2) {
        return Hw.d(n, n2);
    }

    public static short b(int n) {
        return Hw.b(n);
    }

    public static short c(int n) {
        return Hw.c(n);
    }

    public void a(arf_1 arf_12) {
        int n = arf_12.c();
        this.b = new TIntObjectHashMap(n);
        for (int k = 0; k < n; ++k) {
            int n2 = arf_12.c();
            int n3 = arf_12.c();
            if (n3 == 0) continue;
            TIntHashSet tIntHashSet = new TIntHashSet(n3);
            this.b.put(n2, (Object)tIntHashSet);
            for (int i2 = 0; i2 < n3; ++i2) {
                tIntHashSet.add(arf_12.c());
            }
        }
    }

    public void a(gk_0 gk_02) {
        try {
            gk_02.a(this.b.size());
            if (!this.b.isEmpty()) {
                this.b.forEachEntry((TIntObjectProcedure)new aeq_0(this, gk_02));
            }
        }
        catch (IOException iOException) {
            a.error((Object)"IOException during save", (Throwable)iOException);
        }
    }
}

