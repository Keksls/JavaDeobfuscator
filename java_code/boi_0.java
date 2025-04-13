/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bOi
 */
public class boi_0
implements ajh_1 {
    public static final String a = "name";
    private final bof_0 b;

    protected boi_0(bof_0 bof_02) {
        this.b = bof_02;
    }

    protected boi_0() {
        this.b = null;
    }

    @Override
    public String[] d() {
        return b_;
    }

    public bof_0 a() {
        return this.b;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a("rewards.category.filter.name." + (Serializable)(this.b == null ? "all" : Integer.valueOf(this.b.a())), new Object[0]);
        }
        return null;
    }
}

