/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czY
 */
public class czy_1
extends Pw {
    private short a;

    public void a(short s2) {
        this.a = s2;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.putShort(this.a);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 14985;
    }
}

