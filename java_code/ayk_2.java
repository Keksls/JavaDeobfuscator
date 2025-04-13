/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.glu.GLU
 *  com.jogamp.opengl.util.awt.TextureRenderer
 *  com.jogamp.opengl.util.texture.Texture
 */
import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.awt.TextureRenderer;
import com.jogamp.opengl.util.texture.Texture;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/*
 * Renamed from ayk
 */
class ayk_2 {
    int a = 0;
    final FloatBuffer b;
    final FloatBuffer c;
    boolean d;
    int e;
    int f;
    final /* synthetic */ aya_1 g;

    ayk_2(aya_1 aya_12) {
        this.g = aya_12;
        GL gL = GLU.getCurrentGL();
        this.c = Buffers.newDirectFloatBuffer((int)1200);
        this.b = Buffers.newDirectFloatBuffer((int)800);
        boolean bl = this.d = aya_12.m() && aya_12.b(gL);
        if (this.d) {
            try {
                int[] nArray = new int[2];
                gL.glGenBuffers(2, IntBuffer.wrap(nArray));
                this.e = nArray[0];
                this.f = nArray[1];
                gL.glBindBuffer(34962, this.e);
                gL.glBufferData(34962, 4800L, null, 35040);
                gL.glBindBuffer(34962, this.f);
                gL.glBufferData(34962, 3200L, null, 35040);
            }
            catch (Exception exception) {
                aya_12.P = false;
                this.d = false;
            }
        }
    }

    public void a(float f2, float f3) {
        this.b.put(f2);
        this.b.put(f3);
    }

    public void a(float f2, float f3, float f4) {
        this.c.put(f2);
        this.c.put(f3);
        this.c.put(f4);
        ++this.a;
        if (this.a >= 400) {
            this.a();
        }
    }

    void a() {
        if (this.g.O) {
            this.b();
        } else {
            this.c();
        }
    }

    private void b() {
        if (this.a > 0) {
            GL2 gL2 = GLU.getCurrentGL().getGL2();
            TextureRenderer textureRenderer = this.g.q();
            Texture texture = textureRenderer.getTexture();
            this.c.rewind();
            this.b.rewind();
            gL2.glEnableClientState(32884);
            if (this.d) {
                gL2.glBindBuffer(34962, this.e);
                gL2.glBufferSubData(34962, 0L, (long)(this.a * 12), (Buffer)this.c);
                gL2.glVertexPointer(3, 5126, 0, 0L);
            } else {
                gL2.glVertexPointer(3, 5126, 0, (Buffer)this.c);
            }
            gL2.glEnableClientState(32888);
            if (this.d) {
                gL2.glBindBuffer(34962, this.f);
                gL2.glBufferSubData(34962, 0L, (long)(this.a * 8), (Buffer)this.b);
                gL2.glTexCoordPointer(2, 5126, 0, 0L);
            } else {
                gL2.glTexCoordPointer(2, 5126, 0, (Buffer)this.b);
            }
            gL2.glDrawArrays(7, 0, this.a);
            this.c.rewind();
            this.b.rewind();
            this.a = 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void c() {
        if (this.a > 0) {
            TextureRenderer textureRenderer = this.g.q();
            Texture texture = textureRenderer.getTexture();
            GL2 gL2 = GLU.getCurrentGL().getGL2();
            gL2.glBegin(7);
            try {
                int n = this.a / 4;
                this.c.rewind();
                this.b.rewind();
                for (int k = 0; k < n; ++k) {
                    gL2.glTexCoord2f(this.b.get(), this.b.get());
                    gL2.glVertex3f(this.c.get(), this.c.get(), this.c.get());
                    gL2.glTexCoord2f(this.b.get(), this.b.get());
                    gL2.glVertex3f(this.c.get(), this.c.get(), this.c.get());
                    gL2.glTexCoord2f(this.b.get(), this.b.get());
                    gL2.glVertex3f(this.c.get(), this.c.get(), this.c.get());
                    gL2.glTexCoord2f(this.b.get(), this.b.get());
                    gL2.glVertex3f(this.c.get(), this.c.get(), this.c.get());
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            finally {
                gL2.glEnd();
                this.c.rewind();
                this.b.rewind();
                this.a = 0;
            }
        }
    }
}

