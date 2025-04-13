/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctB
 */
public final class ctb_1
extends csy_2 {
    private long b;
    private byte c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        return false;
    }

    public long b() {
        return this.b;
    }

    public byte c() {
        return this.c;
    }

    @Override
    public int a() {
        return 13538;
    }

    @Override
    public String toString() {
        return "PlayerChangeConnectionStateMessage{m_playerId=" + this.b + ", m_connectionState=" + this.c + "}";
    }
}

