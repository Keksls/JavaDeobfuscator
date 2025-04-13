/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bOj
 */
public class boj_0
implements ajh_1 {
    public static final String a = "name";
    private final bog_0 b;

    protected boj_0(bog_0 bog_02) {
        this.b = bog_02;
    }

    protected boj_0() {
        this.b = null;
    }

    @Override
    public String[] d() {
        return b_;
    }

    public bog_0 a() {
        return this.b;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a("rewards.type.filter.name." + (Serializable)(this.b == null ? "all" : Integer.valueOf(this.b.a())), new Object[0]);
        }
        return null;
    }
}

