/*
 * Decompiled with CFR 0.152.
 */
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

public class Hx
extends Random
implements Serializable {
    private static final long a = 2932129847991607657L;
    private static final Hx b = new Hx();
    private static final int c = 624;
    private static final int d = 397;
    private static final int e = -1727483681;
    private static final int f = Integer.MIN_VALUE;
    private static final int g = Integer.MAX_VALUE;
    private static final int h = -1658038656;
    private static final int i = -272236544;
    private int[] j;
    private int k;
    private int[] l;
    private double m;
    private boolean n;

    public Hx() {
        this(System.currentTimeMillis());
    }

    public Hx(long l) {
        super(l);
        this.setSeed(l);
    }

    public Hx(int[] nArray) {
        super(System.currentTimeMillis());
        this.a(nArray);
    }

    @Override
    public synchronized void setSeed(long l) {
        super.setSeed(l);
        this.n = false;
        this.j = new int[624];
        this.l = new int[2];
        this.l[0] = 0;
        this.l[1] = -1727483681;
        this.j[0] = (int)(l & 0xFFFFFFFL);
        this.k = 1;
        while (this.k < 624) {
            this.j[this.k] = 1812433253 * (this.j[this.k - 1] ^ this.j[this.k - 1] >>> 30) + this.k;
            int n = this.k++;
            this.j[n] = this.j[n] & 0xFFFFFFFF;
        }
    }

    public synchronized void a(int[] nArray) {
        int n;
        this.setSeed(19650218L);
        int n2 = 1;
        int n3 = 0;
        int n4 = n = 624 > nArray.length ? 624 : nArray.length;
        while (n != 0) {
            this.j[n2] = (this.j[n2] ^ (this.j[n2 - 1] ^ this.j[n2 - 1] >>> 30) * 1664525) + nArray[n3] + n3;
            int n5 = n2++;
            this.j[n5] = this.j[n5] & 0xFFFFFFFF;
            ++n3;
            if (n2 >= 624) {
                this.j[0] = this.j[623];
                n2 = 1;
            }
            if (n3 >= nArray.length) {
                n3 = 0;
            }
            --n;
        }
        for (n = 623; n != 0; --n) {
            this.j[n2] = (this.j[n2] ^ (this.j[n2 - 1] ^ this.j[n2 - 1] >>> 30) * 1566083941) - n2;
            int n6 = n2++;
            this.j[n6] = this.j[n6] & 0xFFFFFFFF;
            if (n2 < 624) continue;
            this.j[0] = this.j[623];
            n2 = 1;
        }
        this.j[0] = Integer.MIN_VALUE;
    }

    @Override
    protected synchronized int next(int n) {
        int n2;
        if (this.k >= 624) {
            int n3;
            for (n3 = 0; n3 < 227; ++n3) {
                n2 = this.j[n3] & Integer.MIN_VALUE | this.j[n3 + 1] & Integer.MAX_VALUE;
                this.j[n3] = this.j[n3 + 397] ^ n2 >>> 1 ^ this.l[n2 & 1];
            }
            while (n3 < 623) {
                n2 = this.j[n3] & Integer.MIN_VALUE | this.j[n3 + 1] & Integer.MAX_VALUE;
                this.j[n3] = this.j[n3 + -227] ^ n2 >>> 1 ^ this.l[n2 & 1];
                ++n3;
            }
            n2 = this.j[623] & Integer.MIN_VALUE | this.j[0] & Integer.MAX_VALUE;
            this.j[623] = this.j[396] ^ n2 >>> 1 ^ this.l[n2 & 1];
            this.k = 0;
        }
        n2 = this.j[this.k++];
        n2 ^= n2 >>> 11;
        n2 ^= n2 << 7 & 0x9D2C5680;
        n2 ^= n2 << 15 & 0xEFC60000;
        n2 ^= n2 >>> 18;
        return n2 >>> 32 - n;
    }

    private synchronized void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    private synchronized void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    @Override
    public boolean nextBoolean() {
        return this.next(1) != 0;
    }

    public boolean a(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("probability must be between 0.0 and 1.0 inclusive.");
        }
        if (f2 == 0.0f) {
            return false;
        }
        if (f2 == 1.0f) {
            return true;
        }
        return this.nextFloat() < f2;
    }

    public boolean a(double d2) {
        if (d2 < 0.0 || d2 > 1.0) {
            throw new IllegalArgumentException("probability must be between 0.0 and 1.0 inclusive.");
        }
        if (d2 == 0.0) {
            return false;
        }
        if (d2 == 1.0) {
            return true;
        }
        return this.nextDouble() < d2;
    }

    @Override
    public int nextInt(int n) {
        int n2;
        int n3;
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0) {
            return 0;
        }
        if ((n & -n) == n) {
            return (int)((long)n * (long)this.next(31) >> 31);
        }
        while ((n3 = this.next(31)) - (n2 = n3 % n) + (n - 1) < 0) {
        }
        return n2;
    }

    public long a(long l) {
        long l2;
        long l3;
        if (l < 0L) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (l == 0L) {
            return 0L;
        }
        while ((l3 = this.nextLong() >>> 1) - (l2 = l3 % l) + (l - 1L) < 0L) {
        }
        return l2;
    }

    @Override
    public double nextDouble() {
        return (double)(((long)this.next(26) << 27) + (long)this.next(27)) / 9.007199254740992E15;
    }

    @Override
    public float nextFloat() {
        return (float)this.next(24) / 1.6777216E7f;
    }

    @Override
    public void nextBytes(byte[] byArray) {
        for (int k = 0; k < byArray.length; ++k) {
            byArray[k] = (byte)this.next(8);
        }
    }

    public char a() {
        return (char)this.next(16);
    }

    public short b() {
        return (short)this.next(16);
    }

    public byte c() {
        return (byte)this.next(8);
    }

    @Override
    public synchronized double nextGaussian() {
        double d2;
        double d3;
        double d4;
        if (this.n) {
            this.n = false;
            return this.m;
        }
        while ((d4 = (d3 = 2.0 * this.nextDouble() - 1.0) * d3 + (d2 = 2.0 * this.nextDouble() - 1.0) * d2) >= 1.0 || d4 == 0.0) {
        }
        double d5 = Math.sqrt(-2.0 * Math.log(d4) / d4);
        this.m = d2 * d5;
        this.n = true;
        return d3 * d5;
    }

    public static synchronized Hx d() {
        return b;
    }
}

