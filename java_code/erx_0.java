/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eRx
 */
class erx_0
implements eqw_0 {
    private static final Logger a = Logger.getLogger(erx_0.class);
    private int b;

    erx_0() {
    }

    erx_0(erh_1 erh_12) {
        this.b = erh_12.a();
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
            eQk2.a(this.b);
        }
        catch (erq_1 erq_12) {
            a.error((Object)"Impossible de retirer le bonus", (Throwable)erq_12);
        }
    }

    @Override
    public eqy_0 b() {
        return eqy_0.e;
    }

    public String toString() {
        return "RemoveBonusChange{m_bonusId=" + this.b + "}";
    }
}

