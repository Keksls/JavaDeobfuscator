/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cdX
 */
public class cdx_1
implements ajh_1 {
    private static final String e = "cinematicsAvailables";
    private static final String f = "debugMode";
    private static final String g = "withLoadingFrame";
    public static final String[] a = new String[]{"cinematicsAvailables", "debugMode", "withLoadingFrame"};
    protected boolean b;
    protected boolean d;

    @Override
    public String[] d() {
        return a;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "cinematicsAvailables": {
                return this.a();
            }
            case "debugMode": {
                return this.b;
            }
            case "withLoadingFrame": {
                return this.d;
            }
        }
        return null;
    }

    public void a(boolean bl) {
        if (this.b == bl) {
            return;
        }
        this.b = bl;
        fis_1.a().a((ajf_1)this, f);
    }

    public void b(boolean bl) {
        if (this.d == bl) {
            return;
        }
        this.d = bl;
        fis_1.a().a((ajf_1)this, g);
    }

    public List<String> a() {
        return aVk.a.a().stream().sorted(CharSequence::compare).collect(Collectors.toList());
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.d;
    }
}

