/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from asC
 */
public class asc_2
extends ase_2 {
    private final ByteBuffer a;

    public asc_2(ByteBuffer byteBuffer, int n, int n2) {
        super(n, n2);
        this.a = byteBuffer;
    }

    @Override
    public long a() {
        return this.a.position();
    }

    protected void a(int n, byte by) {
        this.b = by;
        this.a.position(n);
    }

    public byte b() {
        this.p();
        return (byte)(this.a.get() - this.b);
    }

    public boolean c() {
        this.p();
        return this.a.get() - this.b != 0;
    }

    public short d() {
        this.p();
        return (short)(this.a.getShort() - this.b);
    }

    public float e() {
        this.p();
        return this.a.getFloat();
    }

    public int f() {
        this.p();
        return this.a.getInt() - this.b;
    }

    public double g() {
        this.p();
        return this.a.getDouble();
    }

    public long h() {
        this.p();
        return this.a.getLong() - (long)this.b;
    }

    public String i() {
        int n = this.f();
        byte[] byArray = new byte[n];
        this.a.get(byArray);
        return Cz.a(byArray);
    }

    public byte[] j() {
        int n = this.f();
        byte[] byArray = new byte[n];
        for (int k = 0; k < n; ++k) {
            byArray[k] = this.b();
        }
        return byArray;
    }

    public int[] k() {
        int n = this.f();
        int[] nArray = new int[n];
        for (int k = 0; k < n; ++k) {
            nArray[k] = this.f();
        }
        return nArray;
    }

    public short[] l() {
        int n = this.f();
        short[] sArray = new short[n];
        for (int k = 0; k < n; ++k) {
            sArray[k] = this.d();
        }
        return sArray;
    }

    public float[] m() {
        int n = this.f();
        float[] fArray = new float[n];
        for (int k = 0; k < n; ++k) {
            fArray[k] = this.e();
        }
        return fArray;
    }

    public String[] n() {
        int n = this.f();
        String[] stringArray = new String[n];
        for (int k = 0; k < n; ++k) {
            stringArray[k] = this.i();
        }
        return stringArray;
    }

    public long[] o() {
        int n = this.f();
        long[] lArray = new long[n];
        for (int k = 0; k < n; ++k) {
            lArray[k] = this.h();
        }
        return lArray;
    }
}

