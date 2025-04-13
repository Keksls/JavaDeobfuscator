/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bog
 */
public class bog_1
extends bof_1 {
    public static final String e = "character";
    public static final String[] f = new String[]{"character"};
    public static final String[] g = new String[bof_1.d.length + f.length];
    private final blx_1 h;

    protected bog_1(blx_1 blx_12) {
        super(boh_1.a);
        this.h = blx_12;
        if (this.h != null) {
            this.h.bv().a(aej_2.d);
        }
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(e)) {
            return this.h;
        }
        return super.b(string);
    }

    public blx_1 c() {
        return this.h;
    }

    @Override
    public Optional<blx_1> b() {
        return Optional.ofNullable(this.h);
    }

    static {
        System.arraycopy(f, 0, g, 0, f.length);
        System.arraycopy(bof_1.d, 0, g, f.length, bof_1.d.length);
    }
}

