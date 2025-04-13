/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fzV
 */
public class fzv_0 {
    private final String a;
    private final ArrayList<fvE> b = new ArrayList();
    private boolean c = true;

    public fzv_0(String string) {
        this.a = string;
    }

    public boolean a() {
        return this.c;
    }

    public void a(boolean bl) {
        if (this.c == bl) {
            return;
        }
        this.c = bl;
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            fvE fvE2 = this.b.get(k);
            fvE2.setNetEnabled(bl);
        }
    }

    public void a(fvE fvE2) {
        this.b.add(fvE2);
        fvE2.setNetEnabled(this.c);
    }

    public void b(fvE fvE2) {
        this.b.remove(fvE2);
    }
}

