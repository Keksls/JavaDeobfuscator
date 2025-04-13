/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

public class bLl
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "selected";
    private final exw_1 d;
    private boolean e;

    public static List<bLl> a() {
        return Arrays.stream(exw_1.values()).filter(exw_12 -> exw_12 != exw_1.i).sorted(Comparator.comparing(exw_1::b)).map(bLl::new).collect(Collectors.toList());
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.b();
            }
            case "selected": {
                return this.e;
            }
        }
        return null;
    }

    public String b() {
        return bae.h().a("item.rarity." + this.d.name(), new Object[0]);
    }

    @Override
    public String[] d() {
        return new String[]{a, b};
    }

    public exw_1 c() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public bLl(exw_1 exw_12) {
        this.d = exw_12;
    }
}

