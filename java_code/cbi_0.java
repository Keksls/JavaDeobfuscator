/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBI
 */
public final class cbi_0
extends ps_0 {
    private byte a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        return true;
    }

    @Override
    public int a() {
        return 23226;
    }

    public byte b() {
        return this.a;
    }
}

