/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cwF
 */
public class cwf_1
extends ps_0 {
    private static final Logger b = Logger.getLogger(cwf_1.class);
    private String c;
    int a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.c = Cz.a(byArray2);
        return true;
    }

    public eor_0 b() {
        eor_0[] eor_0Array = eor_0.values();
        for (int k = 0; k < eor_0Array.length; ++k) {
            if (eor_0Array[k].ordinal() != this.a) continue;
            return eor_0Array[k];
        }
        b.error((Object)("Erreur \u00e0 lad\u00e9s\u00e9rialisation dun r\u00e9sultat de vote (alors qu'on \u00e9tait d\u00e9connect\u00e9) : r\u00e9sultat de type " + this.a + " inconnu"));
        return eor_0.d;
    }

    public String c() {
        return this.c;
    }

    @Override
    public int a() {
        return 14254;
    }
}

