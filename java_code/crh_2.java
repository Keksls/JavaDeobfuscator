/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cRh
 */
class crh_2
implements fxr_0 {
    final /* synthetic */ fso a;
    final /* synthetic */ crg_2 b;

    crh_2(crg_2 crg_22, fso fso2) {
        this.b = crg_22;
        this.a = fso2;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.a.addChildrenAddedListener(new cri_2(this, runnable));
        this.b.a(this.a);
    }
}

