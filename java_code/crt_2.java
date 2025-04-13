/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cRt
 */
class crt_2
implements fxr_0 {
    final /* synthetic */ fso a;
    final /* synthetic */ crg_2 b;

    crt_2(crg_2 crg_22, fso fso2) {
        this.b = crg_22;
        this.a = fso2;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.a.addChildrenAddedListener(new cru_2(this, runnable));
        this.b.b(this.a);
    }
}

