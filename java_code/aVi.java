/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class aVi {
    private final HashMap<String, aVg> a = new HashMap();

    public HashMap<String, aVg> a() {
        return this.a;
    }

    public void a(aVg aVg2) {
        this.a.put(aVg2.g(), aVg2);
    }

    public void a(Iterable<aVg> iterable) {
        for (aVg aVg2 : iterable) {
            this.a(aVg2);
        }
    }

    public boolean b(aVg aVg2) {
        return this.a.remove(aVg2.g()) != null;
    }

    public boolean a(String string) {
        if (this.a.containsKey(string)) {
            this.a.remove(string);
            return true;
        }
        return false;
    }

    public aVg b(String string) {
        return this.a.get(string);
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        for (aVg aVg2 : this.a().values()) {
            stringBuilder.append(" +").append(aVg2.g()).append(" (");
            if (aVg2.h()) {
                stringBuilder.append("onLine");
            } else {
                stringBuilder.append("offLine");
            }
            stringBuilder.append(")\n");
        }
        return stringBuilder.toString();
    }

    public boolean c(String string) {
        return this.a.containsKey(string);
    }
}

