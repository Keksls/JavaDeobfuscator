/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cea
 */
public class cea_2
implements ajh_1 {
    private static final String b = "text";
    public static final String[] a = new String[]{"text"};
    private String d;

    @Override
    public String[] d() {
        return a;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "text": {
                return this.a();
            }
        }
        return null;
    }

    public String a() {
        return this.d;
    }

    public void a(String string) {
        if (Objects.equals(string, this.d)) {
            return;
        }
        this.d = string;
        this.b();
    }

    public void b() {
        fis_1.a().a((ajf_1)this, b);
    }
}

