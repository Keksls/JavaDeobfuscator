/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class fwl
extends fwk<String, fwo> {
    private boolean d = false;
    private Map<fwo, String> e = new HashMap<fwo, String>();

    @Override
    public boolean a(fwo fwo2) {
        if (this.b == null || ((String)this.b).isEmpty()) {
            return true;
        }
        if (fwo2 == null) {
            return true;
        }
        return this.b(fwo2).contains(Cz.o((String)this.b));
    }

    private String b(fwo fwo2) {
        if (!this.d) {
            return Cz.o(fwo2.getFilterableStringValue());
        }
        if (this.e.containsKey(fwo2)) {
            return this.e.get(fwo2);
        }
        String string = Cz.o(fwo2.getFilterableStringValue());
        this.e.put(fwo2, string);
        return string;
    }

    @Override
    public void a(boolean bl) {
        this.d = bl;
    }

    @Override
    public void a() {
        this.e.clear();
    }
}

