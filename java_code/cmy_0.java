/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmY
 */
public class cmy_0
extends Pw {
    private aff_1 a;
    private end_1 b;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(11);
        byteBuffer.putInt(this.a.d());
        byteBuffer.putInt(this.a.e());
        byteBuffer.putShort(this.a.f());
        byteBuffer.put(this.b.a());
        return this.a((byte)3, byteBuffer.array());
    }

    public void a(aff_1 aff_12) {
        this.a = aff_12;
    }

    public void a(end_1 end_12) {
        this.b = end_12;
    }

    @Override
    public int a() {
        return 12011;
    }
}

