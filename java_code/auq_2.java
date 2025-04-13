/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from auq
 */
public class auq_2
extends auo_2 {
    protected static Logger b = Logger.getLogger(auq_2.class);
    private static final int c = 1024;
    private static final int d = 1024;
    private static final int e = 2;
    private static final int f = 200;
    private final ByteBuffer[] g = new ByteBuffer[2];
    private final int[] h = new int[2];

    @Override
    public void a() {
        super.a();
        for (int k = 0; k < 2; ++k) {
            this.g[k] = ByteBuffer.allocate(0x400000);
            for (int i2 = 0; i2 < 0x100000; ++i2) {
                this.g[k].putInt(Math.round(Hw.d() * 5.368709E8f));
            }
            this.g[k].rewind();
        }
        this.a.glEnable(3553);
        this.a.glGenTextures(2, this.h, 0);
    }

    @Override
    public void a(aum_2 aum_22) {
        long l = System.nanoTime();
        for (int k = 0; k < 200; ++k) {
            int n = k % 2;
            this.a.glBindTexture(3553, this.h[n]);
            this.a.glPixelStorei(3317, 1);
            this.a((GL)this.a, 32993, this.g[n]);
        }
        long l2 = System.nanoTime() - l;
        l = System.nanoTime();
        for (int k = 0; k < 200; ++k) {
            int n = k % 2;
            this.a.glBindTexture(3553, this.h[n]);
            this.a.glPixelStorei(3317, 1);
            this.a((GL)this.a, 6408, this.g[n]);
        }
        long l3 = System.nanoTime() - l;
        long l4 = 800L;
        if (l2 < l3) {
            aum_22.a(32993);
        } else {
            aum_22.a(6408);
        }
        aum_22.b(800.0 / ((double)l2 / 1.0E9));
        aum_22.a(800.0 / ((double)l3 / 1.0E9));
    }

    @Override
    public void b() {
        this.a.glDeleteTextures(2, this.h, 0);
        for (int k = 0; k < 2; ++k) {
            this.g[k] = null;
        }
        super.b();
    }

    private void a(GL gL, int n, ByteBuffer byteBuffer) {
        gL.glTexImage2D(3553, 0, 32856, 1024, 1024, 0, n, 5121, (Buffer)byteBuffer);
    }

    @Override
    public String c() {
        return "GL bandwidth and texture format";
    }
}

