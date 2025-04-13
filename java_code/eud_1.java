/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eUD
 */
public enum eud_1 implements TE,
aqk_2
{
    a(0, "Element de Challenge"),
    b(1, "Element d'almanach ");

    private static final Logger c;
    private final byte d;
    private final String e;

    private eud_1(int n2, String string2) {
        this.d = (byte)n2;
        this.e = string2;
    }

    @Nullable
    public static eud_1 a(byte by) {
        eud_1[] eud_1Array = eud_1.values();
        for (int k = 0; k < eud_1Array.length; ++k) {
            eud_1 eud_12 = eud_1Array[k];
            if (eud_12.d != by) continue;
            return eud_12;
        }
        return null;
    }

    @Override
    public byte a() {
        return this.d;
    }

    @Override
    public String d() {
        return String.valueOf(this.d);
    }

    @Override
    public String e() {
        return this.e;
    }

    @Override
    public String f() {
        return null;
    }

    public static ArrayList<TE> a(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        if (n == 0) {
            return null;
        }
        ArrayList<TE> arrayList = new ArrayList<TE>(n);
        for (int k = 0; k < n; ++k) {
            int n2 = byteBuffer.get() & 0xFF;
            eud_1 eud_12 = eud_1.a((byte)n2);
            if (eud_12 != null) {
                arrayList.add(eud_12);
                continue;
            }
            c.warn((Object)("propri\u00e9t\u00e9 incoonu " + n2));
        }
        return arrayList;
    }

    static {
        c = Logger.getLogger(eud_1.class);
    }
}

