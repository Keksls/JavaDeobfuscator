/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eWF
 */
class ewf_2
implements ewz_1 {
    private static final Logger a = Logger.getLogger(ewf_2.class);
    private int b;

    ewf_2() {
    }

    ewf_2(int n) {
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
    public void a(ewo_1 ewo_12) {
        try {
            ewo_12.a(this.b);
        }
        catch (exe_2 exe_22) {
            a.error((Object)"Impossible d'ajouter l'item", (Throwable)exe_22);
        }
    }

    @Override
    public ewb_1 b() {
        return ewb_1.b;
    }

    public String toString() {
        return "RemoveItemChange{m_itemId=" + this.b + "}";
    }
}

