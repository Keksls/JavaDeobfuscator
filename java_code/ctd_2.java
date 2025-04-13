/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

/*
 * Renamed from ctd
 */
public final class ctd_2
extends csy_2 {
    private long b;
    private byte[] c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getLong();
        this.c = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.c);
        return false;
    }

    public long b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }

    @Override
    public int a() {
        return 12739;
    }

    @Override
    public String toString() {
        return "CharacterEffectManagerForReconnectionMessage{m_characterId=" + this.b + ", m_serializedEffects=" + Arrays.toString(this.c) + "}";
    }
}

