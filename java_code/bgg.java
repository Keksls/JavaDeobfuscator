/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bgg {
    public static final bgg a = new bgg();
    private static final Logger b = Logger.getLogger(bgg.class);
    @Nullable
    private ecd_0 c = null;
    @Nullable
    private brx_0 d = null;
    @NotNull
    private final Map<Long, ece_0> e = new HashMap<Long, ece_0>();
    @NotNull
    private final Map<Long, brx_0> f = new HashMap<Long, brx_0>();

    protected bgg() {
    }

    @NotNull
    public Optional<ece_0> a(long l) {
        if (azu_0.j().n().u() == l) {
            if (this.c != null) {
                return Optional.of(this.c);
            }
            Optional optional = bhh_1.a(end_0.n);
            if (optional.isEmpty()) {
                b.error((Object)String.format("[CRAFT] CraftAccountData of current account %s can't be retrieved", l));
                return Optional.empty();
            }
            ebr_0 ebr_02 = (ebr_0)optional.get();
            ece_0 ece_02 = ebr_02.a();
            this.c = new ecd_0(ece_02);
            this.c.a(brv_1.a);
            this.d = new brx_0(l, this.c);
            fis_1.a().a((ajf_1)azu_0.j().k(), "craft");
            return Optional.of(this.c);
        }
        return Optional.ofNullable(this.e.getOrDefault(l, null));
    }

    public void a() {
        long l = azu_0.j().n().u();
        if (this.d == null) {
            return;
        }
        Optional optional = bhh_1.a(end_0.n);
        if (optional.isEmpty()) {
            b.error((Object)String.format("[CRAFT] CraftAccountData of current account %s can't be retrieved", l));
            return;
        }
        ebr_0 ebr_02 = (ebr_0)optional.get();
        ece_0 ece_02 = ebr_02.a();
        this.c.a(ece_02);
        this.d.a();
    }

    @NotNull
    public Optional<brx_0> b(long l) {
        if (azu_0.j().n().u() == l) {
            if (this.d == null && this.a(l).isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(this.d);
        }
        return Optional.ofNullable(this.f.getOrDefault(l, null));
    }

    @NotNull
    public ece_0 c(long l) {
        return this.a(l).orElse(ecc_0.a);
    }

    @NotNull
    public brx_0 d(long l) {
        return this.b(l).orElse(new brx_0(0L, ecc_0.a));
    }

    @NotNull
    public ece_0 b() {
        return this.c(azu_0.j().n().u());
    }

    public void a(long l, @NotNull ece_0 ece_02) {
        if (azu_0.j().n().u() == l) {
            return;
        }
        this.e.put(l, ece_02);
        this.f.put(l, new brx_0(l, ece_02));
    }

    public void e(long l) {
        if (azu_0.j().n().u() == l) {
            return;
        }
        this.e.remove(l);
        this.f.remove(l);
    }

    public void c() {
        if (this.c != null) {
            this.c.b(brv_1.a);
            this.c = null;
        }
        if (this.d != null) {
            this.d.k();
            this.d = null;
        }
    }
}

