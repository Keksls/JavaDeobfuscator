/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;

public abstract class TJ<ContentType extends ts_0>
implements TP<ContentType> {
    protected boolean a;
    protected final TLongObjectHashMap<ContentType> b = new TLongObjectHashMap();
    private long c;
    private final List<tq_0> d = new ArrayList<tq_0>();

    @Override
    public ContentType a(long l) {
        return (ContentType)((ts_0)this.b.get(l));
    }

    public boolean b(long l) {
        return this.b.containsKey(l);
    }

    @Override
    public void a(long l, ContentType ContentType) {
        this.b.put(l, ContentType);
    }

    @Override
    public void c(long l) {
        this.b.remove(l);
    }

    @Override
    public int a() {
        return this.b.size();
    }

    @Override
    public boolean b() {
        return this.b.isEmpty();
    }

    @Override
    public TLongObjectIterator<ContentType> c() {
        return this.b.iterator();
    }

    @Override
    public void d() {
        this.c = 0L;
        this.b.forEachValue((TObjectProcedure)ud_0.a);
        this.b.clear();
    }

    @Override
    public boolean e() {
        return this.a;
    }

    @Override
    public void a(boolean bl) {
        this.a = bl;
        this.k();
    }

    public long f() {
        return this.c;
    }

    public void d(long l) {
        this.c = l;
    }

    private void k() {
        for (int k = 0; k < this.d.size(); ++k) {
            this.d.get(k).a(this);
        }
    }

    public boolean a(tq_0 tq_02) {
        return !this.d.contains(tq_02) && this.d.add(tq_02);
    }

    public boolean b(tq_0 tq_02) {
        return this.d.remove(tq_02);
    }
}

