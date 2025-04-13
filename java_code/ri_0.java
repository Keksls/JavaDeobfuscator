/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ri
 */
public enum ri_0 implements aqk_2
{
    a(1, "Son", rf_0.class),
    b(2, "Particules", rc_0.class),
    c(3, "Lumiere", ra_0.class),
    d(4, "Changement d'Apparance", Rp.class),
    e(5, "Tremblement de la camera", Rk.class),
    f(6, "Changement d'une(des) partie(s) venant d'un autre skin", Rv.class),
    g(8, "Changement de couleur de parties", Rt.class),
    h(9, "Changement du suffixe des anim", Ro.class),
    i(10, "Changement de l'anim statique", Rn.class),
    j(11, "Affihe/masque une(des) partie(s)", RG.class),
    k(12, "Passe des valeurs aux interfaces", re_0.class),
    l(13, "Attache un mobile au point d'accroche LienClip", rb_0.class),
    m(14, "Applique une anim", Rl.class),
    n(15, "Incr\u00e9mente l'altitude", Rz.class),
    o(16, "Change le style de mouvement", Rr.class),
    p(17, "Applique l'apparence d'un monstre", rd_0.class),
    q(18, "Masque tous les \u00e9quipements du joueur", Ry.class),
    r(19, "Costumes - Insignes", Rw.class),
    s(20, "Change l'anim de course", Rm.class),
    t(21, "Change la taille du mobile", Rs.class),
    u(22, "Ajoute un mobile qui va suivre le caster", Rj.class),
    v(23, "Change la hauteur du mobile", Rq.class);

    private final byte w;
    private final String x;
    private final Class<? extends rg_0> y;

    public static ri_0 a(byte by) {
        for (ri_0 ri_02 : ri_0.values()) {
            if (by != ri_02.w) continue;
            return ri_02;
        }
        throw new IllegalArgumentException("HMIActionType inconnu : '" + by + "'");
    }

    private ri_0(byte by, String string2, Class<? extends rg_0> clazz) {
        this.w = by;
        this.x = string2;
        this.y = clazz;
    }

    public short a() {
        return this.w;
    }

    public String b() {
        return this.x;
    }

    public Class<? extends rg_0> c() {
        return this.y;
    }

    @Override
    public String d() {
        return Short.toString(this.a());
    }

    @Override
    public String e() {
        return this.b();
    }

    @Override
    public String f() {
        return this.b();
    }
}

