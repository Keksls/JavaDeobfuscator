/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctz
 */
public final class ctz_2
extends ps_0 {
    private long a;
    private int b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        return true;
    }

    public int b() {
        return this.b;
    }

    @Override
    public int a() {
        return 13262;
    }

    public long c() {
        return this.a;
    }

    @Override
    public String toString() {
        return "HeroJoinFightErrorMessage{m_heroId=" + this.a + ", m_errorCode=" + this.b + "}";
    }
}

