/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fzN
 */
public class fzn_0 {
    private static String a;
    private int b;
    private int c;
    private String d;
    private String e;
    private String f;
    private long g;
    private fzu_0 h;
    private int i;
    private ArrayList<String> j;
    private int[] k;
    private final ArrayList<fzo_0> l = new ArrayList();

    public static void a(String string) {
        a = string;
    }

    public fzn_0(int n, int n2, String string) {
        this(n, n2, string, 2L);
    }

    public fzn_0(int n, int n2, String string, long l) {
        this(n, n2, string, " ", null, l);
    }

    public fzn_0(int n, int n2, String string, String string2, @Nullable String string3, long l) {
        this(n, n2, string, string2, string3, l, null, 0);
    }

    public fzn_0(int n, int n2, String string, String string2, String string3, long l, @Nullable List<String> list, int n3) {
        this.b = n;
        this.c = n2;
        this.d = string;
        this.e = string2;
        this.g = l;
        this.f = string3 != null ? string3 : a;
        this.j = list != null ? new ArrayList<String>(list) : new ArrayList();
        this.i = n3;
        this.k = (int[])fzt_0.j.clone();
    }

    public boolean a(fzo_0 fzo_02) {
        return !this.l.contains(fzo_02) && this.l.add(fzo_02);
    }

    public int a() {
        return this.b;
    }

    public fzn_0 a(int n) {
        this.b = n;
        return this;
    }

    public int b() {
        return this.c;
    }

    public fzn_0 b(int n) {
        this.c = n;
        return this;
    }

    public fzu_0 c() {
        return this.h;
    }

    public void a(fzu_0 fzu_02) {
        this.h = fzu_02;
    }

    public String d() {
        return this.d;
    }

    public fzn_0 b(String string) {
        this.d = string;
        for (fzo_0 fzo_02 : this.l) {
            fzo_02.a();
        }
        return this;
    }

    public long e() {
        return this.g;
    }

    public fzn_0 c(int n) {
        this.g = n;
        return this;
    }

    public ArrayList<String> f() {
        return this.j;
    }

    public fzn_0 a(ArrayList<String> arrayList) {
        this.j = arrayList;
        return this;
    }

    public String g() {
        return this.e;
    }

    public fzn_0 c(String string) {
        this.e = string;
        return this;
    }

    public fzn_0 d(String string) {
        this.f = string != null ? string : a;
        return this;
    }

    public String h() {
        return this.f;
    }

    public int i() {
        return this.i;
    }

    public fzn_0 d(int n) {
        this.i = n;
        return this;
    }

    public void a(int ... nArray) {
        this.k = (int[])nArray.clone();
    }

    public int[] j() {
        return this.k;
    }

    public boolean k() {
        if ((this.g & 0x4000L) == 16384L) {
            return false;
        }
        int n = 0;
        if ((this.g & 2L) == 2L) {
            ++n;
        }
        if ((this.g & 4L) == 4L) {
            ++n;
        }
        if ((this.g & 8L) == 8L) {
            ++n;
        }
        if ((this.g & 0x10L) == 16L) {
            ++n;
        }
        if ((this.g & 0x20L) == 32L) {
            ++n;
        }
        if ((this.g & 0x40L) == 64L) {
            ++n;
        }
        if ((this.g & 0x80L) == 128L) {
            ++n;
        }
        if ((this.g & 0x100L) == 256L) {
            ++n;
        }
        return n < 2;
    }

    public int l() {
        if ((this.g & 2L) == 2L) {
            return 2;
        }
        if ((this.g & 4L) == 4L) {
            return 4;
        }
        if ((this.g & 8L) == 8L) {
            return 8;
        }
        if ((this.g & 0x10L) == 16L) {
            return 16;
        }
        return 0;
    }
}

