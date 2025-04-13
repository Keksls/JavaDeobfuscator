/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

class fvG
implements fwq_0 {
    final /* synthetic */ String a;
    final /* synthetic */ fvE b;

    fvG(fvE fvE2, String string) {
        this.b = fvE2;
        this.a = string;
    }

    @Override
    public void a(@Nullable fyb_0 fyb_02, @Nullable fyb_0 fyb_03) {
        if (fyb_03 == null) {
            return;
        }
        this.b.removeParentListener(this);
        this.b.setVisibilityLinked(this.a);
    }
}

