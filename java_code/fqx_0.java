/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fqX
 */
final class fqx_0
extends fqv_0 {
    @Override
    @Nullable
    public <T> T a(ArrayList<T> arrayList, int n) {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        n = (n % arrayList.size() + arrayList.size()) % arrayList.size();
        return arrayList.get(n);
    }

    @Override
    public <T> float a(float f2, ArrayList<T> arrayList, boolean bl, float f3, float f4, int n) {
        return f2;
    }
}

