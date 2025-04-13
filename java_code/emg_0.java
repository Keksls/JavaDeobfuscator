/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Renamed from emG
 */
public class emg_0
implements emu_0 {
    private int[] a;
    private byte b;
    private boolean c;
    private long d;
    private long e;
    private enu_0 f = enu_0.a;
    private enu_0 g = enu_0.a;
    private emx_0 h = emx_0.a;
    private EnumSet<enw_0> i = EnumSet.noneOf(enw_0.class);
    private emi_0 j;
    private emd_0 k = emd_0.a;
    private emr_0 l = new emr_0();
    private final List<Ow> m = new ArrayList<Ow>(Ow.p.size());
    private xz_0 n = xz_0.a;

    public void a(emi_0 emi_02) {
        this.j = emi_02;
    }

    public void a(int ... nArray) {
        this.a = (int[])nArray.clone();
    }

    public boolean a(emq_0 emq_02) {
        return this.a((short)emq_02.ordinal());
    }

    public boolean a(short s2) {
        return emp_0.b(this.a, s2);
    }

    public int[] a() {
        if (this.a == null) {
            return (int[])emp_0.b.clone();
        }
        return (int[])this.a.clone();
    }

    public byte b() {
        return this.b;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void a(enu_0 enu_02) {
        if (this.f != enu_02) {
            enu_0 enu_03 = this.c();
            this.f = enu_02;
            if (this.j != null) {
                this.j.a(enu_03, this.c());
            }
        }
    }

    public void b(enu_0 enu_02) {
        this.g = enu_02;
    }

    public enu_0 c() {
        if (this.g != enu_0.a) {
            return this.g;
        }
        return this.f;
    }

    public enu_0 d() {
        return this.f;
    }

    public enu_0 e() {
        return this.g;
    }

    public boolean c(enu_0 enu_02) {
        return this.c() == enu_02;
    }

    public boolean a(enw_0 enw_02) {
        boolean bl = this.c() != null && this.c().a(enw_02);
        boolean bl2 = this.i.contains((Object)enw_02);
        return bl || bl2;
    }

    public boolean b(enw_0 enw_02) {
        boolean bl = this.i.add(enw_02);
        if (bl && this.j != null) {
            this.j.a(this.c(), this.c());
        }
        return bl;
    }

    public boolean c(enw_0 enw_02) {
        boolean bl = this.i.remove((Object)enw_02);
        if (bl && this.j != null) {
            this.j.a(this.c(), this.c());
        }
        return bl;
    }

    public EnumSet<enw_0> f() {
        return this.i;
    }

    public boolean d(enw_0 enw_02) {
        return this.i.contains((Object)enw_02);
    }

    public float g() {
        if (this.c() == null) {
            return 1.0f;
        }
        return this.c().e();
    }

    public int h() {
        if (this.c() == null) {
            return 0;
        }
        return this.c().f();
    }

    public Long i() {
        return this.d;
    }

    public void a(Long l) {
        this.d = l;
    }

    public long j() {
        return this.e;
    }

    public void a(long l) {
        this.e = l;
    }

    public void a(emr_0 emr_02) {
        this.l = emr_02;
    }

    public emr_0 k() {
        return this.l;
    }

    public emx_0 l() {
        return this.h;
    }

    public void a(emx_0 emx_02) {
        this.h = emx_02;
    }

    public boolean m() {
        return this.h == emx_0.c || this.h == emx_0.a;
    }

    public emd_0 n() {
        return this.k;
    }

    public void a(emd_0 emd_02) {
        this.k = emd_02;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public boolean o() {
        return this.c;
    }

    public void b(byte by) {
        this.a(Ow.c(by));
    }

    public void a(Collection<Ow> collection) {
        this.m.clear();
        this.m.addAll(collection);
    }

    public List<Ow> p() {
        return this.m;
    }

    public byte q() {
        return Ow.a(this.m);
    }

    public boolean a(Ow ow) {
        return this.m.contains((Object)ow);
    }

    public String r() {
        return this.m.stream().map(Ow::h).collect(Collectors.joining(";"));
    }

    public xz_0 s() {
        return this.n;
    }

    public void a(xz_0 xz_02) {
        this.n = xz_02;
    }

    public void a(or_0 or_02) {
        or_02.c = this.a;
        or_02.d = this.f.e;
        or_02.e = this.g.e;
        or_02.f = this.h.d;
        or_02.k = this.k.a();
        or_02.j = this.b;
        or_02.i = new int[this.i.size()];
        or_02.g = this.e;
        or_02.h = this.d;
        int n = 0;
        for (enw_0 object2 : this.i) {
            or_02.i[n] = object2.z;
            ++n;
        }
        Set<Map.Entry<emt_0, ems_0>> set = this.l.b();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            ot_0 ot_02 = new ot_0();
            ot_02.a = ((emt_0)((Object)entry.getKey())).a();
            ot_02.b = ((ems_0)entry.getValue()).b();
            or_02.l.add(ot_02);
        }
        or_02.m = Ow.a(this.m);
    }

    public void b(or_0 or_02) {
        enu_0 enu_02 = this.c();
        this.a = or_02.c;
        this.f = enu_0.a(or_02.d);
        this.g = enu_0.a(or_02.e);
        this.h = emx_0.a(or_02.f);
        this.b = or_02.j;
        this.k = emd_0.a(or_02.k);
        this.i.clear();
        this.e = or_02.g;
        this.d = or_02.h;
        if (or_02.i != null) {
            for (int k = 0; k < or_02.i.length; ++k) {
                int n = or_02.i[k];
                this.i.add(enw_0.a(n));
            }
        }
        for (ot_0 ot_02 : or_02.l) {
            emt_0 emt_02 = emt_0.a(ot_02.a);
            if (emt_02 == null) continue;
            this.l.a(new ems_0(emt_02, ot_02.b));
        }
        this.b(or_02.m);
        if (this.j != null) {
            this.j.a(enu_02, this.c());
        }
    }

    public void t() {
        this.a = null;
        this.f = enu_0.a;
        this.g = enu_0.a;
        this.h = emx_0.a;
        this.b = 0;
        this.c = false;
        this.i.clear();
        this.l.c();
        this.m.clear();
    }

    public void a(emg_0 emg_02) {
        this.a = emg_02.a;
        this.f = emg_02.f;
        this.g = emg_02.g;
        this.h = emg_02.h;
        this.b = emg_02.b;
        this.c = emg_02.c;
        this.i = emg_02.i;
        this.l = emg_02.l;
        this.a(emg_02.m);
    }

    public String toString() {
        return "WakfuAccountInformationHandler{, m_debuggingHackMode=" + this.c + ", m_subscriptionLevel=" + this.f + ", m_antiAddictionLevel=" + this.h + ", m_additionalSlots=" + this.b + ", m_additionalRights=" + this.i + ", m_accountData=" + this.l + ", m_languages=" + this.r() + "}";
    }
}

