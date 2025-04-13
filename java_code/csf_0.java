/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csf
 */
public class csf_0
extends ps_0 {
    private long a;
    private String b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        short s2 = byteBuffer.get();
        if (byteBuffer.remaining() < s2) {
            A.warn((Object)String.format("Invalid remaining size of buffer for character name: expected %s, got %s.", s2, byteBuffer.remaining()));
            this.b = null;
            return false;
        }
        byte[] byArray2 = new byte[s2];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        return true;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13048;
    }

    @Override
    public String toString() {
        return String.format("RemovePlayerChatMsgMessage{m_characterId=%s, m_characterName=%s}", this.a, this.b);
    }
}

