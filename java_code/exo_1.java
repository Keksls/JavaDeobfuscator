/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eXO
 */
public final class exo_1 {
    private abg_1 b;
    @Nullable
    private exp_2 c;
    @Nullable
    private exv_2 d;

    public void a(abg_1 abg_12, @Nullable exp_2 exp_22, @Nullable exv_2 exv_22) {
        assert (this.b == null) : "ItemComposer already initialized. Can't be initialized twice.";
        this.b = abg_12;
        this.c = exp_22;
        this.d = exv_22;
    }

    public abg_1 a() {
        return this.b;
    }

    @Nullable
    public exp_2 b() {
        return this.c;
    }

    @Nullable
    public exv_2 c() {
        return this.d;
    }

    public String toString() {
        return "ItemComposer{, m_uidGenerator=" + this.b + ", m_fieldProvider=" + this.c + ", m_quantityChangeListener=" + this.d + "}";
    }
}

