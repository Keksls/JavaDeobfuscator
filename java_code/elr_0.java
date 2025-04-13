/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from eLR
 */
public final class elr_0 {
    private static final Logger a = Logger.getLogger(elr_0.class);
    private final Collection<sr_0> b = new ArrayList<sr_0>();
    private final HashMap<sr_0, ArrayList<epq_2>> c = new HashMap();
    private final Collection<sr_0> d = new ArrayList<sr_0>();
    private final Collection<sr_0> e = new ArrayList<sr_0>();
    private final Collection<sr_0> f = new ArrayList<sr_0>();
    private final Collection<abo_2<sr_0, epq_2>> g = new ArrayList<abo_2<sr_0, epq_2>>();
    private final Collection<abo_2<sr_0, epq_2>> h = new ArrayList<abo_2<sr_0, epq_2>>();
    private final Collection<abo_2<sr_0, epq_2>> i = new ArrayList<abo_2<sr_0, epq_2>>();
    private Su j;
    private aff_1 k;
    private final elm_0<? extends epq_2> l;

    public elr_0(elm_0<? extends epq_2> elm_02, Su su, aff_1 aff_12) {
        this.l = elm_02;
        this.a(su);
        this.a(aff_12);
    }

    public void a(Su su) {
        if (su == null) {
            throw new IllegalArgumentException("Le mover ne doit jamais etre null");
        }
        this.j = su;
    }

    public void a(aff_1 aff_12) {
        if (aff_12 == null) {
            throw new IllegalArgumentException("La cellule destination ne doit jamais etre null");
        }
        this.k = aff_12;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
    }

