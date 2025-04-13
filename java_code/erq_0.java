/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eRq
 */
class erq_0
implements eqw_0 {
    private static final Logger a = Logger.getLogger(erq_0.class);
    private int b;

    erq_0() {
    }

    erq_0(int n) {
        this.b = n;
    }

    @Override
    public byte[] a() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.b);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
    }

    @Override
    public void a(eQk eQk2) {
        try {
            if (this.b > 0) {
                eQk2.d(this.b);
            } else {
                eQk2.b(Math.abs(this.b));
            }
        }
        catch (erq_1 erq_12) {
            a.error((Object)"Impossible de retirer le membre", (Throwable)erq_12);
        }
    }

    @Override
    public eqy_0 b() {
        return eqy_0.k;
    }

    public String toString() {
        return "GuildPointsChange{m_guildPoints=" + this.b + "}";
    }
}

