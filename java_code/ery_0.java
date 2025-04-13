/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eRy
 */
class ery_0
implements eqw_0 {
    private static final Logger a = Logger.getLogger(ery_0.class);
    private long b;

    ery_0() {
    }

    ery_0(erl_1 erl_12) {
        this.b = erl_12.a();
    }

    @Override
    public byte[] a() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.b);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
    }

    @Override
    public void a(eQk eQk2) {
        try {
            eQk2.b(this.b);
        }
        catch (erq_1 erq_12) {
            a.error((Object)"Impossible de retirer le membre", (Throwable)erq_12);
        }
    }

    @Override
    public eqy_0 b() {
        return eqy_0.b;
    }

    public String toString() {
        return "RemoveMemberChange{m_memberId=" + this.b + "}";
    }
}

