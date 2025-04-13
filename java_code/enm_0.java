/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.apache.log4j.Logger;

/*
 * Renamed from eNm
 */
public class enm_0<F extends epq_2> {
    private final TLongObjectHashMap<enr_0> a = new TLongObjectHashMap();
    private final TLongObjectHashMap<F> b = new TLongObjectHashMap();
    private static final Logger c = Logger.getLogger(enm_0.class);

    private enr_0 u(epq_2 epq_22) {
        if (epq_22 == null) {
            return new env_2(null);
        }
        enr_0 enr_02 = (enr_0)this.a.get(epq_22.a_());
        return enr_02 == null ? new env_2(epq_22) : enr_02;
    }

    public TLongObjectHashMap<enr_0> a() {
        return new TLongObjectHashMap(this.a);
    }

    public void a(F f2, byte by, boolean bl, F f3) {
        if (f2 == null) {
            c.error((Object)("[FIGHT] fighter cannot be null - " + aho_2.a()));
            return;
        }
        if (!this.a(f3, "controller")) {
            return;
        }
        if (this.i(f2)) {
            c.error((Object)String.format("[FIGHT] On ajoute le fighter %d d\u00e9j\u00e0 pr\u00e9sent -> r\u00e9initialisation de son \u00e9tat.", ((epq_2)f2).a_()));
        }
        this.a.put(((epq_2)f2).a_(), (Object)this.a(by, bl, f3));
        this.b.put(((epq_2)f2).a_(), f2);
    }

    public void a(long l, enr_0 enr_02) {
        this.a.put(l, (Object)enr_02);
    }

    private enr_0 a(byte by, boolean bl, F f2) {
        return new enr_0(by, !this.b(by), bl, ((epq_2)f2).a_());
    }

    public boolean a(F f2) {
        return this.u((epq_2)f2).a(enq_0.b);
    }

    public boolean b(F f2) {
        return this.u((epq_2)f2).a(enq_0.c);
    }

    public boolean c(F f2) {
        return this.u((epq_2)f2).a(enq_0.d);
    }

    public void d(F f2) {
        Collection<F> collection;
        if (!this.i(f2)) {
            c.error((Object)String.format("[FIGHT] removeFighter sur un fighter absent %d - %s", ((epq_2)f2).a_(), aho_2.a(10)));
            return;
        }
        enr_0 enr_02 = (enr_0)this.a.remove(((epq_2)f2).a_());
        this.b.remove(((epq_2)f2).a_());
        if (enr_02.h() && !(collection = this.b(enw_2.c(enr_02.e()))).isEmpty()) {
            this.u((epq_2)collection.iterator().next()).a(true);
        }
    }

    public boolean e(epq_2 epq_22) {
        return this.u(epq_22).a();
    }

    public enq_0 f(epq_2 epq_22) {
        return this.u(epq_22).d();
    }

    public boolean g(epq_2 epq_22) {
        return this.u(epq_22).b();
    }

    public boolean h(epq_2 epq_22) {
        return this.u(epq_22).c();
    }

    public F a(long l) {
        return (F)((epq_2)this.b.get(l));
    }

    public boolean i(F f2) {
        if (f2 == null) {
            return false;
        }
        return this.a.contains(((epq_2)f2).a_());
    }

    public boolean j(epq_2 epq_22) {
        return this.u(epq_22).g();
    }

    public void a(F f2, F f3) {
        if (!this.a(f3, "controller")) {
            return;
        }
        if (!this.a(f2, "controlled")) {
            return;
        }
        enr_0 enr_02 = this.u((epq_2)f2);
        long l = ((epq_2)f3).a_();
        enr_02.a(l, ((epq_2)f3).Y());
    }

    public void k(F f2) {
        if (!this.a(f2, "controller")) {
            return;
        }
        this.a.forEachValue((TObjectProcedure)new enn_0(this, (epq_2)f2));
    }

    public void l(F f2) {
        if (!this.a(f2, "controlled")) {
            return;
        }
        enr_0 enr_02 = this.u((epq_2)f2);
        if (enr_02 instanceof env_2) {
            return;
        }
        enr_02.a(null, (byte)-1);
    }

    public void m(F f2) {
        if (!this.a(f2, "controlled")) {
            return;
        }
        enr_0 enr_02 = this.u((epq_2)f2);
        enr_02.a(enr_02.i(), enr_02.f());
    }

    public Collection<F> n(F f2) {
        if (!this.a(f2, "controller")) {
            return Collections.emptySet();
        }
        return this.b(enw_2.b(f2));
    }

    public Collection<F> o(F f2) {
        if (!this.a(f2, "controller")) {
            return Collections.emptySet();
        }
        return this.b(enw_2.c(f2));
    }

    public F p(F f2) {
        if (!this.a(f2, "controlled")) {
            return null;
        }
        return this.a(this.u((epq_2)f2).j());
    }

    public F q(F f2) {
        if (!this.a(f2, "controlled")) {
            return null;
        }
        return this.a(this.u((epq_2)f2).i());
    }

    private F a(Long l) {
        return l == null ? null : (F)this.a((long)l);
    }

    private boolean a(F f2, String string) {
        if (f2 == null) {
            c.error((Object)String.format("[FIGHT_CONTROLLERS] %s cannot be null - %s", string, aho_2.a(1, 10)));
            return false;
        }
        return true;
    }

    public Collection<F> a(byte by) {
        return this.b(enw_2.c(by), enw_2.j());
    }

    private boolean b(byte by) {
        return !this.b(enw_2.c(by), enw_2.i()).isEmpty();
    }

    public byte r(epq_2 epq_22) {
        return this.u(epq_22).e();
    }

    public byte s(epq_2 epq_22) {
        return this.u(epq_22).f();
    }

    public void a(epq_2 epq_22, byte by) {
        this.u(epq_22).a(by);
    }

    public boolean t(epq_2 epq_22) {
        return this.u(epq_22).h();
    }

    public F a(enw_2 ... enw_2Array) {
        Collection<F> collection = this.b(enw_2Array);
        if (collection.isEmpty()) {
            return null;
        }
        if (collection.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder("On a plusieurs fighters diff\u00e9rents alors qu'on en attendait un seul ");
            for (enw_2 enw_22 : enw_2Array) {
                stringBuilder.append(enw_22).append(", ");
            }
            if (enw_2Array.length > 0) {
                stringBuilder.setLength(stringBuilder.length() - 2);
            }
            c.error((Object)stringBuilder.toString());
        }
        return (F)((epq_2)collection.iterator().next());
    }

    public Collection<F> b(enw_2 ... enw_2Array) {
        ArrayList arrayList = new ArrayList();
        this.b.forEachValue((TObjectProcedure)new eno_0(this, enw_2Array, arrayList));
        return arrayList;
    }

    boolean a(F f2, enw_2 ... enw_2Array) {
        for (enw_2 enw_22 : enw_2Array) {
            if (enw_22.a((epq_2)f2, this.u((epq_2)f2))) continue;
            return false;
        }
        return true;
    }

    public void b() {
        this.a.clear();
        this.b.clear();
    }
}

