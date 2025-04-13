/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNq
 */
public class bnq_0
implements ajh_1 {
    public static final String a = "name";
    private final epn_2 b;

    protected bnq_0(epn_2 epn_22) {
        this.b = epn_22;
    }

    @Override
    public String[] d() {
        return b_;
    }

    public epn_2 a() {
        return this.b;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return epo_2.a(this.b) ? bae.h().a("breed." + this.b.s(), new Object[0]) : bae.h().a("allBreeds", new Object[0]);
        }
        return null;
    }
}

