/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOP
 */
class cop_2
implements fxr_0 {
    final /* synthetic */ fso a;
    final /* synthetic */ coz_2 b;

    cop_2(coz_2 coz_22, fso fso2) {
        this.b = coz_22;
        this.a = fso2;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.b.aR(this.a);
        runnable.run();
    }
}

