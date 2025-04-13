/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csn
 */
public final class csn_0
extends ps_0 {
    private long a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        return false;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    @Override
    public int a() {
        return 12203;
    }

    @Override
    public String toString() {
        return "CompanionUpdateXpMessage{m_companionId=" + this.a + ", m_xp=" + this.b + "}";
    }
}

