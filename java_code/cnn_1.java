/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cNN
 */
class cnn_1
implements fxr_0 {
    final /* synthetic */ fso a;
    final /* synthetic */ cnm_2 b;

    cnn_1(cnm_2 cnm_22, fso fso2) {
        this.b = cnm_22;
        this.a = fso2;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityChangePreExecutor();
        this.a.addChildrenAddedListener(new cno_2(this, runnable));
        this.b.t(this.a);
    }
}

