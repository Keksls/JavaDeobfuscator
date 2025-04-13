/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvJ
 */
public class cvj_2
extends ps_0 {
    private long a = -1L;
    private int b = -1;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12369;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    @Override
    public String toString() {
        return "MimiSymbicResultMessage{m_itemStatUid=" + this.a + ", m_itemSkinRefId=" + this.b + "}";
    }
}

