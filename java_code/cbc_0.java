/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBC
 */
public class cbc_0
extends ps_0 {
    private long a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        return false;
    }

    public long b() {
        return this.a;
    }

    @Override
    public int a() {
        return 22274;
    }
}

