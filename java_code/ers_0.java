/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eRs
 */
class ers_0
implements eqw_0 {
    private static final Logger a = Logger.getLogger(ers_0.class);
    private erh_1 b;

    ers_0() {
    }

    ers_0(erh_1 erh_12) {
        this.b = erh_12;
    }

    @Override
    public byte[] a() {
        return eQw.a(this.b);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.b = eQw.c(byteBuffer);
    }

    @Override
    public void a(eQk eQk2) {
        try {
            eQk2.a(this.b.a(), this.b.c());
        }
        catch (erq_1 erq_12) {
            a.error((Object)"Impossible de modifier le bonus", (Throwable)erq_12);
        }
    }

    @Override
    public eqy_0 b() {
        return eqy_0.f;
    }

    public String toString() {
        return "ModifyBonusChange{m_bonus=" + this.b + "}";
    }
}

