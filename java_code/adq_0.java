/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.kernel.core.maths.Matrix44;

/*
 * Renamed from adq
 */
public class adq_0
extends adn_0 {
    public static final String a = "ibmplexsans";
    public static final int f = 30;
    public static final int g = 0;
    private float h = 1.0f;
    private float i = 1.0f;
    private float j = 1.0f;
    private float k = 1.0f;
    private final EntityText l;
    private final Matrix44 m = new Matrix44(Matrix44.b);
    private final Matrix44 n = new Matrix44(Matrix44.b);

    public adq_0(String string, int n, int n2) {
        this(ayq_1.a(string, n, n2));
    }

    public adq_0(ayn_2 ayn_22) {
        this.l = (EntityText)EntityText.a.c();
        GLGeometryText gLGeometryText = (GLGeometryText)GLGeometryText.c.d();
        this.l.a(gLGeometryText);
        this.l.a(1320);
        this.l.a(ayn_22);
        this.l.a(ayc_2.e);
        this.l.a(new aft_2(0.0f, 0.0f, 0.0f));
        this.l.b(true);
        gLGeometryText.u();
    }

    @Override
    public void a() {
        this.l.u();
    }

    @Override
    public void a(int n) {
        super.a(n);
        float f2 = this.g();
        this.l.a(this.h, this.i, this.j, this.k * f2);
    }

    @Override
    public void a(aui_2 aui_22) {
        this.m.a(aui_22.d());
        this.n.a(aui_22.c());
        aui_22.a(Matrix44.b);
        aui_22.b(Matrix44.b);
        avx_2 avx_22 = auj_1.a.a();
        avx_22.i.a(13);
        this.l.c(aui_22);
        aui_22.a(this.n);
        aui_22.b(this.m);
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.h = f2;
        this.i = f3;
        this.j = f4;
        this.k = f5;
    }

    public void a(String string) {
        this.l.a(string);
    }

    @Override
    public int j() {
        return 2;
    }
}

