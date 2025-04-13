/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public final class eQb
implements eQf {
    private static final Logger a = Logger.getLogger(eQb.class);
    private final long b;
    private long c = -1L;
    private final TLongObjectHashMap<epl_0> d = new TLongObjectHashMap();
    private final List<eQg> e = new ArrayList<eQg>();

    public eQb(long l) {
        this.b = l;
    }

    @Override
    public long a() {
        return this.c;
    }

    @Override
    public void a(long l) {
        long l2 = this.c;
        this.c = l;
        this.a(l2, this.c);
    }

    @Override
    public boolean a(epl_0 epl_02) {
        return epl_02 != null && this.c == epl_02.f();
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public void b(epl_0 epl_02) {
        epl_02.a(this.b);
        this.d.put(epl_02.f(), (Object)epl_02);
        this.e(epl_02);
    }

    @Override
    public boolean b(long l) {
        epl_0 epl_02 = (epl_0)this.d.get(l);
        return epl_02 != null && this.a(epl_02, false, false);
    }

    @Override
    public boolean a(epl_0 epl_02, boolean bl, boolean bl2) {
        if (!this.d.contains(epl_02.f())) {
            return false;
        }
        try {
            if (bl) {
                this.d.remove(epl_02.f());
                this.a(epl_02, bl2);
                epl_02.a(Xc.a(this.b));
                return true;
            }
            if (this.c(epl_02) && this.d.remove(epl_02.f()) != null) {
                this.a(epl_02, bl2);
                epl_02.a(Xc.a(this.b));
                return true;
            }
            return false;
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
            return false;
        }
    }

    @Override
    public boolean c(epl_0 epl_02) {
        return epl_02.i() == this.b && this.d.containsKey(epl_02.f());
    }

    @Override
    public void c() {
        Object[] objectArray = new epl_0[this.d.size()];
        this.d.values(objectArray);
        for (int k = 0; k < objectArray.length; ++k) {
            Object object = objectArray[k];
            this.a((epl_0)object, true, false);
        }
        this.d.clear();
    }

    public int d() {
        return this.d.size();
    }

    @Override
    public TLongObjectHashMap<epl_0> e() {
        return this.d;
    }

    @Override
    public TLongObjectHashMap<epl_0> a(int n) {
        TLongObjectHashMap tLongObjectHashMap = new TLongObjectHashMap();
        this.d.forEachEntry((TLongObjectProcedure)new eQd(n, (TLongObjectHashMap<epl_0>)tLongObjectHashMap));
        return tLongObjectHashMap;
    }

    @Override
    public List<epl_0> d(epl_0 epl_02) {
        long l = epl_02.o();
        return this.c(l);
    }

    @Override
    public List<epl_0> c(long l) {
        TLongObjectHashMap<epl_0> tLongObjectHashMap = this.a(2);
        if (tLongObjectHashMap.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<epl_0> arrayList = new ArrayList<epl_0>();
        tLongObjectHashMap.forEachValue((TObjectProcedure)new eQc(l, arrayList));
        return arrayList;
    }

    @Override
    public List<epl_0> d(long l) {
        TLongObjectHashMap<epl_0> tLongObjectHashMap = this.d;
        if (tLongObjectHashMap.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<epl_0> arrayList = new ArrayList<epl_0>();
        tLongObjectHashMap.forEachValue((TObjectProcedure)new eQc(l, arrayList));
        return arrayList;
    }

    @Override
    public int f() {
        return this.d.size() - this.a(2).size();
    }

    @Override
    public boolean a(String string) {
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            epl_0 epl_02 = (epl_0)tLongObjectIterator.value();
            if (!epl_02.a().equals(string)) continue;
            return true;
        }
        return false;
    }

    @Override
    public epl_0 e(long l) {
        return (epl_0)this.d.get(l);
    }

    @Override
    public boolean f(long l) {
        return this.d.contains(l);
    }

    @Override
    public boolean g() {
        return this.d.isEmpty();
    }

    @Override
    public boolean h() {
        return this.d.size() >= enp_2.a.b(ens_2.bv);
    }

    @Override
    public void a(eQg eQg2) {
        if (this.e.contains(eQg2)) {
            return;
        }
        this.e.add(eQg2);
    }

    @Override
    public void b(eQg eQg2) {
        this.e.remove(eQg2);
    }

    private void a(long l, long l2) {
        ArrayList<eQg> arrayList = new ArrayList<eQg>(this.e);
        for (eQg eQg2 : arrayList) {
            try {
                eQg2.a((eQf)this, l, l2);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void e(epl_0 epl_02) {
        ArrayList<eQg> arrayList = new ArrayList<eQg>(this.e);
        for (eQg eQg2 : arrayList) {
            try {
                eQg2.a(this, epl_02);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void a(epl_0 epl_02, boolean bl) {
        ArrayList<eQg> arrayList = new ArrayList<eQg>(this.e);
        for (eQg eQg2 : arrayList) {
            try {
                eQg2.a((eQf)this, epl_02, bl);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public String toString() {
        return "PartyModel{m_id=" + this.b + ", m_leaderId=" + this.c + ", m_members=" + this.d + ", m_listeners=" + this.e + "}";
    }
}

