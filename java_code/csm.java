/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class csm
extends ps_0 {
    private long a;
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get() == 1;
        return true;
    }

    public long b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13408;
    }

    @Override
    public String toString() {
        return "CompanionUpdateUnlockedMessage{m_companionId=" + this.a + ", m_isUnlocked=" + this.b + "}";
    }
}

