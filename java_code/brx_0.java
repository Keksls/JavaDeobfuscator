/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from brx
 */
public class brx_0
implements ajh_1 {
    public static final String a = "allKnownCrafts";
    public static final String b = "crafts";
    public static final String d = "craftsByLevel";
    public static final String e = "craftsByKnown";
    public static final String f = "harvests";
    public static final String g = "harvestsByLevel";
    public static final String h = "harvestsByKnown";
    public static final String i = "allByKnown";
    public static final String j = "allByLevel";
    public static final String k = "allByType";
    public static final String l = "allByPreferences";
    public static final String m = "isCraftSorted";
    public static final String[] n = new String[]{"allKnownCrafts", "crafts", "harvests", "craftsByLevel", "harvestsByLevel", "craftsByKnown", "harvestsByKnown", "allByKnown", "allByLevel", "allByType", "allByPreferences", "isCraftSorted"};
    private final long o;
    @NotNull
    private final ece_0 p;
    private final brc_2 q;
    private final Map<Integer, brt_1> r = new HashMap<Integer, brt_1>();
    private final Map<Integer, brt_1> s = new HashMap<Integer, brt_1>();

    public brx_0(long l, @NotNull ece_0 ece_02) {
        this.o = l;
        this.p = ece_02;
        if (ece_02 != ecc_0.a) {
            this.q = new brc_2(this);
            this.p.a(this.q);
        } else {
            this.q = null;
        }
    }

    public void a() {
        this.s.clear();
        this.r.clear();
        fis_1.a().a((ajf_1)this, b, f, d, g, e, h, a, j, i, k, l);
    }

    @Nullable
    public brt_1 a(int n) {
        if (this.s.containsKey(n)) {
            return this.s.get(n);
        }
        if (this.r.containsKey(n)) {
            return this.r.get(n);
        }
        return this.b(n);
    }

    @Nullable
    public brt_1 a(@NotNull ect_0 ect_02) {
        int n = ect_02.a();
        if (this.s.containsKey(n)) {
            return this.s.get(n);
        }
        if (this.r.containsKey(n)) {
            return this.r.get(n);
        }
        return this.b(ect_02);
    }

    @Nullable
    protected brt_1 b(int n) {
        ect_0 ect_02 = ecn_0.a.a(n);
        if (ect_02 == null) {
            return null;
        }
        return this.b(ect_02);
    }

    @Nullable
    protected brt_1 b(@NotNull ect_0 ect_02) {
        brt_1 brt_12;
        int n = ect_02.a();
        if (ect_02.j()) {
            return null;
        }
        if (this.p.e(n)) {
            brg_1 brg_12 = new brg_1(n, this.o, this.p);
            brg_12.a(new bri_1(brg_12, 7));
            brt_12 = brg_12;
        } else {
            brt_12 = new brz_0(n, this.p);
        }
        boolean bl = ((brt_1)brt_12).k();
        if (((brt_1)brt_12).k()) {
            this.r.put(n, brt_12);
        } else {
            this.s.put(n, brt_12);
        }
        fis_1.a().a((ajf_1)this, bl ? f : b, bl ? g : d, bl ? h : e, a, j, i, k, l);
        return brt_12;
    }

    @Nullable
    public brg_1 c(int n) {
        brt_1 brt_12 = this.a(n);
        if (brt_12 != null && !brt_12.i()) {
            return (brg_1)brt_12;
        }
        return this.f();
    }

    @NotNull
    protected List<brt_1> b() {
        return ecn_0.a.a().stream().map(this::a).filter(Objects::nonNull).collect(Collectors.toList());
    }

    @NotNull
    public List<brt_1> c() {
        return this.b().stream().filter(brt_12 -> !brt_12.k()).collect(Collectors.toList());
    }

    @NotNull
    public List<brt_1> e() {
        return this.b().stream().filter(brt_1::k).collect(Collectors.toList());
    }

    @Nullable
    public brg_1 f() {
        for (brt_1 brt_12 : this.c()) {
            if (brt_12.i()) continue;
            return (brg_1)brt_12;
        }
        for (brt_1 brt_12 : this.e()) {
            if (brt_12.i()) continue;
            return (brg_1)brt_12;
        }
        return null;
    }

    public boolean g() {
        return this.p.b().isEmpty();
    }

    public int h() {
        return this.p.b().size();
    }

    @Override
    public String[] d() {
        return n;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "crafts": {
                ArrayList<brt_1> arrayList = new ArrayList<brt_1>(this.c());
                arrayList.sort(bry_1.a);
                return arrayList;
            }
            case "craftsByLevel": {
                ArrayList<brt_1> arrayList = new ArrayList<brt_1>(this.c());
                arrayList.sort(bra_2.a);
                return arrayList;
            }
            case "craftsByKnown": {
                ArrayList<brt_1> arrayList = new ArrayList<brt_1>(this.c());
                arrayList.sort(brz_1.a);
                return arrayList;
            }
            case "harvests": {
                ArrayList<brt_1> arrayList = new ArrayList<brt_1>(this.e());
                arrayList.sort(bry_1.a);
                return arrayList;
            }
            case "harvestsByLevel": {
                ArrayList<brt_1> arrayList = new ArrayList<brt_1>(this.e());
                arrayList.sort(bra_2.a);
                return arrayList;
            }
            case "harvestsByKnown": {
                ArrayList<brt_1> arrayList = new ArrayList<brt_1>(this.e());
                arrayList.sort(brz_1.a);
                return arrayList;
            }
            case "allKnownCrafts": {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.c().stream().filter(brt_12 -> !brt_12.i()).collect(Collectors.toList()));
                arrayList.addAll(this.e().stream().filter(brt_12 -> !brt_12.i()).collect(Collectors.toList()));
                return arrayList;
            }
            case "allByKnown": 
            case "allByLevel": {
                ArrayList<brt_1> arrayList = new ArrayList<brt_1>(this.b());
                arrayList.sort(brb_2.a);
                return arrayList;
            }
            case "allByType": {
                ArrayList<brt_1> arrayList = new ArrayList<brt_1>(this.b());
                arrayList.sort(brd_1.a);
                return arrayList;
            }
            case "allByPreferences": {
                return this.j();
            }
            case "isCraftSorted": {
                return this.i();
            }
        }
        return null;
    }

    public boolean i() {
        return ((bvx_0)ans_0.D().h()).a(bWe.as);
    }

    @NotNull
    public List<brt_1> j() {
        ArrayList<brt_1> arrayList = new ArrayList<brt_1>(this.b());
        arrayList.sort(this.i() ? brb_2.a : brd_1.a);
        return arrayList;
    }

    @NotNull
    ece_0 l() {
        return this.p;
    }

    public void k() {
        if (this.q == null) {
            return;
        }
        this.p.b(this.q);
    }
}

