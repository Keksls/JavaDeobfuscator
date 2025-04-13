/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eRp
 */
class erp_0
implements eqw_0 {
    private static final Logger a = Logger.getLogger(erp_0.class);
    private short b;

    erp_0() {
    }

    erp_0(short s2) {
        this.b = s2;
    }

    @Override
    public byte[] a() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.putShort(this.b);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
    }

    @Override
    public void a(eQk eQk2) {
        try {
            eQk2.a(this.b);
        }
        catch (erq_1 erq_12) {
            a.error((Object)"Impossible de retirer le membre", (Throwable)erq_12);
        }
    }

    @Override
    public eqy_0 b() {
        return eqy_0.l;
    }

    public String toString() {
        return "GuildPointsChange{m_guildLevel=" + this.b + "}";
    }
}

