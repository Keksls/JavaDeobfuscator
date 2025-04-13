/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bwM
 */
class bwm_1
extends bwr_0 {
    private static final Logger f = Logger.getLogger(bwm_1.class);
    private boolean g = true;

    bwm_1(@NotNull bwh_0 bwh_02, @NotNull bmr_1 bmr_12) {
        super(bwh_02, bmr_12);
    }

    bwm_1 a() {
        this.g = false;
        return this;
    }

    @Override
    ema_1 b() {
        return this.f();
    }
}

