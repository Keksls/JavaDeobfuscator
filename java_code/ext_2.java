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
import org.apache.log4j.Logger;

/*
 * Renamed from eXt
 */
public abstract class ext_2<IT extends exx_2, MI extends exs_2> {
    protected static final Logger a = Logger.getLogger(ext_2.class);
    private final eqa_2 d = new eqa_2(200, 30, 10, 6);
    protected final TLongObjectHashMap<MI> b = new TLongObjectHashMap();
    protected final ArrayList<eyi_2> c = new ArrayList(1);
    final Uo e = new exu_2(this);

    protected ext_2() {
        this.a(new exv_1(this));
    }

    public final eqa_2 d() {
        return this.d;
    }

    public final void a(eyi_2 eyi_22) {
        if (!this.c.contains(eyi_22)) {
            this.c.add(eyi_22);
        }
    }

    public final void b(eyi_2 eyi_22) {
        this.c.remove(eyi_22);
    }

    public final void a(MI MI) {
        this.b.put(((exs_2)MI).r(), MI);
        for (eyi_2 eyi_22 : this.c) {
            eyi_22.a((exs_2)MI);
        }
    }

    public final void b(MI MI) {
        this.a(((exs_2)MI).r());
    }

    public final void a(long l) {
        exs_2 exs_22 = (exs_2)this.b.remove(l);
        for (eyi_2 eyi_22 : this.c) {
            eyi_22.b(exs_22);
        }
    }

    public final void a(TObjectProcedure<MI> tObjectProcedure) {
        if (!this.b.isEmpty()) {
            this.b.forEachValue(tObjectProcedure);
        }
    }

    public final TLongObjectIterator<MI> e() {
        return this.b.iterator();
    }

    public final int f() {
        return this.b.size();
    }

    public final void g() {
        this.d.g();
        this.b.forEachValue((TObjectProcedure)new exw_2(this));
        this.b.clear();
    }

    public final MI b(long l) {
        return (MI)((exs_2)this.b.get(l));
    }

    public final abo_2<MI, IT> c(long l) {
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exx_2 exx_22 = (exx_2)((exs_2)tLongObjectIterator.value()).e(l);
            if (exx_22 == null) continue;
            return new abo_2<exs_2, exx_2>((exs_2)tLongObjectIterator.value(), exx_22);
        }
        return null;
    }

    public final boolean b(int n) {
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (!((TO)((exs_2)tLongObjectIterator.value())).b(n)) continue;
            return true;
        }
        return false;
    }

    public final abo_2<MI, IT> d(long l) {
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exx_2 exx_22 = (exx_2)((exs_2)tLongObjectIterator.value()).c(l);
            if (exx_22 == null) continue;
            return new abo_2<exs_2, exx_2>((exs_2)tLongObjectIterator.value(), exx_22);
        }
        return null;
    }

    public final int h() {
        int n = 0;
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            n += ((exs_2)tLongObjectIterator.value()).b();
        }
        return n;
    }

    public final int i() {
        int n = 0;
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            n += ((exs_2)tLongObjectIterator.value()).k();
        }
        return n;
    }

    public final abo_2<Long, Short> e(long l) {
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            short s2 = ((exs_2)tLongObjectIterator.value()).b(l);
            if (s2 == -1) continue;
            return new abo_2<Long, Short>(((exs_2)tLongObjectIterator.value()).r(), s2);
        }
        return null;
    }

    public final boolean j() {
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (!((exs_2)tLongObjectIterator.value()).n()) continue;
            return true;
        }
        return false;
    }

    public short k() {
        short s2;
        TLongObjectIterator tLongObjectIterator = this.b.iterator();
        int s22 = Short.MAX_VALUE;
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            short s3 = ((exs_2)tLongObjectIterator.value()).s();
            if (s3 >= s2) continue;
            s2 = s3;
        }
        return s2;
    }
}

