/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aJI
 */
public class aji_1
implements ajh_1 {
    private final String a;
    private final Object b;

    public aji_1(String string, Object object) {
        this.a = string;
        this.b = object;
    }

    @Override
    public String[] d() {
        return new String[]{this.a};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(this.a)) {
            return this.b;
        }
        return null;
    }
}

