/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eWy
 */
class ewy_1
implements ewz_1 {
    private static final Logger a = Logger.getLogger(ewy_1.class);
    private int b;
    private short c;

    ewy_1() {
    }

    ewy_1(int n, short s2) {
        this.b = n;
        this.c = s2;
    }

    @Override
    public byte[] a() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(6);
        byteBuffer.putInt(this.b);
        byteBuffer.putShort(this.c);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
    }

    @Override
    public void a(ewo_1 ewo_12) {
        try {
            ewo_12.f(this.b, this.c);
        }
        catch (exe_2 exe_22) {
            a.error((Object)"Impossible d'ajouter l'item", (Throwable)exe_22);
        }
    }

    @Override
    public ewb_1 b() {
        return ewb_1.c;
    }

    public String toString() {
        return "ItemQuantityChange{m_itemId=" + this.b + ", m_quantity=" + this.c + "}";
    }
}

