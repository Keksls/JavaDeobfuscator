/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Dimension;
import java.util.ArrayList;

/*
 * Renamed from fxd
 */
public final class fxd_0
extends fxe_0 {
    private float a;
    private float t;
    private float u;
    private float v;
    private int w;
    private int x;

    @Override
    public void a(fxp_0 fxp_02) {
        super.a(fxp_02);
        this.a((Entity)this.b.f());
    }

    public void a(float f2, float f3) {
        this.u = f2;
        this.v = f3;
        this.a((Dimension)null);
    }

    public void a(int n, int n2) {
        this.w = n;
        this.x = n2;
        this.a((Dimension)null);
    }

    public void b(float f2, float f3) {
        this.a = f2;
        this.t = f3;
        this.a((Dimension)null);
    }

    @Override
    protected void a(Dimension dimension) {
        float f2 = (this.u + this.a) * this.i;
        float f3 = (this.v + this.t) * this.i;
        float f4 = (float)(this.w / 2) - f2;
        float f5 = (float)(this.x / 2) - f3;
        this.c(f4, f5);
    }

    @Override
    protected void b() {
        this.d.c();
        this.e.c();
        ArrayList<Entity> arrayList = this.c.U();
        Object t = this.b.f();
        if (arrayList.isEmpty()) {
            this.c.a((Entity)t);
            this.c.a(this.d);
            this.c.a((Entity)this.e);
        } else if (arrayList.get(0) != t) {
            this.c.a(0, (Entity)t);
        }
    }
}

