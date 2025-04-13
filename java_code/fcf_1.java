/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fCf
 */
public class fcf_1
extends fbq_2 {
    protected EntitySprite b;
    protected azj_2 c;
    protected azj_2 d;

    public void a(float[] fArray) {
        assert (fArray != null) : "Color components array can't be null";
        assert (fArray.length == 4) : "Color components size must be equal to 4";
        this.c = new azf_2(fArray[0], fArray[1], fArray[2], fArray[3]);
        this.b.a(this.c);
    }

    public void a(azj_2 azj_22) {
        assert (azj_22 != null) : "Color can't be null";
        if (this.c != null && this.c.i() == azj_22.i()) {
            return;
        }
        this.c = azj_22;
        this.d();
    }

    private void d() {
        if (this.b == null) {
            return;
        }
        float f2 = this.c != null ? this.c.q() : 1.0f;
        float f3 = this.c != null ? this.c.r() : 1.0f;
        float f4 = this.c != null ? this.c.s() : 1.0f;
        float f5 = this.c != null ? this.c.p() : 1.0f;
        this.b.a(f2 *= this.d != null ? this.d.q() : 1.0f, f3 *= this.d != null ? this.d.r() : 1.0f, f4 *= this.d != null ? this.d.s() : 1.0f, f5 *= this.d != null ? this.d.p() : 1.0f);
    }

    public final azj_2 a() {
        return this.c;
    }

    public azj_2 b() {
        return this.d;
    }

    public void b(azj_2 azj_22) {
        if (this.d == azj_22) {
            return;
        }
        this.d = azj_22;
        this.d();
    }

    public final EntitySprite c() {
        return this.b;
    }

    @Override
    public void h() {
        this.d = null;
        this.c = null;
        this.b.u();
        this.b = null;
    }

    @Override
    public void i() {
        assert (this.b == null) : "Object is already checked out";
        this.b = (EntitySprite)EntitySprite.a.d();
        this.b.p = this;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.j.d();
        this.b.a(geometrySprite);
        geometrySprite.u();
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = dimension.width - insets.right - insets2.right - insets.left - insets2.left;
        int n2 = dimension.height - insets.top - insets2.top - insets.bottom - insets2.bottom;
        int n3 = insets.left + insets2.left;
        int n4 = insets.bottom + insets2.bottom + n2;
        this.b.a((float)n4, (float)n3, n, n2);
    }

    @Override
    public /* synthetic */ Entity g() {
        return this.c();
    }
}

