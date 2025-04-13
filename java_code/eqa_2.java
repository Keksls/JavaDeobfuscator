/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eqA
 */
public final class eqa_2
implements gq_1<zs_1> {
    protected static final Logger a = Logger.getLogger(eqa_2.class);
    private static final Comparator<eqy_2> b = new eqb_2();
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final List<eqy_2> g = new ArrayList<eqy_2>();
    private short h;
    private long i;
    private long j;

    public eqa_2(int n, int n2, int n3, int n4) {
        this.c = n;
        this.d = n2;
        this.e = n3;
        this.f = n4;
    }

    public void a(eqy_2 eqy_22) {
        boolean bl = false;
        for (eqy_2 eqy_23 : this.g) {
            long l = Math.abs(eqy_22.a() - eqy_23.a());
            if (l <= (long)(this.e * 1000 * 60) && (eqy_23.e() + eqy_22.e() > this.f || !(bl = eqy_23.a(eqy_22)))) continue;
            break;
        }
        if (!bl) {
            this.g.add(eqy_22);
        }
        this.g.sort(b);
        this.h();
        this.h = (short)(this.h + 1);
        this.i += eqy_22.f();
    }

    private void h() {
        while (!this.g.isEmpty()) {
            if (this.g.size() > this.c || System.currentTimeMillis() - this.g.get(this.g.size() - 1).a() > (long)this.d * 1000L * 60L * 60L * 24L) {
                this.g.remove(this.g.size() - 1);
                continue;
            }
            return;
        }
    }

    public short a() {
        return this.h;
    }

    public long b() {
        return this.i;
    }

    public long c() {
        return this.j;
    }

    public void a(long l) {
        this.j = l;
    }

    public void d() {
        this.h = 0;
        this.i = 0L;
    }

    public List<eqy_2> e() {
        return this.g;
    }

    public int f() {
        return this.g.size();
    }

    public void g() {
        this.g.clear();
    }

    @Override
    public boolean a(zs_1 zs_12) {
        zs_12.a.clear();
        for (eqy_2 eqy_22 : this.g) {
            zt_1 zt_12 = new zt_1();
            zt_12.a = eqy_22.a();
            zt_12.b = eqy_22.b();
            zt_12.c = eqy_22.c();
            Iterator<abo_2<Integer, Short>> iterator = eqy_22.d();
            while (iterator.hasNext()) {
                abo_2<Integer, Short> abo_22 = iterator.next();
                zu_1 zu_12 = new zu_1();
                zu_12.a = abo_22.a();
                zu_12.b = abo_22.b();
                zt_12.d.add(zu_12);
            }
            zt_12.e = eqy_22.f();
            zs_12.a.add(zt_12);
        }
        zs_12.b = this.h;
        zs_12.c = this.i;
        zs_12.d = this.j;
        return true;
    }

    @Override
    public boolean b(zs_1 zs_12) {
        this.g.clear();
        for (zt_1 zt_12 : zs_12.a) {
            try {
                eqy_2 eqy_22 = new eqy_2();
                eqy_22.b(zt_12.b);
                eqy_22.a(zt_12.c);
                eqy_22.a(zt_12.a);
                for (zu_1 zu_12 : zt_12.d) {
                    eqy_22.a(zu_12.a, zu_12.b);
                }
                eqy_22.c(zt_12.e);
                this.g.add(eqy_22);
            }
            catch (Exception exception) {
                a.error((Object)("Exception lors de la d\u00e9-serialisation du log de transaction " + zt_12), (Throwable)exception);
            }
        }
        this.h = zs_12.b;
        this.i = zs_12.c;
        this.j = zs_12.d;
        return true;
    }
}

