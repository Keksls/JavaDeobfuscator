/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOg
 */
class cog_1
implements fxr_0 {
    final /* synthetic */ fsQ a;
    final /* synthetic */ cof_1 b;

    cog_1(cof_1 cof_12, fsQ fsQ2) {
        this.b = cof_12;
        this.a = fsQ2;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.a.addChildrenAddedListener(new coh_2(this, runnable));
        this.b.e(this.a);
    }
}

