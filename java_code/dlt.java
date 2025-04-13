/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class dlt
extends dlj {
    private static final Logger f = Logger.getLogger(dlt.class);

    public dlt() {
        super(dly.d, false, "messageContainer3", (short)10000);
    }

    @Override
    protected void a(boolean bl, String string) {
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            return;
        }
        int n = this.b;
        this.b = bl ? 1000 : this.b;
        this.a((fvE)fyy_02.a("container1"), bl);
        this.a((fvE)fyy_02.a("text"), bl);
        if (bl) {
            this.b = 1000;
        }
        this.a((fvE)fyy_02.a("bannerImage"), bl);
        this.b = n;
    }

    @Override
    public void a(dlw dlw2) {
        dlu dlu2 = (dlu)dlw2;
        super.a(dlw2);
        try {
            String string = azs_0.b("bannerImageLocalizedFilePath", dlu2.a(), bae.h().f().h());
            if (cd_0.b(string)) {
                fis_1.a().a("bannerImageIconUrl", (Object)string, this.c);
            } else {
                String string2 = azs_0.b("bannerImageFilePath", dlu2.a());
                fis_1.a().a("bannerImageIconUrl", (Object)string2, this.c);
            }
        }
        catch (gm_0 gm_02) {
            f.warn((Object)gm_02.getMessage());
        }
    }

    @Override
    protected void a(String string) {
    }
}

