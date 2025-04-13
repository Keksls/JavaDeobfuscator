/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyC
 */
public class cyc_1
extends ps_0 {
    private long a;
    private byte b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        return false;
    }

    public long b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    @Override
    public int a() {
        return 12237;
    }

    @Override
    public String toString() {
        return "SpellDeckRemovedMessage{m_characterId=" + this.a + ", m_deckIndex=" + this.b + "}";
    }
}

