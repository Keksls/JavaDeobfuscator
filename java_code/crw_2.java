/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cRw
 */
class crw_2
implements fxr_0 {
    final /* synthetic */ fue_0 a;
    final /* synthetic */ crg_2 b;

    crw_2(crg_2 crg_22, fue_0 fue_02) {
        this.b = crg_22;
        this.a = fue_02;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.a.addChildrenAddedListener(new crx_2(this, runnable));
        this.b.a(this.a);
    }
}

