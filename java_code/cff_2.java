/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cff
 */
public class cff_2
implements ahr_1 {
    private static final cff_2 b = new cff_2();
    protected static final Logger a = Logger.getLogger(cff_2.class);

    public static cff_2 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 12540: {
                css_1 css_12 = (css_1)adt_12;
                a.warn((Object)"[CONVENTION] Cadeau gagn\u00e9");
                cxw_0.a().e();
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 8L;
    }

    @Override
    public void a(long l) {
    }
}

