/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cZi
 */
public class czi_0
implements ahr_1 {
    private static final Logger b = Logger.getLogger(czi_0.class);
    public static final czi_0 a = new czi_0();

    public static czi_0 a() {
        return a;
    }

    private czi_0() {
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
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16779: {
                dgs_0 dgs_02 = (dgs_0)adt_12;
                bmr_1 bmr_12 = azu_0.j().k();
                if (dgs_02.o() == Xd.b) {
                    bmr_12.dE().a(dgs_02.k());
                }
                return false;
            }
            case 17956: {
                dgx_0 dgx_02 = (dgx_0)adt_12;
                bnh_1 bnh_12 = (bnh_1)bmf_2.a().b(dgx_02.k());
                if (byp_2.a().a(bnh_12)) {
                    byp_2.a().f(dgx_02.k());
                } else {
                    aUh.a("guild.error.cannot.invite.user", new Object[0]);
                }
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

