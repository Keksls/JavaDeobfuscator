/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from fKs
 */
public abstract class fks_1<T extends fks_1>
implements fkx_1 {
    public static final int a = 500;
    protected String b;
    protected final String c;
    protected final T d;
    protected final ArrayList<fkt_1> e = new ArrayList();
    protected final ArrayList<T> f = new ArrayList();
    protected final HashMap<String, Object> g = new HashMap();
    protected final HashSet<String> h = new HashSet();
    protected int i = 0;
    private int j;

    public fks_1(String string, String string2, T t, boolean bl) {
        this.b = string;
        this.c = string2;
        this.d = t;
    }

    void a(fkt_1 fkt_12) {
        this.e.add(fkt_12);
    }

    void a(T t) {
        this.f.add(t);
    }

    String a(Object object) {
        Object object2 = "var";
        if (object != null) {
            object2 = (String)object2 + object.getClass().getSimpleName();
        }
        String string = object2;
        do {
            object2 = string + this.i;
            ++this.i;
        } while (this.g.containsKey(object2));
        this.g.put((String)object2, object);
        return object2;
    }

    public String a() {
        return this.b;
    }

    public T b() {
        return this.d;
    }

    public Object a(String string) {
        return this.g.get(string);
    }

    @Override
    public String c() {
        String string = null;
        do {
            string = "var" + this.i;
            ++this.i;
        } while (this.g.containsKey(string));
        this.g.put(string, null);
        return string;
    }

    public boolean d() {
        return this.e.size() >= 500;
    }

    public void a(String string, Object object) {
        this.g.put(string, object);
    }

    @Override
    public boolean b(String string) {
        return this.h.contains(string);
    }

    @Override
    public void c(String string) {
        this.h.add(string);
    }

    public ArrayList<fkt_1> e() {
        return this.e;
    }

    public ArrayList<T> f() {
        return this.f;
    }

    public String g() {
        return this.c;
    }

    public void h() {
        this.j = this.e.size();
    }

    public void i() {
        this.j = -1;
    }

    public void j() {
        if (this.j == -1) {
            return;
        }
        for (int k = this.e.size() - 1; k >= this.j; --k) {
            this.e.remove(k);
        }
    }

    public abstract void a(PrintWriter var1);
}

