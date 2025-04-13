/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aHC
 */
public abstract class ahc_1
extends ahd_1 {
    private final HashMap<Integer, Object> e = new HashMap();

    protected ahc_1() {
    }

    public final void a(int n, Object object) {
        if (object != null) {
            this.e.put(n, object);
        }
    }

    public final Object b(int n) {
        if (this.e.containsKey(n)) {
            return this.e.get(n);
        }
        return null;
    }

    @Override
    protected final String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.e.size();
        for (int k = 0; k < n; ++k) {
            Object object = this.e.get(k);
            if (object == null) continue;
            if (k > 0) {
                stringBuilder.append(string);
            }
            stringBuilder.append(object.toString());
        }
        return stringBuilder.toString();
    }
}

