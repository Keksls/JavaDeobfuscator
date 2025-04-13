/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class aZE
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "shortcuts";
    public static final String d = "listFilter";
    private final String[] e = new String[]{"name", "shortcuts", "listFilter"};
    private ArrayList<aZF> f = new ArrayList();
    private final String g;
    private final fwl h = new fwl();

    public aZE(String string) {
        this.g = string;
    }

    public void a(ArrayList<aZF> arrayList) {
        this.f = arrayList;
    }

    public String a() {
        return this.g;
    }

    public void a(String string) {
        this.h.b(string);
    }

    @Override
    public String[] d() {
        return this.e;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "name": {
                return bae.h().a(this.g, new Object[0]);
            }
            case "shortcuts": {
                return this.f;
            }
            case "listFilter": {
                return this.h;
            }
        }
        return null;
    }
}

