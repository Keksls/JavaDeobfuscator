/*
 * Decompiled with CFR 0.152.
 */
public class dln
extends dlj {
    public dln() {
        super(dly.g, false, "messageContainer4", (short)10000);
    }

    @Override
    protected void a(boolean bl, String string) {
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            return;
        }
        int n = this.b;
        this.b = bl ? 150 : this.b;
        this.a((fvE)fyy_02.a("container1"), bl);
        if (bl) {
            this.b = 10;
        }
        this.a((fvE)fyy_02.a("animatedElement"), bl);
        this.b = n;
    }

    @Override
    public void a(dlw dlw2) {
        super.a(dlw2);
        fyy_0 fyy_02 = fpm_0.b().h().d("messageContainer4");
        if (fyy_02 == null) {
            return;
        }
        dlo dlo2 = (dlo)dlw2;
        float f2 = ans_0.D().c().b().h();
        frO frO2 = (frO)fyy_02.a("animatedElement");
        frO2.setFilePath(dlo2.a());
        frO2.setAnimName(dlo2.c());
        frO2.setDirection(dlo2.b());
        frO2.setScale(f2);
        dln.a(frO2);
    }

    @Override
    protected void a(String string) {
    }
}

