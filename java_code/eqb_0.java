/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Objects;
import org.apache.log4j.Logger;

/*
 * Renamed from eQB
 */
public abstract class eqb_0
implements erk_1 {
    private static final Logger b = Logger.getLogger(eqb_0.class);
    protected final erg_1 a;

    protected eqb_0(erg_1 erg_12) {
        this.a = erg_12;
    }

    protected void a(double d2) {
        this.a.q().a(d2);
    }

    protected void f(int n) {
        this.a.q().a(n);
    }

    @Override
    public void c(erh_1 erh_12) {
        eqd_0 eqd_02 = eqs_2.a.a(erh_12.a());
        if (eqd_02 == null) {
            b.error((Object)("There will be a NPE on bonusActivated for bonus " + erh_12));
        }
        switch (eqd_02.f().a()) {
            case b: {
                this.f(eqn_2.a.f());
                return;
            }
            case e: {
                this.a((eQQ)eqd_02.f());
                return;
            }
            case h: {
                this.a((eqp_0)eqd_02.f());
                return;
            }
            case i: {
                this.a((eQO)eqd_02.f());
                return;
            }
            case j: {
                this.a((eqj_0)eqd_02.f());
                return;
            }
            case c: {
                this.a(eqn_2.a.g());
                return;
            }
            case f: {
                this.a((eQN)eqd_02.f());
                return;
            }
            case g: {
                this.a((eQM)eqd_02.f());
                return;
            }
            case a: 
            case d: {
                break;
            }
            default: {
                b.warn((Object)("Unhandled bonus type " + eqd_02.f().a()));
            }
        }
    }

    @Override
    public void c(int n) {
    }

    @Override
    public void d(int n) {
    }

    private void a(eQM eQM2) {
        this.a.q().b(eQM2.b());
    }

    private void a(eQN eQN2) {
        eQk eQk2 = new eQk(this.a);
        eQk2.f(eQN2.b());
    }

    protected void a(eQQ eQQ2) {
    }

    protected void a(eqp_0 eqp_02) {
    }

    protected void a(eQO eQO2) {
    }

    protected void a(eqj_0 eqj_02) {
        eQk eQk2 = new eQk(this.a);
        eQk2.g(eqj_02.b());
    }

    protected void b(eqj_0 eqj_02) {
        eQk eQk2 = new eQk(this.a);
        eQk2.g(-eqj_02.b());
    }

    @Override
    public void b(erh_1 erh_12) {
        eqd_0 eqd_02 = eqs_2.a.a(erh_12.a());
        switch (eqd_02.f().a()) {
            case b: {
                this.f(eqn_2.a.e());
                return;
            }
            case c: {
                this.a(1.0);
                return;
            }
            case f: {
                this.e();
                return;
            }
            case g: {
                this.d();
                return;
            }
            case j: {
                this.b((eqj_0)eqd_02.f());
                return;
            }
            case e: 
            case h: 
            case i: 
            case a: 
            case d: {
                break;
            }
            default: {
                b.warn((Object)("Unhandled bonus type " + eqd_02.f().a()));
            }
        }
    }

    private void d() {
        this.a.q().b(1.0);
    }

    private void e() {
        eQk eQk2 = new eQk(this.a);
        eQk2.f(7500);
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
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
    }

    @Override
    public void c(ern_1 ern_12) {
    }

    @Override
    public void a(erl_1 erl_12) {
    }

    @Override
    public void b(erl_1 erl_12) {
    }

    @Override
    public void a(erh_1 erh_12) {
        if (erh_12.d()) {
            this.c(erh_12);
        }
    }

    @Override
    public void b(ern_1 ern_12) {
    }

    @Override
    public void d(ern_1 ern_12) {
    }

    @Override
    public void c(erl_1 erl_12) {
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqb_0)) {
            return false;
        }
        eqb_0 eqb_02 = (eqb_0)object;
        return this.a.equals(eqb_02.a);
    }

    public int hashCode() {
        return Objects.hash(this.a);
    }
}

