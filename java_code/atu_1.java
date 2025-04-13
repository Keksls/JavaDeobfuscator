/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from atU
 */
public class atu_1 {
    public static final atu_1 a = new atw_1();
    private boolean c = true;
    private boolean d;
    private boolean e = true;
    final ArrayList<FR> f = new ArrayList(1);
    private final ArrayList<Anm> g = new ArrayList(4);
    private final ArrayList<ato_2> h = new ArrayList(4);
    private final TIntObjectHashMap<ato_2> i = new TIntObjectHashMap();
    private int j;
    private final TObjectProcedure<ato_2> k = new atv_2();
    private final TObjectProcedure<ato_2> l = new atx_1(this);

    protected final boolean a() {
        return !this.g.isEmpty() || !this.h.isEmpty() || !this.i.isEmpty() || this.j != 0;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean c() {
        return !this.h.isEmpty();
    }

    final ato_2 a(int n) {
        return (ato_2)this.i.get(n);
    }

    public boolean d() {
        if (this.c) {
            this.c = false;
            this.d = false;
            this.d = !this.i.isEmpty() && !this.i.forEachValue(this.k);
        }
        return this.d;
    }

    public ArrayList<FR> e() {
        if (this.e) {
            this.e = false;
            this.f.clear();
            this.i.forEachValue(this.l);
        }
        return this.f;
    }

    public void f() {
        for (int k = this.g.size() - 1; k >= 0; --k) {
            atu_1.b(this.g.get(k));
        }
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.f.clear();
        this.e = true;
        this.d = false;
        this.c = true;
        this.j = 0;
    }

    boolean a(@NotNull Anm anm, TIntHashSet tIntHashSet) {
        return this.a(anm, tIntHashSet, null);
    }

    boolean a(@NotNull Anm anm, TIntHashSet tIntHashSet, TIntHashSet tIntHashSet2) {
        this.a(anm);
        ++this.j;
        if (tIntHashSet == null) {
            return this.a(anm, this.j, tIntHashSet2);
        }
        boolean bl = false;
        if (anm.f()) {
            List<gc_0> list = anm.c().f().b();
            for (gc_0 gc_02 : list) {
                int n = gc_02.c();
                if (tIntHashSet2 != null && tIntHashSet2.contains(gc_02.d()) || n == 0 || !tIntHashSet.contains(gc_02.d())) continue;
                this.a(n, new ato_2(n, anm, gc_02, this.j));
                bl = true;
                this.a(gc_02.d(), this.j);
            }
        } else {
            for (int n : tIntHashSet) {
                if (tIntHashSet2 != null && tIntHashSet2.contains(n)) continue;
                this.h.add(new ato_2(n, anm, null, this.j));
            }
        }
        return bl;
    }

    private void a(int n, int n2) {
        for (int k = this.h.size() - 1; k >= 0; --k) {
            ato_2 ato_22 = this.h.get(k);
            if (ato_22.a != n || ato_22.d >= n2) continue;
            this.h.remove(k);
        }
    }

    boolean b(Anm anm, TIntHashSet tIntHashSet) {
        boolean bl = false;
        TIntObjectIterator tIntObjectIterator = this.i.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ato_2 ato_22 = (ato_2)tIntObjectIterator.value();
            if (tIntHashSet == null) {
                if (ato_22.b != anm) continue;
                tIntObjectIterator.remove();
                bl = true;
                continue;
            }
            if (!tIntHashSet.contains(ato_22.c.d()) || ato_22.b != anm) continue;
            tIntObjectIterator.remove();
            bl = true;
        }
        int n = 0;
        while (n < this.h.size()) {
            ato_2 ato_23 = this.h.get(n);
            if (tIntHashSet == null) {
                if (ato_23.b == anm) {
                    this.h.remove(n);
                    bl = true;
                    continue;
                }
                ++n;
                continue;
            }
            if (tIntHashSet.contains(ato_23.a) && ato_23.b == anm) {
                this.h.remove(n);
                bl = true;
                continue;
            }
            ++n;
        }
        this.e = true;
        this.c = true;
        return bl && this.i();
    }

