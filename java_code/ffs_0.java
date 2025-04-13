/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ffS
 */
class ffs_0
implements ffc_0 {
    private long a;

    ffs_0() {
    }

    ffs_0(wu_0 wu_02) {
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
        ffv2.b(wt_0.b(this.a));
    }

    @Override
    public fff_0 b() {
        return fff_0.e;
    }

    public String toString() {
        return "PetLastHungryDateChange{m_lastHungryDate=" + this.a + "}";
    }
}

