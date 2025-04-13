/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class csl
extends ps_0 {
    private long a;
    private String b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        return false;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    @Override
    public int a() {
        return 12231;
    }

    @Override
    public String toString() {
        return "CompanionUpdateNameMessage{m_companionId=" + this.a + ", m_name='" + this.b + "'}";
    }
}

