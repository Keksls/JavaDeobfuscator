/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from TY
 */
public abstract class ty_0<ContentType extends ts_0, User extends TP<ContentType>> {
    protected static final Logger a = Logger.getLogger(ty_0.class);
    protected User b;
    protected User c;
    protected tx_0 d;
    protected final long e;
    protected final long f;
    protected final long g;

    protected ty_0(long l, User User2, User User3) {
        this.e = l;
        this.f = User2.g();
        this.g = User3.g();
        this.a(User2, User3);
    }

    public long a() {
        return this.e;
    }

    public long b() {
        return this.f;
    }

    public long c() {
        return this.g;
    }

    protected void a(User User2, User User3) {
        if (User2 == null) {
            throw new NullPointerException("[Trade] First user of an ItemExchanger can't be null");
        }
        if (User3 == null) {
            throw new NullPointerException("[Trade] Second user of an ItemExchanger can't be null");
        }
        a.info((Object)("[Trade] Starting an exchange between " + User2.h() + " (id=" + User2.g() + ") and " + User3.h() + " (id=" + User3.g() + ")"));
        this.d = tx_0.a;
        this.b = User2;
        this.b.a(false);
        this.c = User3;
        this.c.a(false);
    }

    public void ad_() {
        if (this.d != tx_0.a) {
            throw new IllegalStateException("[Trade] Only an Initializing exchanger can be started. Current State: " + this.d);
        }
        if (!Ua.a().a(this)) {
            this.d = tx_0.d;
            this.a(this.b, (Us)Up.a(this, Ur.a));
            this.b(this.b);
            this.b(this.c);
            return;
        }
        if (this.i()) {
            this.o();
        } else {
            this.p();
        }
    }

    protected abstract boolean a(User var1);

    protected abstract void b(User var1);

    protected boolean c(TP tP) {
        return tP == this.b || tP == this.c;
    }

    public User e() {
        return this.b;
    }

    public User f() {
        return this.c;
    }

    @Nullable
    public User d(User User2) {
        if (User2 == this.b) {
            return this.c;
        }
        if (User2 == this.c) {
            return this.b;
        }
        return null;
    }

    private void o() {
        this.d = tx_0.b;
        this.a(this.b, Us.a(this, Uu.b));
        this.a(this.c, Us.a(this, Uu.a));
    }

    private void p() {
        if (!this.a(this.b)) {
            this.d = tx_0.d;
            this.a(this.b, (Us)Up.a(this, Ur.b));
            this.a(this.c, (Us)Up.a(this, Ur.a));
            Ua.a().b(this);
            return;
        }
        if (!this.a(this.c)) {
            this.d = tx_0.d;
            this.a(this.b, (Us)Up.a(this, Ur.a));
            this.a(this.c, (Us)Up.a(this, Ur.b));
            this.b(this.b);
            Ua.a().b(this);
            return;
        }
        this.d = tx_0.c;
        this.a(Us.a(this, Uu.c));
    }

    protected void g() {
        a.info((Object)("[Trade] Ending the exchange between " + this.b.h() + " (id=" + this.b.g() + ") and " + this.c.h() + " (id=" + this.c.g() + ")"));
        this.d = tx_0.d;
        this.b.d();
        this.c.d();
        Ua.a().b(this);
    }

    @Nullable
    public User a(long l) {
        if (l == this.b.g()) {
            return this.b;
        }
        if (l == this.c.g()) {
            return this.c;
        }
        return null;
    }

    protected void a(Us us) {
        this.a(us, true);
    }

    protected void a(Us us, boolean bl) {
        if (this.b != null) {
            this.b.a(us);
        }
        if (this.c != null) {
            this.c.a(us);
        }
        if (bl) {
            try {
                us.a();
            }
            catch (Exception exception) {
                a.error((Object)"[Trade] Exception lors de la notification d'un \u00e9v\u00e8nement aux utilisateurs d'un ItemExchanger: ", (Throwable)exception);
            }
        }
    }

    protected void a(long l, Us us) {
        this.a(l, us, true);
    }

    protected void a(User User2, Us us) {
        this.a(User2, us, true);
    }

    protected void a(long l, Us us, boolean bl) {
        User User2 = this.a(l);
        if (User2 == null) {
            a.error((Object)("[Trade] Impossible d'envoyer un \u00e9v\u00e8nement \u00e0 l'utilisateur d'id " + l));
            return;
        }
        this.a(User2, us, bl);
    }

    protected void a(User User2, Us us, boolean bl) {
        if (User2 != null) {
            User2.a(us);
        }
        if (bl) {
            try {
                us.a();
            }
            catch (Exception exception) {
                a.error((Object)"[Trade] Exception lors de la notification d'un \u00e9v\u00e8nement \u00e0 un user d'un ItemExchanger: ", (Throwable)exception);
            }
        }
    }

    public tx_0 h() {
        return this.d;
    }

    protected abstract boolean i();

    protected abstract boolean j();

    public void b(long l) {
        this.e(this.a(l));
    }

    public void e(User User2) {
        if (!this.c((TP)User2)) {
            return;
        }
        this.p();
    }

    public void a(User User2, Ur ur) {
        if (!this.c((TP)User2)) {
            return;
        }
        User User3 = this.d(User2);
        assert (User3 != null);
        Up up = Up.a(this, Ur.b);
        up.a(User2.g());
        Up up2 = Up.a(this, ur);
        up2.a(User2.g());
        this.d = tx_0.d;
        this.a(User3.g(), (Us)up2);
        this.a(User2.g(), (Us)up);
        this.g();
    }

    public void c(long l) {
        this.f(this.a(l));
    }

