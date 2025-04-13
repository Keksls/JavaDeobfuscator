/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bJR
 */
public class bjr_1 {
    private static final Logger a = Logger.getLogger(bjr_1.class);

    public static List<bjt_1> a(bjs_1 bjs_12) {
        short s2;
        ArrayList<bjt_1> arrayList = new ArrayList<bjt_1>();
        short s3 = bjs_12.d();
        for (int k = bjs_12.c(); k > 0; k -= s2) {
            s2 = (short)Math.min(k, s3);
            bjt_1 bjt_12 = new bjt_1(bjs_12.b(), s2, bjs_12.e());
            arrayList.add(bjt_12);
        }
        return arrayList;
    }

    public static Optional<bjs_1> a(oH oH2) {
        Object r2 = eyo_1.g().d(oH2.e());
        if (r2 == null) {
            return Optional.empty();
        }
        bjs_1 bjs_12 = new bjs_1((ezr_0<?>)r2);
        bjs_12.a(oH2.g());
        bjs_12.a(oH2.c());
        return Optional.of(bjs_12);
    }
}

