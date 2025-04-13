/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMp
 */
class cmp_2
implements fxr_0 {
    final /* synthetic */ fso a;
    final /* synthetic */ cmg_2 b;

    cmp_2(cmg_2 cmg_22, fso fso2) {
        this.b = cmg_22;
        this.a = fso2;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.a.addChildrenAddedListener(new cmq_2(this, runnable));
        this.b.dj(this.a);
    }
}