    boolean g() {
        boolean bl = false;
        int n = 0;
        while (n < this.h.size()) {
            ato_2 ato_22 = this.h.get(n);
            int n2 = ato_22.a;
            Anm anm = ato_22.b;
            if (anm.f()) {
                bl = true;
                boolean bl2 = false;
                if (n2 == 0) {
                    this.a(anm, ato_22.d, ato_22.e);
                } else {
                    List<gc_0> list = anm.c().f().b();
                    for (gc_0 gc_02 : list) {
                        if (gc_02 == null || gc_02.c() == 0 || gc_02.d() != n2) continue;
                        bl2 = true;
                        this.a(gc_02.c(), new ato_2(n2, anm, gc_02, ato_22.d));
                    }
                }
                this.h.remove(ato_22);
                if (!bl2) continue;
                this.a(n2, ato_22.d);
                continue;
            }
            if (anm.a()) {
                this.h.remove(n);
                continue;
            }
            ++n;
        }
        if (this.h.isEmpty()) {
            this.j = 0;
        }
        return bl;
    }

    private void a(int n, ato_2 ato_22) {
        this.i.put(n, (Object)ato_22);
        this.e = true;
        this.c = true;
    }

    private void a(@NotNull Anm anm) {
        int n = this.g.size();
        for (int k = 0; k < n; ++k) {
            if (this.g.get(k) != anm) continue;
            return;
        }
        anm.k_();
        this.g.add(anm);
    }

    private static void b(@NotNull Anm anm) {
        assert (anm.aw() > 0);
        anm.u();
    }

    private boolean i() {
        boolean bl = false;
        int n = 0;
        while (n < this.g.size()) {
            Anm anm = this.g.get(n);
            if (this.c(anm)) {
                ++n;
                continue;
            }
            this.g.remove(n);
            atu_1.b(anm);
            bl = true;
        }
        return bl;
    }

    private boolean c(Anm anm) {
        TIntObjectIterator tIntObjectIterator = this.i.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (((ato_2)tIntObjectIterator.value()).b != anm) continue;
            return true;
        }
        int n = this.h.size();
        for (int k = 0; k < n; ++k) {
            if (this.h.get((int)k).b != anm) continue;
            return true;
        }
        return false;
    }

    boolean a(Anm anm, int n, TIntHashSet tIntHashSet) {
        ++this.j;
        boolean bl = false;
        if (anm.f()) {
            List<gc_0> list = anm.c().f().b();
            for (gc_0 gc_02 : list) {
                int n2 = gc_02.c();
                if (tIntHashSet != null && tIntHashSet.contains(gc_02.d())) continue;
                if (gc_02.b() != null) {
                    ato_2 ato_22 = (ato_2)this.i.get(n2);
                    if (ato_22 == null || ato_22.d < n) {
                        this.a(n2, new ato_2(n2, anm, gc_02, this.j));
                    }
                    this.a(gc_02.d(), this.j);
                }
                bl = true;
            }
        } else {
            this.h.add(new ato_2(0, anm, null, this.j, tIntHashSet));
        }
        return bl;
    }

    boolean a(Anm anm, int n) {
        return this.a(anm, n, null);
    }

    atu_1 h() {
        int n;
        atu_1 atu_12 = new atu_1();
        int n2 = this.g.size();
        atu_12.g.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            Anm anm = this.g.get(n);
            anm.k_();
            atu_12.g.add(anm);
        }
        n = this.h.size();
        atu_12.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            atu_12.h.add(new ato_2(this.h.get(k)));
        }
        TIntObjectIterator tIntObjectIterator = this.i.iterator();
        atu_12.i.ensureCapacity(this.i.size());
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            atu_12.i.put(tIntObjectIterator.key(), (Object)((ato_2)tIntObjectIterator.value()));
        }
        atu_12.j = this.j;
        atu_12.e = true;
        atu_12.c = true;
        return atu_12;
    }
}

