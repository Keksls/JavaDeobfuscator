/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

/*
 * Renamed from auu
 */
public class auu_2 {
    private Geometry a;
    private ays_2 b;
    private Material c;
    private boolean d;

    public auu_2(Geometry geometry, ays_2 ays_22, Material material) {
        this.a(ays_22);
        if (geometry != null) {
            geometry.k_();
        }
        this.a = geometry;
        this.a(material);
    }

    public final void a() {
        if (this.b != null) {
            this.b.u();
            this.b = null;
        }
        if (this.a != null) {
            this.a.u();
            this.a = null;
        }
        if (this.c != null) {
            this.c.u();
            this.c = null;
        }
    }

    public Geometry b() {
        return this.a;
    }

    public ays_2 c() {
        return this.b;
    }

    public void a(ays_2 ays_22) {
        if (ays_22 == this.b) {
            return;
        }
        if (ays_22 != null) {
            ays_22.k_();
        }
        if (this.b != null) {
            this.b.u();
        }
        this.b = ays_22;
    }

    public Material d() {
        return this.c;
    }

    void a(Material material) {
        if (this.c == material) {
            return;
        }
        if (material != null) {
            material.k_();
        }
        if (this.c != null) {
            this.c.u();
        }
        this.c = material;
        this.d = true;
    }

    public void e() {
        this.d = true;
    }

    public final void a(avx_2 avx_22, boolean bl) {
        if (this.b != null && !this.b.j()) {
            return;
        }
        if (this.a == null) {
            return;
        }
        GL2 gL2 = avx_22.e();
        axr_2 axr_22 = axr_2.a();
        axr_22.a((GL)gL2, (avz_2)this.b);
        if (this.c != null) {
            axr_22.a(gL2, this.c);
            if (this.d && bl) {
                this.d = false;
                this.a.a(this.c);
            }
        }
        this.a.a(avx_22);
    }
}

