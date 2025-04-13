/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eRC
 */
public class erc_1
implements erk_1 {
    private static final Logger a = Logger.getLogger(erc_1.class);
    private final erg_1 b;

    public erc_1(erg_1 erg_12) {
        this.b = erg_12;
    }

    @Override
    public void a(String string) {
        a.info((Object)("[Guild] le nom de la guilde " + this.b.a() + " a chang\u00e9 : " + this.b.e() + "(pr\u00e9c\u00e9dent nom: " + string + ")"));
    }

    @Override
    public void a() {
        a.info((Object)("[Guild] le blazon de la guilde " + this.b.a() + " a chang\u00e9 : " + this.b.f()));
    }

    @Override
    public void b() {
        a.info((Object)("[Guild] la description de la guilde " + this.b.a() + " a chang\u00e9 : " + this.b.g()));
    }

    @Override
    public void c() {
        a.info((Object)("[Guild] le message de la guilde " + this.b.a() + " a chang\u00e9 : " + this.b.h()));
    }

    @Override
    public void a(short s2) {
    }

    @Override
    public void a(int n) {
    }

    @Override
    public void b(int n) {
    }

    @Override
    public void a(ern_1 ern_12) {
        a.info((Object)("[Guild] Un rang de la guilde " + this.b.a() + " a \u00e9t\u00e9 ajout\u00e9 : " + ern_12));
    }

    @Override
    public void b(ern_1 ern_12) {
        a.info((Object)("[Guild] Un rang de la guilde " + this.b.a() + " a \u00e9t\u00e9 d\u00e9plac\u00e9 : " + ern_12));
    }

    @Override
    public void c(ern_1 ern_12) {
        a.info((Object)("[Guild] Un rang de la guilde " + this.b.a() + " a \u00e9t\u00e9 retir\u00e9 : " + ern_12));
    }

    @Override
    public void a(erl_1 erl_12) {
        a.info((Object)("[Guild] Un membre de la guilde " + this.b.a() + " a \u00e9t\u00e9 ajout\u00e9 : " + erl_12));
    }

    @Override
    public void b(erl_1 erl_12) {
        a.info((Object)("[Guild] Un membre de la guilde " + this.b.a() + " a \u00e9t\u00e9 retir\u00e9 : " + erl_12));
    }

    @Override
    public void a(erh_1 erh_12) {
    }

    @Override
    public void b(erh_1 erh_12) {
    }

    @Override
    public void d(ern_1 ern_12) {
        a.info((Object)("[Guild] Le rang " + ern_12 + " de la guilde " + this.b.a() + " a \u00e9t\u00e9 modifi\u00e9"));
    }

    @Override
    public void c(erl_1 erl_12) {
    }

    @Override
    public void a(erl_1 erl_12, long l) {
        ern_1 ern_12 = this.b.c(l);
        ern_1 ern_13 = this.b.c(erl_12.d());
        if (ern_13.d() == 0) {
            a.info((Object)("[Guild] Nouveau leader pour la guilde " + this.b.a() + " : " + erl_12 + " (ancien rang: " + ern_12 + ")"));
        }
        if (ern_12.d() == 0) {
            a.info((Object)("[Guild] Ce membre n'est plus le leader de la guilde " + this.b.a() + " : " + erl_12 + " (nouveau rang: " + ern_13 + ")"));
        }
    }

    @Override
    public void c(erh_1 erh_12) {
    }

    @Override
    public void c(int n) {
    }

    @Override
    public void d(int n) {
    }

    public String toString() {
        return "GuildModelLogger{m_guild=" + this.b + "}";
    }
}

