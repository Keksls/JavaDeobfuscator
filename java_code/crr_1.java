/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cRR
 */
class crr_1
implements fxr_0 {
    final /* synthetic */ fsQ a;
    final /* synthetic */ crg_2 b;

    crr_1(crg_2 crg_22, fsQ fsQ2) {
        this.b = crg_22;
        this.a = fsQ2;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.a.addChildrenAddedListener(new crs_2(this, runnable));
        this.b.g(this.a);
    }
}

