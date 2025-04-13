/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public abstract class aVl {
    public static final int a = 100;
    private final List<String> b = new ArrayList<String>();
    private int c = 0;
    private String d = "";

    aVl() {
    }

    public String a() {
        if (this.b.isEmpty()) {
            return "";
        }
        if (this.c > 0) {
            --this.c;
        }
        return this.b.get(this.c);
    }

    public String b() {
        if (this.c <= this.b.size() - 1) {
            ++this.c;
        }
        return this.c <= this.b.size() - 1 ? this.b.get(this.c) : this.d;
    }

    public boolean c() {
        return this.c <= this.b.size() - 1;
    }

    public void a(String string) {
        this.d = string;
    }

    protected void b(String string) {
        if (this.b.size() >= 100) {
            this.b.remove(0);
        }
        this.b.add(string);
        this.c = this.b.size();
        this.d = "";
    }
}

