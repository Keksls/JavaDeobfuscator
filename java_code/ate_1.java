/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.net.URL;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ate
 */
public class ate_1
extends asp_1 {
    private final String b;
    private URL c = null;
    private afk_2 d = null;

    ate_1(@NotNull afk_2 afk_22, String string) {
        super(ass_1.b, afk_22);
        this.b = string != null ? string : "";
    }

    public String f() {
        return this.b;
    }

    public URL g() {
        return this.c;
    }

    public boolean h() {
        return this.d != null;
    }

    public afk_2 i() {
        return new afk_2(this.d);
    }

    void a(URL uRL) {
        this.c = uRL;
    }

    void a(afk_2 afk_22) {
        this.d = afk_22;
    }
}

