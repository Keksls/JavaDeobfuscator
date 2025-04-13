/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwP
 */
public class cwp_1
extends ps_0 {
    private long a;

    public long b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 13571;
    }
}

