/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fht
 */
public class fht_0
extends fhx {
    private long a;

    public fht_0(ByteBuffer byteBuffer) {
        this.a(byteBuffer);
    }

    public fht_0(int n, int n2, long l) {
        super(n, n2);
        this.a = l;
    }

    public long b() {
        return this.a;
    }

    @Override
    void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
    }

    @Override
    final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getLong();
    }

    @Override
    public fhu a() {
        return fhu.c;
    }

    public String toString() {
        return "EntriesByGuild{m_guildId=" + this.a + "}";
    }
}

