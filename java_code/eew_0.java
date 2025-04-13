/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eEW
 */
public abstract class eew_0
extends Si<efh_0> {
    @Nullable
    public final efh_0 d(int n) {
        if (eFF.a().a(n)) {
            return eFF.a().b(n);
        }
        efh_0 efh_02 = (efh_0)super.a(n);
        if (efh_02 == null && (efh_02 = this.b(n)) != null) {
            this.a(efh_02);
        }
        return efh_02;
    }

    @Nullable
    protected abstract efh_0 b(int var1);

    @Override
    @Nullable
    public /* synthetic */ Sl a(int n) {
        return this.d(n);
    }
}

