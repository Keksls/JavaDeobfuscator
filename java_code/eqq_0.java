/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eQq
 */
public final class eqq_0
implements erg_1,
erj_1,
erm_1,
ero_1 {
    private static final Logger b = Logger.getLogger(eqq_0.class);
    private final List<erk_1> c = new ArrayList<erk_1>();
    private long d;
    private String e;
    private long f;
    private String g;
    private String h;
    private short i;
    private final eqs_0 j = new eqs_0();
    private wu_0 k;
    private int l;
    private final TLongObjectHashMap<ern_1> m = new TLongObjectHashMap();
    private final TLongObjectHashMap<erl_1> n = new TLongObjectHashMap();
    private final TIntObjectHashMap<erh_1> o = new TIntObjectHashMap();
    private final eri_1 p = new eri_1();
    private final List<Runnable> q = new ArrayList<Runnable>();

    @Override
    public long a() {
        return this.d;
    }

    @Override
    public long b() {
        long[] lArray = this.m.keys();
        Arrays.sort(lArray);
        return lArray.length > 0 ? lArray[0] : 0L;
    }

    @Override
    public long c() {
        ern_1 ern_12 = (ern_1)this.m.get(this.d());
        TLongObjectIterator tLongObjectIterator = this.m.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ern_1 ern_13 = (ern_1)tLongObjectIterator.value();
            if (ern_13.a() == this.b() || ern_12.d() <= ern_13.d()) continue;
            ern_12 = ern_13;
        }
        return ern_12.a();
    }

    @Override
    public long d() {
        long[] lArray = this.m.keys();
        Arrays.sort(lArray);
        return lArray.length > 1 ? lArray[1] : 0L;
    }

    @Override
    public String e() {
        return this.e;
    }

    @Override
    public long f() {
        return this.f;
    }

    @Override
    public String g() {
        return this.g;
    }

    @Override
    public String h() {
        return this.h;
    }

    @Override
    public short i() {
        return this.i;
    }

    @Override
    public int j() {
        return this.j.a();
    }

    @Override
    public int k() {
        return this.j.b();
    }

    @Override
    public erl_1 a(long l) {
        return (erl_1)this.n.get(l);
    }

    @Override
    public List<erl_1> b(long l) {
        ArrayList<erl_1> arrayList = new ArrayList<erl_1>();
        TLongObjectIterator tLongObjectIterator = this.n.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            erl_1 erl_12 = (erl_1)tLongObjectIterator.value();
            if (erl_12.d() != l) continue;
            arrayList.add(erl_12);
        }
        return arrayList;
    }

    @Override
    public ern_1 c(long l) {
        return (ern_1)this.m.get(l);
    }

    @Override
    public List<ern_1> l() {
        return Collections.unmodifiableList(new ArrayList(this.m.valueCollection()));
    }

    @Override
    public erh_1 a(int n) {
        return (erh_1)this.o.get(n);
    }

    @Override
    public int m() {
        return this.n.size();
    }

    @Override
    public boolean n() {
        return this.m() >= 200 + this.l;
    }

    @Override
    public boolean a(TObjectProcedure<erl_1> tObjectProcedure) {
        return this.n.forEachValue(tObjectProcedure);
    }

    @Override
    public int o() {
        return this.m.size();
    }

    @Override
    public boolean b(TObjectProcedure<ern_1> tObjectProcedure) {
        return this.m.forEachValue(tObjectProcedure);
    }

    @Override
    public int p() {
        return this.o.size();
    }

    @Override
    public boolean c(TObjectProcedure<erh_1> tObjectProcedure) {
        return this.o.forEachValue(tObjectProcedure);
    }

    @Override
    public eri_1 q() {
        return this.p;
    }

    @Override
    public int r() {
        return this.j.d();
    }

    @Override
    public int s() {
        return this.j.c();
    }

    @Override
    public int t() {
        return this.j.e();
    }

    @Override
    public wu_0 u() {
        return this.k;
    }

    void d(long l) {
        this.d = l;
    }

    void a(String string) {
        String string2 = this.e;
        this.e = string;
        this.d(string2);
    }

    void e(long l) {
        this.f = l;
        this.z();
    }

    void b(String string) {
        this.g = string;
        this.A();
    }

    void c(String string) {
        this.h = string;
        this.B();
    }

    void a(short s2) {
        this.i = s2;
        this.b(this.i);
    }

    void b(int n) {
        int n2 = this.j.b();
        this.j.b(n);
        this.i(this.j.b() - n2);
    }

    void c(int n) {
        int n2 = this.j.a();
        this.j.a(n);
        this.j(this.j.a() - n2);
    }

    void d(int n) {
        this.j.d(n);
    }

    @Override
    public void e(int n) {
        this.j.c(n);
        this.l(n);
    }

    @Override
    public erl_1 v() {
        long l = this.b();
        TLongObjectIterator tLongObjectIterator = this.n.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            erl_1 erl_12 = (erl_1)tLongObjectIterator.value();
            if (erl_12.d() != l) continue;
            return erl_12;
        }
        return null;
    }

    @Override
    public void f(int n) {
        this.j.e(n);
        this.m(n);
    }

    void a(ern_1 ern_12) {
        this.m.put(ern_12.a(), (Object)ern_12);
        ern_12.a(this);
        this.c(ern_12);
    }

    void a(long l, short s2) {
        ern_1 ern_12 = (ern_1)this.m.get(l);
        ern_12.a(s2);
        this.d(ern_12);
    }

    void f(long l) {
        ern_1 ern_12 = (ern_1)this.m.remove(l);
        ern_12.b(this);
        this.e(ern_12);
    }

    void a(erl_1 erl_12) {
        this.n.put(erl_12.a(), (Object)erl_12);
        erl_12.a(this);
        this.c(erl_12);
    }

    void g(long l) {
        erl_1 erl_12 = (erl_1)this.n.remove(l);
        erl_12.b(this);
        this.d(erl_12);
    }

    void a(erh_1 erh_12) {
        if (erh_12 == null) {
            b.error((Object)("Trying to add null bonus to guild " + this.a()));
            return;
        }
        this.o.put(erh_12.a(), (Object)erh_12);
        erh_12.a(this);
        this.c(erh_12);
    }

    void g(int n) {
        erh_1 erh_12 = (erh_1)this.o.remove(n);
        erh_12.b(this);
        this.d(erh_12);
    }

    void h(int n) {
        this.l += n;
        this.k(n);
    }

    private void d(String string) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).a(string);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee au changement de nom de la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void z() {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).a();
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee au changement de blason pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void A() {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).b();
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee au changement de description pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void b(short s2) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).a(s2);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee au changement de niveau pour la guilde " + this + " niveau = " + s2), (Throwable)runtimeException);
            }
        }
    }

    private void i(int n) {
        int n2 = this.c.size();
        for (int k = 0; k < n2; ++k) {
            try {
                this.c.get(k).b(n);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee au changement de point de guilde, delta = " + n + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void j(int n) {
        int n2 = this.c.size();
        for (int k = 0; k < n2; ++k) {
            try {
                this.c.get(k).a(n);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee au changement de point de guilde, delta = " + n + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void B() {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).c();
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee au changement de message de la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void c(ern_1 ern_12) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).a(ern_12);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee \u00e0 l'ajout du rank " + ern_12 + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void d(ern_1 ern_12) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).b(ern_12);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee sur le changement de rang " + ern_12 + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void e(ern_1 ern_12) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).c(ern_12);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee au retrait du rang " + ern_12 + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void c(erl_1 erl_12) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).a(erl_12);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee \u00e0 l'ajout d'un membre " + erl_12 + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void d(erl_1 erl_12) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).b(erl_12);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee au retrait d'un membre " + erl_12 + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void c(erh_1 erh_12) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).a(erh_12);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee pour le bonus " + erh_12 + " de la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void d(erh_1 erh_12) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).b(erh_12);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee au retrait d'un bonus " + erh_12 + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void k(int n) {
        int n2 = this.c.size();
        for (int k = 0; k < n2; ++k) {
            try {
                this.c.get(k).d_(n);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception raised changing bonus members size, delta : " + n + " for guild " + this), (Throwable)runtimeException);
            }
        }
    }

    private void l(int n) {
        int n2 = this.c.size();
        for (int k = 0; k < n2; ++k) {
            try {
                this.c.get(k).c(n);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee lors de la modification de points gagn\u00e9s " + n + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    private void m(int n) {
        int n2 = this.c.size();
        for (int k = 0; k < n2; ++k) {
            try {
                this.c.get(k).d(n);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee lors de la modification de la semaine " + n + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void b(ern_1 ern_12) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).d(ern_12);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee \u00e0 la modification d'un rang " + ern_12 + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void b(erl_1 erl_12) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).c(erl_12);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee \u00e0 la modification d'un membre " + erl_12 + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void a(erl_1 erl_12, long l) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).a(erl_12, l);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee \u00e0 la modification d'un rang d'un membre " + erl_12 + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public void b(erh_1 erh_12) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.c.get(k).c(erh_12);
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)("Exception levee \u00e0 l'activation d'un bonus " + erh_12 + " pour la guilde " + this), (Throwable)runtimeException);
            }
        }
    }

    @Override
    public boolean a(erk_1 erk_12) {
        return !this.c.contains(erk_12) && this.c.add(erk_12);
    }

    @Override
    public boolean b(erk_1 erk_12) {
        return this.c.remove(erk_12);
    }

    public String toString() {
        return "GuildModel{m_id=" + this.d + ", m_name='" + this.e + "', m_members=" + this.n.size() + "}";
    }

    @Override
    public void a(wu_0 wu_02) {
        this.k = wu_02;
    }

    @Override
    public long w() {
        return this.n.valueCollection().stream().filter(erl_1::g).count();
    }

    @Override
    public int x() {
        return this.l;
    }

    @Override
    public void a(Runnable runnable) {
        this.q.add(runnable);
    }

    @Override
    public void y() {
        for (Runnable runnable : this.q) {
            runnable.run();
        }
        this.q.clear();
    }
}

