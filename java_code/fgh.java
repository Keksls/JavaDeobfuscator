/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.TestOnly
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.TestOnly;

public class fgh {
    public static final fgh a = new fgh();
    private final TIntObjectHashMap<fge> c = new TIntObjectHashMap();
    private final TIntObjectHashMap<fge> d = new TIntObjectHashMap();
    private Map<Integer, Integer> e;

    private fgh() {
    }

    public void a(fge fge2, int n) {
        this.c.put(fge2.b(), (Object)fge2);
        assert (!this.d.contains(n));
        this.d.put(n, (Object)fge2);
        this.e = null;
    }

    public fge a(int n) {
        return (fge)this.c.get(n);
    }

    public fge b(int n) {
        return (fge)this.d.get(n);
    }

    public int c(int n) {
        TIntObjectIterator tIntObjectIterator = this.d.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fge fge2 = (fge)tIntObjectIterator.value();
            if (fge2.b() != n) continue;
            return tIntObjectIterator.key();
        }
        return 0;
    }

    public String toString() {
        return "PetDefinitionManager{m_petDefinitions=" + this.c.size() + "}";
    }

    public boolean d(int n) {
        if (this.e == null) {
            this.e = this.b();
        }
        return this.e.containsKey(n);
    }

    public Optional<fge> e(int n) {
        Integer n2;
        if (this.e == null) {
            this.e = this.b();
        }
        if ((n2 = this.e.get(n)) == null || n2 < 0) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.a(n2));
    }

    private Map<Integer, Integer> b() {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        this.c.forEachValue(fge2 -> {
            for (int n : fge2.l()) {
                hashMap.put(n, fge2.b());
            }
            return true;
        });
        return hashMap;
    }

    public boolean a(TObjectProcedure<? super fge> tObjectProcedure) {
        return this.c.forEachValue(tObjectProcedure);
    }

    @TestOnly
    public void a() {
        this.c.clear();
        this.d.clear();
        if (this.e != null) {
            this.e.clear();
        }
    }
}

