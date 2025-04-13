/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

/*
 * Renamed from arF
 */
public class arf_1
implements eg_1 {
    public static final ByteOrder a = ByteOrder.LITTLE_ENDIAN;
    private static final Logger b = Logger.getLogger(arf_1.class);
    private final ByteBuffer c;
    private int d = -1;
    private byte e = (byte)-1;
    private byte f = 0;
    private static final ByteBuffer g = ByteBuffer.allocate(0);
    private byte[] h = new byte[128];

    protected arf_1(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("ByteBuffer can't be null");
        }
        this.c = byteBuffer;
        this.c.order(a);
    }

    public static arf_1 a(InputStream inputStream) {
        arf_1 arf_12 = new arf_1(arf_1.b(inputStream));
        inputStream.close();
        return arf_12;
    }

    public static arf_1 a(ByteBuffer byteBuffer) {
        return new arf_1(byteBuffer);
    }

    public static arf_1 a(ByteBuffer byteBuffer, ByteOrder byteOrder) {
        byteBuffer.order(byteOrder);
        return new arf_1(byteBuffer);
    }

    public static arf_1 a(byte[] byArray) {
        return new arf_1(ByteBuffer.wrap(byArray));
    }

    public static arf_1 a(byte[] byArray, ByteOrder byteOrder) {
        return new arf_1(ByteBuffer.wrap(byArray).order(byteOrder));
    }

    protected static ByteBuffer b(InputStream inputStream) {
        byte[] byArray = null;
        while (inputStream.available() != 0) {
            int n;
            int n2 = inputStream.available();
            byte[] byArray2 = new byte[n2];
            for (int k = 0; k != n2; k += n) {
                n = inputStream.read(byArray2, k, n2 - k);
                if (n != -1) continue;
                throw new EOFException("Less data than assumed in the stream. " + n2 + " expected, " + k + " read");
            }
            if (byArray == null) {
                byArray = byArray2;
                continue;
            }
            byte[] byArray3 = new byte[byArray.length + byArray2.length];
            System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
            System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
            byArray = byArray3;
        }
        if (byArray != null) {
            return ByteBuffer.wrap(byArray);
        }
        return ByteBuffer.allocate(0);
    }

    public final void a(ByteOrder byteOrder) {
        this.c.order(byteOrder);
    }

    public final ByteOrder f() {
        return this.c.order();
    }

    public final int e(int n) {
        if (n <= 0) {
            return 0;
        }
        int n2 = this.c.remaining();
        int n3 = Math.min(n2, n);
        this.c.position(this.c.position() + n3);
        return n3;
    }

    public final int g() {
        return this.c.remaining();
    }

    @Override
    public void close() {
    }

    public final int a(byte[] byArray, int n, int n2) {
        int n3 = Math.min(this.g(), Math.min(byArray.length - n, n2));
        this.c.get(byArray, n, n3);
        return n3;
    }

    public final int b(byte[] byArray) {
        int n = Math.min(this.g(), byArray.length);
        this.c.get(byArray, 0, n);
        return n;
    }

    @Override
    public final byte[] a(int n) {
        byte[] byArray = new byte[n];
        this.c.get(byArray);
        return byArray;
    }

    @Override
    public final short[] b(int n) {
        short[] sArray = new short[n];
        for (int k = 0; k < n; ++k) {
            sArray[k] = this.c.getShort();
        }
        return sArray;
    }

    @Override
    public final int[] c(int n) {
        int[] nArray = new int[n];
        for (int k = 0; k < n; ++k) {
            nArray[k] = this.c.getInt();
        }
        return nArray;
    }

    @Override
    public final float[] d(int n) {
        float[] fArray = new float[n];
        for (int k = 0; k < n; ++k) {
            fArray[k] = this.c.getFloat();
        }
        return fArray;
    }

    @Override
    public final float d() {
        return this.c.getFloat();
    }

    @Override
    public final short b() {
        return this.c.getShort();
    }

    public final int h() {
        return this.c.getShort() & 0xFFFF;
    }

    @Override
    public final int c() {
        return this.c.getInt();
    }

    public final long i() {
        return (long)this.c.getInt() & 0xFFFFFFFFL;
    }

    public final long j() {
        return this.c.getLong();
    }

    @Override
    public final byte a() {
        return this.c.get();
    }

    public final short k() {
        return (short)((short)this.c.get() & 0xFF);
    }

    public final boolean l() {
        int n = this.c.position();
        if (n == this.d && this.e <= 6) {
            this.e = (byte)(this.e + 1);
            return (this.f & 1 << 7 - this.e) != 0;
        }
        this.e = 0;
        this.d = n + 1;
        this.f = this.c.get();
        int n2 = this.f & 0x80;
        return n2 != 0;
    }

    @Override
    public final String e() {
        int n;
        int n2 = this.c.limit();
        for (n = this.c.position(); n < n2 && this.c.get(n) != 0; ++n) {
        }
        if (n >= n2) {
            throw new EOFException("Unable to find a valid Null terminated UTF-8 string end.");
        }
        int n3 = n - this.c.position();
        if (n3 > 0) {
            if (n3 > this.h.length) {
                this.h = new byte[n3];
            }
            this.c.get(this.h, 0, n3);
            this.c.get();
            return Cz.a(this.h, 0, n3);
        }
        this.c.get();
        return "";
    }

    public final int m() {
        return this.c.position();
    }

    public final void f(int n) {
        this.c.position(n);
    }
}

