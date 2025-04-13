/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class eQr {
    private static final Logger a = Logger.getLogger(eQr.class);
    private long b;
    private String c;
    private long d;
    private String e = "";
    private String f = "";
    private short g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final ArrayList<erl_1> l = new ArrayList();
    private final ArrayList<ern_1> m = new ArrayList();
    private final ArrayList<erh_1> n = new ArrayList();

    public eQr a(long l) {
        this.b = l;
        return this;
    }

    public eQr a(String string) {
        this.c = string;
        return this;
    }

    public eQr b(long l) {
        this.d = l;
        return this;
    }

    public eQr b(String string) {
        this.e = string;
        return this;
    }

    public eQr c(String string) {
        this.f = string;
        return this;
    }

    public eQr a(int n) {
        this.h = n;
        return this;
    }

    public eQr b(int n) {
        this.i = n;
        return this;
    }

    public eQr a(short s2) {
        this.g = s2;
        return this;
    }

    public eQr c(int n) {
        this.j = n;
        return this;
    }

    public eQr d(int n) {
        this.k = n;
        return this;
    }

    public eQr a(erl_1 erl_12) {
        this.l.add(erl_12);
        return this;
    }

    public eQr a(ern_1 ern_12) {
        this.m.add(ern_12);
        return this;
    }

    public eQr a(erh_1 erh_12) {
        this.n.add(erh_12);
        return this;
    }

    public erg_1 a() {
        int n;
        eqq_0 eqq_02 = new eqq_0();
        eqq_02.d(this.b);
        eqq_02.a(this.c);
        eqq_02.e(this.d);
        eqq_02.b(this.e);
        eqq_02.c(this.f);
        eqq_02.c(this.h);
        eqq_02.b(this.i);
        eqq_02.e(this.j);
        eqq_02.f(this.k);
        eqq_02.a(this.g);
        int n2 = this.m.size();
        for (n = 0; n < n2; ++n) {
            eqq_02.a(this.m.get(n));
        }
        n2 = this.n.size();
        for (n = 0; n < n2; ++n) {
            eqq_02.a(this.n.get(n));
        }
        n2 = this.l.size();
        for (n = 0; n < n2; ++n) {
            eqq_02.a(this.a(eqq_02, this.l.get(n)));
        }
        return eqq_02;
    }

    private erl_1 a(eqq_0 eqq_02, erl_1 erl_12) {
        if (eqq_02.c(erl_12.d()) == null) {
            long l = eqq_02.d();
            if (l > 0L) {
                a.error((Object)("Member " + erl_12.f() + " with member id " + erl_12.a() + " for guild " + eqq_02.a() + " has a rank id " + erl_12.d() + " which doesn't exist for this guild ! Setting worst rank for member (ie rank id " + l + ")."));
                ((eQp)erl_12).a(l);
            } else {
                a.error((Object)("Member " + erl_12.f() + " with member id " + erl_12.a() + " for guild " + eqq_02.a() + " has a rank id " + erl_12.d() + " which doesn't exist for this guild ! AND NO WORST RANK TO APPLY BY DEFAULT. FIX ME."));
            }
        }
        return erl_12;
    }
}

