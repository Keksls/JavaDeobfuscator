/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.List;

/*
 * Renamed from eWw
 */
public final class eww_1 {
    public static void a(ewr_2 ewr_22, byte[] byArray) {
        lW lW2;
        ewu_1 ewu_12 = (ewu_1)ewr_22;
        ewu_12.f();
        try {
            lW2 = lW.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            invalidProtocolBufferException.printStackTrace();
            return;
        }
        List<le_0> list = lW2.b();
        for (le_0 le_02 : list) {
            ewu_12.a(eyl_1.a(le_02));
        }
    }

    public static byte[] a(ewr_2 ewr_22) {
        ewu_1 ewu_12 = (ewu_1)ewr_22;
        ly_0 ly_02 = lW.f();
        for (short s2 = 0; s2 < ewu_12.b(); s2 = (short)(s2 + 1)) {
            exk_2 exk_22 = ewu_12.a(s2);
            if (exk_22 == null) continue;
            ly_02.a(eyl_1.b(exk_22));
        }
        return ly_02.g().toByteArray();
    }
}

