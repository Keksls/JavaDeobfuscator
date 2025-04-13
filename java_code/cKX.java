/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cKX
extends cLf {
    private static final Logger c = Logger.getLogger(cKX.class);

    @Override
    public fks_0 a() {
        return fks_0.b;
    }

    @Override
    protected void a(int n, int n2) {
        fkr_0 fkr_02 = this.a.getBuildingUnderMouse(n, n2);
        this.b = new cLk(fkr_02);
        this.a.c(fkr_02);
    }
}

