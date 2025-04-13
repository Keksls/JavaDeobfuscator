/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agP
 */
public interface agp_0 {
    public String b();

    public <R extends ajd_1 & ajw_1> R b(agk_0<?, ?> var1);

    public <W extends aje_1 & ajw_1> W c(agk_0<?, ?> var1);

    default public void a(agk_0<?, ?> agk_02, aja_1 aja_12) {
        ((ajw_1)this.b(agk_02)).a(this.b(), aja_12);
    }

    default public void b(agk_0<?, ?> agk_02, aja_1 aja_12) {
        ((ajw_1)this.b(agk_02)).b(this.b(), aja_12);
    }
}

