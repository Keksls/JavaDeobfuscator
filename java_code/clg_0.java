/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clG
 */
public class clg_0
extends Pw {
    private final int a;

    public clg_0(int n) {
        this.a = n;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13390;
    }

    @Override
    public String toString() {
        return "AchievementTryToActivateRequestMessage{m_achievementId=" + this.a + "}";
    }
}

