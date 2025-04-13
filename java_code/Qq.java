/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Qq
extends Pw {
    private final byte a;
    private final String b;

    public Qq(byte by, String string) {
        this.a = by;
        this.b = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.b);
        ByteBuffer byteBuffer = ByteBuffer.allocate(2 + byArray.length);
        byteBuffer.put(this.a);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)3, byteBuffer.array());
    }

    public byte c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    @Override
    public int a() {
        return 1027;
    }
}

