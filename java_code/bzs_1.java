/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bzs
 */
public class bzs_1
implements ajh_1 {
    public static final String a = "nameFilter";
    public static final String b = "hasFilterOtherThanName";
    public static final String d = "levelFilterType";
    public static final String e = "rarities";
    public static final String[] f = new String[]{"nameFilter", "hasFilterOtherThanName", "levelFilterType", "rarities"};
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private final @Unmodifiable List<bzc_1> j;
    private final List<bLl> k = bLl.a();

    bzs_1(@Unmodifiable List<bzc_1> list) {
        this.j = list;
        this.a();
    }

    private void a() {
        Optional optional = this.a(bzd_1.c);
        if (optional.isEmpty()) {
            return;
        }
        Set<exw_1> set = ((bzg_2)optional.get()).d();
        if (set.isEmpty()) {
            return;
        }
        this.k.forEach(bLl2 -> bLl2.a(set.contains(bLl2.c())));
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "nameFilter": {
                Optional<bzf_2> optional = this.a(bzd_1.a);
                return optional.map(bzf_2::d).orElse(null);
            }
            case "hasFilterOtherThanName": {
                for (bzc_1 bzc_12 : this.j) {
                    if (bzc_12.b() == bzd_1.a) continue;
                    return true;
                }
                return false;
            }
            case "levelFilterType": {
                Optional optional = this.a(bzd_1.b);
                if (optional.isEmpty()) {
                    return 0;
                }
                return ((bze_1)optional.get()).g() ? 1 : 2;
            }
            case "rarities": {
                return this.k;
            }
        }
        return null;
    }

    private <T extends bzc_1> Optional<T> a(bzd_1 bzd_12) {
        for (bzc_1 bzc_12 : this.j) {
            if (bzc_12.b() != bzd_12) continue;
            return Optional.of(bzc_12);
        }
        return Optional.empty();
    }

    @Override
    public String[] d() {
        return f;
    }
}

