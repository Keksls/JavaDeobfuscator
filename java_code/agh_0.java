/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from agh
 */
public class agh_0
implements agi {
    private static final Logger b = Logger.getLogger(agh_0.class);
    protected final agi a;
    private final afp_0 c;
    private final afp_0 d;

    public agh_0(agi agi2, afp_0 afp_02, afp_0 afp_03) {
        this.a = agi2;
        this.c = afp_02;
        this.d = afp_03;
    }

    @Override
    public afp_0 a(afj_0 afj_02, int n) {
        return n < afj_02.bi() ? this.c : this.d;
    }

    @Override
    public void a(afj_0 afj_02) {
    }

    @Override
    public void b(afj_0 afj_02) {
        afj_02.a(this.a);
    }

    public static agi a(boolean bl, afe_0 afe_02, afp_0 afp_02, afp_0 afp_03) {
        if (afp_02 == null && afp_03 == null) {
            return agm.a();
        }
        if (afp_02 == null) {
            b.warn((Object)"style inconnu pour la marche");
            afp_02 = afp_03;
        }
        if (afp_03 == null) {
            b.warn((Object)"style inconnu pour la course");
            afp_03 = afp_02;
        }
        if (bl) {
            return new agj(afe_02.aZ(), afp_02, afp_03);
        }
        return new agh_0(afe_02.aZ(), afp_02, afp_03);
    }
}

