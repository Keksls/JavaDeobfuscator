/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/*
 * Renamed from ayB
 */
class ayb_1 {
    private static final Pattern b = Pattern.compile(",");
    public static final String a = "default";
    private final ArrayList<Ow> c = new ArrayList();
    private String d;
    private int e;
    private int f;
    private int g;

    ayb_1() {
    }

    void a(String string) {
        this.d = string;
    }

    void a(int n) {
        this.e = n;
    }

    void b(int n) {
        this.f = n;
    }

    void c(int n) {
        this.g = n;
    }

    void a(CharSequence charSequence) {
        ArrayList<Ow> arrayList = new ArrayList<Ow>();
        if (charSequence != null) {
            for (String string : b.split(charSequence)) {
                Ow ow = Ow.a(string, true);
                if (ow == null) continue;
                arrayList.add(ow);
            }
        }
        if (arrayList.isEmpty()) {
            this.e();
        } else {
            this.c.clear();
            this.c.addAll(arrayList);
        }
    }

    private void e() {
        this.c.clear();
        this.c.addAll(Arrays.asList(Ow.values()));
    }

    boolean a(Ow ow) {
        return this.c.contains((Object)ow);
    }

    String a() {
        return this.d;
    }

    int b() {
        return this.e;
    }

    int c() {
        return this.f;
    }

    int d() {
        return this.g;
    }
}

