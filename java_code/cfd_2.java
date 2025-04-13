/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cfD
 */
public class cfd_2
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfd_2.class);
    public static final cfd_2 b = new cfd_2();

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 12264: {
                csc_0 csc_02 = (csc_0)adt_12;
                cZW.d().a(csc_02.b(), csc_02.c(), csc_02.d());
                return false;
            }
            case 13956: {
                csd_0 csd_02 = (csd_0)adt_12;
                cZW.d().a(csd_02.b());
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

