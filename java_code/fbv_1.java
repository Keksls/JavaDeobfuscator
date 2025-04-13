/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fBV
 */
public class fbv_1
extends fbr_2 {
    private final zl_0 c = new zl_0();
    private zm_0 d = new zm_0();
    private EntityText e;
    private boolean f = true;
    private int g;
    private int h;
    private int i;
    private int j;

    public fbv_1() {
        super.a(new Insets(this.c.d(), this.c.b(), this.c.a(), this.c.c()));
    }

    public void a(float f2) {
        this.c.c(f2);
        this.b();
    }

    public void a(boolean bl) {
        this.c.a(bl);
        this.b();
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        this.g = insets.left;
        this.h = insets.bottom;
        this.i = dimension.width - insets.left - insets.right;
        this.j = dimension.height - insets.bottom - insets.top;
        this.e.a(new aft_2(this.g, this.h, 0.0f));
        this.e.b(this.i - (insets2.left + insets2.right));
        this.e.c(this.j - (insets2.bottom + insets2.top));
    }

    private void b() {
        this.e.e().a(this.c.e(), this.c.f());
    }

    @Override
    public Entity g() {
        return this.e;
    }

    @Override
    public void h() {
        this.e.u();
        this.e = null;
    }

    @Override
    public void i() {
        assert (this.e == null);
        this.e = (EntityText)EntityText.a.d();
        GLGeometryText gLGeometryText = (GLGeometryText)GLGeometryText.c.d();
        GLGeometryBackground gLGeometryBackground = (GLGeometryBackground)GLGeometryBackground.c.d();
        this.e.a(gLGeometryText);
        this.e.a(gLGeometryBackground);
        this.e.a(ayc_2.g);
        gLGeometryBackground.a(this.c.e(), this.c.f());
        gLGeometryBackground.b(this.c.g());
        gLGeometryBackground.a(this.c.h());
        gLGeometryBackground.c(this.c.b(), this.c.c(), this.c.d(), this.c.a());
        gLGeometryText.u();
        gLGeometryBackground.u();
    }

    @Override
    public void a(Insets insets) {
    }
}

