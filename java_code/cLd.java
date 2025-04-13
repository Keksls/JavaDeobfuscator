/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  org.apache.log4j.Logger
 */
import javax.inject.Inject;
import org.apache.log4j.Logger;

public class cLd
extends cLf
implements csk_1 {
    private static final Logger c = Logger.getLogger(cLd.class);

    @Inject
    public cLd() {
    }

    @Override
    public fks_0 a() {
        return fks_0.b;
    }

    @Override
    protected void a(int n, int n2) {
        fkr_0 fkr_02 = this.a.getBuildingUnderMouse(n, n2);
        this.a.b(fkr_02);
        if (fkr_02 == null) {
            return;
        }
        this.b = new cLp(fkr_02);
    }
}

