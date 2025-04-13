/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fxe
 */
public abstract class fxe_0 {
    private static final Logger a = Logger.getLogger(fxe_0.class);
    protected fxp_0 b;
    protected EntityGroup c;
    protected Entity3D d;
    protected EntityGroup e;
    protected ayx_2 f;
    protected ayx_2 g;
    private azj_2 t;
    protected ayo_2 h;
    protected float i = 1.0f;
    protected int j;
    protected int k;
    protected fwv l;
    protected ayo_2 m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected TLongObjectHashMap<fwz> r;
    private float u = Float.NaN;
    private float v = Float.NaN;

    protected void a(Entity entity) {
        entity.D().a(this.f);
        entity.D().a(this.g);
    }

    public void a(fxp_0 fxp_02) {
        if (this.b != null) {
            this.b.d();
        }
        this.b = fxp_02;
        this.b.g();
    }

    public final int e() {
        return this.j;
    }

    public final void b(int n) {
        this.j = n;
    }

    public final int f() {
        return this.k;
    }

    public final void c(int n) {
        this.k = n;
    }

    public final Entity g() {
        return this.c;
    }

    public final ayo_2 h() {
        return this.h;
    }

    public final azj_2 i() {
        return this.t;
    }

    public void a(ayo_2 ayo_22) {
        this.h = ayo_22;
        this.l.c(ayo_22.e());
    }

    public final void a(azj_2 azj_22) {
        if (this.t == azj_22) {
            return;
        }
        this.t = azj_22;
    }

    public final void a(float f2) {
        this.i = f2;
        this.f.b(this.i, this.i, this.i);
        this.a();
    }

    protected final void c(float f2, float f3) {
        if (this.u == f2 && this.v == f3) {
            return;
        }
        this.u = f2;
        this.v = f3;
        this.g.a(f2, f3, -10000.0f);
        this.a();
    }

    protected void a() {
        if (this.b == null) {
            return;
        }
        ((Entity)this.b.f()).D().e();
        this.d.D().e();
        this.e.D().e();
    }

    protected abstract void b();

    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        this.a(dimension);
        if (this.b != null) {
            this.b.a(this);
            this.b();
            this.a();
        }
        this.b(this.j());
    }

    protected abstract void a(Dimension var1);

    public final void b(int n, int n2) {
        this.k = n;
        this.j = n2;
    }

    public void c() {
        this.h = null;
        this.c.u();
        this.c = null;
        this.t = null;
        if (this.b != null) {
            this.b.d();
            this.b = null;
        }
        this.m = null;
        this.r.clear();
        this.r = null;
        this.d.u();
        this.d = null;
        this.e.u();
        this.e = null;
        this.l = null;
    }

    public void d() {
        assert (this.c == null);
        assert (this.b == null);
        assert (this.d == null);
        assert (this.e == null);
        this.c = (EntityGroup)EntityGroup.a.d();
        this.c.p = this;
        this.f = new ayx_2();
        this.g = new ayx_2();
        this.u = Float.NaN;
        this.v = Float.NaN;
        this.r = new TLongObjectHashMap();
        this.d = (Entity3D)Entity3D.c.d();
        this.e = (EntityGroup)EntityGroup.a.d();
        this.a(this.d);
        this.a(this.e);
        try {
            this.l = new fwv();
        }
        catch (Exception exception) {
            a.warn((Object)"Probl\u00e8me \u00e0 l'instantiation de MapMesh");
        }
    }

    public final azj_2 j() {
        return this.t == null ? azf_2.e : this.t;
    }

    public void a(long l, fwz fwz2) {
        this.r.put(l, (Object)fwz2);
    }

    public void a(long l) {
        this.r.remove(l);
    }

    public void k() {
        this.r.clear();
    }

    protected void b(azj_2 azj_22) {
        TLongObjectIterator tLongObjectIterator = this.r.iterator();
        while (tLongObjectIterator.hasNext()) {
            int n;
            tLongObjectIterator.advance();
            fwz fwz2 = (fwz)tLongObjectIterator.value();
            ayo_2 ayo_22 = fwz2.h();
            if (ayo_22 != null) {
                int n2 = (int)((float)ayo_22.e() / this.i / 1.5f);
                n = (int)((float)ayo_22.d() / this.i / 1.5f);
                fwQ.a(fwz2.i() - this.k / 2, fwz2.j() + n + this.j / 2, n2, n, ayo_22, azj_22, this.d);
            }
            ArrayList<fww> arrayList = fwz2.b();
            int n3 = arrayList.size();
            for (n = 0; n < n3; ++n) {
                fww fww2 = arrayList.get(n);
                aby_0 aby_02 = fww2.y();
                if (aby_02 == null) continue;
                this.e.a(aby_02.t());
            }
        }
    }

    public void b(ayo_2 ayo_22) {
        this.m = ayo_22;
    }

    public void a(int n, int n2, int n3, int n4) {
        this.n = n;
        this.o = n2;
        this.p = n3;
        this.q = n4;
    }

    public void a(ays_2 ays_22) {
        if (this.l != null) {
            this.l.a(ays_22);
        }
        this.b.a(ays_22);
    }
}

