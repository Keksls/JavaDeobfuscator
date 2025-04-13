/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bsX
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "value";
    private final bsV d;

    public bsX(bsV bsV2) {
        this.d = bsV2;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d.b();
        }
        if (string.equals(b)) {
            return this.d;
        }
        return null;
    }

    public bsV a() {
        return this.d;
    }
}

