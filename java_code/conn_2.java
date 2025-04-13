/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cONN
 */
class conn_2
implements fxr_0 {
    final /* synthetic */ fut_0 a;
    final /* synthetic */ coz_2 b;

    conn_2(coz_2 coz_22, fut_0 fut_02) {
        this.b = coz_22;
        this.a = fut_02;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.b.b(this.a);
        runnable.run();
    }
}

