/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from fai
 */
public class fai_0 {
    public static final fag_0 a = new fag_0("", -1, -1, null, "", false);
    public static final int b = 1;
    public static final int c = 5;
    public static final int d = 5;
    private static final int[] e = new int[]{1, 5};

    private fai_0() {
    }

    public static boolean a(int n) {
        return ArrayUtils.contains((int[])e, (int)n);
    }

    public static fag_0 a(ByteBuffer byteBuffer) {
        wa_1 wa_12 = new wa_1();
        wa_12.b(byteBuffer);
        fag_0 fag_02 = new fag_0();
        fag_02.b(wa_12);
        return fag_02;
    }
}

