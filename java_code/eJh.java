/*
 * Decompiled with CFR 0.152.
 */
public class eJh
extends ejh_0 {
    private static final aqr_2 w = new eFw(new eFv("Invoque la cr\u00e9ature actuellement s\u00e9lectionn\u00e9e dans le symbiote", new eFu[0]), new eFv("Invoque la cr\u00e9ature s\u00e9lectionn\u00e9e dans le symbiote avec controle de sa puissance", new eFu("Puissance des caracs principales (hp/dmg/res)", eFx.b), new eFu("Puissance des caracs secondaires (init/tacle/esquive)", eFx.b)), new eFv("Sp\u00e9cifie la timeline", new eFu("Puissance des caracs principales (hp/dmg/res)", eFx.b), new eFu("Puissance des caracs secondaires (init/tacle/esquive)", eFx.b), new eFu("Spawn timeline relatif \u00e0 : 0 = currentFighter, 1 = d\u00e9but de la timeline, 2 = caster de l'effet", eFx.c), new eFu("Offset timeline (Peut \u00eatre n\u00e9gatif pour partir de la fin)", eFx.c)));
    float x;
    float y;
    private long z;
    eqy_1 A;
    byte B = (byte)-1;
    private boolean C;
    vw_0 D;
    public final fo_1 v = new eji_0(this);

    @Override
    public aqr_2 c_() {
        return w;
    }

    public eJh() {
        this.M();
    }

    public eJh aD() {
        eJh eJh2 = new eJh();
        eJh2.C = false;
        eJh2.D = null;
        return eJh2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.e == null) {
            return;
        }
        if (this.A == null) {
            return;
        }
        if (this.C) {
            a.error((Object)"Summoning not allowed");
            this.j(true);
            return;
        }
        epq_2 epq_22 = null;
        if (this.e instanceof erk_2 && this.e instanceof epq_2) {
            erk_2 erk_22 = (erk_2)((Object)this.e);
            this.A.a(this.z);
            Object t = erk_22.dQ();
            if (this.B != -1 && t != null) {
                eqy_1 eqy_12 = t.a((int)this.B);
                if (eqy_12 == null) {
                    return;
                }
                eqy_12.a(this.z);
            }
            a.info((Object)("New summon with id " + this.A.h()));
            epq_22 = ((epq_2)((Object)erk_22)).b(this.A.h(), this.g, this.A.f(), this.A, this.D, false, null);
            this.a(epq_22);
            epq_22.F(true);
            if (this.D()) {
                this.A.a(epq_22.Z());
            }
            if (t != null) {
                t.a(this.B, false);
            }
        } else if (this.e instanceof epq_2) {
            epq_22 = ((epq_2)this.e).b(this.A.h(), this.g, this.A.f(), this.A, this.D, false, null);
            this.a(epq_22);
        }
        this.c(sd_02, bl);
        if (this.D() && ((epq_2)this.e).ck() != null) {
            ((epq_2)this.e).ck().Q(epq_22);
        }
    }

    @Override
    private void a(epq_2 epq_22) {
        eKd.a.a(epq_22.gP(), this.x, this.y);
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        if (((efh_0)this.c).F() == 2) {
            this.x = (float)((efh_0)this.c).a(0, s2, eFb.a) / 100.0f;
            this.y = (float)((efh_0)this.c).a(1, s2, eFb.a) / 100.0f;
        } else {
            this.x = 1.0f;
            this.y = 1.0f;
        }
        this.z = this.h.f().a((byte)1);
        Object t = ((erk_2)((Object)this.e)).dQ();
        if (t.b(t.c())) {
            this.B = t.c();
            this.A = t.a((int)this.B);
            this.A.a(((epq_2)this.e).dr());
        } else {
            this.C = true;
        }
        if (this.D == null) {
            this.D = new vw_0();
            this.D.a(this.e != null ? this.e.a_() : 0L);
        }
        if (((efh_0)this.c).F() > 2) {
            int n = ((efh_0)this.c).a(2, this.aZ(), eFb.a);
            Vx vx = Vx.b(n);
            this.D.a(vx);
        }
        if (((efh_0)this.c).F() > 3) {
            this.D.a(((efh_0)this.c).a(3, this.aZ(), eFb.a));
        }
    }

    @Override
    public void z() {
        super.z();
        this.x = 1.0f;
        this.y = 1.0f;
    }

    @Override
    public void Z() {
        super.Z();
        this.A = null;
        this.D = null;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    protected void a(iQ iQ2) {
        super.a(iQ2);
        iQ2.a(is_0.m().b(this.z).n());
    }

    @Override
    protected void b(iO iO2) {
        super.b(iO2);
        if (iO2.A()) {
            is_0 is_02 = iO2.B();
            this.z = is_02.i();
            this.f = null;
        }
    }

    @Override
    public fo_1 ax() {
        return this.v;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }

    static /* synthetic */ Su a(eJh eJh2) {
        return eJh2.e;
    }

    static /* synthetic */ Su b(eJh eJh2) {
        return eJh2.e;
    }
}

