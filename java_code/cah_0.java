/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAH
 */
public class cah_0
extends ps_0 {
    private boolean a = false;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() != 0;
        this.b = byteBuffer.getLong();
        return false;
    }

    public boolean b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13998;
    }
}

