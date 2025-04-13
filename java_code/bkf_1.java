/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKf
 */
public class bkf_1
implements ajh_1 {
    private static final String b = "instances";
    private static final String d = "instance";
    private static final String e = "playlist";
    public static final String a = "currentMusicName";
    private final Map<Long, bkd_1> f = new HashMap<Long, bkd_1>();
    private final bkb_1 g;
    private bkd_1 h;
    private bke_1 i;
    private String j;

    public bkf_1(bkb_1 bkb_12) {
        this.g = bkb_12;
    }

    @Override
    public String[] d() {
        return new String[]{b, e};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.f.values().stream().filter(bkd_12 -> Cz.a(bkd_12.b(), this.j)).sorted(Comparator.comparing(bkd_1::b)).collect(Collectors.toList());
        }
        if (string.equals(d)) {
            return this.h;
        }
        if (string.equals(e)) {
            return this.i;
        }
        if (string.equals(a)) {
            bmr_1 bmr_12 = azu_0.j().k();
            bso_1 bso_12 = bmr_12.di().v();
            short s2 = bso_12.l();
            if (s2 <= 0) {
                return "-";
            }
            afp afp2 = afr.a().a(s2);
            long l = afp2.i();
            int n = afp2.j();
            return bae.h().a(77, l, new Object[0]) + " - " + bae.h().a(54, (long)n, new Object[0]);
        }
        return null;
    }

    public void a() {
        this.f.clear();
        afr.a().a((Short s2, afp afp2) -> {
            long l = afp2.i();
            if (l <= 0L) {
                return;
            }
            int n = afp2.j();
            if (n <= 0) {
                return;
            }
            this.f.compute(l, (l2, bkd_12) -> {
                if (bkd_12 == null) {
                    return new bkd_1().a(l).a(n);
                }
                return bkd_12.a(n);
            });
        });
        this.j = "";
        if (this.f.size() <= 0) {
            return;
        }
        Optional<bkd_1> optional = this.f.values().stream().min(Comparator.comparing(bkd_1::b));
        this.a(optional.get());
    }

    public void b() {
        this.f.clear();
        this.h = null;
        this.j = null;
        this.i = null;
    }

    public void a(bkd_1 bkd_12) {
        this.h = bkd_12;
        fis_1.a().a((ajf_1)this, d);
        if (this.h == null) {
            return;
        }
        List<Integer> list = this.h.a();
        if (list.size() <= 0) {
            return;
        }
        Collection<afp> collection = afr.a().a(list.get(0));
        if (collection.isEmpty()) {
            return;
        }
        this.a(new bke_1(collection.stream().findFirst().get()));
    }

    public void a(bke_1 bke_12) {
        this.i = bke_12;
        fis_1.a().a((ajf_1)this, e);
    }

    public void a(Long l) {
        if (l == -1L) {
            this.g.a();
        }
        if (this.i == null) {
            return;
        }
        Optional<amb_1> optional = this.i.a(l);
        if (optional.isEmpty()) {
            return;
        }
        this.g.a(this.i.a(), optional.get());
    }

    public void c() {
        Random random = new Random();
        ArrayList<bkd_1> arrayList = new ArrayList<bkd_1>(this.f.values());
        int n = random.nextInt(arrayList.size());
        bkd_1 bkd_12 = (bkd_1)arrayList.get(n);
        List<Integer> list = bkd_12.a();
        int n2 = random.nextInt(list.size());
        Integer n3 = list.get(n2);
        Collection<afp> collection = afr.a().a(n3);
        int n4 = random.nextInt(collection.size());
        afp afp2 = new ArrayList<afp>(collection).get(n4);
        List<amb_1> list2 = afp2.a();
        int n5 = random.nextInt(list2.size());
        amb_1 amb_12 = list2.get(n5);
        this.g.a(afp2, amb_12);
    }

    public void a(String string) {
        this.j = string;
        fis_1.a().a((ajf_1)this, b);
    }
}

