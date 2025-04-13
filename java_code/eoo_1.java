/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eOO
 */
public class eoo_1
implements eok_1 {
    private final eok_1 c;
    private eos_1 d;
    private int e;
    private int f;

    public eoo_1(eok_1 eok_12) {
        this.c = eok_12;
        this.d = eos_1.a;
    }

    public void a(eos_1 eos_12) {
        this.d = eos_12;
    }

    public eos_1 j() {
        return this.d;
    }

    @Override
    public int a() {
        return this.c.a();
    }

    @Override
    public int b() {
        return this.c.b();
    }

    @Override
    public short c() {
        return this.c.c();
    }

    @Override
    public apc_2 d() {
        return this.c.d();
    }

    @Override
    public int e() {
        return this.c.e();
    }

    @Override
    public int f() {
        return this.c.f();
    }

    @Override
    public int g() {
        return this.c.g();
    }

    @Override
    public ArrayList<eor_1> h() {
        return this.c.h();
    }

    @Override
    public boolean a(int n) {
        return this.c.a(n);
    }

    @Override
    public boolean b(int n) {
        return this.c.b(n);
    }

    @Override
    public boolean i() {
        return this.c.i();
    }

    public void c(int n) {
        this.e = n;
    }

    public void d(int n) {
        this.f = n;
    }

    public int k() {
        return this.e;
    }

    public int l() {
        return this.f;
    }

    public void a(epq_2 epq_22, elm_0 elm_02) {
        this.f = 0;
        this.e = 0;
        ArrayList<eor_1> arrayList = this.c.h();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            eor_1 eor_12 = arrayList.get(k);
            if (!eor_12.b().b(epq_22, epq_22, elm_02, elm_02)) continue;
            this.f += eor_12.c();
            this.e += eor_12.d();
        }
    }

    public String toString() {
        return "FightChallengeInstance{m_model=" + this.c + ", m_state=" + this.d + ", m_dropLevel=" + this.e + ", m_xpLevel=" + this.f + "}";
    }
}

