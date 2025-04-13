/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eQV
 */
class eqv_0
implements eqw_0 {
    private static final Logger a = Logger.getLogger(eqv_0.class);
    private String b;

    eqv_0() {
    }

    eqv_0(String string) {
        this.b = string;
    }

    @Override
    public byte[] a() {
        byte[] byArray = Cz.a(this.b);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + byArray.length);
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.b = Cz.a(byArray);
    }

    @Override
    public void a(eQk eQk2) {
        try {
            eQk2.a(this.b);
        }
        catch (erq_1 erq_12) {
            a.error((Object)"Impossible de changer la description", (Throwable)erq_12);
        }
    }

    @Override
    public eqy_0 b() {
        return eqy_0.m;
    }

    public String toString() {
        return "DescriptionChange{m_description='" + this.b + "'}";
    }
}