    public void f(User User2) {
        if (!this.c((TP)User2)) {
            a.warn((Object)("[Trade] Impossible d'annuler l'\u00e9change, " + User2.h() + " n'est pas concern\u00e9"));
            return;
        }
        this.d = tx_0.d;
        this.a(this.b, (Us)Up.a(this, Ur.a));
        this.a(this.c, (Us)Up.a(this, Ur.b));
        this.g();
    }

    public void k() {
        this.d = tx_0.d;
        this.a(this.b, (Us)Up.a(this, Ur.h));
        this.a(this.c, (Us)Up.a(this, Ur.h));
        this.g();
    }

    public void g(User User2) {
        if (!this.c((TP)User2)) {
            a.error((Object)("[Trade] Impossible de retirer l'utilisateur (\"" + User2.h() + "\", " + User2.g() + ") de l'ExchangerUser : Il n'est pas concern\u00e9 par cet \u00e9change (\"" + this.b.h() + "\", " + this.b.g() + "/\"" + this.c.h() + "\", " + this.c.g() + ")."));
            return;
        }
        User User3 = this.d(User2);
        this.d = tx_0.d;
        this.a(User2, (Us)Up.a(this, Ur.e));
        this.a(User3, (Us)Up.a(this, Ur.d));
        this.g();
    }

    public void h(User User2) {
        if (!this.c((TP)User2)) {
            a.error((Object)("[Trade] Impossible de finir l'\u00e9change " + User2 + " de l'ExchangerUser n'est pas concern\u00e9 par cet \u00e9change"));
            return;
        }
        if (this.m()) {
            this.n();
            this.d = tx_0.d;
            this.a(Up.a(this, Ur.f));
            this.g();
        } else {
            this.g(User2);
        }
    }

    public void a(long l, boolean bl) {
        this.a(this.a(l), bl);
    }

    public void a(User User2, boolean bl) {
        if (!this.c((TP)User2)) {
            a.error((Object)("[Trade] Impossible de continuer l'\u00e9change " + User2 + " de l'ExchangerUser n'est pas concern\u00e9 par cet \u00e9change"));
            return;
        }
        if (this.j()) {
            User2.a(bl);
        }
    }

    public void a(long l, ContentType ContentType, short s2) {
        this.a(this.a(l), ContentType, s2);
    }

    public void a(long l, List<ts_0> list) {
        User User2 = this.a(l);
        if (User2 == null) {
            return;
        }
        for (ts_0 ts_02 : list) {
            this.a(User2, ts_02, ts_02.e(), true);
        }
        this.a(User2, list);
    }

    public void a(User User2, List<ts_0> list) {
        this.a(Uv.a(this, Ux.a, User2.g(), list));
    }

    public void a(User User2, ContentType ContentType, short s2) {
        this.a(User2, ContentType, s2, false);
    }

    public abstract void a(User var1, ContentType var2, short var3, boolean var4);

    public void b(long l, ContentType ContentType, short s2) {
        this.b(this.a(l), ContentType, s2);
    }

    public void b(long l, List<ts_0> list) {
        User User2 = this.a(l);
        if (User2 == null) {
            return;
        }
        ArrayList<ts_0> arrayList = new ArrayList<ts_0>();
        for (ts_0 ts_02 : list) {
            Object ContentType = User2.a(ts_02.a());
            if (ContentType == null) continue;
            this.b(User2, ts_02, ContentType.e(), true);
            ts_0 ts_03 = ts_02.i();
            ts_03.a(ContentType.e());
            arrayList.add(ts_03);
        }
        this.b(this.a(l), arrayList);
    }

    public void b(User User2, List<ts_0> list) {
        this.a(Uv.a(this, Ux.b, User2.g(), list));
    }

    public void b(User User2, ContentType ContentType, short s2) {
        this.b(User2, ContentType, s2, false);
    }

    public void b(User User2, ContentType ContentType, short s2, boolean bl) {
        if (!this.c((TP)User2)) {
            a.error((Object)"[Trade] On essaye de retirer un objet de la liste d'un utilisateur non valide");
            return;
        }
        if (s2 < 1) {
            a.error((Object)"[Trade] On essaye de retirer une quantit\u00e9 n\u00e9gative ou nulle d'objets \u00e0 l'\u00e9change");
            return;
        }
        this.b.a(false);
        this.c.a(false);
        Object ContentType2 = User2.a(ContentType.a());
        if (ContentType2 == null) {
            a.error((Object)"[Trade] On essaye de retirer un objet de l'\u00e9change qui n'existe pas");
            return;
        }
        if (ContentType2.e() < s2) {
            a.error((Object)"[Trade] On essaie de retirer plus d'objets qu'il n'y en a dans l'\u00e9change");
        } else if (ContentType2.e() == s2) {
            ContentType2.release();
            User2.c(ContentType.a());
        } else {
            ContentType2.b(-s2);
        }
        if (!bl) {
            this.a(Uv.a(this, Ux.e, User2.g(), ContentType, s2));
        }
    }

    protected boolean l() {
        return true;
    }

    protected abstract boolean m();

    protected abstract void n();

    public void d(long l) {
        this.i(this.a(l));
    }

    public void i(User User2) {
        if (!this.c((TP)User2)) {
            a.warn((Object)("[Trade] Impossible d'annuler l'\u00e9change, " + User2.h() + " n'est pas concern\u00e9"));
            return;
        }
        switch (this.d) {
            case c: {
                this.g(User2);
                break;
            }
            case b: {
                this.a(User2, Ur.c);
            }
        }
    }

    public abstract boolean e(long var1);
}

