/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bVT
 */
public enum bvt_0 implements ajh_1
{
    a(0, "options.desc.relic.aura.all"),
    b(1, "options.desc.relic.aura.mine"),
    d(2, "options.desc.relic.aura.none");

    public static final String e = "id";
    public static final String f = "description";
    private final int g;
    private final String h;

    private bvt_0(int n2, String string2) {
        this.g = n2;
        this.h = string2;
    }

    public int a() {
        return this.g;
    }

    public String b() {
        return this.h;
    }

    @Override
    public String[] d() {
        return new String[]{e, f};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (f.equals(string)) {
            return bae.h().a(this.h, new Object[0]);
        }
        if (e.equals(string)) {
            return this.g;
        }
        return null;
    }

    public static Optional<bvt_0> a(int n) {
        for (bvt_0 bvt_02 : bvt_0.values()) {
            if (n != bvt_02.g) continue;
            return Optional.of(bvt_02);
        }
        return Optional.empty();
    }
}

