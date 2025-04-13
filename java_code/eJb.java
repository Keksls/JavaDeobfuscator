/*
 * Decompiled with CFR 0.152.
 */
public class eJb
extends ejh_0 {
    private static final aqr_2 w = new eFw(new eFv("Standard avec level du sort pour la creature", new eFu("id du monstre \u00e0 invoquer", eFx.a)), new eFv("Standard", new eFu("id du monstre \u00e0 invoquer", eFx.a), new eFu("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe \u00e0 donner)", eFx.c)), new eFv("Sp\u00e9cifie que l'invocation est son propre controlleur (attention)", new eFu("id du monstre \u00e0 invoquer", eFx.a), new eFu("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe \u00e0 donner)", eFx.c), new eFu("controlleur = invocation : 1 sinon 0", eFx.c)), new eFv("Sp\u00e9cifie la direction (par defaut celle du caster", new eFu("id du monstre \u00e0 invoquer", eFx.a), new eFu("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe \u00e0 donner)", eFx.c), new eFu("controlleur = invocation : 1 sinon 0", eFx.c), new eFu("Direction (-1 par d\u00e9faut)", eFx.c)), new eFv("Sp\u00e9cifie l'equipe", new eFu("id du monstre \u00e0 invoquer", eFx.a), new eFu("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe \u00e0 donner)", eFx.c), new eFu("controlleur = invocation : 1 sinon 0", eFx.c), new eFu("Direction (-1 par d\u00e9faut)", eFx.c), new eFu("Equipe (0 = rouge, 1=bleue)", eFx.c)), new eFv("Sp\u00e9cifie la timeline", new eFu("id du monstre \u00e0 invoquer", eFx.a), new eFu("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe \u00e0 donner)", eFx.c), new eFu("controlleur = invocation : 1 sinon 0", eFx.c), new eFu("Direction (-1 par d\u00e9faut)", eFx.c), new eFu("Equipe (0 = rouge, 1=bleue)", eFx.c), new eFu("Spawn timeline relatif \u00e0 : 0 = currentFighter, 1 = d\u00e9but de la timeline, 2 = caster de l'effet", eFx.c), new eFu("Offset timeline (Peut \u00eatre n\u00e9gatif pour partir de la fin)", eFx.c)));
    private static final int x = 3251;
    private long y;
    eqy_1 z;
    vw_0 A;
    eri_2<eoz_1> B;
    byte C;
    boolean D = false;
    public final fo_1 v = new ejc_0(this);

    @Override
    public aqr_2 c_() {
        return w;
    }

    public eJb() {
        this.M();
    }

    @Override
    public void M() {
        super.M();
        this.c(2130);
    }

    public eJb aD() {
        eJb eJb2 = new eJb();
        eJb2.z = null;
        eJb2.A = null;
        eJb2.B = null;
        eJb2.D = false;
        return eJb2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.z != null && this.e instanceof epq_2) {
            a.info((Object)("Instanciation d'une nouvelle invocation avec un id de " + this.y));
            epq_2 epq_22 = (epq_2)this.e;
            epq_2 epq_23 = epq_22.b(this.z.h(), this.g, this.z.f(), this.z, this.A, this.D, this.B);
            if (this.D()) {
                this.z.a(epq_23.Z());
            }
            epq_23.y(true);
            if (this.z.f() == 3251 && this.e instanceof epq_2) {
                epq_23.q(((epq_2)this.e).en());
            }
            this.c(sd_02, bl);
            if (this.D() && ((epq_2)this.e).ck() != null) {
                ((epq_2)this.e).ck().Q(epq_23);
            }
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        int n;
        Object object;
        short s2 = -1;
        this.y = this.h.f().a((byte)1);
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        int n2 = ((efh_0)this.c).F() > 1 ? ((efh_0)this.c).a(1, this.aZ(), eFb.a) : -1;
        eph_2 eph_22 = epv_1.a();
        switch (n2) {
            case -1: {
                if (this.d != null) {
                    s2 = this.aZ();
                    break;
                }
                a.error((Object)"[Summon] Impossible d'invoquer une creature avec le mm niveau que le sort : l'effectContainer est null");
                return;
            }
            case -2: {
                if (this.e != null) {
                    s2 = ((epq_2)this.e).dr();
                    break;
                }
                a.error((Object)"[Summon] Impossible d'invoquer une creature avec le mm niveau que le caster car celui-ci est null");
                return;
            }
            case -3: {
                if (eph_22 != null && (object = eph_22.b((short)this.m)) != null) {
                    s2 = ((epj_2)object).v();
                }
                if (s2 != -1) break;
                a.error((Object)"[Summon] Impossible d'invoquer une creature, on ne peut pas recup\u00e9rer son niveau");
                return;
            }
            default: {
                if (n2 > 0) {
                    s2 = (short)n2;
                    break;
                }
                a.error((Object)("[Summon] Erreur de saisie : le levelType doit etre positif ou -1 ou -2, l\u00e9 il vaut " + n2));
                return;
            }
        }
        boolean bl = this.D = ((efh_0)this.c).F() > 2 && ((efh_0)this.c).a(2, this.aZ(), eFb.a) >= 1;
        if (((efh_0)this.c).F() > 3) {
            n = ((efh_0)this.c).a(3, this.aZ(), eFb.a);
            object = aej_2.a(n);
        } else {
            object = aej_2.k;
        }
        if (((efh_0)this.c).F() > 4) {
            this.C = (byte)((efh_0)this.c).a(4, this.aZ(), eFb.a);
        } else if (this.e instanceof epq_2) {
            this.C = ((epq_2)this.e).Y();
        }
        if (this.z == null) {
            this.z = new eqy_1((short)this.m, "", -1, s2);
        }
        if (this.A == null) {
            this.A = new vw_0();
            this.A.a(this.e != null ? this.e.a_() : 0L);
        }
        if (((efh_0)this.c).F() > 5) {
            n = ((efh_0)this.c).a(5, this.aZ(), eFb.a);
            Vx object2 = Vx.b(n);
            this.A.a(object2);
        }
        if (((efh_0)this.c).F() > 6) {
            this.A.a(((efh_0)this.c).a(6, this.aZ(), eFb.a));
        }
        this.z.a(this.y);
        this.z.a((aej_2)((Object)object));
        this.z.b(this.C);
        if (this.B == null) {
            this.B = new eri_2();
        }
        if (eph_22 != null) {
            Object b2 = eph_22.b((short)this.m);
            for (int n3 : b2.q()) {
                this.B.a(eoz_1.a(n3), (byte)1);
            }
        }
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
    public boolean bm_() {
        return false;
    }

    @Override
    public void Z() {
        super.Z();
        this.z = null;
        this.B = null;
        this.A = null;
    }

    @Override
    protected void a(iQ iQ2) {
        super.a(iQ2);
        iQ2.a(is_0.m().b(this.y).n());
    }

    @Override
    protected void b(iO iO2) {
        super.b(iO2);
        if (iO2.A()) {
            is_0 is_02 = iO2.B();
            this.y = is_02.i();
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
}

