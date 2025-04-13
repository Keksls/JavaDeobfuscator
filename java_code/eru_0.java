/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eRu
 */
class eru_0
implements eqw_0 {
    private static final Logger a = Logger.getLogger(eru_0.class);
    private ern_1 b;

    eru_0() {
    }

    eru_0(ern_1 ern_12) {
        this.b = ern_12;
    }

    @Override
    public byte[] a() {
        return eQw.a(this.b);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.b = eQw.b(byteBuffer);
    }

    @Override
    public void a(eQk eQk2) {
        try {
            eQk2.a(this.b.a(), this.b.b());
            eQk2.b(this.b.a(), this.b.c());
        }
        catch (erq_1 erq_12) {
            a.error((Object)"Impossible de modifier le rang", (Throwable)erq_12);
        }
    }

    @Override
    public eqy_0 b() {
        return eqy_0.i;
    }

    public String toString() {
        return "ModifyRankChange{m_rank=" + this.b + "}";
    }
}

