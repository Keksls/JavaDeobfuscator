/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eWI
 */
class ewi_2
implements ewk_2 {
    private static final Logger a = Logger.getLogger(ewi_2.class);
    private long b;
    private short c;
    private short d;
    private long e;

    ewi_2() {
    }

    ewi_2(long l, short s2, long l2, short s3) {
        this.b = l;
        this.c = s2;
        this.e = l2;
        this.d = s3;
    }

    @Override
    public byte[] a() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putLong(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.putLong(this.e);
        byteBuffer.putShort(this.d);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getShort();
        this.e = byteBuffer.getLong();
        this.d = byteBuffer.getShort();
    }

    @Override
    public void a(ewt_1 ewt_12) {
        try {
            if (this.e == -1L || this.e == 0L) {
                ewt_12.a(this.b, this.c);
            } else {
                short s2 = (short)(ewt_12.c(this.b) - this.c);
                ewt_12.a(this.b, this.e, this.d, s2);
            }
        }
        catch (exf_2 exf_22) {
            a.error((Object)("Impossible de modifier la quantit\u00e9. " + exf_22.getMessage()));
        }
    }

    @Override
    public ewm_2 b() {
        return ewm_2.c;
    }

    public String toString() {
        return "ItemQuantityChange{m_itemId=" + this.b + ", m_quantity=" + this.c + "}";
    }
}

