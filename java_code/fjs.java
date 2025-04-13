/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.google.common.collect.ImmutableList;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class fjs {
    public static final fjs a = new fjs();
    private final Set<Integer> b = new HashSet<Integer>();
    private final TLongObjectHashMap<fjE> c = new TLongObjectHashMap();
    private final TLongObjectHashMap<fjF> d = new TLongObjectHashMap();
    private final TLongObjectHashMap<fjD> e = new TLongObjectHashMap();
    private final TLongObjectHashMap<fjA> f = new TLongObjectHashMap();
    private final TLongObjectHashMap<fjw> g = new TLongObjectHashMap();
    private final TLongObjectHashMap<fjx> h = new TLongObjectHashMap();
    private final TLongObjectHashMap<fjy> i = new TLongObjectHashMap();

    public <Info extends fjB> Info a(fjv fjv2, long l) {
        switch (fjv2) {
            case a: {
                return (Info)((fjB)this.c.get(l));
            }
            case b: {
                return (Info)((fjB)this.f.get(l));
            }
            case d: {
                return (Info)((fjB)this.g.get(l));
            }
            case c: {
                return (Info)((fjB)this.i.get(l));
            }
        }
        throw new IllegalArgumentException("Type de transport inconnu " + fjv2);
    }

    public void a(fjy fjy2) {
        this.i.put(fjy2.e(), (Object)fjy2);
    }

    public void a(fjw fjw2) {
        this.g.put(fjw2.e(), (Object)fjw2);
    }

    public fjx a(fjx fjx2) {
        if (!this.g.containsKey((long)fjx2.b()) || !this.g.containsKey((long)fjx2.c())) {
            throw new IllegalArgumentException("We can't add a link between boats if they don't exist, start : " + fjx2.b() + ", end : " + fjx2.c());
        }
        this.h.put(fjx2.a(), (Object)fjx2);
        return fjx2;
    }

    public List<fjx> a(long l, long l2) {
        return this.h.valueCollection().stream().filter(fjx2 -> {
            int n = fjx2.b();
            int n2 = fjx2.c();
            if ((long)n == l && (long)n2 == l2) {
                return true;
            }
            return (long)n == l2 && (long)n2 == l;
        }).collect(Collectors.toList());
    }

    public fjx a(long l) {
        return (fjx)this.h.get(l);
    }

    public void a(TObjectProcedure<fjx> tObjectProcedure) {
        this.h.forEachValue(tObjectProcedure);
    }

    public void a(fjA fjA2) {
        this.f.put(fjA2.e(), (Object)fjA2);
    }

    public fjA b(long l) {
        return (fjA)this.f.get(l);
    }

    public fjF b(long l, long l2) {
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fjF fjF2 = (fjF)tLongObjectIterator.value();
            int n = fjF2.b();
            int n2 = fjF2.c();
            if (((long)n != l || (long)n2 != l2) && ((long)n != l2 || (long)n2 != l)) continue;
            return fjF2;
        }
        throw new IllegalArgumentException("Impossible de trouver un lien entre les zaaps " + l + " et " + l2);
    }

    public void a(fjE fjE2, boolean bl) {
        this.c.put(fjE2.e(), (Object)fjE2);
        if (bl) {
            this.b.add((int)fjE2.e());
        }
    }

    public void a(fjF fjF2) {
        if (!this.c.containsKey((long)fjF2.b()) || !this.c.containsKey((long)fjF2.c())) {
            throw new IllegalArgumentException("Impossible de rajouter un liens entre deux zaaps si ces zaaps n'existent pas");
        }
        this.d.put(fjF2.a(), (Object)fjF2);
    }

    public void a(fjD fjD2) {
        this.e.put((long)fjD2.a(), (Object)fjD2);
    }

    public void a(fjE fjE2) {
        fjD fjD2 = (fjD)this.e.get((long)fjE2.k());
        if (fjD2 == null) {
            throw new IllegalArgumentException("Impossible de trouver la categorie " + fjE2.k() + " pour le zaap " + fjE2.e());
        }
        fjD2.c().add(fjE2);
    }

    public List<fjD> a() {
        return ImmutableList.copyOf((Object[])((fjD[])this.e.values((Object[])new fjD[this.e.size()])));
    }

    public fjD c(long l) {
        return (fjD)this.e.get(l);
    }

    public void b() {
        TLongObjectIterator tLongObjectIterator = this.c.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            TLongObjectIterator tLongObjectIterator2 = this.c.iterator();
            while (tLongObjectIterator2.hasNext()) {
                tLongObjectIterator2.advance();
                if (tLongObjectIterator.key() == tLongObjectIterator2.key() || this.b(tLongObjectIterator.key(), tLongObjectIterator2.key()) != null) continue;
                throw new IllegalArgumentException("Impossible de trouver un lien entre les zaaps " + tLongObjectIterator.key() + " et " + tLongObjectIterator2.key());
            }
        }
    }

    public Set<Integer> c() {
        return this.b;
    }
}