    public void b() {
        this.b((aff_1)null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(aff_1 aff_12) {
        aff_1 aff_13;
        if (aff_12 == null) {
            aff_12 = this.j.P_();
        }
        if ((aff_13 = this.j.P_()) != aff_12) {
            this.j.a(aff_12);
        }
        try {
            for (sr_0 sr_02 : this.l.aB()) {
                if (sr_02.a(this.j, aff_12.d(), aff_12.e(), aff_12.f())) {
                    this.b.add(sr_02);
                }
                if (sr_02.N()) continue;
                ArrayList<epq_2> arrayList = this.c.get(sr_02);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.c.put(sr_02, arrayList);
                }
                for (epq_2 epq_22 : this.l.am()) {
                    if (!sr_02.a(epq_22, epq_22.G(), epq_22.H(), epq_22.I())) continue;
                    arrayList.add(epq_22);
                }
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            if (aff_13 != aff_12) {
                this.j.a(aff_13);
            }
        }
    }

    private void h() {
        this.d.clear();
        this.e.clear();
        this.g.clear();
        this.f.clear();
        this.h.clear();
    }

    public void c() {
        this.h();
        if (this.l.aB().isEmpty()) {
            return;
        }
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>(this.l.aB());
        for (sr_0 sr_02 : arrayList) {
            this.b(sr_02);
            if (sr_02.N()) continue;
            this.c(sr_02);
        }
    }

    public boolean d() {
        boolean bl;
        if (!this.m()) {
            return false;
        }
        aff_1 aff_12 = new aff_1(this.j.P_());
        this.j.a(this.k);
        try {
            bl = this.i() || this.j();
        }
        catch (Exception exception) {
            bl = false;
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        this.j.a(aff_12);
        return bl;
    }

    public boolean e() {
        Object object;
        if (!this.m()) {
            return false;
        }
        for (sr_0 object2 : this.e) {
            if (!object2.b_(10002) || !object2.al()) continue;
            return true;
        }
        for (sr_0 sr_02 : this.f) {
            if (!sr_02.b_(10008) || !sr_02.al()) continue;
            return true;
        }
        for (sr_0 sr_03 : this.d) {
            if (!sr_03.b_(10001) || !sr_03.al()) continue;
            return true;
        }
        for (abo_2<sr_0, epq_2> abo_22 : this.g) {
            object = abo_22.a();
            if (!((sr_0)object).b_(10001) || !((sr_0)object).al()) continue;
            return true;
        }
        for (abo_2<sr_0, epq_2> abo_22 : this.i) {
            object = abo_22.a();
            if (!((sr_0)object).b_(10008) || !((sr_0)object).al()) continue;
            return true;
        }
        for (abo_2<sr_0, epq_2> abo_22 : this.h) {
            object = abo_22.a();
            if (!((sr_0)object).b_(10002) || !((sr_0)object).al()) continue;
            return true;
        }
        return false;
    }

    public boolean f() {
        if (!this.m()) {
            return false;
        }
        for (sr_0 object : this.e) {
            if (!object.b_(10002) || this.a(object)) continue;
            return true;
        }
        for (sr_0 sr_02 : this.f) {
            if (!sr_02.b_(10008) || this.a(sr_02)) continue;
            return true;
        }
        for (sr_0 sr_03 : this.d) {
            if (!sr_03.b_(10001) || this.a(sr_03)) continue;
            return true;
        }
        for (abo_2 abo_22 : this.g) {
            if (!((sr_0)abo_22.a()).b_(10001)) continue;
            return true;
        }
        for (abo_2 abo_23 : this.i) {
            if (!((sr_0)abo_23.a()).b_(10008)) continue;
            return true;
        }
        for (abo_2 abo_24 : this.h) {
            if (!((sr_0)abo_24.a()).b_(10002)) continue;
            return true;
        }
        return false;
    }

    public boolean a(sr_0 sr_02) {
        return sr_02.w() == ele_0.k.a() && sr_02.v() == this.j;
    }

    private boolean i() {
        for (sr_0 sr_02 : this.e) {
            if (!sr_02.a(10002, (apq_2)this.j)) continue;
            return true;
        }
        for (sr_0 sr_02 : this.f) {
            if (!sr_02.a(10008, (apq_2)this.j)) continue;
            return true;
        }
        for (sr_0 sr_02 : this.d) {
            if (!sr_02.a(10001, (apq_2)this.j)) continue;
            return true;
        }
        return false;
    }

    private boolean j() {
        for (abo_2<sr_0, epq_2> abo_22 : this.h) {
            if (!abo_22.a().a(10002, (apq_2)this.j)) continue;
            return true;
        }
        for (abo_2<sr_0, epq_2> abo_22 : this.i) {
            if (!abo_22.a().a(10008, (apq_2)this.j)) continue;
            return true;
        }
        for (abo_2<sr_0, epq_2> abo_22 : this.g) {
            if (!abo_22.a().a(10001, (apq_2)this.j)) continue;
            return true;
        }
        return false;
    }

    public void g() {
        this.k();
        this.l();
    }

    private void k() {
        for (sr_0 sr_02 : this.e) {
            this.a(sr_02, (short)10002, this.j);
            if (!this.j.p() && !this.j.t()) continue;
            return;
        }
        for (sr_0 sr_02 : this.f) {
            this.a(sr_02, (short)10008, this.j);
            if (!this.j.p() && !this.j.t()) continue;
            return;
        }
        for (sr_0 sr_02 : this.d) {
            this.a(sr_02, (short)10001, this.j);
            if (!this.j.p() && !this.j.t()) continue;
            return;
        }
    }

    private void l() {
        for (abo_2<sr_0, epq_2> abo_22 : this.h) {
            this.a(abo_22.a(), (short)10002, abo_22.b());
            if (!this.j.p() && !this.j.t()) continue;
            break;
        }
        for (abo_2<sr_0, epq_2> abo_22 : this.i) {
            this.a(abo_22.a(), (short)10008, abo_22.b());
            if (!this.j.p() && !this.j.t()) continue;
            break;
        }
        for (abo_2<sr_0, epq_2> abo_22 : this.g) {
            this.a(abo_22.a(), (short)10001, abo_22.b());
            if (!this.j.p() && !this.j.t()) continue;
            break;
        }
    }

    private void b(sr_0 sr_02) {
        if (sr_02.v() == this.j && !sr_02.N()) {
            return;
        }
        if (this.j != null && !sr_02.e(this.j)) {
            return;
        }
        if (sr_02.a(this.j, this.k.d(), this.k.e(), this.k.f())) {
            if (!this.b.contains(sr_02)) {
                this.d.add(sr_02);
                this.b.add(sr_02);
            } else {
                this.f.add(sr_02);
            }
        } else if (this.b.contains(sr_02)) {
            this.e.add(sr_02);
            this.b.remove(sr_02);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void c(sr_0 sr_02) {
        ArrayList<epq_2> arrayList = this.c.get(sr_02);
        if (arrayList == null) {
            return;
        }
        aff_1 aff_12 = this.j.P_();
        try {
            this.j.a(this.k);
            for (epq_2 epq_22 : this.l.am()) {
                short s2;
                int n;
                if (epq_22 == this.j || this.j != sr_02.v() || sr_02.N()) continue;
                int n2 = epq_22.G();
                if (sr_02.a(epq_22, n2, n = epq_22.H(), s2 = epq_22.I())) {
                    if (!arrayList.contains(epq_22)) {
                        this.g.add(new abo_2<sr_0, epq_2>(sr_02, epq_22));
                        continue;
                    }
                    this.i.add(new abo_2<sr_0, epq_2>(sr_02, epq_22));
                    continue;
                }
                if (!arrayList.contains(epq_22)) continue;
                this.h.add(new abo_2<sr_0, epq_2>(sr_02, epq_22));
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception lev\u00e9e ", (Throwable)exception);
        }
        finally {
            this.j.a(aff_12);
        }
    }

    private boolean m() {
        return !this.d.isEmpty() || !this.e.isEmpty() || !this.f.isEmpty() || !this.h.isEmpty() || !this.g.isEmpty() || !this.i.isEmpty();
    }

    private void a(sr_0 sr_02, short s2, apq_2 apq_22) {
        sr_02.a((int)s2, null, apq_22);
    }
}

