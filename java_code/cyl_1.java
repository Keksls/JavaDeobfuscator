/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyl
 */
public class cyl_1
extends ps_0 {
    private int a;
    private byte b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12092;
    }

    public int b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }
}

