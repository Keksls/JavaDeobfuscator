/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvR
 */
public class cvr_2
extends ps_0 {
    private long a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        return true;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    @Override
    public int a() {
        return 12334;
    }

    @Override
    public String toString() {
        return "ItemXpChangeMessage{m_itemId=" + this.a + ", m_xp=" + this.b + "}";
    }
}

