/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eCh
 */
public class ech_0
implements ebv_0 {
    @NotNull
    private final Set<ebv_0> a;

    public ech_0(@NotNull Set<ebv_0> set) {
        this.a = set;
    }

    @Override
    public void a(@NotNull ect_0 ect_02) {
        this.a.forEach(ebv_02 -> ebv_02.a(ect_02));
    }

    @Override
    public void a(int n, long l) {
        this.a.forEach(ebv_02 -> ebv_02.a(n, l));
    }

    @Override
    public void a(int n, int n2) {
        this.a.forEach(ebv_02 -> ebv_02.a(n, n2));
    }

    @Override
    public void a(int n) {
        this.a.forEach(ebv_02 -> ebv_02.a(n));
    }
}

