/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fex
 */
public class fex_0
extends fdg {
    private final emr_2 b;
    private final epq_2 c;
    private final epq_2 d;
    @Nullable
    private final fgp_0 e;
    private final Collection<? extends epq_2> f;

    public fex_0(faU faU2, emr_2 emr_22, epq_2 epq_22, epq_2 epq_23, @Nullable fgp_0 fgp_02, Collection<? extends epq_2> collection) {
        super(faU2);
        this.b = emr_22;
        this.c = epq_22;
        this.d = epq_23;
        this.e = fgp_02;
        this.f = collection;
    }

    @Nullable
    public fgp_0 e() {
        return this.e;
    }

    public emr_2 f() {
        return this.b;
    }

    public epq_2 g() {
        return this.c;
    }

    public epq_2 h() {
        return this.d;
    }

    public Collection<? extends epq_2> i() {
        return this.f;
    }

    @Override
    public fdh_0 d() {
        return fdh_0.f;
    }
}

