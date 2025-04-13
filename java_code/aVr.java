/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class aVr
implements ajh_1,
aVp {
    public static final String a = "prompt";
    public static final String b = "logs";
    public static final String[] d = new String[]{"prompt", "logs"};
    private static final aVr e = new aVr();
    private String f = "";
    private final List<String> g = new ArrayList<String>();

    public static aVr a() {
        return e;
    }

    private aVr() {
    }

    @Override
    public void f(String string) {
        this.f = string;
        fis_1.a().a((ajf_1)this, a);
    }

    @Override
    public void e(String string) {
        this.a(string, azf_2.h);
    }

    @Override
    public void a(String string) {
        this.a(string, azf_2.j);
    }

    @Override
    public void c(String string) {
        this.g(string);
    }

    @Override
    public void a(String string, int n) {
        this.a(string, new azf_2((n & 0xFF) << 16 | n & 0xFF00 | (n & 0xFF0000) >> 16));
    }

    @Override
    public void d(String string) {
        this.g(string + "\n");
    }

    private void a(String string, azf_2 azf_22) {
        this.g(new ani_2().a(azf_22.w()).a((CharSequence)string).r());
    }

    private void g(String string) {
        this.g.add((String)(string.endsWith("\n") ? string : string + "\n"));
        fis_1.a().a((ajf_1)this, b);
    }

    public void b() {
        this.g.clear();
        fis_1.a().a((ajf_1)this, b);
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "prompt": {
                return this.f;
            }
            case "logs": {
                return String.join((CharSequence)"\n", this.g);
            }
        }
        return null;
    }

    @Override
    public String[] d() {
        return d;
    }
}

