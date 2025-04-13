/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;

/*
 * Renamed from bRE
 */
public class bre_0 {
    private int a;
    private wy_0[] b;
    private int[] c;
    private int[] d;
    private int[] e;
    private float[] f;
    private float[] g;
    private Yf[] h;
    private HashMap<wy_0, float[]> i;

    public int a() {
        return this.a;
    }

    public wy_0 a(int n) {
        return this.b[n];
    }

    public int b(int n) {
        return this.c[n];
    }

    public int c(int n) {
        return this.d[n];
    }

    public int d(int n) {
        return this.e[n];
    }

    public float e(int n) {
        return this.f[n];
    }

    public float f(int n) {
        return this.g[n];
    }

    public Yf g(int n) {
        return this.h[n];
    }

    public float[] a(wy_0 wy_02) {
        return this.i.get((Object)wy_02);
    }

    public void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get() & 0xFF;
        if (this.a > 0) {
            int n;
            int n2;
            this.b = new wy_0[this.a];
            this.c = new int[this.a];
            this.d = new int[this.a];
            this.f = new float[this.a];
            this.h = new Yf[this.a];
            this.e = new int[this.a];
            this.g = new float[this.a];
            for (n2 = 0; n2 < this.a; ++n2) {
                this.b[n2] = wy_0.values()[byteBuffer.get() & 0xFF];
                this.c[n2] = byteBuffer.get();
                this.d[n2] = byteBuffer.get();
                this.f[n2] = (float)(byteBuffer.getShort() & 0xFFFF) / 65535.0f;
                this.h[n2] = Yf.a(byteBuffer.getInt());
                this.e[n2] = byteBuffer.get();
                this.g[n2] = (float)byteBuffer.getShort() / 32767.0f;
            }
            this.i = new HashMap();
            n2 = byteBuffer.get() & 0xFF;
            for (n = 0; n < n2; ++n) {
                wy_0 wy_02 = wy_0.values()[byteBuffer.get() & 0xFF];
                float f2 = byteBuffer.get();
                float f3 = byteBuffer.get();
                this.i.put(wy_02, new float[]{f2, f3});
            }
            n = 2 - n2;
            for (int k = 0; k < n; ++k) {
                byteBuffer.getShort();
                byteBuffer.get();
            }
        }
    }

    public void b() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}

