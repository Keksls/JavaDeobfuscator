/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Objects;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eOi
 */
public abstract class eoi_2<F extends epq_2, TFight extends We & elv_0<F>, TTimeline extends eof_2<F>> {
    private static final Logger b = Logger.getLogger(eoi_2.class);
    @NotNull
    protected final TFight a;

    protected eoi_2(@NotNull TFight TFight) {
        this.a = TFight;
    }

    @NotNull
    protected vg_0 a(vd_0 vd_02) {
        return new vh_0(vd_02);
    }

    @NotNull
    protected vd_0 a(eoo_2 eoo_22) {
        return new eoj_2((elv_0)this.a, eoo_22);
    }

    @NotNull
    protected eoo_2 c() {
        return new eom_2((emx_1)this.a);
    }

    @NotNull
    protected eoh_1 d() {
        return new eoi_1();
    }

    @NotNull
    public TTimeline e() {
        TTimeline TTimeline = this.b();
        ((va_0)TTimeline).a(Objects.requireNonNullElseGet(((elv_0)this.a).af_().h(), () -> enp_2.a.c(ens_2.aP)));
        ((va_0)TTimeline).b(Objects.requireNonNullElseGet(((elv_0)this.a).af_().i(), () -> enp_2.a.c(ens_2.aR)));
        ((va_0)TTimeline).c(Objects.requireNonNullElseGet(((elv_0)this.a).af_().j(), () -> enp_2.a.c(ens_2.aS)));
        ((va_0)TTimeline).d(enp_2.a.c(ens_2.aQ));
        return TTimeline;
    }

    @NotNull
    protected abstract TTimeline b();
}

