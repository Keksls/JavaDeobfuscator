/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bse
implements ajh_1 {
    public static final String a = "currentArtisansPage";
    public static final String b = "currentPageText";
    public static final String d = "currentPage";
    public static final String e = "totalPages";
    private int g = 0;
    private int h = 0;
    private List<bsb> i;
    public static final String[] f = new String[]{"currentArtisansPage", "currentPageText", "currentPage", "totalPages"};

    public void a(List<bsb> list) {
        this.i = list;
    }

    public List<bsb> a() {
        if (this.i == null) {
            return new ArrayList<bsb>();
        }
        return this.i;
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (Strings.isNullOrEmpty((String)string)) {
            return null;
        }
        if (string.equals(a)) {
            return this.i;
        }
        if (string.equals(b)) {
            return this.c() + 1 + " / " + Math.max(this.e(), 1);
        }
        if (string.equals(d)) {
            return this.c() + 1;
        }
        if (string.equals(e)) {
            return this.e();
        }
        return null;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.g / 13;
    }

    private int e() {
        if (this.h % 13 == 0) {
            return this.h / 13;
        }
        return this.h / 13 + 1;
    }

    public void a(int n) {
        this.g = n;
    }

    public void b(int n) {
        this.h = n;
    }
}

