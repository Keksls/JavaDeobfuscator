/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czH
 */
public class czh_2
extends Pw {
    private final boolean a;

    public czh_2(boolean bl) {
        this.a = bl;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put((byte)(this.a ? 1 : 0));
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 14307;
    }

    @Override
    public String toString() {
        return "GuildInvitationResultMessage{m_accepted=" + this.a + "}";
    }
}

