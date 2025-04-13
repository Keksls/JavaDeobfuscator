/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class dlp
extends dlj {
    private static final Logger f = Logger.getLogger(dlp.class);

    public dlp(dly dly2, String string) {
        super(dly2, false, string, (short)10000);
    }

    protected abstract String c();

    @Override
    protected void a(boolean bl, String string) {
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            return;
        }
        int n = this.b;
        this.b = bl ? 150 : this.b;
        this.a((fvE)fyy_02.a("container1"), bl);
        this.a((fvE)fyy_02.a("image1"), bl);
        this.a((fvE)fyy_02.a("image2"), bl);
        this.a((fvE)fyy_02.a("image3"), bl);
        this.a((fvE)fyy_02.a("text"), bl);
        if (bl) {
            this.b = 10;
        }
        this.a((fvE)fyy_02.a("animatedElementLeft"), bl);
        this.a((fvE)fyy_02.a("animatedElementRight"), bl);
        this.b = n;
    }

    @Override
    public void a(dlw dlw2) {
        String string;
        dlq dlq2 = (dlq)dlw2;
        super.a(dlw2);
        fyy_0 fyy_02 = fpm_0.b().h().d(this.c);
        if (fyy_02 == null) {
            return;
        }
        frO frO2 = (frO)fyy_02.a("animatedElementLeft");
        frO frO3 = (frO)fyy_02.a("animatedElementRight");
        try {
            string = this.c();
        }
        catch (gm_0 gm_02) {
            return;
        }
        frO2.setFilePath(string);
        frO2.setAnimName(dlq2.a() + "-G");
        frO2.setDirection(0);
        frO2.setScale(1.0f);
        frO3.setFilePath(string);
        frO3.setAnimName(dlq2.a() + "-D");
        frO3.setDirection(0);
        frO3.setScale(1.0f);
        dlp.a(frO2);
        dlp.a(frO3);
    }

    @Override
    protected void a(String string) {
    }
}

