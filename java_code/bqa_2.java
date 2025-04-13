/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bqa
 */
public class bqa_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bqa_2.class);
    private final bEh b;

    public bqa_2(bEh bEh2) {
        this.b = bEh2;
    }

    @Override
    public short ac_() {
        return 19;
    }

    @Override
    public boolean g() {
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        return this.b.c(biI2.ap());
    }

    @Override
    public void a() {
        a.info((Object)("Lancement de l'occupation MARKET sur la board " + this.b));
        this.d.a(false, true);
        this.b.a(Tv.m, azu_0.j().k());
        if (azu_0.j().c(daw.d())) {
            azu_0.j().b(daw.d());
        }
        azu_0.j().a(daw.d());
        azu_0.j().a(cju_1.a());
        this.d.a(this);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        a.info((Object)("On annule l'occupation MARKET sur la board " + this.b + " (fromServer=" + bl + ", sendMessage=" + bl2 + ")"));
        azu_0.j().b(daw.d());
        azu_0.j().b(cju_1.a());
        if (bl2) {
            this.b.a(Tv.n, azu_0.j().k());
        }
        return true;
    }

    @Override
    public boolean b() {
        a.info((Object)("On arr\u00eate l'occupation MARKET sur la board " + this.b));
        azu_0.j().b(cju_1.a());
        this.b.a(Tv.n, azu_0.j().k());
        return true;
    }
}

