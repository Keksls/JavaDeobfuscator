/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ffX
 */
class ffx_0
implements ffc_0 {
    private int a;

    ffx_0() {
    }

    ffx_0(int n) {
        this.a = n;
    }

    @Override
    public byte[] a() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.a);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
    }

    @Override
    public void a(ffv ffv2) {
        ffv2.a(this.a);
    }

    @Override
    public fff_0 b() {
        return fff_0.c;
    }

    public String toString() {
        return "PetXpChange{m_xp=" + this.a + "}";
    }
}

