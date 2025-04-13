/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

class fvH
implements fxr_0 {
    final /* synthetic */ fqt_0 a;
    final /* synthetic */ fvE b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ fvE d;

    fvH(fvE fvE2, fqt_0 fqt_02, fvE fvE3, Runnable runnable) {
        this.d = fvE2;
        this.a = fqt_02;
        this.b = fvE3;
        this.c = runnable;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.d.removeVisibilityChangePreExecutor();
        if (this.a.f) {
            this.d.addChildrenAddedListener(new fvi_0(this, runnable));
            this.c.run();
        } else {
            this.c.run();
            runnable.run();
        }
    }
}

