/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvF
 */
public class cvf_1
extends ps_0 {
    private long a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12543;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }
}

