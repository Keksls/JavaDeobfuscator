/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Wg
implements Wf<vl_0> {
    public static final int a = 0;
    final TShortObjectHashMap<List<vl_0>> b = new TShortObjectHashMap();
    final TShortObjectHashMap<List<vl_0>> c = new TShortObjectHashMap();
    private final TLongHashSet d = new TLongHashSet();

    public VW a(vl_0 vl_02, vx_0 vx_02, boolean bl, boolean bl2, short s2) {
        boolean bl3 = !bl2 && !bl;
        short s3 = (short)(s2 + (bl3 ? (short)1 : 0) + vx_02.e());
        short s4 = (short)(s2 + (bl3 ? (short)1 : 0));
        if (vx_02.d()) {
            s3 = (short)(s3 - 1);
        }
        if (bl && vx_02.b()) {
            s3 = (short)(s3 + 1);
        }
        s3 = (short)Math.max(s4, s3);
        if (vx_02.d()) {
            this.a(vl_02, s3, this.c);
        } else {
            this.a(vl_02, s3, this.b);
        }
        vl_02.a(this);
        return VW.a(vl_02.a()).b(s3).a(vx_02.d());
    }

    void a(vl_0 vl_02, short s2, TShortObjectHashMap<List<vl_0>> tShortObjectHashMap) {
        ArrayList<vl_0> arrayList = (ArrayList<vl_0>)tShortObjectHashMap.get(s2);
        if (arrayList == null) {
            arrayList = new ArrayList<vl_0>();
            tShortObjectHashMap.put(s2, arrayList);
        }
        arrayList.add(vl_02);
    }

    public void a(long l, short s2, va_0 va_02) {
        List list = (List)this.b.get(s2);
        if (list == null) {
            return;
        }
        this.a(l, va_02, list);
    }

    public void b(long l, short s2, va_0 va_02) {
        List list = (List)this.c.get(s2);
        if (list == null) {
            return;
        }
        this.a(l, va_02, list);
    }

    void a(long l, va_0 va_02, List<vl_0> list) {
        ArrayList<vl_0> arrayList = new ArrayList<vl_0>(list);
        Iterator<vl_0> iterator = arrayList.iterator();
        while (va_02.ai_() && iterator.hasNext()) {
            vl_0 vl_02 = iterator.next();
            if (l != 0L && vl_02.a() != l || !list.contains(vl_02)) continue;
            iterator.remove();
            va_02.a(vl_02);
            this.b(vl_02);
        }
    }

    private void a(va_0 va_02, List<vl_0> list) {
        this.a(0L, va_02, list);
    }

    @Override
    public void a(vl_0 vl_02) {
        this.b(vl_02);
    }

    private void b(vl_0 vl_02) {
        this.b.forEachValue((TObjectProcedure)new Wh(this, vl_02));
        this.c.forEachValue((TObjectProcedure)new Wi(this, vl_02));
    }

    private void e() {
        this.a(this.b);
        this.a(this.c);
    }

    public void a() {
        this.c.clear();
        this.b.clear();
    }

    @Override
    public void a(long l) {
        this.d.add(l);
    }

    public void b(long l) {
        this.d.remove(l);
    }

    public void a(short s2, va_0 va_02) {
        this.b(s2, va_02);
        this.c(s2, va_02);
        this.e();
    }

    private void b(short s2, va_0 va_02) {
        this.d.forEach((TLongProcedure)new Wj(this, s2, va_02));
    }

    private void c(short s2, va_0 va_02) {
        List list;
        int n = s2 - 1;
        List list2 = (List)this.b.get((short)n);
        if (list2 != null) {
            this.a(va_02, list2);
        }
        if ((list = (List)this.c.get((short)n)) != null) {
            this.a(va_02, list);
        }
    }

    @Override
    private void a(TShortObjectHashMap<List<vl_0>> tShortObjectHashMap) {
        TShortObjectIterator tShortObjectIterator = tShortObjectHashMap.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            List list = (List)tShortObjectIterator.value();
            if (!list.isEmpty()) continue;
            tShortObjectIterator.remove();
        }
    }

    public TLongHashSet b() {
        return this.d;
    }

    TShortObjectHashMap<List<vl_0>> c() {
        return this.b;
    }

    TShortObjectHashMap<List<vl_0>> d() {
        return this.c;
    }
}

