/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 */
import com.jogamp.opengl.GL;
import java.nio.ByteBuffer;

/*
 * Renamed from ayZ
 */
public abstract class ayz_2 {
    protected final int a = -1;
    private ays_2 b;
    private azr_2 c;
    private long d = -1L;
    private float e = 0.0f;
    private float f = 1.0f;
    private float g = 0.0f;
    private float h = 1.0f;

    protected void a() {
        this.b = new avz_2(auk_2.a(), 32, 32, false);
        this.c = this.b.a(0);
        this.c.a(this.b());
        this.o();
        this.d = -1L;
    }

    public abstract byte b();

    public void a(GL gL) {
        long l = this.e();
        if (l == this.d || l == -1L) {
            return;
        }
        ByteBuffer byteBuffer = this.f();
        if (byteBuffer == null) {
            return;
        }
        this.c.a(byteBuffer, this.c(), this.d());
        this.b.b(gL);
        this.o();
        this.d = l;
    }

    protected abstract int c();

    protected abstract int d();

    protected abstract long e();

    protected abstract ByteBuffer f();

    private void o() {
        afe_1 afe_12 = this.b.b(0);
        float f2 = this.c();
        float f3 = this.d();
        this.e = 0.0f;
        this.f = f3 / (float)afe_12.b();
        this.g = 0.0f;
        this.h = f2 / (float)afe_12.a();
    }

    public boolean g() {
        return this.b != null;
    }

    public ays_2 h() {
        return this.b;
    }

    public float i() {
        return this.e;
    }

    public float j() {
        return this.f;
    }

    public float k() {
        return this.g;
    }

    public float l() {
        return this.h;
    }

    public int m() {
        return this.c();
    }

    public int n() {
        return this.d();
    }
}

