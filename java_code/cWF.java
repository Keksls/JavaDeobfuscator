/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cWF
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cWF.class);
    private static final cWF b = new cWF();

    public static cWF a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12 instanceof adh_2) {
            adh_2 adh_22 = (adh_2)adt_12;
            if (adh_22.c() == -1) {
                blq_2.a.b();
            }
            return false;
        }
        adt_12.a();
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            cgu_2.a().b(this);
        }
    }

    @Override
    public long a_() {
        return 5L;
    }

    @Override
    public void a(long l) {
    }
}

