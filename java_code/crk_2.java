/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cRk
 */
class crk_2
implements fxr_0 {
    final /* synthetic */ fsQ a;
    final /* synthetic */ crg_2 b;

    crk_2(crg_2 crg_22, fsQ fsQ2) {
        this.b = crg_22;
        this.a = fsQ2;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.a.addChildrenAddedListener(new crl_1(this, runnable));
        this.b.h(this.a);
    }
}

