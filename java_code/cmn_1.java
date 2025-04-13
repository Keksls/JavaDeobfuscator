/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMn
 */
class cmn_1
implements fxr_0 {
    final /* synthetic */ fso a;
    final /* synthetic */ cmg_2 b;

    cmn_1(cmg_2 cmg_22, fso fso2) {
        this.b = cmg_22;
        this.a = fso2;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.a.addChildrenAddedListener(new cmo_2(this, runnable));
        this.b.cL(this.a);
    }
}

