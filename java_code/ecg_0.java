/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eCg
 */
public class ecg_0 {
    private static final ecg_0 a = new ecg_0();
    private final Set<eco_0> b = new HashSet<eco_0>();

    public static ecg_0 a() {
        return a;
    }

    public void a(eco_0 eco_02) {
        this.b.add(eco_02);
    }

    public boolean a(int n) {
        return this.b.stream().anyMatch(eco_02 -> eco_02.e() == n);
    }

    public boolean b(@NotNull eco_0 eco_02) {
        return this.a(eco_02.e());
    }

    @NotNull
    public @Unmodifiable Set<Integer> b() {
        return this.b.stream().map(eco_0::e).collect(Collectors.toUnmodifiableSet());
    }

    @NotNull
    public @Unmodifiable Set<eco_0> c() {
        return Collections.unmodifiableSet(this.b);
    }
}

