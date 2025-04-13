/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;

class agv
implements azt_2 {
    static final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ agw c;
    final /* synthetic */ agu d;

    agv(agu agu2, String string, agw agw2) {
        this.d = agu2;
        this.b = string;
        this.c = agw2;
    }

    @Override
    public boolean a() {
        if (this.d.g) {
            this.d.c();
            return false;
        }
        if (!this.d.a()) {
            return true;
        }
        avx_2 avx_22 = auj_1.a.a();
        GL2 gL2 = avx_22.e();
        int n = this.a((GL)gL2);
        byte[] byArray = this.a(n, avx_22, this.b);
        if (!a && this.c == null) {
            throw new AssertionError();
        }
        this.c.a(byArray);
        gL2.glDeleteTextures(1, new int[]{n}, 0);
        this.d.c();
        return false;
    }

    private int a(GL gL) {
        gL.glEnable(3553);
        int[] nArray = new int[1];
        int n = this.d.c.a();
        int n2 = this.d.c.b();
        avz_2.a(gL, n, n2, nArray, true);
        return nArray[0];
    }

    private byte[] a(int n, avx_2 avx_22, String string) {
        GL2 gL2 = avx_22.e();
        int n2 = this.d.c.a();
        int n3 = this.d.c.b();
        float f2 = this.d.c.a(this.d.f);
        float f3 = this.d.c.b(this.d.f);
        float f4 = this.d.c.c(this.d.f);
        float[] fArray = new float[4];
        gL2.glGetFloatv(3106, fArray, 0);
        axr_2.a().a(gL2);
        gL2.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        avx_22.i.a(0);
        axr_2 axr_22 = axr_2.a();
        axr_22.a(gL2, axp_2.b, Matrix44.b);
        axr_22.a(gL2, axp_2.a, Matrix44.b);
        aad_2 aad_22 = new aad_2(0, 0, n2, n3);
        axr_22.a(gL2, aad_22);
        axr_22.e();
        aui_1.a().d();
        axu_2.a().a((GL)gL2);
        axr_22.a(gL2, axp_2.c, Matrix44.b);
        avx_22.b(Matrix44.b);
        this.d.e.a(1.0f, 1.0f, 1.0f, 1.0f);
        ayx_2 ayx_22 = new ayx_2();
        ((ayv_2)ayx_22).b(f2, f2, 1.0f);
        ((ayv_2)ayx_22).a(f3, f4, 0.0f);
        this.d.e.a(axt_2.b);
        this.d.e.b(axt_2.b);
        this.d.f.a(0, this.d.e, 0);
        axr_22.a(2.0f);
        this.d.e.D().a(ayx_22);
        this.d.e.a(avx_22);
        axr_22.d(true);
        gL2.glBindTexture(3553, n);
        gL2.glCopyTexImage2D(3553, 0, 6408, 0, 0, n2, n3, 0);
        byte[] byArray = new byte[n2 * n3 * 4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        gL2.glGetTexImage(3553, 0, 6408, 5121, (Buffer)byteBuffer);
        BufferedImage bufferedImage = azm_2.a(n2, n3, byArray, azn_1.a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedImage bufferedImage2 = azm_2.a(bufferedImage, true);
            ImageIO.write((RenderedImage)bufferedImage2, string, byteArrayOutputStream);
        }
        catch (IOException iOException) {
            agu.d.error((Object)iOException);
        }
        axr_22.e();
        gL2.glClearColor(fArray[0], fArray[1], fArray[2], fArray[3]);
        return byteArrayOutputStream.toByteArray();
    }

    static {
        a = !agu.class.desiredAssertionStatus();
    }
}

