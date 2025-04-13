/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bgI
 */
class bgi_0
implements asy_2<ate_0> {
    final /* synthetic */ bgh_0 a;

    bgi_0(bgh_0 bgh_02) {
        this.a = bgh_02;
    }

    @Nullable
    public ate_0 b(int n) {
        try {
            ate_0 ate_02 = new ate_0();
            if (asw_2.a().a(n, ate_02)) {
                return ate_02;
            }
        }
        catch (Exception exception) {
            bgh_0.a.error((Object)("erreur lors du chargement de l'effet " + n), (Throwable)exception);
        }
        return null;
    }

    @Override
    @Nullable
    public /* synthetic */ asu_2 a(int n) {
        return this.b(n);
    }
}

