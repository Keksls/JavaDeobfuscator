/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnT
 */
public class cnt_0
extends Pw {
    private short a;
    private long b;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putShort(this.a);
        byteBuffer.putLong(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13769;
    }

    public void a(short s2) {
        this.a = s2;
    }

    public void a(long l) {
        this.b = l;
    }

    @Override
    public String toString() {
        return "MergeIntoItemSetRequestMessage{m_itemSetId=" + this.a + "}";
    }
}

