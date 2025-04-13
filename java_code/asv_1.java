/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from asV
 */
public class asv_1 {
    private final String a;
    private Date b;
    private String c;
    private String d = null;
    private URL e = null;
    private final EnumSet<aso_1> f = EnumSet.noneOf(aso_1.class);
    private int g = 0;
    private asq_1 h;
    private final List<asp_1> i = new ArrayList<asp_1>();

    public asv_1(String string) {
        this.a = string;
    }

    public String a() {
        return this.a;
    }

    public Date b() {
        return new Date(this.b.getTime());
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public URL e() {
        return this.e;
    }

    public int f() {
        return this.g;
    }

    public asq_1 g() {
        return this.h;
    }

    public List<asp_1> h() {
        return this.i;
    }

    public <T extends asp_1> List<T> a(Class<T> clazz) {
        ArrayList<asp_1> arrayList = new ArrayList<asp_1>();
        for (int k = 0; k < this.i.size(); ++k) {
            asp_1 asp_12 = this.i.get(k);
            if (asp_12.getClass() != clazz) continue;
            arrayList.add(asp_12);
        }
        return arrayList;
    }

    void a(Date date) {
        this.b = date;
    }

    void a(String string) {
        this.c = string;
    }

    void b(String string) {
        this.d = string;
    }

    void a(URL uRL) {
        this.e = uRL;
    }

    void a(int n) {
        this.g = n;
    }

    void a(aso_1 aso_12) {
        this.f.add(aso_12);
    }

    void a(@NotNull asp_1 asp_12) {
        this.i.add(asp_12);
    }

    void a(asq_1 asq_12) {
        this.h = asq_12;
    }

    public String toString() {
        return "{NewsItem guid=" + this.a + " contexts:" + this.f.size() + " pubDate=" + this.b + " priority=" + this.g + " title=" + this.c + " link=" + this.e + "}";
    }
}

