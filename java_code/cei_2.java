/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cei
 */
public class cei_2
implements ajh_1 {
    public static final String a = "id";
    public static final String b = "name";
    public static final String d = "description";
    public static final String e = "message";
    public static final String f = "level";
    public static final String g = "blazon";
    public static final String h = "members";
    public static final String i = "ranks";
    private final ng_0 j;
    private final List<cej_2> k = new ArrayList<cej_2>();
    private final Map<Long, cek_2> l = new HashMap<Long, cek_2>();

    public cei_2(ng_0 ng_02) {
        this.j = ng_02;
        for (no_0 generatedMessageV3 : this.j.q()) {
            this.l.put(generatedMessageV3.c(), new cek_2(generatedMessageV3));
        }
        for (nk_0 nk_02 : this.j.t()) {
            this.k.add(new cej_2(nk_02, this.l.get(nk_02.j())));
        }
    }

    public static cei_2 a(byte[] byArray) {
        return new cei_2(ng_0.a(byArray));
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "id": {
                return this.a();
            }
            case "name": {
                return this.j.e();
            }
            case "description": {
                return this.j.h();
            }
            case "message": {
                return this.j.k();
            }
            case "level": {
                return this.j.n();
            }
            case "blazon": {
                eqd_2 eqd_22 = new eqd_2(this.j.p());
                bxo_1 bxo_12 = new bxo_1(eqd_22.a(), eqd_22.c(), bxm_1.a().a(eqd_22.d()), bxm_1.a().a(eqd_22.b()));
                return bxp_1.a().a(bxo_12);
            }
            case "members": {
                return this.h();
            }
            case "ranks": {
                return this.i();
            }
        }
        return null;
    }

    private List<cej_2> h() {
        return this.k.stream().sorted(Comparator.comparingInt(object -> ((cej_2)object).b().b()).thenComparing(object -> ((cej_2)object).a())).collect(Collectors.toList());
    }

    private List<cek_2> i() {
        return this.l.values().stream().sorted(Comparator.comparingInt(cek_2::b).thenComparing(cek_2::a)).collect(Collectors.toList());
    }

    public long a() {
        return this.j.c();
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("===== Guild '").append(this.j.e()).append("' (ID ").append(this.j.c()).append(")\n");
        stringBuilder.append("- Level: ").append(this.j.n()).append('\n');
        stringBuilder.append("- Description: \"").append(this.j.h()).append("\"\n");
        stringBuilder.append("- Message: \"").append(this.j.k()).append("\"\n\n");
        stringBuilder.append("- Ranks:\n");
        this.i().forEach(cek_22 -> stringBuilder.append("  ").append(cek_22.c()).append('\n'));
        stringBuilder.append('\n');
        stringBuilder.append("- Members:\n");
        List<cej_2> list = this.h();
        list.forEach(cej_22 -> stringBuilder.append("  - ").append(cej_22.a()).append(" (Account ID=").append(cej_22.e()).append(", Character ID=").append(cej_22.c()).append(", Rank=").append(cej_22.b().a()).append(")\n"));
        stringBuilder.append('\n');
        stringBuilder.append("- All account IDs:\n");
        this.c().forEach(l -> stringBuilder.append(l).append('\n'));
        stringBuilder.append('\n');
        stringBuilder.append("- All character IDs:\n");
        list.forEach(cej_22 -> stringBuilder.append(cej_22.c()).append('\n'));
        return stringBuilder.toString();
    }

    public List<Long> c() {
        return this.h().stream().map(cej_2::e).distinct().collect(Collectors.toList());
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d, e, f, g, h, i};
    }

    public ng_0 e() {
        return this.j;
    }

    public List<cej_2> f() {
        return this.k;
    }

    public Map<Long, cek_2> g() {
        return this.l;
    }

    public String toString() {
        return "ModeratedGuildView(m_guild=" + this.e() + ", m_members=" + this.f() + ", m_ranks=" + this.g() + ")";
    }
}

