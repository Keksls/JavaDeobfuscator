/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from asD
 */
public class asd_2
extends ase_2 {
    static final int a = 756423;
    private final gk_0 c = new gk_0(102400);

    public asd_2(int n, int n2) {
        super(n, n2);
        this.c.a(n2 - 756423);
    }

    public byte[] b() {
        return this.c.a();
    }

    public void c() {
        this.c.d();
    }

    @Override
    public long a() {
        return this.c.b();
    }

    public void a(boolean bl) {
        this.p();
        byte by = bl ? (byte)1 : 0;
        this.c.a((byte)(by + this.b));
    }

    public void a(byte by) {
        this.p();
        this.c.a((byte)(by + this.b));
    }

    public void a(short s2) {
        this.p();
        this.c.a((short)(s2 + this.b));
    }

    public void a(float f2) {
        this.p();
        this.c.a(f2);
    }

    public void a(int n) {
        this.p();
        this.c.a(n + this.b);
    }

    public void a(double d2) {
        this.p();
        this.c.b(d2);
    }

    public void a(long l) {
        this.p();
        this.c.c(l + (long)this.b);
    }

    public void a(String string) {
        byte[] byArray = Cz.a(string);
        this.a(byArray.length);
        this.c.a(byArray);
    }

    public void a(byte[] byArray) {
        if (byArray == null) {
            this.a(0);
            return;
        }
        this.a(byArray.length);
        for (int k = 0; k < byArray.length; ++k) {
            this.a(byArray[k]);
        }
    }

    public void a(int[] nArray) {
        if (nArray == null) {
            this.a(0);
            return;
        }
        this.a(nArray.length);
        for (int k = 0; k < nArray.length; ++k) {
            this.a(nArray[k]);
        }
    }

    public void a(short[] sArray) {
        if (sArray == null) {
            this.a(0);
            return;
        }
        this.a(sArray.length);
        for (int k = 0; k < sArray.length; ++k) {
            this.a(sArray[k]);
        }
    }

    public void a(float[] fArray) {
        if (fArray == null) {
            this.a(0);
            return;
        }
        this.a(fArray.length);
        for (int k = 0; k < fArray.length; ++k) {
            this.a(fArray[k]);
        }
    }

    public void a(String[] stringArray) {
        if (stringArray == null) {
            this.a(0);
            return;
        }
        this.a(stringArray.length);
        for (int k = 0; k < stringArray.length; ++k) {
            this.a(stringArray[k]);
        }
    }

    public void a(long[] lArray) {
        if (lArray == null) {
            this.a(0);
            return;
        }
        this.a(lArray.length);
        for (int k = 0; k < lArray.length; ++k) {
            this.a(lArray[k]);
        }
    }

    public void a(Object object) {
        ((asf_2)object).a(this);
    }

    public byte d() {
        return this.b;
    }
}

