/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxe
 */
public class cxe_1
extends ps_0 {
    private long a;
    private int b;
    private int c;
    private int d;
    private boolean e;

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 13694;
    }
}

