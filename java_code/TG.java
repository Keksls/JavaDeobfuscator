/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class TG
extends fl_1
implements TH {
    private static final Logger a = Logger.getLogger(TG.class);
    public static final byte c = 0;
    protected long d;
    private short b;
    protected final aff_1 e = new aff_1();
    protected long f;
    protected short g;
    private boolean q;
    protected boolean h;
    protected boolean i;
    protected short j;
    protected final HashSet<aff_1> k = new HashSet();
    private aej_2 r;
    protected String l;
    protected boolean m;
    protected boolean n;
    protected byte o = 0;
    private boolean s;
    private final HashSet<TE> t = new HashSet();
    protected abm_1 p;
    private ArrayList<Ty> u;

    protected TG() {
    }

    public final short x() {
        return this.j;
    }

    public aej_2 F() {
        return this.r;
    }

    public abstract int G();

    public abstract int H();

    public abstract short I();

    public void a(aej_2 aej_22) {
        this.r = aej_22;
    }

    public boolean y() {
        return false;
    }

    @Override
    public long a_() {
        return this.d;
    }

    public void b(long l) {
        this.d = l;
    }

    public void a(TE tE) {
        this.t.add(tE);
    }

    public void a(Collection<TE> collection) {
        this.t.addAll(collection);
    }

    public final void b(Collection<TE> collection) {
        this.t.clear();
        if (collection != null) {
            this.t.addAll(collection);
        }
    }

    public void b(TE tE) {
        this.t.remove(tE);
    }

    public void c(Collection<TE> collection) {
        this.t.removeAll(collection);
    }

    public boolean c(TE tE) {
        return this.t.contains(tE);
    }

    public Iterator<TE> z() {
        return this.t.iterator();
    }

    public int A() {
        return this.t.size();
    }

    public final short B() {
        return this.g;
    }

    public void a(short s2) {
        this.g = s2;
    }

    public final long C() {
        return this.f;
    }

    public void c(long l) {
        this.f = l;
    }

    @Override
    public final aff_1 P_() {
        return this.e;
    }

    public final boolean D() {
        return this.n;
    }

    public void b(boolean bl) {
        this.n = bl;
    }

    public boolean E() {
        return false;
    }

    public boolean M() {
        return this.m && this.q;
    }

    public boolean N() {
        return this.h && !this.O();
    }

    public boolean c(boolean bl) {
        return bl ? this.h : this.N();
    }

    public void d(boolean bl) {
        this.h = bl;
    }

    public boolean O() {
        return this.i;
    }

    public void e(boolean bl) {
        this.i = bl;
        this.T();
    }

    public boolean P() {
        return this.q;
    }

    public void f(boolean bl) {
        this.q = bl;
        if (!bl) {
            this.g(false);
        }
    }

    public void a(String string) {
        this.l = string.intern();
    }

    protected void a(abm_1 abm_12) {
        this.p = abm_12;
    }

    public fo_1[] Q() {
        return new fo_1[]{this.V(), this.ad()};
    }

    @Override
    public void onCheckOut() {
        this.d = 0L;
        this.b = 0;
        this.e.c();
        this.f = 0L;
        this.g = (short)Short.MAX_VALUE;
        this.q = false;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.r = aej_2.h;
        this.l = null;
        this.m = false;
        this.n = false;
        this.o = 0;
        this.s = false;
    }

    @Override
    public void onCheckIn() {
        this.d = Long.MAX_VALUE;
        this.k.clear();
        this.t.clear();
        if (this.u != null) {
            this.u.clear();
            this.u = null;
        }
    }

    @Override
    public void release() {
        if (this.p != null) {
            try {
                this.p.returnObject(this);
            }
            catch (Exception exception) {
                a.error((Object)"Erreur lors du retour au pool", (Throwable)exception);
            }
            this.p = null;
        } else {
            a.error((Object)("Double release de " + this.getClass()), (Throwable)new Exception());
            this.onCheckIn();
        }
    }

    public final void a(Ty ty) {
        if (this.u == null) {
            this.u = new ArrayList(1);
        }
        if (this.u.contains(ty)) {
            return;
        }
        this.u.add(ty);
    }

    public final void R() {
        this.u.clear();
        this.u = null;
    }

    public boolean b(aff_1 aff_12) {
        return !this.k.isEmpty() && this.k.contains(aff_12);
    }

    public HashSet<aff_1> S() {
        return this.k;
    }

    public final void T() {
        if (this.u != null) {
            for (Ty ty : this.u) {
                ty.onInteractiveElementChanges(this);
            }
        }
    }

    @Override
    public fo_1[] b_() {
        return new fo_1[]{this.e(), this.U(), this.V(), this.ad(), this.f(), this.g()};
    }

    protected abstract fo_1 e();

    protected abstract fo_1 U();

    protected abstract fo_1 V();

    protected abstract fo_1 ad();

    protected abstract fo_1 f();

    protected abstract fo_1 g();

    public final void b(Ty ty) {
        if (this.u != null) {
            this.u.remove(ty);
        }
    }

    public void g(boolean bl) {
        this.m = bl;
    }

    public String toString() {
        return "[" + this.getClass().getSimpleName() + " id=" + this.d + "]" + this.P_();
    }

    protected abstract yx_0 h();

    public void a_(byte by) {
        this.o = by;
    }

    public byte ae() {
        return this.o;
    }

    public void b(short s2) {
        this.b = s2;
    }

    public short af() {
        return this.b;
    }

    public boolean ag() {
        return false;
    }

    public void ah() {
        this.s = true;
    }

    public void ai() {
        this.s = false;
    }

    public boolean aj() {
        return this.s;
    }

    public void aJ_() {
    }

    public List<aej_2> al() {
        return List.of(aej_2.b, aej_2.d);
    }

    public boolean c(aej_2 aej_22) {
        return this.al().contains((Object)aej_22);
    }
}

