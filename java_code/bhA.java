/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class bhA {
    private static final Logger b = Logger.getLogger(bhA.class);
    public static final bhA a = new bhA();
    final TIntObjectHashMap<bhu> c = new TIntObjectHashMap();
    final TIntObjectHashMap<bhu> d = new TIntObjectHashMap();
    private final TIntObjectHashMap<bhD> e = new TIntObjectHashMap();
    private final TIntArrayList f = new TIntArrayList();
    private final TIntArrayList g = new TIntArrayList();

    private bhA() {
        for (xg_0 xg_02 : xg_0.values()) {
            bhD bhD2 = new bhD(xg_02.a(), xg_02.b());
            this.e.put(bhD2.k(), (Object)bhD2);
        }
    }

    public void a(arw_0 arw_02) {
        this.c.put(arw_02.c(), (Object)bhA.c(arw_02));
        this.f.add(arw_02.c());
    }

    public void b(arw_0 arw_02) {
        this.d.put(arw_02.c(), (Object)bhA.c(arw_02));
        this.g.add(arw_02.c());
    }

    private static bhu c(arw_0 arw_02) {
        apc_2 apc_22 = bhA.d(arw_02);
        return new bhu(arw_02.c(), arw_02.f(), arw_02.g(), arw_02.h(), arw_02.e(), arw_02.i(), apc_22);
    }

    private static apc_2 d(arw_0 arw_02) {
        try {
            return eyS.c(arw_02.l());
        }
        catch (Exception exception) {
            b.error((Object)("Error when compiling the emote " + arw_02.c() + " criterion"), (Throwable)exception);
            return null;
        }
    }

    public bhx a(int n) {
        bhu bhu2 = this.c(n);
        return bhu2 != null ? bhu2 : this.b(n);
    }

    public bhD b(int n) {
        return (bhD)this.e.get(n);
    }

    public bhu c(int n) {
        if (this.d.contains(n)) {
            return (bhu)this.d.get(n);
        }
        if (this.c.contains(n)) {
            return (bhu)this.c.get(n);
        }
        return null;
    }

    public bhu a(aZz aZz2) {
        TIntObjectIterator tIntObjectIterator = this.d.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (!aZz2.j().matcher(((bhu)tIntObjectIterator.value()).i).matches()) continue;
            return (bhu)tIntObjectIterator.value();
        }
        tIntObjectIterator = this.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (!aZz2.j().matcher(((bhu)tIntObjectIterator.value()).i).matches()) continue;
            return (bhu)tIntObjectIterator.value();
        }
        return null;
    }

    public bhu a(String string) {
        if (string == null) {
            return null;
        }
        TIntObjectIterator tIntObjectIterator = this.d.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (!string.equalsIgnoreCase(((bhu)tIntObjectIterator.value()).i)) continue;
            return (bhu)tIntObjectIterator.value();
        }
        tIntObjectIterator = this.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (!string.equalsIgnoreCase(((bhu)tIntObjectIterator.value()).i)) continue;
            return (bhu)tIntObjectIterator.value();
        }
        return null;
    }

    public List<bhu> b(String string) {
        ArrayList<bhu> arrayList = new ArrayList<bhu>();
        this.f.forEach((TIntProcedure)new bhB(this, string, arrayList));
        return arrayList;
    }

    public List<bhu> c(String string) {
        ArrayList<bhu> arrayList = new ArrayList<bhu>();
        this.g.forEach((TIntProcedure)new bhC(this, string, arrayList));
        return arrayList;
    }
}

