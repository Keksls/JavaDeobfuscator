/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cLb
extends cLf {
    private static final Logger c = Logger.getLogger(cLb.class);
    private final etn_2 d;

    public cLb(etn_2 etn_22) {
        super(new clg_1(true, true));
        this.d = etn_22;
    }

    @Override
    public fks_0 a() {
        return fks_0.a;
    }

    @Override
    protected void a(int n, int n2) {
        afe_1 afe_12 = this.a.getPatchCoordFromMouse(n, n2);
        fkf_0 fkf_02 = new fkf_0(this.a.getWorkingHavenWorld(), cck_2.a);
        short s2 = this.d(n, n2);
        fkw fkw2 = this.a.a(this.d, afe_12.a(), afe_12.b());
        this.b = new cLj(fkw2, s2);
        fkf_02.a(this.d.b(), afe_12.a(), afe_12.b());
        this.b.a(fkf_02.a());
    }

    private short d(int n, int n2) {
        fkw fkw2 = this.a.getGroundUnderMouse(n, n2);
        if (fkw2 != null) {
            this.a.a(fkw2);
            return fkw2.h();
        }
        return fkk_0.c;
    }
}

