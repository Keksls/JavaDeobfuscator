/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuQ
 */
public class cuq_1
extends ps_0 {
    private long a;
    private boolean b;

    public long b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 13686;
    }
}

