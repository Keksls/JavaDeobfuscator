/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  org.apache.log4j.Logger
 */
import javax.inject.Inject;
import org.apache.log4j.Logger;

public class cLe
extends cLf
implements csl_1 {
    private static final Logger c = Logger.getLogger(cLe.class);

    @Inject
    public cLe() {
    }

    @Override
    public fks_0 a() {
        return fks_0.a;
    }

    @Override
    protected void a(int n, int n2) {
        fkw fkw2 = this.a.getGroundUnderMouse(n, n2);
        if (fkw2 != null) {
            this.a.b(fkw2);
            this.b = new cLq(fkw2);
        }
    }
}

