/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJs
 */
public interface bjs_2 {
    public boolean a(@Nullable bmr_1 var1, @Nullable ezr_0<?> var2);

    default public boolean a(@Nullable bmr_1 bmr_12, @Nullable exk_2 exk_22) {
        return this.a(bmr_12, exk_22 != null ? exk_22.T() : null);
    }
}

