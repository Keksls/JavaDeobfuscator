/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eRz
 */
class erz_0
implements eqw_0 {
    private static final Logger a = Logger.getLogger(erz_0.class);
    private long b;

    erz_0() {
    }

    erz_0(ern_1 ern_12) {
        this.b = ern_12.a();
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
            eQk2.c(this.b);
        }
        catch (erq_1 erq_12) {
            a.error((Object)"Impossible d'ajouter le rang", (Throwable)erq_12);
        }
    }

    @Override
    public eqy_0 b() {
        return eqy_0.h;
    }

    public String toString() {
        return "RemoveRankChange{m_rankId=" + this.b + "}";
    }
}

