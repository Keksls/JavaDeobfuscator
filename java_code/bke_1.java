/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKe
 */
public class bke_1
implements ajh_1 {
    private static final String a = "ambienceZoneName";
    private static final String b = "dayMusics";
    private static final String d = "nightMusics";
    private static final String e = "fightMusics";
    private static final String f = "bossMusics";
    private final afp g;
    private final String h;

    bke_1(afp afp2) {
        this.g = afp2;
        this.h = bae.h().a(54, (long)afp2.j(), new Object[0]);
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d, e, f};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.h;
        }
        if (string.equals(b)) {
            return this.a(this.g.b());
        }
        if (string.equals(d)) {
            return this.a(this.g.c());
        }
        if (string.equals(e)) {
            return this.a(this.g.d());
        }
        if (string.equals(f)) {
            return this.a(this.g.e());
        }
        return null;
    }

    private List<Long> a(List<amb_1> list) {
        return list == null ? null : list.stream().map(amb_1::a).collect(Collectors.toList());
    }

    Optional<amb_1> a(Long l) {
        if (l == null) {
            return Optional.empty();
        }
        return this.g.a(l);
    }

    afp a() {
        return this.g;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bke_1 bke_12 = (bke_1)object;
        return this.g.h() == bke_12.g.h();
    }
}

