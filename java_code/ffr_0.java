/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ffR
 */
class ffr_0
implements ffc_0 {
    private int a;

    ffr_0() {
    }

    ffr_0(int n) {
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
        ffv2.c(this.a);
    }

    @Override
    public fff_0 b() {
        return fff_0.b;
    }

    public String toString() {
        return "PetHealthChangeEvent{m_health=" + this.a + "}";
    }
}

