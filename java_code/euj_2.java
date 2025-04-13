/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUj
 */
public class euj_2<T extends epq_2> {
    protected final long a;

    public euj_2(long l) {
        this.a = l;
    }

    public void a(T t) {
        if (((epq_2)t).U_() != this.a) {
            throw new eui_2("Le h\u00e9ros qu'on essaye d'ajouter n'appartient pas au client : " + this.a);
        }
        if (((epq_2)t).a(eqr_1.b) && !euu_2.a()) {
            throw new eui_2("[PARTY] Adding a hero but it should be disabled! Account id " + this.a);
        }
        euw_2.a.a(this.a, (epq_2)t);
    }

    public void b(T t) {
        if (((epq_2)t).U_() != this.a) {
            throw new eui_2("Le h\u00e9ros qu'on essaye d'ajouter au groupe n'appartient pas au client : " + this.a);
        }
        Object t2 = euw_2.a.d(((epq_2)t).a_());
        if (t2 == null) {
            throw new eui_2("Le h\u00e9ros qu'on veut grouper n'est pas charg\u00e9");
        }
        if (((epq_2)t).a(eqr_1.d) && !euu_2.b()) {
            throw new eui_2("[PARTY] Adding a companion to the party but it should be disabled! Account id " + this.a);
        }
        if (((epq_2)t).a(eqr_1.b) && !euu_2.a()) {
            throw new eui_2("[PARTY] Adding a hero to the party but it should be disabled! Account id " + this.a);
        }
        euw_2.a.a(this.a, ((epq_2)t).a_());
    }

    public void c(T t) {
        if (((epq_2)t).U_() != this.a) {
            throw new eui_2("Le h\u00e9ros qu'on essaye de retirer du groupe n'appartient pas au client : " + this.a);
        }
        Object t2 = euw_2.a.d(((epq_2)t).a_());
        if (t2 == null) {
            throw new eui_2("Le h\u00e9ros qu'on veut d\u00e9grouper n'est pas charg\u00e9");
        }
        euw_2.a.b(this.a, ((epq_2)t).a_());
    }

    public String toString() {
        return "HeroManagerController{m_ownerId=" + this.a + "}";
    }
}

