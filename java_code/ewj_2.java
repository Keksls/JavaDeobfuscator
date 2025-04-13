/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eWJ
 */
class ewj_2
implements ewk_2 {
    private static final Logger a = Logger.getLogger(ewj_2.class);
    private long b;
    private short c;
    private long d;

    ewj_2() {
    }

    ewj_2(long l, long l2, short s2) {
        this.d = l;
        this.b = l2;
        this.c = s2;
    }

    @Override
    public byte[] a() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(18);
        byteBuffer.putLong(this.d);
        byteBuffer.putLong(this.b);
        byteBuffer.putShort(this.c);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.d = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getShort();
    }

    @Override
    public void a(ewt_1 ewt_12) {
        try {
            if (this.b == -1L) {
                exk_2 exk_22 = ewt_12.b(this.d);
                if (exk_22 != null) {
                    exk_22.release();
                }
            } else {
                ewt_12.a(this.d, this.b, this.c, (short)-1);
            }
        }
        catch (exf_2 exf_22) {
            a.error((Object)("Impossible de retirer l'objet : " + exf_22.getMessage()));
        }
    }

    @Override
    public ewm_2 b() {
        return ewm_2.b;
    }

    public String toString() {
        return "RemoveItemChange{m_itemId=" + this.d + "}";
    }
}

