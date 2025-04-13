/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class QH
extends ps_0 {
    private long a;
    private String b;
    private byte c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = byteBuffer.get();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        this.a = byteBuffer.getLong();
        return true;
    }

    public String b() {
        return this.b;
    }

    public byte c() {
        return this.c;
    }

    public long d() {
        return this.a;
    }

    @Override
    public int a() {
        return 1046;
    }

    @Override
    public String toString() {
        return "GroupInvitationRequestMessage{m_inviterId=" + this.a + ", m_inviterName='" + this.b + "', m_groupType=" + this.c + "}";
    }
}

