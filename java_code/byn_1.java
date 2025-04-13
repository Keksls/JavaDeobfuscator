/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from byN
 */
public class byn_1 {
    private final bmr_1 a;
    private eQb b;
    private final ArrayList<byo_1> c = new ArrayList();

    public byn_1(bmr_1 bmr_12) {
        this.a = bmr_12;
    }

    public final eQb a() {
        return this.b;
    }

    public long b() {
        if (this.b == null) {
            return 0L;
        }
        return this.b.b();
    }

    public boolean c() {
        if (this.b == null) {
            return false;
        }
        return this.b.a() == this.a.a_();
    }

    public boolean d() {
        return this.b != null;
    }

    public void a(String string) {
        if (aUh.a(string, eAO.b)) {
            return;
        }
        aUh.b("group.party.inviting", string);
        qp_0 qp_02 = new qp_0();
        qp_02.a(Xd.b.a());
        try {
            long l = Long.parseLong(string);
            qp_02.a(l);
        }
        catch (NumberFormatException numberFormatException) {
            qp_02.a(string);
        }
        azu_0.j().K().c(qp_02);
    }

    public void a(long l) {
        if (this.b == null) {
            return;
        }
        Qs qs = new Qs();
        qs.a(this.b.b());
        qs.b(l);
        azu_0.j().K().c(qs);
    }

    public void b(long l) {
        if (this.b == null) {
            return;
        }
        Qt qt = new Qt();
        qt.a(this.b.b());
        qt.b(l);
        azu_0.j().K().c(qt);
    }

    public void a(eQb eQb2) {
        if (eQb2 == this.b) {
            return;
        }
        if (eQb2 != null) {
            this.b(eQb2);
        } else {
            this.c(this.b);
        }
        this.b = eQb2;
        azu_0.j().k().z();
    }

    public void a(byo_1 byo_12) {
        if (this.c.contains(byo_12)) {
            return;
        }
        this.c.add(byo_12);
    }

    public void b(byo_1 byo_12) {
        if (!this.c.contains(byo_12)) {
            return;
        }
        this.c.remove(byo_12);
    }

    public void b(eQb eQb2) {
        for (int k = this.c.size() - 1; k >= 0; --k) {
            this.c.get(k).a(eQb2);
        }
    }

    public void c(eQb eQb2) {
        for (int k = this.c.size() - 1; k >= 0; --k) {
            this.c.get(k).b(eQb2);
        }
    }
}

