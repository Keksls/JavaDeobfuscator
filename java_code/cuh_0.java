/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cUH
 */
@FunctionalInterface
public interface cuh_0 {
    public Optional<cSS> getValidAction(cUM var1);

    default public boolean a(cUM cUM2) {
        return this.getValidAction(cUM2).isPresent();
    }
}

