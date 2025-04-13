/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bsY
implements ajh_1 {
    private static final String a = "name";
    private static final String b = "value";
    private static final List<bsY> d = Arrays.stream(ezc_2.values()).map(bsY::new).collect(Collectors.toList());
    private final ezc_2 e;

    private bsY(ezc_2 ezc_22) {
        this.e = ezc_22;
    }

    @Override
    public String[] d() {
        return new String[]{a, b};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            if (this.e == null) {
                return bae.h().a("dungeon.filter.0", new Object[0]);
            }
            return bae.h().a("dungeon.gameplay." + this.e.a(), new Object[0]);
        }
        if (b.equals(string)) {
            return Optional.ofNullable(this.e).map(ezc_2::a).orElse((short)-1);
        }
        return null;
    }

    @NotNull
    static List<bsY> a() {
        return Collections.unmodifiableList(d);
    }

    public ezc_2 b() {
        return this.e;
    }

    static {
        d.add(0, new bsY(null));
    }
}

