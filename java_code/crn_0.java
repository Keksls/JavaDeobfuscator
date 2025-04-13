/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crn
 */
public class crn_0
extends cwj_2 {
    private long f;
    private long g;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.d = byteBuffer.get();
        this.a = byteBuffer.getShort();
        this.c = byteBuffer.getLong();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.getLong();
        return true;
    }

    public long b() {
        return this.g;
    }

    @Override
    public int a() {
        return 13763;
    }

    public long c() {
        return this.f;
    }

    @Override
    public String toString() {
        return "StartCollectOnInteractiveElementMessage{m_interactifElementId=" + this.f + ", m_collectTime=" + this.g + "}";
    }
}

