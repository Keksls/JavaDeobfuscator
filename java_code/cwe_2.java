/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwe
 */
public class cwe_2
extends ps_0 {
    private long a;
    private long b;

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 13334;
    }
}

