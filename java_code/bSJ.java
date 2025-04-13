/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;

public class bSJ
implements ajh_1 {
    public static final String a = "rent.type";
    public static final String b = "rent.duration";
    public static final String d = "server.id";
    public static final String e = "STATUS";
    public static final String f = "WKCHARACTERS";
    public static final String g = "WKVAULTUP";
    public static final String h = "TYPE";
    private bjw_1 i;
    private final int j;
    private final long k;
    private HashMap<String, String> l = null;
    private final bsx_0 m;

    public bSJ(int n, long l, bsx_0 bsx_02) {
        this.j = n;
        this.k = l;
        if (n > -1) {
            this.i = (bjw_1)eyo_1.g().d(n);
        }
        this.m = bsx_02;
    }

    public bSJ(bsx_0 bsx_02) {
        this(-1, 0L, bsx_02);
    }

    public void a(String string, String string2) {
        if (this.l == null) {
            this.l = new HashMap();
        }
        this.l.put(string, string2);
    }

    public int a(String string) {
        if (this.l == null) {
            return 0;
        }
        return Co.c(this.l.get(string));
    }

    @Nullable
    public String c(String string) {
        if (this.l == null) {
            return null;
        }
        return this.l.get(string);
    }

    public int a() {
        return this.j;
    }

    public bjw_1 b() {
        return this.i;
    }

    public long c() {
        return this.k;
    }

    public bsx_0 e() {
        return this.m;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (this.i != null) {
            return this.i.b(string);
        }
        return null;
    }

    public boolean f() {
        return this.l != null && this.l.get(a) != null;
    }

    public boolean g() {
        if (this.l == null) {
            return true;
        }
        String string = this.l.get(d);
        if (string == null || string.isEmpty()) {
            return true;
        }
        int n = azu_0.j().F();
        return Integer.parseInt(string) == n;
    }
}

