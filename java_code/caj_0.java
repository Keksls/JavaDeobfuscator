/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAJ
 */
public class caj_0
extends ps_0 {
    private int a;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        return true;
    }

    public int b() {
        return this.a;
    }

    @Override
    public int a() {
        return 14821;
    }

    @Override
    public String toString() {
        return "GuildBonusLearnedMessage{m_bonusId=" + this.a + "}";
    }
}

