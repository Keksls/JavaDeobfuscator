/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAO
 */
public class cao_0
extends ps_0 {
    private String a;
    private String b;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        byte[] byArray3 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray3);
        this.b = Cz.a(byArray3);
        return true;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    @Override
    public int a() {
        return 14232;
    }

    @Override
    public String toString() {
        return "GuildInvitationMessage{m_inviterName='" + this.a + "', m_guildName='" + this.b + "'}";
    }
}

