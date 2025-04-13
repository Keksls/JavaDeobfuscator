/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aom
 */
public class aom_2 {
    private apy_1 a;
    private aom_2 b;
    private aom_2 c;
    private aom_2 d;

    public aom_2(apy_1 apy_12, aom_2 aom_22, aom_2 aom_23) {
        this.a = apy_12;
        if (aom_23 != null) {
            aom_23.c(this);
        }
        this.c = aom_23;
        if (aom_22 != null) {
            aom_22.c(this);
        }
        this.b = aom_22;
    }

    public aom_2(apy_1 apy_12) {
        this(apy_12, null, null);
    }

    public aom_2() {
        this(null, null, null);
    }

    public boolean a() {
        return this.a == null;
    }

    public boolean b() {
        return this.d == null;
    }

    public boolean c() {
        return !this.a() && this.b == null && this.c == null && (this.a.a().equals((Object)aon_1.g) || this.a.a().equals((Object)aon_1.h) || this.a.a().equals((Object)aon_1.i) || this.a.a().equals((Object)aon_1.c));
    }

    public boolean d() {
        return !this.a() && this.a.a().equals((Object)aon_1.b);
    }

    public void a(apy_1 apy_12) {
        this.a = apy_12;
    }

    public void a(aom_2 aom_22) {
        aom_22.c(this);
        this.b = aom_22;
    }

    public void b(aom_2 aom_22) {
        aom_22.c(this);
        this.c = aom_22;
    }

    public void c(aom_2 aom_22) {
        this.d = aom_22;
    }

    public apy_1 e() {
        return this.a;
    }

    public aom_2 f() {
        return this.c;
    }

    public aom_2 g() {
        return this.b;
    }

    public aom_2 h() {
        return this.d;
    }

    public boolean i() {
        if (this.b != null && this.c != null) {
            return this.b.i() || this.c.i();
        }
        if (this.b != null) {
            return this.b.i();
        }
        if (this.c != null) {
            return this.c.i();
        }
        if (this.a != null) {
            return this.a.e();
        }
        return true;
    }

    public Object a(Object object, Object object2, Object object3, Object object4) {
        if (this.a instanceof apo_2) {
            return ((apo_2)this.a).a(this.b.a(object, object2, object3, object4), this.c.a(object, object2, object3, object4));
        }
        if (this.a instanceof app_1) {
            return this.a.u_();
        }
        if (this.a instanceof apn_2) {
            return ((apn_2)this.a).a(this.c.a(object, object2, object3, object4));
        }
        if (this.a instanceof apm_2) {
            return ((apm_2)this.a).a(object, object2, object3, object4);
        }
        throw new aoh_1("[Evaluation d'un arbre syntaxique] Evaluation impossible");
    }

    public aom_2 j() {
        if (this.a instanceof apo_2 && this.b != null && this.c != null) {
            if (!this.i()) {
                return new aom_2(((apo_2)this.a).b(this.b.j().a(null, null, null, null), this.c.j().a(null, null, null, null)));
            }
            return new aom_2(this.a, this.b.j(), this.c.j());
        }
        if (this.a instanceof app_1) {
            return this;
        }
        if (this.a instanceof apn_2 && this.c != null) {
            if (!this.i()) {
                return new aom_2(((apn_2)this.a).b(this.c.j().a(null, null, null, null)));
            }
            return new aom_2(this.a, this.b, this.c.j());
        }
        if (this.a instanceof apm_2 && !this.a.e()) {
            return new aom_2(((apm_2)this.a).f());
        }
        return this;
    }
}

