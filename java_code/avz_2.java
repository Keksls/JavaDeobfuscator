/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.Threading
 *  org.apache.log4j.Logger
 */
import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.Threading;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from avz
 */
public final class avz_2
extends ays_2 {
    private static final Logger v = Logger.getLogger(avz_2.class);
    private static final int w = abc_1.a("DXT1");
    private static final int x = abc_1.a("DXT3");
    private static final int y = abc_1.a("DXT5");
    public static final int a = 32856;
    private static final int z = 25;
    private int[] A;

    public avz_2(long l, String string, boolean bl) {
        super(l, string, bl);
        this.C();
    }

    public avz_2(long l, azk_2 azk_22, boolean bl) {
        super(l, azk_22, bl);
        this.C();
    }

    public avz_2(long l, int n, int n2, boolean bl) {
        super(l, n, n2, bl);
        this.C();
    }

    public int a() {
        return this.A[0];
    }

    public int b() {
        return this.A[3];
    }

    @Override
    public boolean a(GL gL) {
        return Threading.isOpenGLThread() && (this.j ? this.e(gL) : this.f(gL));
    }

    @Override
    public boolean b(GL gL) {
        if (this.v() == null) {
            return false;
        }
        int n = 0;
        if (this.v().a() == w) {
            n = 33777;
        } else if (this.v().a() == x) {
            n = 33778;
        } else if (this.v().a() == y) {
            n = 33779;
        }
        gL.glBindTexture(3553, this.A[0]);
        gL.glTexParameterf(3553, 10242, 10497.0f);
        gL.glTexParameterf(3553, 10243, 10497.0f);
        gL.glTexParameterf(3553, 10240, 9729.0f);
        gL.glTexParameterf(3553, 10241, 9729.0f);
        for (int k = 0; k < this.t(); ++k) {
            azr_2 azr_22 = this.a(k);
            if (azr_22 == null) {
                return false;
            }
            byte[] byArray = azr_22.h();
            if (byArray == null) {
                return false;
            }
            int n2 = byArray.length;
            ByteBuffer byteBuffer = Buffers.newDirectByteBuffer((int)n2);
            byteBuffer.put(byArray, 0, n2);
            byteBuffer.rewind();
            if (this.e()) {
                gL.glCompressedTexImage2D(3553, k, n, Hw.e(azr_22.a()), Hw.e(azr_22.b()), 0, byArray.length, (Buffer)byteBuffer);
                continue;
            }
            gL.glTexImage2D(3553, k, 32856, Hw.e(azr_22.a()), Hw.e(azr_22.b()), 0, avz_2.b(azr_22), 5121, (Buffer)byteBuffer);
        }
        this.f = true;
        this.s = false;
        return true;
    }

    private static int b(azr_2 azr_22) {
        if (azr_22.n() == 1) {
            return 6407;
        }
        if (azr_22.n() == 17) {
            return 6408;
        }
        if (azr_22.n() == 18) {
            return 32993;
        }
        if (azr_22.n() == 2) {
            return 32992;
        }
        return 6408;
    }

    @Override
    public void a(GL2 gL2) {
        if (!this.j()) {
            this.a((GL)gL2);
        }
        this.c();
        axr_2 axr_22 = axr_2.a();
        axr_22.d(true);
        axr_22.a(gL2);
        gL2.glBindTexture(3553, this.A[0]);
        axr_22.a(this.g);
        axr_22.a(gL2);
    }

    private boolean e(GL gL) {
        boolean bl;
        gL.glGenFramebuffers(1, this.A, 3);
        gL.glGenTextures(1, this.A, 0);
        gL.glGenRenderbuffers(1, this.A, 2);
        gL.glBindFramebuffer(36160, this.A[3]);
        gL.glBindTexture(3553, this.A[0]);
        gL.glTexParameteri(3553, 10242, 33071);
        gL.glTexParameteri(3553, 10243, 33071);
        azr_2 azr_22 = this.a(0);
        if (azr_22 == null) {
            return false;
        }
        int n = azr_22.a();
        int n2 = azr_22.b();
        if (this.k) {
            gL.glTexParameterf(3553, 10240, 9729.0f);
            gL.glTexParameterf(3553, 10241, 9987.0f);
            gL.glTexImage2D(3553, 0, 32856, n, n2, 0, avz_2.b(azr_22), 5121, null);
            gL.glGenerateMipmap(3553);
        } else {
            gL.glTexParameteri(3553, 10240, 9729);
            gL.glTexParameteri(3553, 10241, 9729);
            gL.glTexParameteri(3553, 34891, 6409);
            gL.glTexImage2D(3553, 0, 32856, n, n2, 0, avz_2.b(azr_22), 5121, null);
        }
        gL.glFramebufferTexture2D(36160, 36064, 3553, this.A[0], 0);
        gL.glBindRenderbuffer(36161, this.A[2]);
        gL.glRenderbufferStorage(36161, 35056, n, n2);
        gL.glFramebufferRenderbuffer(36160, 36096, 36161, this.A[2]);
        gL.glFramebufferRenderbuffer(36160, 36128, 36161, this.A[2]);
        int n3 = gL.glCheckFramebufferStatus(36160);
        gL.glBindFramebuffer(36160, 0);
        this.f = bl = n3 == 36053;
        this.s = false;
        return bl;
    }

    private boolean f(GL gL) {
        if (this.r != null) {
            if (this.r.d()) {
                this.B();
            } else if (this.r.e()) {
                this.r = null;
            } else {
                return false;
            }
        }
        gL.glPixelStorei(3317, 1);
        gL.glGenTextures(1, this.A, 0);
        if (this.A[0] == 0) {
            v.error((Object)"Unable to generate a new texture");
            return false;
        }
        boolean bl = this.b(gL);
        if (bl && !this.h) {
            if (this.i) {
                this.c(25);
            }
            this.k();
        }
        return bl;
    }

    public void c(GL gL) {
        if (!this.j()) {
            this.a(gL);
        }
        gL.glBindTexture(3553, this.A[0]);
        this.c();
    }

    public void c() {
        int n = this.aw();
        if (n > this.l) {
            this.l = n;
        }
    }

    @Override
    public void d(GL gL) {
        if (!this.h()) {
            return;
        }
        this.e = false;
        gL.glBindTexture(3553, 0);
    }

    @Override
    public void a(aui_2 aui_22) {
    }

    @Override
    public void b(aui_2 aui_22) {
    }

    @Override
    protected void j_() {
        assert (Threading.isOpenGLThread()) : "Trying to release a texture in a non-opengl thread";
        assert (this.m == ayt_2.e || this.m == ayt_2.b);
        super.j_();
        GL2 gL2 = auj_1.a.a().e();
        gL2.glDeleteTextures(1, this.A, 0);
        if (this.j) {
            gL2.glDeleteFramebuffers(1, this.A, 3);
            gL2.glDeleteRenderbuffers(1, this.A, 2);
        }
        this.f = false;
        this.l = 0;
        this.m = ayt_2.f;
    }

    @Override
    public boolean e() {
        return this.v().a() == w || this.v().a() == x || this.v().a() == y;
    }

    private void C() {
        if (this.j) {
            this.A = new int[4];
            this.A[1] = 0;
            this.A[2] = 0;
            this.A[3] = 0;
        } else {
            this.A = new int[1];
        }
        this.A[0] = 0;
        this.f = false;
        if (!axy_2.b.a(axx_2.i)) {
            int n = this.w().a();
            int n2 = this.w().b();
            int n3 = Hw.e(n);
            int n4 = Hw.e(n2);
            if (n3 != n || n4 != n2) {
                this.y();
            }
        }
        this.m = ayt_2.b;
    }

    public static void a(GL gL, int n, int n2, int[] nArray, boolean bl) {
        gL.glGenTextures(1, nArray, 0);
        gL.glBindTexture(3553, nArray[0]);
        gL.glTexImage2D(3553, 0, 32856, n, n2, 0, 6408, 5121, (Buffer)ByteBuffer.allocateDirect(n * n2 * 4));
        gL.glTexParameterf(3553, 10242, 33071.0f);
        gL.glTexParameterf(3553, 10243, 33071.0f);
        gL.glTexParameterf(3553, 10240, bl ? 9729.0f : 9728.0f);
        gL.glTexParameterf(3553, 10241, bl ? 9729.0f : 9728.0f);
    }

    public String toString() {
        return this.d;
    }
}

