/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cfU
 */
public class cfu_1
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfu_1.class);
    private static final cfu_1 b = new cfu_1();

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 12798: {
                cwh_2 cwh_22 = (cwh_2)adt_12;
                bai_0.e().b(cwh_22.b());
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    public static cfu_1 a() {
        return b;
    }
}

