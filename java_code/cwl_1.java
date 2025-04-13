/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwl
 */
public class cwl_1
extends ps_0 {
    private long a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getLong();
        this.a = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12588;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }
}

