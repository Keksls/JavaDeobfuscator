/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eQU
 */
public class equ_0
implements eqw_0 {
    private long a;

    equ_0() {
    }

    equ_0(long l) {
        this.a = l;
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
    public void a(eQk eQk2) {
        eQk2.a(this.a);
    }

    @Override
    public eqy_0 b() {
        return eqy_0.p;
    }

    public String toString() {
        return "BlazonChange{m_blazon=" + this.a + "}";
    }
}

