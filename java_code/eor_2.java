/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eOr
 */
class eor_2 {
    final vl_0 a;
    final VW b;

    public VW a() {
        return this.b;
    }

    public vl_0 b() {
        return this.a;
    }

    public int c() {
        return this.a.d() + 2 + 1;
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.b.e());
        byteBuffer.put((byte)(this.b.d() ? 1 : 0));
        this.a.b(byteBuffer);
    }

    public static eor_2 a(vz_0 vz_02, long l, ByteBuffer byteBuffer) {
        short s2 = byteBuffer.getShort();
        boolean bl = byteBuffer.get() == 1;
        return new eor_2(vl_0.b(vz_02, byteBuffer), VW.a(l).b(s2).a(bl));
    }

    public static eor_2 a(vl_0 vl_02, VW vW) {
        return new eor_2(vl_02, vW);
    }

    eor_2(vl_0 vl_02, VW vW) {
        this.a = vl_02;
        this.b = vW;
    }
}

