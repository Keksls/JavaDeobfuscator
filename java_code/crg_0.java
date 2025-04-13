/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crg
 */
public class crg_0
extends ps_0 {
    private long a;
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get() == 1;
        return false;
    }

    @Override
    public int a() {
        return 12644;
    }

    public long b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }
}

