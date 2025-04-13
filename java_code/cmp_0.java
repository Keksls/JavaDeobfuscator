/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmP
 */
public class cmp_0
extends Pw {
    private aff_1 a;

    public void a(aff_1 aff_12) {
        this.a = aff_12;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putInt(this.a.d());
        byteBuffer.putInt(this.a.e());
        byteBuffer.putShort(this.a.f());
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13109;
    }
}

