/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 */
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/*
 * Renamed from bPk
 */
public class bpk_0
extends bor_0
implements fiS {
    public static final String e = "elementarySpellsList";
    public static final String f = "activeSpellsList";
    public static final String g = "passiveSpellsList";
    public static final String[] h = new String[]{"elementarySpellsList", "activeSpellsList", "passiveSpellsList"};
    public static final String[] i = new String[bor_0.d.length + h.length];
    protected fiz<bpl_0> j;
    protected bnh_1 k;

    public bpk_0(bnh_1 bnh_12) {
        this.j = new fiz<bpl_0>(zq_22 -> new bpl_0(bnh_12), 60, new bpn_0(bnh_12), null, false, false, false);
        this.k = bnh_12;
    }

    @Override
    public Object b(String string) {
        Comparator comparator = (bpj_02, bpj_03) -> Ints.compare((int)bpj_02.a().q(), (int)bpj_03.a().q());
        if (string.equals(e)) {
            return this.m().stream().filter(Objects::nonNull).filter(bpj_02 -> bpj_02.a().q() != efa_0.h.a()).sorted(comparator.thenComparing(bpj_0::compareTo)).map(bpj_02 -> bpj_02.b() != null ? bpj_02.b() : bpj_02.a()).collect(Collectors.toList());
        }
        if (string.equals(f)) {
            return this.m().stream().filter(Objects::nonNull).filter(bpj_02 -> !bpj_02.a().w()).filter(bpj_02 -> bpj_02.a().q() == efa_0.h.a()).filter(bpj_02 -> new bos_0().a(bpj_02.a())).sorted(comparator.thenComparing(bpj_0::compareTo)).map(bpj_02 -> bpj_02.b() != null ? bpj_02.b() : bpj_02.a()).collect(Collectors.toList());
        }
        if (string.equals(g)) {
            return this.m().stream().filter(Objects::nonNull).filter(bpj_02 -> bpj_02.a().w()).filter(bpj_02 -> new bos_0().a(bpj_02.a())).sorted().map(bpj_02 -> bpj_02.b() != null ? bpj_02.b() : bpj_02.a()).collect(Collectors.toList());
        }
        return super.b(string);
    }

    private List<bpj_0> m() {
        HashMap<Integer, bpl_0> hashMap = new HashMap<Integer, bpl_0>();
        for (Map.Entry<Long, bpl_0> object2 : this.j.g().entrySet()) {
            hashMap.put(((bph_0)object2.getValue().r()).i(), object2.getValue());
        }
        fiR fiR2 = this.k.dw();
        if (fiR2 == null) {
            return Collections.emptyList();
        }
        fiO fiO2 = fiR2.b(this.k.C());
        if (fiO2 == null) {
            return Collections.emptyList();
        }
        int n = fiO2.b() <= 0 ? (int)this.k.dt() : fiO2.b();
        return this.k.bb().g().stream().map(bph_02 -> {
            int n2 = bph_02.i();
            if (!hashMap.containsKey(n2) || ((bph_0)((bpl_0)hashMap.get(n2)).r()).m() > n) {
                return new bpj_0((bph_0)bph_02, null);
            }
            return new bpj_0((bph_0)bph_02, (bpl_0)hashMap.get(n2));
        }).collect(Collectors.toList());
    }

    public void h() {
        fis_1.a().a((ajf_1)this, e, f, g);
    }

    @Override
    public String[] d() {
        return h;
    }

    public bpl_0 a(long l) {
        return (bpl_0)this.i().e(l);
    }

    public fiz<bpl_0> i() {
        if (this.f()) {
            return this.e();
        }
        return this.j;
    }

    public fiz<bpl_0> j() {
        return this.j;
    }

    @Override
    public Iterable<bpl_0> c() {
        return this.i();
    }

    public long k() {
        return this.k.a_();
    }

    @Override
    public void a(fiO fiO2) {
        fis_1.a().a((ajf_1)this, h);
    }

    @Override
    public void a(int n) {
        fis_1.a().a((ajf_1)this, h);
    }

    public void l() {
        fis_1.a().a((ajf_1)this, h);
        for (bpl_0 bpl_02 : this.j.g().values()) {
            fis_1.a().a((ajf_1)bpl_02, "isInCurrentDeck", "unlockLevel", "isUnlockedSpell");
        }
    }

    static {
        System.arraycopy(h, 0, i, 0, h.length);
        System.arraycopy(bor_0.d, 0, i, h.length, bor_0.d.length);
    }
}

