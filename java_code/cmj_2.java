/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMj
 */
class cmj_2
implements fxr_0 {
    final /* synthetic */ fso a;
    final /* synthetic */ cmg_2 b;

    cmj_2(cmg_2 cmg_22, fso fso2) {
        this.b = cmg_22;
        this.a = fso2;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.a.addChildrenAddedListener(new cmk_1(this, runnable));
        this.b.dA(this.a);
    }
}

