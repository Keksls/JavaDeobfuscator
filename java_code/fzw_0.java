/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fzW
 */
public class fzw_0 {
    public static final fzw_0 a = new fzw_0();
    private final HashMap<String, fzv_0> b = new HashMap();

    private fzw_0() {
    }

    public boolean a(String string) {
        return this.b.containsKey(string);
    }

    public void b(String string) {
        this.b.put(string, new fzv_0(string));
    }

    public void c(String string) {
        this.b.remove(string);
    }

    public void a(String string, fvE fvE2) {
        fzv_0 fzv_02 = this.b.get(string);
        if (fzv_02 != null) {
            fzv_02.a(fvE2);
        }
    }

    public void b(String string, fvE fvE2) {
        fzv_0 fzv_02 = this.b.get(string);
        if (fzv_02 != null) {
            fzv_02.b(fvE2);
        }
    }

    public void a(String string, boolean bl) {
        fzv_0 fzv_02 = this.b.get(string);
        if (fzv_02 != null) {
            fzv_02.a(bl);
        }
    }

    public boolean d(String string) {
        fzv_0 fzv_02 = this.b.get(string);
        return fzv_02 != null && fzv_02.a();
    }
}

