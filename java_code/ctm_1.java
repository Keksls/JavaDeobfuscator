/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctm
 */
public class ctm_1
extends ps_0 {
    private long a;
    private byte b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        return true;
    }

    public final long b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    @Override
    public int a() {
        return 12295;
    }

    @Override
    public String toString() {
        return "FightInvitationMessage{m_fighterId=" + this.a + ", m_fightType=" + this.b + "}";
    }
}

