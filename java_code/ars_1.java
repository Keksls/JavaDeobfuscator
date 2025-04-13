/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import org.apache.log4j.Logger;

/*
 * Renamed from arS
 */
public abstract class ars_1 {
    protected static final Logger a = Logger.getLogger(ars_1.class);
    private static final CRC32 b = new CRC32();
    private int c;
    private short d;
    private long e = System.currentTimeMillis();
    private long f = Long.MAX_VALUE;
    private boolean g = false;
    private final boolean h;

    private ars_1() {
        this.h = false;
    }

    protected ars_1(short s2) {
        this();
        this.d = s2;
    }

    public int G() {
        return this.c;
    }

    public void e(int n) {
        this.c = n;
    }

    public short H() {
        return this.d;
    }

    public void e(short s2) {
        this.d = s2;
    }

    public long a(byte[] byArray) {
        long l;
        if (byArray != null && byArray.length > 0) {
            b.reset();
            b.update(byArray);
            l = b.getValue();
        } else {
            l = 0L;
        }
        return l;
    }

    public final void I() {
        if (!this.h) {
            if (this.f < Long.MAX_VALUE) {
                this.g = true;
            }
        } else {
            a.error((Object)("toggleModified sur un BinaryStorable flagg\u00e9 UNUSED " + this.G()));
        }
    }

    public abstract int f();

    public abstract byte[] e();

    public abstract void a(ByteBuffer var1, int var2, short var3);

    public abstract ars_1 a();

    public long J() {
        return this.f;
    }

    public void a(long l) {
        this.f = l;
    }

    public boolean K() {
        return this.g;
    }

    public long L() {
        return this.e;
    }

    public void a(arm_1 arm_12) {
        arm_12.a(arq_1.b, (Object)this);
        this.g = false;
        this.e = System.currentTimeMillis();
    }

    public void b(arm_1 arm_12) {
        arm_12.a(arq_1.a, (Object)this);
        this.g = false;
        this.e = System.currentTimeMillis();
    }

    public boolean M() {
        return this.h;
    }

    public String toString() {
        return "Bstorable type:" + this.f() + ", id:" + this.G() + ", version:" + this.H();
    }
}

