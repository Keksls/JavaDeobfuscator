/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Qv
extends Pw {
    private final byte a;
    private final boolean b;
    private final long c;

    public Qv(boolean bl, long l, byte by) {
        this.b = bl;
        this.a = by;
        this.c = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.put(this.a);
        byteBuffer.put((byte)(this.b ? 1 : 0));
        byteBuffer.putLong(this.c);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public final int a() {
        return 1074;
    }

    @Override
    public String toString() {
        return "GroupInvitationByIdAnswerMessage{m_groupType=" + this.a + ", m_invitationAccepted=" + this.b + ", m_inviterId=" + this.c + "}";
    }
}

