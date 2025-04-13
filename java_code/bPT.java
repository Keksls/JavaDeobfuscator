/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bPT
implements ajh_1 {
    private boolean f = false;
    private final int g;
    private final int h;
    @NotNull
    private final bpe_0 i;
    public static final String a = "state";
    public static final String b = "stateDescription";
    public static final String d = "selected";
    public static final String e = "weight";

    public bPT(int n, int n2, @NotNull bpe_0 bpe_02) {
        this.g = n;
        this.h = n2;
        this.i = bpe_02;
    }

    @Override
    public String[] d() {
        return new String[]{d, a, e};
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "selected": {
                return this.f;
            }
            case "state": {
                return this.i;
            }
            case "weight": {
                return this.h;
            }
            case "stateDescription": {
                String string2 = this.i.f();
                if (!Strings.isNullOrEmpty((String)string2)) {
                    return string2;
                }
                List<String> list = this.i.a(eDk.a);
                if (list == null) {
                    return null;
                }
                return String.join((CharSequence)System.lineSeparator(), list);
            }
        }
        return null;
    }

    public boolean a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public void a(boolean bl) {
        if (bl == this.f) {
            return;
        }
        this.f = bl;
        fis_1.a().a((ajf_1)this, d);
    }

    public bpe_0 e() {
        return this.i;
    }
}

