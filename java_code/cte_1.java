/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctE
 */
public final class cte_1
extends csy_2 {
    private long b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        return true;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    @Override
    public int a() {
        return 12939;
    }

    @Override
    public String toString() {
        return "PointEffectSelectionActivationMessage{m_fighterId=" + this.b + ", m_remainingMillis=" + this.c + "}";
    }
}

