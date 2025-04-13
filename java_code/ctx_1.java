/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctx
 */
public class ctx_1
extends csy_2 {
    private long b;
    private boolean c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 13413;
    }

    public boolean b() {
        return this.c;
    }

    public long c() {
        return this.b;
    }
}

