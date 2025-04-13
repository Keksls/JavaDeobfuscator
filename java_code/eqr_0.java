/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eQR
 */
class eqr_0
implements eqw_0 {
    private static final Logger a = Logger.getLogger(eqr_0.class);
    private erh_1 b;

    eqr_0() {
    }

    eqr_0(erh_1 erh_12) {
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
            eQk2.a(this.b);
        }
        catch (erq_1 erq_12) {
            a.error((Object)"Impossible d'ajouter le bonus", (Throwable)erq_12);
        }
    }

    @Override
    public eqy_0 b() {
        return eqy_0.d;
    }

    public String toString() {
        return "AddBonusChange{m_bonus=" + this.b + "}";
    }
}

