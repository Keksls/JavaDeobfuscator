/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.apache.log4j.Logger;

public final class eBo {
    private static final Logger b = Logger.getLogger(eBo.class);
    public static final eBo a = new eBo();
    private final TLongObjectHashMap<TLongObjectHashMap<eBt>> c = new TLongObjectHashMap();
    private final TLongObjectHashMap<eBt> d = new TLongObjectHashMap();
    private final Set<Integer> e = new HashSet<Integer>();
    private final List<eBs> f = new ArrayList<eBs>();

    private eBo() {
    }

    public void a(long l, eBt eBt2) {
        if (eBt2.f() != l) {
            throw new IllegalArgumentException("le companion " + eBt2 + " doit avoir le bon ownerId : " + l);
        }
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.c.get(l);
        if (tLongObjectHashMap == null) {
            tLongObjectHashMap = new TLongObjectHashMap();
            this.c.put(l, (Object)tLongObjectHashMap);
        }
        tLongObjectHashMap.put(eBt2.b(), (Object)eBt2);
        this.d.put(eBt2.b(), (Object)eBt2);
        this.b(eBt2);
    }

    public List<eBt> a(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.c.get(l);
        if (tLongObjectHashMap == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<eBt> arrayList = new ArrayList<eBt>();
        tLongObjectHashMap.forEachValue((TObjectProcedure)new eBp(this, arrayList));
        return arrayList;
    }

    public TLongObjectHashMap<eBt> b(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.c.get(l);
        if (tLongObjectHashMap == null) {
            return new TLongObjectHashMap();
        }
        return tLongObjectHashMap;
    }

    public eBt a(long l, long l2) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.c.get(l);
        if (tLongObjectHashMap == null) {
            return null;
        }
        return (eBt)tLongObjectHashMap.get(l2);
    }

    public eBt c(long l) {
        return (eBt)this.d.get(l);
    }

    public eBt a(long l, int n) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.c.get(l);
        if (tLongObjectHashMap == null) {
            return null;
        }
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            eBt eBt2 = (eBt)tLongObjectIterator.value();
            if (eBt2.a() != n) continue;
            return eBt2;
        }
        return null;
    }

    public boolean b(long l, int n) {
        eBt eBt2 = this.a(l, n);
        return eBt2 != null && eBt2.i();
    }

    public void d(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.c.remove(l);
        if (tLongObjectHashMap != null) {
            TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.d.remove(tLongObjectIterator.key());
            }
        }
    }

    public boolean b(long l, long l2) {
        boolean bl;
        this.d.remove(l2);
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.c.get(l);
        if (tLongObjectHashMap == null) {
            return false;
        }
        eBt eBt2 = (eBt)tLongObjectHashMap.remove(l2);
        boolean bl2 = bl = eBt2 != null;
        if (bl) {
            this.a(eBt2);
        }
        return bl;
    }

    public List<eBt> e(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.c.get(l);
        if (tLongObjectHashMap == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<eBt> arrayList = new ArrayList<eBt>();
        tLongObjectHashMap.forEachValue((TObjectProcedure)new eBq(this, arrayList));
        return arrayList;
    }

    public void a(int n) {
        this.e.add(n);
    }

    public void b(int n) {
        this.e.remove(n);
    }

    public boolean c(int n) {
        return this.e.contains(n);
    }

    private void a(eBt eBt2) {
        for (eBs eBs2 : this.f) {
            try {
                eBs2.a(eBt2);
            }
            catch (Exception exception) {
                b.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void b(eBt eBt2) {
        for (eBs eBs2 : this.f) {
            try {
                eBs2.b(eBt2);
            }
            catch (Exception exception) {
                b.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void a(eBs eBs2) {
        if (!this.f.contains(eBs2)) {
            return;
        }
        this.f.remove(eBs2);
    }

    public void b(eBs eBs2) {
        if (this.f.contains(eBs2)) {
            return;
        }
        this.f.add(eBs2);
    }

    public eBt c(long l, long l2) {
        List<eBt> list = this.a(l);
        for (eBt eBt2 : list) {
            if (!eBt2.h().d(l2)) continue;
            return eBt2;
        }
        return null;
    }

    public Optional<eBt> c(long l, int n) {
        List<eBt> list = this.a(l);
        for (eBt eBt2 : list) {
            if (!eBt2.h().b(n)) continue;
            return Optional.of(eBt2);
        }
        return Optional.empty();
    }
}

