/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

/*
 * Renamed from fhd
 */
public final class fhd_0 {
    public static final fhd_0 a = new fhd_0();
    private final HashMap<Integer, fhc_0> b = new HashMap();

    private fhd_0() {
    }

    public void a(fhc_0 fhc_02) {
        this.b.put(fhc_02.a(), fhc_02);
    }

    public Optional<fhc_0> a(int n) {
        return Optional.ofNullable(this.b.get(n));
    }

    public Collection<fhc_0> a() {
        return this.b.values();
    }
}

