/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aCX
 */
public abstract class acx_1<S, T> {
    public abstract void a(S var1, List<T> var2, Object ... var3);

    @Nullable
    public byte[] b(S s2, List<T> list, Object ... objectArray) {
        return null;
    }

    public String a(Object ... objectArray) {
        return "{" + this.getClass().getSimpleName() + "}";
    }
}

