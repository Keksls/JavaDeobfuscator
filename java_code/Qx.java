/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Qx
extends Pw {
    private final long a;
    private final String b;

    public Qx(long l, String string) {
        this.a = l;
        this.b = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.b);
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + byArray.length);
        byteBuffer.putLong(this.a);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)2, byteBuffer.array());
    }

    public long c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    @Override
    public int a() {
        return 1025;
    }
}

