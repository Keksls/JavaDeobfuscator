/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fxc
 */
public final class fxc_0
extends fxe_0 {
    private static final Logger t = Logger.getLogger(fxc_0.class);
    private Entity3D u;
    private Entity3D v;
    private static final short w = 3855;

    @Override
    public void a(fxp_0 fxp_02) {
        super.a(fxp_02);
        this.a((Entity)this.b.f());
        this.l();
    }

    public void a(azj_2 azj_22, int n, boolean bl) {
        if (n < 0 || n >= this.u.V()) {
            return;
        }
        GeometryMesh geometryMesh = (GeometryMesh)this.u.b(n);
        geometryMesh.a(azj_22.q(), azj_22.r(), azj_22.s(), bl ? 0.6f : 0.3f);
    }

    public void a(int n, float f2) {
        if (n < 0 || n >= this.u.V()) {
            return;
        }
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)this.u.b(n);
        gLGeometryMesh.b(f2);
    }

    @Override
    protected void a() {
        super.a();
        this.u.D().e();
        this.v.D().e();
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        super.a(dimension, insets, insets2, insets3);
        this.c(this.j());
    }

    @Override
    protected void a(Dimension dimension) {
        this.c((float)dimension.getWidth() * 0.5f, (float)dimension.getHeight() * 0.5f);
    }

    @Override
    protected void b() {
        this.u.c();
        this.d.c();
        this.v.c();
        this.e.c();
        ArrayList<Entity> arrayList = this.c.U();
        Object t = this.b.f();
        if (arrayList.isEmpty()) {
            this.c.a((Entity)t);
            this.c.a(this.u);
            this.c.a(this.d);
            this.c.a(this.v);
            this.c.a((Entity)this.e);
        } else if (arrayList.get(0) != t) {
            this.c.a(0, (Entity)t);
        }
    }

    private void c(azj_2 azj_22) {
        if (this.m != null) {
            fwQ.a(-this.k / 2 + this.n, this.j / 2 - this.o, this.p, this.q, this.m, azj_22, this.v);
        }
    }

    @Override
    public void c() {
        super.c();
        this.u.u();
        this.u = null;
        this.v.u();
        this.v = null;
    }

    @Override
    public void d() {
        super.d();
        assert (this.u == null);
        assert (this.v == null);
        this.u = (Entity3D)Entity3D.c.d();
        this.v = (Entity3D)Entity3D.c.d();
        this.a(this.u);
        this.a(this.v);
    }

    private void l() {
        if (this.b != null) {
            this.l.a("nation");
            ((Entity)this.b.f()).a(this.l.c(), this.l.d(), this.l.f());
        }
    }

    private void m() {
        if (this.b != null) {
            this.l.a("highlight");
            ((Entity)this.b.f()).a(this.l.c(), this.l.d(), this.l.f());
        }
    }

    public void a(boolean bl) {
        if (bl) {
            this.l();
        } else {
            this.m();
        }
    }

    public void a(TLongByteHashMap tLongByteHashMap) {
        if (this.l != null) {
            this.l.a(tLongByteHashMap);
        }
    }

    public void a(TLongObjectHashMap<azj_2> tLongObjectHashMap) {
        if (this.l != null) {
            this.l.a(tLongObjectHashMap);
        }
    }

    public void a(int n) {
        if (this.l != null) {
            this.l.b(n);
        }
    }
}

