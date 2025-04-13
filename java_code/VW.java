/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.text.MessageFormat;
import org.jetbrains.annotations.NotNull;

public class VW
implements Comparable<VW> {
    private long a;
    private int b;
    private short c;
    private boolean d;
    private static final VW e = new VW(0L, 0, -1, false);

    public VW() {
    }

    public VW(long l, short s2, boolean bl) {
        this.d = bl;
        this.a = l;
        this.c = s2;
    }

    public VW(long l, int n, short s2, boolean bl) {
        this.d = bl;
        this.a = l;
        this.b = n;
        this.c = s2;
    }

    public VW(VW vW) {
        this(vW.a, vW.b, vW.c, vW.d);
    }

    public static VW a() {
        return e;
    }

    public boolean b() {
        return this.c < 0;
    }

    public long c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }

    public short e() {
        return this.c;
    }

    public void a(int n) {
        this.b = n;
    }

    public int f() {
        return this.b;
    }

    public static VW a(long l) {
        VW vW = new VW();
        vW.a = l;
        return vW;
    }

    public VW b(int n) {
        this.c = (short)n;
        return this;
    }

    public VW a(boolean bl) {
        this.d = bl;
        return this;
    }

    public static int g() {
        return 11;
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putShort(this.c);
        byteBuffer.put((byte)(this.d ? 1 : 0));
    }

    public static VW b(ByteBuffer byteBuffer) {
        VW vW = new VW();
        vW.c(byteBuffer);
        return vW;
    }

    void c(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.get() == 1;
    }

    public String toString() {
        return MessageFormat.format("@T{0}{2}({1})", this.c, this.a, this.d ? "+" : "-");
    }

    public int a(@NotNull VW vW) {
        if (this == vW) {
            return 0;
        }
        if (this.h()) {
            return -1;
        }
        if (vW == null || vW.h()) {
            return 1;
        }
        if (vW.a != this.a) {
            return 0;
        }
        int n = Integer.signum(this.c - vW.c);
        if (n != 0) {
            return n;
        }
        return (this.d ? 1 : 0) - (vW.d ? 1 : 0);
    }

    public boolean h() {
        return this.e() == e.e() && this.c() == e.c() && this.d() == e.d();
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((VW)object);
    }
}

