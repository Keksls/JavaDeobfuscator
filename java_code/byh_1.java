/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from byH
 */
public class byh_1
implements ajh_1 {
    public static final String a = "label";
    public static final String b = "id";
    public static final String[] d = new String[]{"label", "id"};
    private final byg_1 e;

    public byh_1(byg_1 byg_12) {
        this.e = byg_12;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return bae.h().a("guild.emblem.category." + this.e.a(), new Object[0]);
        }
        if (b.equals(string)) {
            return this.e.a();
        }
        return null;
    }

    public byg_1 a() {
        return this.e;
    }

    public ImmutableSet<Integer> b() {
        return this.e.b();
    }

    @Override
    public String[] d() {
        return d;
    }
}

