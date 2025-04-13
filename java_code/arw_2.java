/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from arw
 */
public class arw_2
implements arf_2 {
    private List<ara_1> a = null;
    private StringBuffer b = null;
    private StringBuffer c = null;
    private boolean d = false;
    private boolean e = false;
    private arh_2 f = null;
    private int g = -1;
    private int h = -1;
    private int i = -1;

    arw_2() {
    }

    void j() {
        if (this.a == null) {
            this.a = new ArrayList<ara_1>();
        }
        this.a.clear();
        this.b = new StringBuffer("");
        this.c = new StringBuffer("");
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = -1;
        this.h = -1;
    }

    @Override
    public List<ara_1> i() {
        return this.a;
    }

    void a(List<ara_1> list) {
        this.a = list;
    }

    void a(ara_1 ara_12) {
        if (this.a == null) {
            this.a = new ArrayList<ara_1>();
        }
        this.a.add(ara_12);
    }

    void a(String string, String string2) {
        if (this.a == null) {
            this.a = new ArrayList<ara_1>();
        }
        this.a.add(new ara_1(string, string2));
    }

    @Override
    public String f() {
        return this.b.toString();
    }

    void a(String string) {
        this.b = new StringBuffer(string);
    }

    void a(char c2) {
        this.b.append(c2);
    }

    @Override
    public boolean h() {
        return this.d;
    }

    void a(boolean bl) {
        this.d = bl;
    }

    @Override
    public boolean g() {
        return this.e;
    }

    void b(boolean bl) {
        this.e = bl;
    }

    @Override
    public int d() {
        return this.h;
    }

    void a(int n) {
        this.h = n;
    }

    @Override
    public arh_2 e() {
        return this.f;
    }

    void a(arh_2 arh_22) {
        this.f = arh_22;
    }

    @Override
    public int c() {
        return this.g;
    }

    void b(int n) {
        this.h = n;
    }

    @Override
    public String a() {
        Object object = "<";
        if (this.d) {
            object = (String)object + "/";
        }
        object = (String)object + this.b;
        if (this.a != null && this.a.size() > 0) {
            for (ara_1 ara_12 : this.a) {
                object = (String)object + " " + ara_12.b() + "=\"" + ara_12.a() + "\"";
            }
        }
        if (this.e) {
            object = (String)object + "/";
        }
        return (String)object + ">";
    }

    void b(String string) {
        this.c = new StringBuffer(string);
    }

    public String toString() {
        Object object = "[TAG]";
        if (this.d) {
            object = (String)object + "/";
        }
        object = (String)object + this.b + "(";
        if (this.a != null) {
            for (ara_1 ara_12 : this.a) {
                object = (String)object + ara_12.b() + ":" + ara_12.a() + " ";
            }
        }
        object = ((String)object).trim();
        object = (String)object + ")";
        return object;
    }

    void c(int n) {
        this.i = n;
    }

    @Override
    public int b() {
        return this.i;
    }
}

