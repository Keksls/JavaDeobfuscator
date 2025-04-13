/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eWx
 */
class ewx_1
implements ewz_1 {
    private static final Logger a = Logger.getLogger(ewx_1.class);
    private ewz_2 b;

    ewx_1() {
    }

    ewx_1(ewz_2 ewz_22) {
        this.b = ewz_22;
    }

    @Override
    public byte[] a() {
        ye_1 ye_12 = ewq_2.a(this.b);
        ByteBuffer byteBuffer = ByteBuffer.allocate(ye_12.b());
        ye_12.a(byteBuffer);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        ye_1 ye_12 = new ye_1();
        ye_12.b(byteBuffer);
        try {
            this.b = ewq_2.a(ye_12, eyo_1.g());
        }
        catch (exe_2 exe_22) {
            a.error((Object)("Impossible de d\u00e9-s\u00e9rialiser l'item " + ye_12), (Throwable)exe_22);
        }
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
        return ewb_1.a;
    }

    public String toString() {
        return "AddItemChange{m_item=" + this.b + "}";
    }
}

