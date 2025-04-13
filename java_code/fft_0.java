/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ffT
 */
class fft_0
implements ffc_0 {
    private long a;

    fft_0() {
    }

    fft_0(wu_0 wu_02) {
        this.a = wu_02.h();
    }

    @Override
    public byte[] a() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.a);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
    }

    @Override
    public void a(ffv ffv2) {
        ffv2.a(wt_0.b(this.a));
    }

    @Override
    public fff_0 b() {
        return fff_0.d;
    }

    public String toString() {
        return "PetLastMealDateChange{m_lastMealDate=" + this.a + "}";
    }
}

