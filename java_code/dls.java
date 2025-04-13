/*
 * Decompiled with CFR 0.152.
 */
public class dls
extends dlj {
    public static final String f = "container1";
    public static final String g = "container2";
    public static final String h = "image1";
    public static final String i = "image2";

    public dls() {
        super(dly.f, false, "messageContainerFight", (short)10000);
    }

    @Override
    protected void a(boolean bl, String string) {
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            return;
        }
        int n = this.b;
        this.b = bl ? 150 : this.b;
        this.a((fvE)fyy_02.a(f), bl);
        this.a((fvE)fyy_02.a(h), bl);
        this.a((fvE)fyy_02.a(i), bl);
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
        super.a(dlw2);
        fyy_0 fyy_02 = fpm_0.b().h().d("messageContainerFight");
        if (fyy_02 == null) {
            return;
        }
        dls.a((frO)fyy_02.a("animatedElementLeft"));
        dls.a((frO)fyy_02.a("animatedElementRight"));
    }

    @Override
    protected void a(String string) {
    }
}

