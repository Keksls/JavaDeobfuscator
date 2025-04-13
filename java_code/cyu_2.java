/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyU
 */
public abstract class cyu_2
extends ps_0 {
    protected static final int a = 8;
    private int b;
    private int c = -1;

    public abstract int b();

    public abstract fke c();

    protected void a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

