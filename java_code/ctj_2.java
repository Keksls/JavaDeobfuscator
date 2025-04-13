/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctJ
 */
public abstract class ctj_2
extends csy_2 {
    protected static final int b = 12;
    private int c;
    private int d = -1;

    public abstract int b();

    public abstract emd_1 c();

    protected void b(ByteBuffer byteBuffer) {
        this.a(byteBuffer);
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }
}

