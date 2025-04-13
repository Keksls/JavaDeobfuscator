/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Iterator;
import java.util.Optional;

/*
 * Renamed from eZE
 */
public class eze_0
implements Serializable {
    private int a;
    private tc_0 b;
    private int c;

    public eze_0() {
        this(0, tc_0.a, 0);
    }

    public eze_0(tc_0 tc_02) {
        this(0, tc_02, 0);
    }

    public eze_0(byte by) {
        this(0, tc_0.a(by), 0);
    }

    public eze_0(int n, byte by, int n2) {
        this(n, tc_0.a(by), n2);
    }

    public eze_0(int n, tc_0 tc_02, int n2) {
        this.a = n;
        this.b = tc_02;
        this.c = n2;
    }

    public int a() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public void b() {
        this.a = 0;
        this.c = 0;
    }

    public tc_0 c() {
        return this.b;
    }

    public void a(tc_0 tc_02) {
        this.b = tc_02;
    }

    public int d() {
        return this.c;
    }

    public Optional<ezr_0<?>> e() {
        if (this.a <= 0) {
            return Optional.empty();
        }
        return Optional.ofNullable(eyo_1.g().d(this.a));
    }

    public Optional<eAy> a(exh_2 exh_22) {
        if (this.b == tc_0.a) {
            return Optional.empty();
        }
        Optional<ezr_0<?>> optional = this.e();
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        ezr_0<?> ezr_02 = optional.get();
        short s2 = this.f();
        Iterator<efh_0> iterator = ezr_02.u();
        while (iterator.hasNext()) {
            eAy eAy2;
            ejh_0 ejh_02;
            ejh_0 ejh_03;
            efh_0 efh_02 = iterator.next();
            if (s2 > efh_02.P() || s2 < efh_02.O() || (ejh_03 = (ejh_0)efc_0.a().b(efh_02.j())) == null || (ejh_02 = (ejh_0)ejh_03.a(null, null)) == null) continue;
            efi_0 efi_02 = new efj_0().d(s2).a();
            efn_0 efn_02 = efn_0.a(true, true, null);
            ejh_02.a(efh_02, efi_02, null, null, null, 0, 0, (short)0, (Sr)efn_02);
            ejh_02.j(null);
            if (ejh_02 instanceof eGH) {
                eGN eGN2 = (eGN)ejh_02;
                eAy2 = new eAy((eps_0)eGN2.aJ());
                eAy2.a(eGN2.n());
            } else {
                if (!(ejh_02 instanceof ege_0)) continue;
                ege_0 ege_02 = (ege_0)ejh_02;
                eAy2 = new eAy((eps_0)ege_02.aE());
                eAy2.a(ege_02.n());
                eAy2.b(ege_02.n());
            }
            if (ezr_02.ab().b().contains(exh_22)) {
                eAy2.a(eAy2.b() * 2);
                eAy2.b(eAy2.c() * 2);
            }
            return Optional.of(eAy2);
        }
        return Optional.empty();
    }

    public short f() {
        if (this.a <= 0) {
            return 0;
        }
        Object r2 = eyo_1.g().d(this.a);
        if (r2 == null || ((ezr_0)r2).ab() == null) {
            return 0;
        }
        return ((ezr_0)r2).ab().b(this.c);
    }

    public void b(int n) {
        this.c = n;
    }

    public void c(int n) {
        this.c += n;
    }

    public void d(int n) {
        this.c -= n;
    }

    public boolean g() {
        return this.a != 0;
    }

    public eze_0 h() {
        return new eze_0(this.a, tc_0.a(this.b.a()), this.c);
    }

    public boolean a(eze_0 eze_02) {
        if (this.a != eze_02.a) {
            return false;
        }
        if (this.b != eze_02.b) {
            return false;
        }
        return this.c == eze_02.c;
    }

    public String toString() {
        return "{m_slottedItemId:" + this.a + ",m_color:" + this.b + ",m_amount:" + this.c + "}";
    }
}

