/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;

public class aiQ {
    public static final int a = Integer.MAX_VALUE;
    public static final int b = 3000;
    public static int c = 3000;
    private int d;
    private int e = c;
    private boolean f = false;
    private int g = 0;
    private int h = 0;
    private final EntityText i = (EntityText)EntityText.a.d();

    public static void a(int n) {
        c = n;
    }

    public static int a() {
        return c;
    }

    public aiQ(ayn_2 ayn_22) {
        GLGeometryText gLGeometryText = (GLGeometryText)GLGeometryText.c.d();
        GeometryBackground geometryBackground = (GeometryBackground)GLGeometryBackground.c.d();
        this.i.a(ayc_2.g);
        this.i.a(gLGeometryText);
        this.i.a(geometryBackground);
        this.i.a(ayn_22);
        GeometryBackground geometryBackground2 = this.i.e();
        aiR aiR2 = new aiR();
        geometryBackground2.a(aiR2.e(), aiR2.f());
        geometryBackground2.b(aiR2.g());
        geometryBackground2.a(aiR2.h());
        geometryBackground2.c(aiR2.b(), aiR2.c(), aiR2.d(), aiR2.a());
        gLGeometryText.u();
        geometryBackground2.u();
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.i.e().a(f2, f3, f4, f5);
    }

    public azj_2 b() {
        return this.i.e().j();
    }

    public void b(float f2, float f3, float f4, float f5) {
        this.i.e().b(f2, f3, f4, f5);
    }

    public azj_2 c() {
        return this.i.e().k();
    }

    public int d() {
        return this.e;
    }

    public void b(int n) {
        this.e = n;
    }

    public void a(int n, int n2) {
        this.g = n;
        this.h = n2;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return this.h;
    }

    protected float g() {
        return this.g;
    }

    protected float h() {
        return this.h;
    }

    public void a(boolean bl) {
        if (!bl && this.i.f() != null && !this.i.f().isEmpty()) {
            this.f = false;
            this.d = 0;
        }
        this.i.b(bl);
    }

    public void c(int n) {
        if (this.i.f() == null) {
            return;
        }
        if (!this.i.at()) {
            this.f = false;
            return;
        }
        if (this.e == Integer.MAX_VALUE) {
            return;
        }
        this.d += n;
        if (!this.f) {
            this.d = 0;
            this.f = true;
        }
        if (this.d >= this.e) {
            this.a(false);
            this.f = false;
            return;
        }
    }

    public final EntityText i() {
        return this.i;
    }

    public final String j() {
        return this.i.f();
    }

    public final void a(String string) {
        this.i.a(string);
    }

    public final void c(float f2, float f3, float f4, float f5) {
        this.i.a(f2, f3, f4, f5);
    }

    public final void a(ayn_2 ayn_22) {
        this.i.a(ayn_22);
    }

    public final void a(float f2, float f3) {
        this.i.a(new aft_2(f2, f3, 0.0f));
    }

    public final void a(float f2) {
        this.i.e().d(f2);
    }

    public final void d(int n) {
        this.i.a(n);
    }
}

