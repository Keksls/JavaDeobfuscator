/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bof
 */
public abstract class bof_1
implements ajh_1 {
    public static final String a = "type";
    public static final String b = "hovered";
    public static final String[] d = new String[]{"type", "hovered"};
    private final boh_1 e;
    private int f;
    private boolean g;

    protected bof_1(boh_1 boh_12) {
        this.e = boh_12;
    }

    @Override
    public String[] d() {
        return d;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e.a();
        }
        if (string.equals(b)) {
            return this.g;
        }
        return null;
    }

    public int a() {
        return this.f;
    }

    public void a(int n) {
        this.f = n;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public Optional<blx_1> b() {
        return Optional.empty();
    }
}

