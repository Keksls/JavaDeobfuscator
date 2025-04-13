/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyy
 */
public class cyy_1
extends ps_0 {
    private eyo_2 a;
    private long b;
    private eZw c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = eyo_2.values()[byteBuffer.getInt()];
        this.b = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.c = eZy.a(byArray2);
        return true;
    }

    public eyo_2 b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public eZw d() {
        return this.c;
    }

    @Override
    public int a() {
        return 13865;
    }

    @Override
    public String toString() {
        return "ShardsResultMessage{m_itemId=" + this.b + ", m_shards=" + this.c + "}";
    }
}

