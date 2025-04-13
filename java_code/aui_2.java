/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;

/*
 * Renamed from aui
 */
public abstract class aui_2 {
    protected GL2 a;
    protected Matrix44 b;
    protected Matrix44 c;
    protected final Matrix44 d = (Matrix44)Matrix44.a.c();
    protected ays_2 e;
    protected int f = 1;
    protected int g;
    protected int h;

    protected aui_2() {
    }

    public abstract auj_1 a();

    public abstract ays_2 a(long var1, String var3, boolean var4);

    public abstract ays_2 a(long var1, azk_2 var3, boolean var4);

    public abstract ays_2 a(long var1, int var3, int var4, boolean var5);

    public abstract void a(Matrix44 var1);

    public abstract void b(Matrix44 var1);

    public abstract void b();

    public final Matrix44 c() {
        return this.b;
    }

    public final Matrix44 d() {
        return this.c;
    }

    public abstract void a(ays_2 var1);

    public void a(auh_2 auh_22) {
        auh_22.c(this);
    }

    public void a(GL2 gL2) {
        this.a = gL2;
    }

    public final GL2 e() {
        return this.a;
    }

    public abstract void a(float var1, float var2, float var3, float var4, int var5);

    public abstract boolean f();

    public final Matrix44 g() {
        return this.d;
    }

    public final void a(int n, int n2) {
        this.g = n;
        this.h = n2;
    }

    public final int h() {
        return this.g;
    }

    public final int i() {
        return this.h;
    }
}

