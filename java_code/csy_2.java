/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csY
 */
public abstract class csy_2
extends ps_0 {
    protected static final int a = 4;
    private int b = -1;

    protected void a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
    }

    public int d() {
        return this.b;
    }
}

