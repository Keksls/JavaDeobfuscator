/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agT
 */
public interface agt_0
extends agp_0 {
    public ajb_1 a(agk_0<?, ?> var1);

    @Override
    default public <R extends ajd_1 & ajw_1> R b(agk_0<?, ?> agk_02) {
        return (R)this.a(agk_02);
    }

    @Override
    default public <W extends aje_1 & ajw_1> W c(agk_0<?, ?> agk_02) {
        return (W)this.a(agk_02);
    }
}

