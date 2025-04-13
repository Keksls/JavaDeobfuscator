/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cer
 */
public final class cer_2
implements ajh_1,
fwo {
    private static final String a = "type";
    private static final String b = "color";
    private static final String d = "moderatorName";
    private static final String e = "date";
    private static final String f = "reason";
    private static final String g = "isNote";
    private static final String[] h = new String[]{"type", "color", "moderatorName", "date", "reason", "isNote"};
    private static final SimpleDateFormat i = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
    private final flu_0 j;
    private final eol_0 k;

    public cer_2(flu_0 flu_02) {
        this.j = flu_02;
        this.k = eol_0.a(flu_02.e());
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "type": {
                return this.a();
            }
            case "color": {
                return new azf_2(this.h(), 0.5f);
            }
            case "moderatorName": {
                return this.j.c();
            }
            case "date": {
                return this.i();
            }
            case "reason": {
                return this.e();
            }
            case "isNote": {
                return this.f();
            }
        }
        return null;
    }

    @NotNull
    public String a() {
        if (this.k != null) {
            return this.k.d().name();
        }
        if (this.f()) {
            return "NOTE";
        }
        if (this.j()) {
            return "LANGUAGE RESTRICTION";
        }
        return "UNKNOWN";
    }

    private azj_2 h() {
        if (this.k != null) {
            switch (this.k.d()) {
                case a: {
                    return azf_2.v;
                }
                case b: {
                    return azf_2.s;
                }
                case c: {
                    return azf_2.h;
                }
            }
        }
        if (this.f()) {
            return azf_2.l;
        }
        if (this.j()) {
            return azf_2.m;
        }
        return azf_2.a;
    }

    public String b() {
        return this.j.c();
    }

    public Date c() {
        return this.j.f();
    }

    private String i() {
        return i.format(this.j.f());
    }

    public String e() {
        if (this.k != null) {
            return bae.h().a(String.format("moderationPanel.sanction%d", this.k.c()), new Object[0]);
        }
        return this.j.d();
    }

    public boolean f() {
        return this.j.e() == -1;
    }

    private boolean j() {
        return this.j.e() == -2;
    }

    public flu_0 g() {
        return this.j;
    }

    public String toString() {
        return this.a() + " - " + this.j.c() + " - " + this.i() + " - " + this.e();
    }

    @Override
    public String getFilterableStringValue() {
        return this.toString();
    }

    @Override
    public String[] d() {
        return h;
    }
}

